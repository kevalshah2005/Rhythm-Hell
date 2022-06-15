package io.github.kevalshah2005.patterns;

import com.badlogic.gdx.math.Vector2;

public abstract class AttackPattern {
	
	double time;
	Vector2 position;
	boolean started = false;
	
	/**
	 * Creates a new attack
	 * @param position The position to spawn the attack at
	 * @param time The time delay to spawn the attack at
	 */
	public AttackPattern(Vector2 position, double time) {
		this.position = position;
		this.time = time;
	}
	
	/**
	 * Updates pattern based on time
	 * @param elapsedTime Time since start of level
	 * @param deltaTime Time between frames
	 */
	public abstract void update(float elapsedTime, float deltaTime);
}
