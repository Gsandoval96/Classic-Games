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

/**
 *
 * @author gsandoval
 */
public class Board {
    private Coord pos;
    private Color col;
    private int sizeX, sizeY;
    
    private List<Square> board;
    
    public Board() {
        this.pos = new Coord(1,1);
        this.col = Color.GRAY;
        this.sizeX = 4;
        this.sizeY = 4;
        
        board = new ArrayList<Square>();
        fillBoard();
    }
    
    public Board(Coord pos, int sizeX, int sizeY) {
        this.pos = pos;
        this.col = Color.GRAY;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        
        board = new ArrayList<Square>();
        fillBoard();
    }
    
    private void fillBoard(){
        Square box;
        for(int i=0;i<sizeX*sizeY;i++){
            box = new Square(pos.x + i%sizeX,pos.y + i/sizeX,col);
            board.add(box);
        }
    }

    public void draw(ShapeRenderer shp){
        for(Square s:board)
            s.draw(shp);
    }
    
    public boolean hasInside(Square s){
        boolean isInside = false;
            
            if(s.getPosX()>= pos.x && s.getPosX() <= pos.x + sizeX -1 &&
               s.getPosY()>= pos.y && s.getPosY() <= pos.y + sizeY -1)
            isInside = true;
        
        return isInside;
    }
    
    
    
}
