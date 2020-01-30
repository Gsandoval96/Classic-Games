/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mygdx.chainreaction;

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
    private int sizeX, sizeY;
    
    private List<Tile> board;
    
    public Board() {
        this.pos = new Coord(1,1);
        this.sizeX = 6;
        this.sizeY = 9;
        
        board = new ArrayList<Tile>();
        fillBoard();
    }
    
    public Board(Coord pos, int sizeX, int sizeY) {
        this.pos = pos;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        
        board = new ArrayList<Tile>();
        fillBoard();
    }
    
    private void fillBoard(){
        Tile box;
        for(int i=0;i<sizeX*sizeY;i++){
            box = new Tile(pos.x + i%sizeX,pos.y + i/sizeX);
            board.add(box);
        }
    }

    public void draw(ShapeRenderer shp){
        for(Tile t:board)
            t.draw(shp);
    }
    
}