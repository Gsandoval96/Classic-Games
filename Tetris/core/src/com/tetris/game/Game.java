/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tetris.game;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import java.util.Random;

/**
 *
 * @author gsandoval
 */
public class Game {
    private Board board;
    private Piece actual, next, saved;
    private long seed;
    private Random rand;

    public Game(){
        board = new Board();
        actual = new Piece(5,18);
        next = new Piece();
        saved = new Piece();
        
        initialize();
    }
    
    private void initialize(){
        seed = System.currentTimeMillis();
        rand = new Random(seed);
    }
    
    public void draw(ShapeRenderer shp){
        board.draw(shp);
        actual.draw(shp);
        saved.draw(shp);
    }
    
    public Piece getP(){
        return actual;
    }
    
    
    
    public void newPiece(){
        actual = new Piece(5,18,rand.nextInt(6));
    }
    
    public void savePiece(){
        
    }
    
}
