package io.github.kevalshah2005.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;

import io.github.kevalshah2005.RhythmHell;
import io.github.kevalshah2005.levels.SpiderDance;
import io.github.kevalshah2005.utils.Config;

public class MainMenuScreen implements Screen {

	final RhythmHell game;
	
	OrthographicCamera camera;
	
	Music backgroundMusic;
	
	/**
	 * Initializes Main Menu screen
	 * @param game Game object storing assets
	 */
	public MainMenuScreen(final RhythmHell game) {
		this.game = game;
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, Config.GAME_WIDTH, Config.GAME_HEIGHT);
	}
	
	/**
	 * What to do when screen is shown
	 */
	@Override
	public void show() {
		backgroundMusic = Gdx.audio.newMusic(Gdx.files.internal("mainMenuMusic.mp3"));
		backgroundMusic.setLooping(true);
		backgroundMusic.play();
		
	}

	/**
	 * Loop that runs every frame
	 */
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		camera.update();
		game.batch.setProjectionMatrix(camera.combined);
		
		game.batch.begin();
		game.batch.draw(RhythmHell.skin.get("gameLogo", Texture.class), 450, 200);
		RhythmHell.skin.getFont("mediumFont").draw(game.batch, "Press space to continue", 550, 300);
		game.batch.end();
		
		Gdx.input.setCatchKey(Keys.SPACE, true);
		if (Gdx.input.isKeyPressed(Keys.SPACE)) {
			game.setScreen(new GameScreen(game, new SpiderDance()));
			dispose();
		}
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
		backgroundMusic.stop();
		backgroundMusic.dispose();
	}
	
}
