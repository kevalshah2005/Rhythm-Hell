package io.github.kevalshah2005.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public abstract class Entity {
	public Texture sprite;
	public Vector2 position;
	public Rectangle hitbox;
	
	/**
	 * Initializes an entity
	 * @param sprite Entity sprite
	 * @param position Entity initial position
	 */
	public Entity(Texture sprite, Vector2 position) {
		this.sprite = sprite;
		this.position = position;
	}
}
