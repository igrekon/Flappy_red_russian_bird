package ru.innovationcampus.vsu26.igrekon.happy_flappy_bird;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.utils.ScreenUtils;

public class ScreenGame implements Screen {
    Texture birdTexture;
    int birdX = 0;
    int birdY = 0;
    int birdSpeed = 2;
    private MyGdxGame myGdxGame;

    ScreenGame(MyGdxGame myGdxGame){
        this.myGdxGame=myGdxGame;
        birdTexture = new Texture("bird0.png");
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        birdX+=birdSpeed;
        birdY+=birdSpeed;

        ScreenUtils.clear(1, 1, 1, 1);
        myGdxGame.camera.update();
        myGdxGame.batch.setProjectionMatrix(myGdxGame.camera.combined);
        myGdxGame.batch.begin();
        myGdxGame.batch.draw(birdTexture, birdX, birdY);
        myGdxGame.batch.end();
        if (Gdx.input.justTouched()){
            System.out.println("Just touched");
        }
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
        birdTexture.dispose();

    }
}
