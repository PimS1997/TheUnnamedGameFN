package net.pim.game.src.gop;

import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

public class GameWindow extends JFrame{

	boolean fse = false;
	int fsm = 2;
	GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
	
	public GameWindow(String title, int width, int height){
		setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	}
	
	private void setfullscreen(int fsnm){
		
		switch(fsm){
		case 0:
			System.out.println("No Fullscreen");
			setUndecorated(false);
			break;
		case 1:
			setUndecorated(true);
			setExtendedState(JFrame.MAXIMIZED_BOTH);
			break;
		case 2:
			setUndecorated(true);
			device.setFullScreenWindow(this);
			break;
		}
		
	}
	public void setFullScreen(int fsnm){
		fse = true;
		if(fsm <= 2){
			this.fsm = fsnm;
			setfullscreen(fsm);
		}else{
			System.err.println("Error" + fsnm + "is not Supported.");
		}
	}
}
