package fr.ul.rollingball;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import fr.ul.rollingball.views.GameScreen;
import fr.ul.rollingball.views.SplashScreen;

public class RollingBall extends Game {
	SpriteBatch batch;
	Texture img;
	SplashScreen splashScreen;
	GameScreen gameScreen;
	private int width = 1024;
	private int height = 720;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		splashScreen = new SplashScreen(this);
		gameScreen = new GameScreen(this);
		this.setScreen(splashScreen);

	}


	public void display_game(){
		this.setScreen(gameScreen);

	}

	public void dispose () {
		splashScreen.dispose();
		gameScreen.dispose();
		//img.dispose();
	}

	public int getWidth(){
		return this.width;
	}

	public int getHeight(){
		return this.height;
	}

}
