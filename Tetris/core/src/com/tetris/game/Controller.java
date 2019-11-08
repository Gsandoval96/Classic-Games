/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tetris.game;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;

/**
 *
 * @author gsandoval
 */
public class Controller implements InputProcessor {
@Override
    public boolean keyDown (int keycode) {
         switch(keycode){
         case Input.Keys.LEFT:
           Tetris.g.getP().move(-1,0);
         break;
         case Input.Keys.RIGHT:
           Tetris.g.getP().move(1,0);
         break;
         case Input.Keys.DOWN:
           Tetris.g.getP().move(0,-1);
         break;
         case Input.Keys.E:
           Tetris.g.getP().turnRight();
         break;
         case Input.Keys.Q:
           Tetris.g.getP().turnLeft();
         break;
         case Input.Keys.SPACE:
           Tetris.g.newPiece();
         break;
     }
        return false;
    }

    @Override
    public boolean keyUp (int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char c) {
        return false;
    }

    @Override
    public boolean touchDown(int i, int i1, int i2, int i3) {
        return false;
    }

    @Override
    public boolean touchUp(int i, int i1, int i2, int i3) {
        return false;
    }

    @Override
    public boolean touchDragged(int i, int i1, int i2) {
        return false;
    }

    @Override
    public boolean mouseMoved(int i, int i1) {
        return false;
    }

    @Override
    public boolean scrolled(int i) {
        return false;
    }

}
