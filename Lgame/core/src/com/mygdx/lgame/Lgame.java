package com.mygdx.lgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class Lgame extends ApplicationAdapter {
	ShapeRenderer shp;
        static Board b;
        static Piece p1;
        static Piece p2;
        static boolean turno;
        static boolean turnoC;
        static boolean c1;
        static Square s1;
        static Square s2;
        Controller controls;
	
	@Override
	public void create () {
		shp = new ShapeRenderer();
                
                b = new Board();
                
                p1 = new Piece(2,2,Color.RED);
                
                p2 = new Piece(2,2,Color.BLUE);
                p2.turnRight();
                p2.turnRight();
                p2.move(1, 1);
                
                s1 = new Square(1,1);
                s2 = new Square(4,4);
                
                c1 = true;
                
                turno = true;
                turnoC = false;
                
                controls = new Controller();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
                Gdx.input.setInputProcessor(controls);
                
                b.draw(shp);
                p1.draw(shp);
                p2.draw(shp);
                
                s1.draw(shp);
                s2.draw(shp);
	}
	
	@Override
	public void dispose () {
		shp.dispose();
	}
}
