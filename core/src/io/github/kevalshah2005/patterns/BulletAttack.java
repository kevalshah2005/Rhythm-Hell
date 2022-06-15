package io.github.kevalshah2005.patterns;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import io.github.kevalshah2005.entities.Bullet;

public abstract class BulletAttack extends AttackPattern {
	float bulletSpeed;
	Texture bulletSprite;
	public ArrayList<Bullet> bullets = new ArrayList<>();

	/**
	 * Creates a new bullet attack
	 * @param position The position to spawn the attack at
	 * @param time The time delay to spawn the attack at
	 * @param bulletSpeed The speed of the bullets
	 */
	public BulletAttack(Vector2 position, double time, float bulletSpeed, Texture bulletSprite) {
		super(position, time);
		this.bulletSpeed = bulletSpeed;
		this.bulletSprite = bulletSprite;
	}
}
