package io.github.kevalshah2005.utils;

public class Config {
	public static int GAME_WIDTH = 1920;
	public static int GAME_HEIGHT = 1080;
	
	public static final float STARTUP_TIME = 4; // seconds
	
	private static final double FONT_SIZE_BASE = 0.02;
	
	/**
	 * Gets adjusted base font size based on width of screen and base font size
	 * @return Base font size
	 */
	private static double getBaseFontSize() {
		return GAME_WIDTH * FONT_SIZE_BASE;
	}
	
	/**
	 * Gets font size for small text
	 */
	private static final int FONT_SIZE_SMALL = 1;
	public static int getFontSizeSmall() {
		return (int) getBaseFontSize() * FONT_SIZE_SMALL;
	}
	
	/** 
	 * Gets font size for medium text
	 */
	private static final int FONT_SIZE_MEDIUM = 2;
	public static int getFontSizeMedium() {
		return (int) getBaseFontSize() * FONT_SIZE_MEDIUM;
	}
	
	/**
	 * Gets font size for large text
	 */
	private static final int FONT_SIZE_LARGE = 4;
	public static int getFontSizeLarge() {
		return (int) getBaseFontSize() * FONT_SIZE_LARGE;
	}
}
