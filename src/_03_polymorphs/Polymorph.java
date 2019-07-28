package _03_polymorphs;

import java.awt.Graphics;
import java.util.ArrayList;

public abstract class Polymorph {
    int x;
    int y;
    int width;
    int height;
    
    Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.height=height;
   	 this.width=width;
    }
    
    public ArrayList get() {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(x);
    list.add(y);
    return list;
    }
    
    public void setX(int x) {
    	this.x=x;
    }
    public void setY(int y) {
    	this.y=y;
    }
    public int getX() {
    	return x;
    }
    public int getY() {
    	return y;
    }
    
    public void update(){
   	 
    	
    	
    }
    
    public abstract void draw(Graphics g);
}
