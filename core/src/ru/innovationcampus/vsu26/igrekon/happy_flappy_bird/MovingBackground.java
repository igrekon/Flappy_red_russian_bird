package ru.innovationcampus.vsu26.igrekon.happy_flappy_bird;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

public class MovingBackground {
    Texture texture;

    MovingBackground(){
        texture = new Texture("game_bg.png");
    }
    void  draw(Batch batch){
        batch.draw(texture,0,0, MyGdxGame.SCR_WIDTH, MyGdxGame.SCR_HEIGHT);
    }
}
