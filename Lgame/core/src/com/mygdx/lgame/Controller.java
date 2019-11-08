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
                if(Lgame.turno){ 
                    if(!Lgame.turnoC)Lgame.p1.move(-1,0);
                    else{
                        if(Lgame.c1) Lgame.s1.move(-1, 0);
                        else Lgame.s2.move(-1, 0);                               
                    }
                    
                }           
                else{ 
                    if(!Lgame.turnoC)Lgame.p2.move(-1,0);
                    else{
                        if(Lgame.c1) Lgame.s1.move(-1, 0);
                        else Lgame.s2.move(-1, 0);                               
                    }
                }
            break;
            case Input.Keys.D:
                if(Lgame.turno){ 
                    if(!Lgame.turnoC)Lgame.p1.move(1,0);
                    else{
                        if(Lgame.c1) Lgame.s1.move(1, 0);
                        else Lgame.s2.move(1, 0);                               
                    }
                }           
                else{ 
                    if(!Lgame.turnoC)Lgame.p2.move(1,0);
                    else{
                        if(Lgame.c1) Lgame.s1.move(1, 0);
                        else Lgame.s2.move(1, 0);                               
                    }
                }
            break;
            case Input.Keys.S:
                if(Lgame.turno){ 
                    if(!Lgame.turnoC)Lgame.p1.move(0,-1);
                    else{
                        if(Lgame.c1) Lgame.s1.move(0,-1);
                        else Lgame.s2.move(0,-1);                               
                    }
                }           
                else{ 
                    if(!Lgame.turnoC)Lgame.p2.move(0,-1);
                    else{
                        if(Lgame.c1) Lgame.s1.move(0,-1);
                        else Lgame.s2.move(0,-1);                               
                    }
                }
            break;
            case Input.Keys.W:
                if(Lgame.turno){ 
                    if(!Lgame.turnoC)Lgame.p1.move(0,1);
                    else{
                        if(Lgame.c1) Lgame.s1.move(0,1);
                        else Lgame.s2.move(0,1);                               
                    }
                }           
                else{ 
                    if(!Lgame.turnoC)Lgame.p2.move(0,1);
                    else{
                        if(Lgame.c1) Lgame.s1.move(0,1);
                        else Lgame.s2.move(0,1);                               
                    }
                }
            break;
            case Input.Keys.E:
                if(!Lgame.turnoC){
                    if(Lgame.turno) Lgame.p1.turnLeft();
                    else Lgame.p2.turnLeft();
                }
            break;
            case Input.Keys.Q:
                if(!Lgame.turnoC){
                    if(Lgame.turno) Lgame.p1.turnRight();
                    else Lgame.p2.turnRight();
                }
            break;
            
            case Input.Keys.SPACE:
                if(Lgame.turno){
                    if(Lgame.turnoC){
                            if(!Lgame.p1.overlap(Lgame.s1) &&
                               !Lgame.p1.overlap(Lgame.s2) &&
                               !Lgame.p2.overlap(Lgame.s1) &&
                               !Lgame.p2.overlap(Lgame.s2) &&    
                               !Lgame.s1.overlap(Lgame.s2.getCoord()))
                            {
                                Lgame.turno = false; 
                                Lgame.turnoC = false;
                            }
                        
                    }
                    else{ 
                            if(!Lgame.p1.overlap(Lgame.p2) && 
                               !Lgame.p1.overlap(Lgame.s1) &&
                               !Lgame.p1.overlap(Lgame.s2))
                            Lgame.turnoC = true;
                        
                    }
                }
                else{
                    if(Lgame.turnoC){ 
                            if(!Lgame.p1.overlap(Lgame.s1) &&
                               !Lgame.p1.overlap(Lgame.s2) &&
                               !Lgame.p2.overlap(Lgame.s1) &&
                               !Lgame.p2.overlap(Lgame.s2) &&    
                               !Lgame.s1.overlap(Lgame.s2.getCoord()))
                            {
                                Lgame.turno = true; 
                                Lgame.turnoC = false;
                            }
                    }
                    else{ 
                            if(!Lgame.p2.overlap(Lgame.p1) && 
                               !Lgame.p2.overlap(Lgame.s1) &&
                               !Lgame.p2.overlap(Lgame.s2))
                                Lgame.turnoC = true;    
                    }
                }
                    
            break;
            
            case Input.Keys.C:
                Lgame.c1 = !Lgame.c1;             
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