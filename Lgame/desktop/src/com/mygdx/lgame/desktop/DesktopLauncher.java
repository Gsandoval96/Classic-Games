package com.mygdx.lgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.lgame.Lgame;
import com.mygdx.lgame.Square;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
                config.title = "Lgame";
                config.width = Square.SIZE * 6;
                config.height = Square.SIZE * 6;
		new LwjglApplication(new Lgame(), config);
	}
}
