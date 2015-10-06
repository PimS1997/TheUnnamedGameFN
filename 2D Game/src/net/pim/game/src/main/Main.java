package net.pim.game.src.main;

import net.pim.game.src.gameloop.GameLoop;
import net.pim.game.src.gop.GameWindow;
import net.pim.game.src.gop.SpriteSheet;

public class Main implements Runnable{

	
	static SpriteSheet block = new SpriteSheet();
	
	public static void main(String[] args) {
		
		GameWindow frame = new GameWindow("2D Game", 1280, 720);
		frame.setFullScreen(0);
		frame.add(new GameLoop(1280, 720));
		frame.setVisible(true);
		
		
	}
	
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
