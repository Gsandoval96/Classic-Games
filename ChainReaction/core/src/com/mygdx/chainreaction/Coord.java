/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mygdx.chainreaction;

/**
 *
 * @author gsandoval
 */
public class Coord {
    public int x, y;

    public Coord(int posX, int posY) {
        this.x = posX;
        this.y = posY;
    }
    
    public Coord getCoord(){
        return new Coord(x,y);
    }
    
    public void setCoord(Coord c){
        x = c.x;
        y = c.y;
    }
    
}
