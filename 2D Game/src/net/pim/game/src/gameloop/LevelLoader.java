package net.pim.game.src.gameloop;

import java.awt.Graphics2D;

import net.pim.game.src.gamestate.GameState;
import net.pim.game.src.gamestate.GameStateManager;

public class LevelLoader extends GameState{

	public LevelLoader(GameStateManager gsm) {
		super(gsm);
		
	}

	public void init() {
		
		
	}

	public void tick(double deltaTime) {
		
		
	}

	public void render(Graphics2D g) {
		g.drawString("Hello world!", 200, 200);
	}

}
