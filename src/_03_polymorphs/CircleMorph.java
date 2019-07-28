package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{

	int circleCounter;
	
	CircleMorph(int x, int y, int width, int height){
		super(x,y,width,height);
		
	}
	
	public void draw(Graphics g) {
		
		g.setColor(Color.black);
		g.fillRect(x, y, width, height);
	}
	
	public void update() {
		
		setX((int)(getX()+Math.cos(circleCounter)*100));
		setY((int)(getX()+Math.cos(circleCounter)*100));
		
		circleCounter++;
		
	}
	
}
