package net.pim.game.src.gameloop;

import java.awt.Component;

import net.pim.game.src.gamestate.GameStateManager;
import net.pim.game.src.gop.GOPGameLoop;

public class GameLoop extends GOPGameLoop {

	GameStateManager gsm;
	
	public GameLoop(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void init() {
		gsm = new GameStateManager();
		gsm.init();
		super.init();
	}
	@Override
	public void tick(double deltaTime) {
	gsm.tick(deltaTime);
	}
	@Override
	public void render() {
		super.render();
		gsm.render(graphics2D);
		clear();
	}

	@Override
	public void clear() {
		super.clear();
	}


}
