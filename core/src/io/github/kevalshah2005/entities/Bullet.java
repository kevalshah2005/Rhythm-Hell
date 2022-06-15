package io.github.kevalshah2005.entities;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Pool.Poolable;

import io.github.kevalshah2005.utils.AngleUnit;
import io.github.kevalshah2005.utils.Config;

public class Bullet extends Entity implements Poolable {
	public Vector2 velocity;
	
	final double HITBOX_SCALE = 0.6;
	double hitboxWidth, hitboxHeight;
	
	/**
	 * Initializes bullet
	 * @param texture Bullet sprite
	 * @param position Initial position of bullet
	 */
	public Bullet(Texture texture, Vector2 position) {
		super(texture, position);
        this.velocity = new Vector2();
        hitboxWidth = HITBOX_SCALE * texture.getWidth();
        hitboxHeight = HITBOX_SCALE * texture.getHeight();
        hitbox = new Rectangle((int) (position.x + hitboxWidth / 2), (int) (position.y + hitboxHeight / 2), (int) hitboxWidth, (int) hitboxHeight);
    }

    /**
     * Initialize bullet with position and velocity
     * @param posX X position of bullet
     * @param posY Y Position of bullet
     * @param velX X Velocity of bullet
     * @param velY Y Velocity of bullet
     */
    public void init(float posX, float posY, float velX, float velY) {
        position.set(posX, posY);
        velocity.set(velX, velY);
    }
    
    /**
     * Initialize bullet with velocity
     * @param velX X Velocity of bullet
     * @param velY Y Velocity of bullet
     */
    public void init(float velX, float velY) {
    	velocity.set(velX, velY);
    }

    /**
     * Initialize bullet with position, velocity magnitude, and direction
     * @param posX X position of bullet
     * @param posY Y position of bullet
     * @param vel Magnitude of velocity
     * @param angle Direction for bullet to move
     * @param angleType Whether angle is in degrees or radians
     */
    public void init(float posX, float posY, float vel, double angle, AngleUnit angleType) {
        position.set(posX, posY);
        if (angleType == AngleUnit.DEGREES) {
            angle *= Math.PI/180;
        }
        velocity.set((float)(vel * Math.cos(angle)), (float)(vel * Math.sin(angle)));
    }
    
    /**
     * Initialize bullet with velocity magnitude and direction
     * @param vel Magnitude of velocity
     * @param angle Direction for bullet to move
     * @param angleType Whether angle is in degrees or radians
     */
    public void init(float vel, double angle, AngleUnit angleType) {
        if (angleType == AngleUnit.DEGREES) {
            angle *= Math.PI/180;
        }
        velocity.set((float) (vel * Math.cos(angle)), (float) (vel * Math.sin(angle)));
    }

    /**
     * Resets bullet
     */
    @Override
    public void reset() {
        position.set(-60,-60);
        velocity.set(0,0);
    }

    /**
     * Updates the bullet
     * @param delta Change in time between frames
     */
    public void update (float delta) {
    	position.x += velocity.x * delta;
    	position.y += velocity.y * delta;
    	hitbox.x = (int) (position.x + hitboxWidth / 2);
    	hitbox.y = (int) (position.y + hitboxHeight / 2);
    }
    
    public void render (SpriteBatch batch) {
    	batch.draw(sprite, position.x, position.y);
    }

    /**
     * Returns whether the bullet is out of the screen
     * @return Whether the bullet is out of the screen
     */
    public boolean isOutOfScreen() {
        return position.x < 0 || position.y < 0 || position.x > Config.GAME_WIDTH || position.y > Config.GAME_HEIGHT;
    }
}
