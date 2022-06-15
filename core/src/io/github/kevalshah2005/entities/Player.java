package io.github.kevalshah2005.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.controllers.Controller;
import com.badlogic.gdx.controllers.Controllers;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

import io.github.kevalshah2005.utils.Config;

public class Player extends Entity {
	
	public static final int MOVEMENT_SPEED = 400;

	/**
	 * Instantiates player
	 * @param sprite The sprite representing the player
	 * @param position Starting position of the player
	 */
	public Player(Texture sprite, Vector2 position) {
		super(sprite, position);
		hitbox = new Rectangle(position.x, position.y, sprite.getWidth(), sprite.getHeight());
		Gdx.input.setCatchKey(Keys.UP, true);
		Gdx.input.setCatchKey(Keys.DOWN, true);
		Gdx.input.setCatchKey(Keys.LEFT, true);
		Gdx.input.setCatchKey(Keys.RIGHT, true);
	}
	
	/**
	 * Handles user input for the player
	 * @param delta The change in time between frames
	 */
	public void handleInput(float delta) {
		hitbox.x = position.x;
		hitbox.y = position.y;
		
		if (Gdx.input.isKeyPressed(Keys.UP)) {
			position.add(new Vector2(0, MOVEMENT_SPEED * delta));
		}
		
		if (Gdx.input.isKeyPressed(Keys.DOWN)) {
			position.add(new Vector2(0, -MOVEMENT_SPEED * delta));
		}
		
		if (Gdx.input.isKeyPressed(Keys.LEFT)) {
			position.add(new Vector2(-MOVEMENT_SPEED * delta, 0));
		}
		
		if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
			position.add(new Vector2(MOVEMENT_SPEED * delta, 0));
		}
		
		if (position.x > Config.GAME_WIDTH - sprite.getWidth()) {
			position.x = Config.GAME_WIDTH - sprite.getWidth();
		} else if (position.x < 0) {
			position.x = 0;
		}
		
		if (position.y > Config.GAME_HEIGHT - sprite.getHeight()) {
			position.y = Config.GAME_HEIGHT - sprite.getHeight();
		} else if (position.y < 0) {
			position.y = 0;
		}
	}
}
