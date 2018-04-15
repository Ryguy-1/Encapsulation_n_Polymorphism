package _03_polymorphs;

import java.awt.Graphics;
import java.util.ArrayList;

public abstract class Polymorph {
    int x;
    int y;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public ArrayList get() {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(x);
    list.add(y);
    return list;
    }
    
    public void set(int x, int y) {
    	this.x=x;
    	this.y=y;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);
}
