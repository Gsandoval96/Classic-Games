package com.tetris.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.tetris.game.Square;
import com.tetris.game.Tetris;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
                config.title = "Tetris";
                config.width = Square.SIZE * 17;
                config.height = Square.SIZE * 24;
		new LwjglApplication(new Tetris(), config);
	}
}
