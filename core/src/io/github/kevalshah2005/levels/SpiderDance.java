package io.github.kevalshah2005.levels;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import io.github.kevalshah2005.patterns.BulletBurst;
import static io.github.kevalshah2005.RhythmHell.skin;

public class SpiderDance extends Level {
	/**
	 * Initializes Spider Dance level
	 */
	public SpiderDance() {
		music = Gdx.audio.newMusic(Gdx.files.internal("SpiderDanceDrop.mp3"));
		
		attacks.add(new BulletBurst(3.070, new Vector2(500, 900), 150, 20, skin.get("largeBulletBlue", Texture.class)));
		attacks.add(new BulletBurst(3.618, new Vector2(900, 500), 300, 18, skin.get("largeBulletWhite", Texture.class)));
		attacks.add(new BulletBurst(4.025, new Vector2(1000, 600), 200, 18, skin.get("largeBulletRed", Texture.class)));
		attacks.add(new BulletBurst(4.475, new Vector2(1400, 750), 200, 18, skin.get("largeBulletTeal", Texture.class)));
		attacks.add(new BulletBurst(5.002, new Vector2(1500, 500), 200, 18, skin.get("largeBulletGreen", Texture.class)));
		attacks.add(new BulletBurst(5.412, new Vector2(300, 700), 200, 15, skin.get("largeBulletWhite", Texture.class)));
		attacks.add(new BulletBurst(5.913, new Vector2(500, 900), 300, 18, skin.get("largeBulletPink", Texture.class)));
		attacks.add(new BulletBurst(6.366, new Vector2(200, 1000), 200, 10, skin.get("largeBulletGreen", Texture.class)));
		attacks.add(new BulletBurst(6.835, new Vector2(500, 600), 200, 18, skin.get("largeBulletRed", Texture.class)));
		attacks.add(new BulletBurst(7.287, new Vector2(500, 600), 200, 20, skin.get("largeBulletBlue", Texture.class)));
		attacks.add(new BulletBurst(7.758, new Vector2(1500, 500), 150, 20, skin.get("largeBulletRed", Texture.class)));
		attacks.add(new BulletBurst(8.225, new Vector2(300, 700), 200, 18, skin.get("largeBulletPink", Texture.class)));
		attacks.add(new BulletBurst(8.538, new Vector2(500, 900), 200, 18, skin.get("largeBulletWhite", Texture.class)));
		attacks.add(new BulletBurst(8.707, new Vector2(200, 1000), 200, 36, skin.get("smallBulletPink", Texture.class)));
		attacks.add(new BulletBurst(9.168, new Vector2(500, 600), 200, 18, skin.get("largeBulletTeal", Texture.class)));
		attacks.add(new BulletBurst(9.632, new Vector2(500, 600), 300, 25, skin.get("largeBulletBlue", Texture.class)));
		attacks.add(new BulletBurst(10.136, new Vector2(500, 900), 200, 30, skin.get("smallBulletRed", Texture.class)));
		attacks.add(new BulletBurst(10.569, new Vector2(900, 500), 200, 18, skin.get("largeBulletBlue", Texture.class)));
		attacks.add(new BulletBurst(11.037, new Vector2(1000, 600), 150, 12, skin.get("largeBulletRed", Texture.class)));
		attacks.add(new BulletBurst(11.505, new Vector2(960, 750), 200, 50, skin.get("smallBulletPink", Texture.class)));
		attacks.add(new BulletBurst(11.975, new Vector2(1500, 500), 200, 18, skin.get("largeBulletPink", Texture.class)));
		attacks.add(new BulletBurst(12.443, new Vector2(300, 700), 200, 15, skin.get("largeBulletRed", Texture.class)));
		attacks.add(new BulletBurst(12.912, new Vector2(500, 900), 300, 15, skin.get("largeBulletWhite", Texture.class)));
		attacks.add(new BulletBurst(13.389, new Vector2(200, 1000), 200, 15, skin.get("largeBulletTeal", Texture.class)));
		attacks.add(new BulletBurst(13.848, new Vector2(500, 600), 200, 18, skin.get("largeBulletRed", Texture.class)));
		attacks.add(new BulletBurst(14.318, new Vector2(500, 600), 200, 15, skin.get("largeBulletPink", Texture.class)));
		attacks.add(new BulletBurst(14.787, new Vector2(1500, 500), 150, 15, skin.get("largeBulletBlue", Texture.class)));
		attacks.add(new BulletBurst(15.257, new Vector2(300, 700), 200, 28, skin.get("smallBulletRed", Texture.class)));
		attacks.add(new BulletBurst(15.724, new Vector2(500, 900), 300, 18, skin.get("largeBulletRed", Texture.class)));
		attacks.add(new BulletBurst(16.193, new Vector2(200, 1000), 200, 15, skin.get("largeBulletBlue", Texture.class)));
		attacks.add(new BulletBurst(16.567, new Vector2(500, 600), 200, 15, skin.get("largeBulletGreen", Texture.class)));
		attacks.add(new BulletBurst(17.147, new Vector2(300, 700), 200, 18, skin.get("largeBulletPink", Texture.class)));
		attacks.add(new BulletBurst(17.635, new Vector2(960, 900), 200, 60, skin.get("smallBulletRed", Texture.class)));
		attacks.add(new BulletBurst(18.056, new Vector2(600, 900), 150, 18, skin.get("largeBulletBlue", Texture.class)));
		attacks.add(new BulletBurst(18.538, new Vector2(900, 500), 300, 15, skin.get("largeBulletRed", Texture.class)));
		attacks.add(new BulletBurst(19.005, new Vector2(500, 600), 200, 30, skin.get("smallBulletPink", Texture.class)));
		attacks.add(new BulletBurst(19.490, new Vector2(1500, 500), 200, 18, skin.get("largeBulletPink", Texture.class)));
		attacks.add(new BulletBurst(19.943, new Vector2(300, 700), 200, 15, skin.get("largeBulletRed", Texture.class)));
		attacks.add(new BulletBurst(20.428, new Vector2(500, 900), 200, 18, skin.get("largeBulletRed", Texture.class)));
		attacks.add(new BulletBurst(20.880, new Vector2(200, 1000), 200, 15, skin.get("largeBulletWhite", Texture.class)));
		attacks.add(new BulletBurst(21.353, new Vector2(500, 900), 150, 15, skin.get("largeBulletGreen", Texture.class)));
		attacks.add(new BulletBurst(21.819, new Vector2(800, 500), 300, 15, skin.get("largeBulletPink", Texture.class)));
		attacks.add(new BulletBurst(22.154, new Vector2(1100, 600), 200, 18, skin.get("largeBulletRed", Texture.class)));
		attacks.add(new BulletBurst(22.323, new Vector2(1400, 750), 200, 15, skin.get("largeBulletBlue", Texture.class)));
		attacks.add(new BulletBurst(22.644, new Vector2(1500, 500), 200, 18, skin.get("largeBulletTeal", Texture.class)));
		attacks.add(new BulletBurst(22.756, new Vector2(300, 700), 200, 15, skin.get("largeBulletPink", Texture.class)));
		attacks.add(new BulletBurst(23.242, new Vector2(500, 900), 200, 40, skin.get("smallBulletRed", Texture.class)));
		attacks.add(new BulletBurst(23.692, new Vector2(600, 900), 200, 18, skin.get("largeBulletBlue", Texture.class)));
		attacks.add(new BulletBurst(24.162, new Vector2(900, 500), 200, 15, skin.get("largeBulletGreen", Texture.class)));
		attacks.add(new BulletBurst(24.647, new Vector2(500, 600), 300, 18, skin.get("largeBulletTeal", Texture.class)));
		attacks.add(new BulletBurst(25.137, new Vector2(1500, 500), 150, 18, skin.get("largeBulletWhite", Texture.class)));
		attacks.add(new BulletBurst(25.545, new Vector2(500, 900), 200, 15, skin.get("largeBulletBlue", Texture.class)));
		attacks.add(new BulletBurst(26.072, new Vector2(800, 500), 200, 15, skin.get("largeBulletRed", Texture.class)));
		attacks.add(new BulletBurst(26.505, new Vector2(1100, 600), 200, 18, skin.get("largeBulletBlue", Texture.class)));
		attacks.add(new BulletBurst(26.505, new Vector2(1400, 750), 200, 15, skin.get("largeBulletRed", Texture.class)));
		attacks.add(new BulletBurst(26.977, new Vector2(1500, 500), 300, 15, skin.get("largeBulletGreen", Texture.class)));
		attacks.add(new BulletBurst(27.442, new Vector2(300, 700), 200, 15, skin.get("largeBulletPink", Texture.class)));
		attacks.add(new BulletBurst(27.915, new Vector2(500, 600), 200, 18, skin.get("largeBulletBlue", Texture.class)));
		attacks.add(new BulletBurst(28.397, new Vector2(1500, 500), 200, 15, skin.get("largeBulletGreen", Texture.class)));
		attacks.add(new BulletBurst(28.721, new Vector2(300, 700), 150, 15, skin.get("largeBulletTeal", Texture.class)));
		attacks.add(new BulletBurst(29.320, new Vector2(500, 900), 200, 15, skin.get("largeBulletPink", Texture.class)));
		attacks.add(new BulletBurst(29.804, new Vector2(200, 1000), 200, 15, skin.get("largeBulletBlue", Texture.class)));
		attacks.add(new BulletBurst(30.256, new Vector2(500, 600), 300, 28, skin.get("smallBulletRed", Texture.class)));
		attacks.add(new BulletBurst(30.741, new Vector2(500, 600), 200, 18, skin.get("largeBulletBlue", Texture.class)));
		attacks.add(new BulletBurst(31.195, new Vector2(900, 500), 200, 30, skin.get("smallBulletPink", Texture.class)));
		attacks.add(new BulletBurst(31.612, new Vector2(960, 800), 150, 30, skin.get("largeBulletBlue", Texture.class)));
	}
}
