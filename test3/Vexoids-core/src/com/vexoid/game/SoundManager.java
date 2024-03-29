package com.vexoid.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;

public class SoundManager {
	
	private static Music CurrentMusic = null;

	public static Music menuMusic = Gdx.audio.newMusic(Gdx.files.internal("assets/asdd - main 2.mp3"));
	public static Music gameMusic = Gdx.audio.newMusic(Gdx.files.internal("assets/asdd - main.mp3"));
	public static Music extraMusic = Gdx.audio.newMusic(Gdx.files.internal("assets/Vocaloid Miku ievan polkka.mp3"));
	public static Music extraMusic2 = Gdx.audio.newMusic(Gdx.files.internal("assets/Subboss Theme - Scott Pilgrim vs. The World_ The Game Music.mp3"));
	public static Music extraMusic3 = Gdx.audio.newMusic(Gdx.files.internal("assets/asdd - main 8bit.mp3"));
	
	public static Music boss1Music = Gdx.audio.newMusic(Gdx.files.internal("assets/asdd - boss1.mp3"));
	
	public static Music endMusic = Gdx.audio.newMusic(Gdx.files.internal("assets/end_game.mp3"));
	
	public static Sound startSound = Gdx.audio.newSound(Gdx.files.internal("assets/start_game.mp3"));
	
	public static Sound hit1 = Gdx.audio.newSound(Gdx.files.internal("assets/hit1.mp3"));
	public static Sound hit2 = Gdx.audio.newSound(Gdx.files.internal("assets/hit2.mp3"));
	public static Sound hit3 = Gdx.audio.newSound(Gdx.files.internal("assets/hit3.mp3"));
	public static Sound hit4 = Gdx.audio.newSound(Gdx.files.internal("assets/hit4.mp3"));
	public static Sound hit5 = Gdx.audio.newSound(Gdx.files.internal("assets/hit5.mp3"));
	
	public static Sound cry1 = Gdx.audio.newSound(Gdx.files.internal("assets/cry1.mp3"));
	public static Sound cry2 = Gdx.audio.newSound(Gdx.files.internal("assets/cry2.mp3"));
	public static Sound cry3 = Gdx.audio.newSound(Gdx.files.internal("assets/cry3.mp3"));
	
	public static Sound shot1 = Gdx.audio.newSound(Gdx.files.internal("assets/shot1.mp3"));
	public static Sound shot2 = Gdx.audio.newSound(Gdx.files.internal("assets/shot2.mp3"));
	public static Sound shot3 = Gdx.audio.newSound(Gdx.files.internal("assets/shot3.mp3"));
	
	public static Sound laserShot1 = Gdx.audio.newSound(Gdx.files.internal("assets/laser_shot.mp3"));
	
	public static Sound warning1 = Gdx.audio.newSound(Gdx.files.internal("assets/warning.mp3"));
	public static Sound liveLost = Gdx.audio.newSound(Gdx.files.internal("assets/live_lost.mp3"));

	public static Sound sound1 = Gdx.audio.newSound(Gdx.files.internal("assets/sound1.mp3"));
	public static Sound sound2 = Gdx.audio.newSound(Gdx.files.internal("assets/sound2.mp3"));
	
	
	public static void stopASound(Sound sound){
		sound.stop();
	}	
	public static void playMusic(){
		CurrentMusic.play();
	}
	public static void stopMusic(){
		CurrentMusic.stop();
	}
	public static void pauseMusic(){
		CurrentMusic.pause();
	}
	public static void setMusic(Music music, float vol, boolean loop){
		CurrentMusic = music;
		CurrentMusic.play();
		CurrentMusic.setVolume(vol);
		CurrentMusic.setLooping(loop);
	}
	public static Music getMusic(){
		return CurrentMusic;
	}
}
