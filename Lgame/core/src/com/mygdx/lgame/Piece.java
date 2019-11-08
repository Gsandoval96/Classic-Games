/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mygdx.lgame;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author gsandoval
 */
public class Piece {
    
    private Square center;
    private Color color;
    
    private List<Square> perifs;
    private List<Coord> perifs_pos;
    
    private boolean update;
    
    private void initialize(){

        perifs_pos.add(new Coord(0,1));
        perifs_pos.add(new Coord(1,-1));
        perifs_pos.add(new Coord(0,-1));    
        
        center.setColor(color);
    }
    
    
    public Piece(){
        center = new Square();
        update = true;
       
        perifs = new ArrayList<Square>();
        perifs_pos = new ArrayList<Coord>();
        
        initialize();
    }
    
    public Piece(int a, int b, Color c){
        center = new Square(a, b);
        update = true;
        
        color = c;
        
        perifs = new ArrayList<Square>(); 
        perifs_pos = new ArrayList<Coord>();
        
        initialize();
    }

    public Square getCenter() {
        return center;
    }

    public void setCenter(Square center) {
        this.center = center;
    }

    public List<Square> getPerifs() {
        return perifs;
    }

    public void setPerifs(List<Square> perifs) {
        this.perifs = perifs;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
          
    public void draw(ShapeRenderer shp){
        
        update();
        
        center.draw(shp);
        
        for(Square s:perifs)
            s.draw(shp);
    }
    
    public void move(int a, int b){
        center.move(a,b);
        for(Square s:perifs)
            s.move(a,b);
    }
    
    public void turnRight(){
        Coord aux;
        for(Coord c:perifs_pos){
            aux = new Coord(-c.y,c.x);
            c.setCoord(aux);
        }
        update = true;   
    }
    
    public void turnLeft(){
        Coord aux;
        for(Coord c:perifs_pos){
            aux = new Coord(c.y,-c.x);
            c.setCoord(aux);
        }
        update = true;
    }
    
    private void update(){
        if(update){
            perifs.clear();
            for(Coord c:perifs_pos)
                perifs.add(new Square(center.getPosX() + c.x, center.getPosY() + c.y, color)); 
            update = false;
        }
    }
   
}
