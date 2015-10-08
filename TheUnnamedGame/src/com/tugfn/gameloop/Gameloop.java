package com.tugfn.gameloop;

import java.util.concurrent.CopyOnWriteArrayList;

import com.idgl.essentials.NewGameLoop;
import com.tugfn.essentials.Assets;
import com.tugfn.essentials.GameThread;


public class Gameloop extends NewGameLoop{

	private CopyOnWriteArrayList<GameThread> threads = new CopyOnWriteArrayList<GameThread>();
	
	Assets assets = new Assets();
	
	public Gameloop(int fwidth, int fheight) {
		super(fwidth, fheight);
	}
	

	public void init() {
		//INIT shit
		
		//init textures
		
		assets.init();
		
		for(GameThread thread : threads){
			thread.start();
		}
		
		super.init();
	}

	public void tick(double deltaTime) {

	}

	public void render() {
		super.render();
		
		graphics2D.drawString("Hello world", 200, 200);
		graphics2D.drawImage(assets.img, 0, 0, 32*5, 32*5, null);
		clear();
	}
	@Override
	public void clear() {
		super.clear();
	}
}
