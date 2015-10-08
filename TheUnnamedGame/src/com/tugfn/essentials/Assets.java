package com.tugfn.essentials;

import java.awt.image.BufferedImage;

import com.idgl.essentials.ImageLoader;
import com.idgl.essentials.SpriteSheet;

public class Assets {

	SpriteSheet sheet = new SpriteSheet();
	public BufferedImage img;
	
	public void init(){
		
		sheet.setSpriteSheet(ImageLoader.loadImage("spritesheets/spritesheet.png"));
	
	
		img = sheet.getTile(0, 0, 16, 16);
	}
}
