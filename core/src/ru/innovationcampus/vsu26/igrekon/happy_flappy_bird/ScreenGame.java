package ru.innovationcampus.vsu26.igrekon.happy_flappy_bird;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.utils.ScreenUtils;

public class ScreenGame implements Screen {

    MyGdxGame myGdxGame;
    Bird bird;
    boolean isGameOver;

    int tubeCount=3;
    Tube[] tubes;





    ScreenGame(MyGdxGame myGdxGame){
        this.myGdxGame=myGdxGame;

        tubes = new Tube[tubeCount];
        for (int i=0; i < tubeCount;i++ ){
            tubes[i] = new Tube(tubeCount,i);
        }

        bird = new Bird(0,500,10,250,200);
    }

    @Override
    public void show() {
        isGameOver = false;

    }

    @Override
    public void render(float delta) {
        if (Gdx.input.justTouched()) {
            bird.onClick();
        }

        bird.fly();
        for (Tube tube : tubes) tube.move();

        ScreenUtils.clear(1, 1, 1, 1);
        myGdxGame.camera.update();
        myGdxGame.batch.setProjectionMatrix(myGdxGame.camera.combined);
        myGdxGame.batch.begin();
        for (Tube tube : tubes) tube.draw(myGdxGame.batch);

        bird.draw(myGdxGame.batch);

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
        bird.dispose();
        for (int i =0; i < tubeCount;i++){
            tubes[i].dispose();
        }

    }
    void initTubes() {
        tubes = new Tube[tubeCount];
        for (int i = 0; i < tubeCount; i++) {
            tubes[i] = new Tube(tubeCount, i);
        }
    }
}
