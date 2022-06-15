package io.github.kevalshah2005.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import io.github.kevalshah2005.RhythmHell;
import io.github.kevalshah2005.entities.Bullet;
import io.github.kevalshah2005.entities.Player;
import io.github.kevalshah2005.levels.Level;
import io.github.kevalshah2005.levels.SpiderDance;
import io.github.kevalshah2005.patterns.AttackPattern;
import io.github.kevalshah2005.patterns.BulletAttack;
import io.github.kevalshah2005.utils.Config;

public class GameScreen implements Screen {
	
	private enum MusicState {
		PLAYING,
		STOPPED
	}
	private MusicState musicState = MusicState.PLAYING;
	
	final RhythmHell game;
	final Level level;
	
	OrthographicCamera camera;
	
	Player player;
	Texture playerTexture;
	
	float elapsedTime = 0;
	float endTime = 0;
	
	float MUSIC_FADE_IN_TIME = 3;
	
	/**
	 * Initializes game
	 * @param game Game object storing assets
	 * @param level The level to load
	 */
	public GameScreen (final RhythmHell game, final Level level) {
		this.game = game;
		this.level = level;
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, Config.GAME_WIDTH, Config.GAME_HEIGHT);
	}

	/**
	 * What to do when the screen is first shown; works similar to init()
	 */
	@Override
	public void show() {
		// TODO Auto-generated method stub
		playerTexture = new Texture(Gdx.files.internal("player.png"));
		player = new Player(playerTexture, new Vector2(Config.GAME_WIDTH / 2, Config.GAME_HEIGHT / 2));
		
		level.music.play();
	}

	/**
	 * Loop that runs every frame
	 */
	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		elapsedTime += delta;
		
		camera.update();
		
		player.handleInput(delta);
		
		game.batch.begin();
		for (BulletAttack attack : level.attacks) {
			attack.update(elapsedTime, delta);
			for (Bullet bullet : attack.bullets) {
				if (bullet.hitbox.overlaps(player.hitbox)) {
					dispose();
					game.setScreen(new GameScreen(game, new SpiderDance()));
				}
				game.batch.draw(bullet.sprite, bullet.position.x, bullet.position.y);
			}
		}
		
		if (elapsedTime < MUSIC_FADE_IN_TIME) {
			level.music.setVolume(elapsedTime / MUSIC_FADE_IN_TIME);
		}
		
		switch (musicState) {
			case PLAYING:
				if (!level.music.isPlaying()) {
					musicState = MusicState.STOPPED;
				}
				break;
			case STOPPED:
				endTime += delta;
				if (endTime > 10) {
					game.setScreen(new MainMenuScreen(game));
					dispose();
				}
				break;
		}
		
		game.batch.draw(player.sprite, player.position.x, player.position.y);
		game.batch.end();
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	/**
	 * What to do when this object is disposed
	 */
	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		level.music.stop();
		level.music.dispose();
		
	}

}
