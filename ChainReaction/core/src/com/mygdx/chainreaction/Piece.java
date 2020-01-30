/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mygdx.chainreaction;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author gsandoval
 */
public class Piece {
    private Coord pos;
    private Color color;

    public Piece(){
        pos = new Coord(0,0);
        color = Color.GREEN;
    }

    public Piece(int a, int b){
        pos = new Coord(a,b);
        color = Color.GREEN;
    }
    
    public Piece(int a, int b, Color c){
        pos = new Coord(a,b);
        color = c;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
          
    public void draw(ShapeRenderer shp){
        
         update();
        
         shp.begin(ShapeType.Filled);
         shp.setColor(color);
         shp.circle(pos.x*Square.SIZE + Square.SIZE/2, pos.y*Square.SIZE + Square.SIZE/2, 6);
         shp.end();

    }
    
    private void update(){
        
    }
   
}
