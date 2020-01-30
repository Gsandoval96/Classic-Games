package com.mygdx.chainreaction;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

public class ChainReaction extends ApplicationAdapter {
	ShapeRenderer shp;
        Board b;
        Controller controls;
	
	@Override
	public void create () {
		shp = new ShapeRenderer();
                b = new Board();
                
                controls = new Controller();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
                Gdx.input.setInputProcessor(controls);
                
                b.draw(shp);
	}
	
	@Override
	public void dispose () {
		shp.dispose();
	}
}