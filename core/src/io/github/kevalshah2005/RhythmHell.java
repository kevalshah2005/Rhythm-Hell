package io.github.kevalshah2005;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import io.github.kevalshah2005.screens.MainMenuScreen;
import io.github.kevalshah2005.screens.StartupScreen;
import io.github.kevalshah2005.utils.Config;

public class RhythmHell extends Game {
	public SpriteBatch batch;
	private BitmapFont font;
	public static Skin skin = new Skin();
	
	/**
	 * Initializes assets and adds them to skin for easy access
	 */
	@Override
	public void create () {		
		batch = new SpriteBatch();
		
		skin.add("companyLogo", new Texture("companyLogo.png"));
		
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("ChangaOne.ttf"));
		FreeTypeFontParameter parameter = new FreeTypeFontParameter();
		
		parameter.size = Config.getFontSizeSmall();
		font = generator.generateFont(parameter);
		skin.add("smallFont", font);
		
		parameter.size = Config.getFontSizeMedium();
		font = generator.generateFont(parameter);
		skin.add("mediumFont", font);
		
		parameter.size = Config.getFontSizeLarge();
		font = generator.generateFont(parameter);
		skin.add("largeFont", font);
		
		skin.add("gameLogo", new Texture("gameLogo.png"));
		
		skin.add("largeBulletBlue", new Texture("largeBulletBlue.png"));
		skin.add("largeBulletGreen", new Texture("largeBulletGreen.png"));
		skin.add("largeBulletRed", new Texture("largeBulletRed.png"));
		skin.add("largeBulletPink", new Texture("largeBulletPink.png"));
		skin.add("largeBulletTeal", new Texture("largeBulletTeal.png"));
		skin.add("largeBulletWhite", new Texture("largeBulletWhite.png"));
		skin.add("smallBulletRed", new Texture("smallBulletRed.png"));
		skin.add("smallBulletPink", new Texture("smallBulletPink.png"));
		
		generator.dispose();
		this.setScreen(new StartupScreen(this));
	}

	/**
	 * Renders assets on screen
	 */
	@Override
	public void render () {
		super.render();
	}
	
	/**
	 * What to do when this object is disposed
	 */
	@Override
	public void dispose () {
		batch.dispose();
		font.dispose();
	}
}
