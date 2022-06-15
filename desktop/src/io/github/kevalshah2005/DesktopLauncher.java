package io.github.kevalshah2005;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

import io.github.kevalshah2005.utils.Config;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setWindowedMode(Config.GAME_WIDTH, Config.GAME_HEIGHT);
		config.setForegroundFPS(60);
		config.setDecorated(true);
		config.setTitle("Rhythm Hell");
		new Lwjgl3Application(new RhythmHell(), config);
	}
}
