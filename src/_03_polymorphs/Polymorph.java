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
    
    public void set(int x, int y, int width, int height) {
    	this.x=x;
    	this.y=y;
    	this.width=width;
    	this.height=height;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
