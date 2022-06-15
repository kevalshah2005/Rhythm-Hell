	package io.github.kevalshah2005.patterns;

import java.util.ArrayList;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import io.github.kevalshah2005.entities.Bullet;
import io.github.kevalshah2005.utils.AngleUnit;

public class BulletBurst extends BulletAttack {
	int density;

	/**
	 * Creates a new bullet burst attack
	 * @param position The position to spawn the attack at
	 * @param time The time delay to spawn the attack at
	 * @param bulletSpeed The speed of the bullets
	 * @param density Number of bullets
	 */
	public BulletBurst(double time, Vector2 position, float bulletSpeed, int density, Texture bulletSprite) {
		super(position, time, bulletSpeed, bulletSprite);
		this.density = density;
	}
	
	/**
	 * Updates attack
	 * @param elapsedTime Time elapsed so far in the level
	 */
	@Override
	public void update(float elapsedTime, float deltaTime) {
		if (elapsedTime > time && !started) {
			for (int i = 0; i < density; i++) {
				Bullet bullet = new Bullet(bulletSprite, position.cpy());
				bullet.init(bulletSpeed, i * 360f / density, AngleUnit.DEGREES);
				bullets.add(bullet);
			}
			started = true;
		}
		
		if (started) {
			ArrayList<Bullet> removedBullets = new ArrayList<>();
			for (Bullet bullet : bullets) {
				bullet.update(deltaTime);
				if (bullet.isOutOfScreen()) {
					removedBullets.add(bullet);
				}
			}
			bullets.removeAll(removedBullets);
		}
	}
}