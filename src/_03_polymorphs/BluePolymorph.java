package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class BluePolymorph extends Polymorph{
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;	
	BluePolymorph(int x, int y, int width, int height) {
		super(10, 10, 100, 100);
		if (needImage) {
		    loadImage ("PolyPic.png");
		}
	}

	void loadImage(String imageFile) {
	    if (needImage) {
	        try {
	            image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
		    gotImage = true;
	        } catch (Exception e) {
	            
	        }
	        needImage = false;
	    }
	}
	
	@Override
	public void draw(Graphics g) {
		if (gotImage) {
			g.drawImage(image, x, y, width, height, null);
		} else {
			g.setColor(Color.BLUE);
			g.fillRect(x, y, width, height);
		}

	}
	
}
