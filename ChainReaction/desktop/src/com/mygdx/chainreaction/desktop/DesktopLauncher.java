package com.mygdx.chainreaction.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.mygdx.chainreaction.ChainReaction;
import com.mygdx.chainreaction.Square;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
                config.title = "ChainReaction";
                config.width = Square.SIZE * 8;
                config.height = Square.SIZE * 11;
		new LwjglApplication(new ChainReaction(), config);
	}
}
