package io.github.kevalshah2005.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;

import io.github.kevalshah2005.RhythmHell;
import io.github.kevalshah2005.utils.Config;

public class StartupScreen implements Screen {
	
	final RhythmHell game;
	
	OrthographicCamera camera;
	
	Texture companyLogo;
	
	float elapsedTime = 0;
	
	/**
	 * Initializes the startup screen with the company logo
	 * @param game Game object storing assets
	 */
	public StartupScreen(final RhythmHell game) {
		this.game = game;
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, Config.GAME_WIDTH, Config.GAME_HEIGHT);
	}

	/**
	 * What to do when screen is first shown
	 */
	@Override
	public void show() {
		companyLogo =  RhythmHell.skin.get("companyLogo", Texture.class);
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
		
		elapsedTime += delta;
		game.batch.begin();
		game.batch.setColor(1, 1, 1, (float) alphaCalculator());
		game.batch.draw(companyLogo, (Config.GAME_WIDTH - companyLogo.getWidth()) / 2, (Config.GAME_HEIGHT - companyLogo.getHeight()) / 2);
		game.batch.end();
		
		if (elapsedTime > Config.STARTUP_TIME) {
			game.batch.setColor(Color.WHITE);
			game.setScreen(new MainMenuScreen(game));
			dispose();
		}
	}
	
	/**
	 * Calculates desired alpha value
	 * @see <a href="https://www.desmos.com/calculator/cestt886xq"></a>
	 * @return Desired alpha value
	 */
	public double alphaCalculator() {
		final double FADE_RATIO = 0.125;
		if (elapsedTime < FADE_RATIO * Config.STARTUP_TIME) {
			return (elapsedTime / (Config.STARTUP_TIME * FADE_RATIO));
		} else if (elapsedTime < Config.STARTUP_TIME * (1 - FADE_RATIO)) {
			return 1;
		} else {
			return (-elapsedTime / (Config.STARTUP_TIME * FADE_RATIO)) + (1 / FADE_RATIO);
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

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
	
}
