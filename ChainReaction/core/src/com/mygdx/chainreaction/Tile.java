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
public class Tile {
    private Square square;
    private List<Piece> pieces;
    private int n_pieces;

    public Tile(){
        square = new Square();
        pieces = new ArrayList<Piece>();
        n_pieces = 0;
    }

    public Tile(int x, int y){
        square = new Square(x,y);
        pieces = new ArrayList<Piece>();
        n_pieces = 0;
        addPiece();
    }

    public void addPiece(){
        pieces.add(new Piece(square.getPosX(),square.getPosY()));
        n_pieces++;
    }

    public void draw(ShapeRenderer shp){
        square.draw(shp);
        for(Piece p:pieces)
            p.draw(shp);
    }
}
