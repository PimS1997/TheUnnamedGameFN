package com.tugfn.main;

import com.idgl.essentials.GameWindow;
import com.tugfn.gameloop.Gameloop;

public class Main {

	public static void main(String[] args) {

		GameWindow window = new GameWindow("asas", 0);
		window.setFullscreen(0);
		window.add(new Gameloop(window.getDWidth(), window.getDHeight()));
		window.setVisible(true);
	}

}
