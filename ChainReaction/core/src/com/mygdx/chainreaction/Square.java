package com.mygdx.chainreaction;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

/**
 *
 * @author gsandoval
 */
public class Square {
    
    public static final int SIZE = 35;
    private Coord pos;
    private Color color;

    public Square(){
        pos = new Coord(0,0);
        color = Color.BLACK;
    }
    
    public Square(int a, int b){
        pos = new Coord(a,b);
        color = Color.BLACK;
    }

    public Square(int a, int b, Color c){
        pos = new Coord(a,b);
        color = c;
    }

    public int getPosX() {
        return pos.x;
    }

    public void setPosX(int posX) {
        pos.x = posX;
    }

    public int getPosY() {
        return pos.y;
    }

    public void setPosY(int posY) {
        pos.y = posY;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void draw(ShapeRenderer shp){
         shp.begin(ShapeType.Filled);
         shp.setColor(color);
         shp.rect(pos.x*SIZE, pos.y*SIZE, SIZE-1, SIZE-1);
         shp.end();
    }
    
    /*public void move(int a, int b){
        pos.x += a;
        pos.y += b;
    }*/
}