/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.lgame;

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
            case Input.Keys.A:
                if(Lgame.turno) Lgame.p1.move(-1,0);
                else Lgame.p2.move(-1,0);
            break;
            case Input.Keys.D:
                if(Lgame.turno) Lgame.p1.move(1,0);
                else Lgame.p2.move(1,0);
            break;
            case Input.Keys.S:
                if(Lgame.turno) Lgame.p1.move(0,-1);
                else Lgame.p2.move(0,-1);
            break;
            case Input.Keys.W:
                if(Lgame.turno) Lgame.p1.move(0,1);
                else Lgame.p2.move(0,1);
            break;
            case Input.Keys.E:
                if(Lgame.turno) Lgame.p1.turnLeft();
                else Lgame.p2.turnLeft();
            break;
            case Input.Keys.Q:
                if(Lgame.turno) Lgame.p1.turnRight();
                else Lgame.p2.turnRight();
            break;
            
            case Input.Keys.SPACE:
                Lgame.turno = !Lgame.turno;
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