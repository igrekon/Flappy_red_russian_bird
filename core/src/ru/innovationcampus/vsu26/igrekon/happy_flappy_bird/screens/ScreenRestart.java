package ru.innovationcampus.vsu26.igrekon.happy_flappy_bird.screens;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.utils.ScreenUtils;

import ru.innovationcampus.vsu26.igrekon.happy_flappy_bird.MyGdxGame;
import ru.innovationcampus.vsu26.igrekon.happy_flappy_bird.components.MovingBackground;
import ru.innovationcampus.vsu26.igrekon.happy_flappy_bird.components.PointCounter;
import ru.innovationcampus.vsu26.igrekon.happy_flappy_bird.components.TextButton;

public class ScreenRestart implements Screen {
    MyGdxGame myGdxGame;
    MovingBackground background;
    PointCounter pointCounter;
    int gamePoints;

    TextButton buttonRestart;


    public ScreenRestart(MyGdxGame myGdxGame){
        this.myGdxGame = myGdxGame;
        this.background = new MovingBackground("background/restart_bg.png");
        buttonRestart = new TextButton(100,400,"Restart");
        this.pointCounter = new PointCounter(800,500);

    }
    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        ScreenUtils.clear(1,0,0,1);
        myGdxGame.camera.update();
        myGdxGame.batch.setProjectionMatrix(myGdxGame.camera.combined);


        myGdxGame.batch.begin();
        background.draw(myGdxGame.batch);
        pointCounter.draw(myGdxGame.batch,gamePoints);
        buttonRestart.draw(myGdxGame.batch);
        myGdxGame.batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
