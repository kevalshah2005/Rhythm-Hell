package io.github.kevalshah2005.levels;

import java.util.ArrayList;

import com.badlogic.gdx.audio.Music;

import io.github.kevalshah2005.patterns.BulletAttack;

public abstract class Level {
	public ArrayList<BulletAttack> attacks = new ArrayList<>();
	public Music music;
}