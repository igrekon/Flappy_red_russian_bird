package ru.innovationcampus.vsu26.igrekon.happy_flappy_bird;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import ru.innovationcampus.vsu26.igrekon.happy_flappy_bird.screens.ScreenGame;
import ru.innovationcampus.vsu26.igrekon.happy_flappy_bird.screens.ScreenMenu;
import ru.innovationcampus.vsu26.igrekon.happy_flappy_bird.screens.ScreenRestart;


public class MyGdxGame extends Game {
	public static final int SCR_WIDTH =1280;
	public static final int SCR_HEIGHT = 720;
	public SpriteBatch batch;
	public OrthographicCamera camera;











	public ScreenMenu screenMenu;
	public ScreenGame screenGame;
	public ScreenRestart screenRestart;



	
	@Override
	public void create () {
		batch = new SpriteBatch();
		camera = new OrthographicCamera();
		camera.setToOrtho(false,SCR_WIDTH,SCR_HEIGHT);

		screenGame = new ScreenGame(this);
		screenRestart = new ScreenRestart(this);
		screenMenu = new ScreenMenu(this);
		setScreen(screenMenu);
	}


	
	@Override
	public void dispose () {
		batch.dispose();


	}
}


