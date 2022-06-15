package io.github.kevalshah2005.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;

import io.github.kevalshah2005.RhythmHell;
import io.github.kevalshah2005.utils.Config;

/**
 * Obsolete
 * @author keval
 *
 */
public class LevelSelectScreen implements Screen {
	
	final RhythmHell game;
	
	OrthographicCamera camera;
	
	/**
	 * Initializes level select screen
	 * @param game Game object storing assets
	 */
	public LevelSelectScreen(final RhythmHell game) {
		this.game = game;
		
		camera = new OrthographicCamera();
		camera.setToOrtho(false, Config.GAME_WIDTH, Config.GAME_HEIGHT);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		camera.update();
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
