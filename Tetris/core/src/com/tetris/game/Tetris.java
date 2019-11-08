package com.tetris.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import java.util.ArrayList;
import java.util.List;

public class Tetris extends ApplicationAdapter {
        ShapeRenderer shp;
        Controller controls;
        static Game g;
        
	
	@Override
	public void create () {
                shp = new ShapeRenderer();
                controls = new Controller();
                g = new Game();
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
                
                Gdx.input.setInputProcessor(controls);
                g.draw(shp);
	}
	
	@Override
	public void dispose () {
                shp.dispose();
	}
}
