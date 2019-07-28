package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
   
    ArrayList<Polymorph> polys;
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	 BluePolymorph blue = new BluePolymorph(10,10,100,100);
   	 RedMorph red = new RedMorph(120,10,100,100);
   	 MovingMorph move = new MovingMorph(10,120,100,100);
   	 CircleMorph circle = new CircleMorph(120,120,100,100);
   	 
   	 polys = new ArrayList<Polymorph>();
  
   	 polys.add(blue);
   	 polys.add(red);
   	 polys.add(move);
   	 polys.add(circle);
   	 
   	 
   	 
   	 
   	 timer = new Timer(1000 / 30, this);
   	 timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	System.out.println(polys.size());
   	 for(Polymorph p:polys) {
   		 p.draw(g);
   		 p.update();
   	 }
   	 System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
  
   	
   	 
    }

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		for(Polymorph p: polys) {
			if(p instanceof MovingMorph) {
				p.setX(e.getX());
				p.setY(e.getY());
			}
		}
		
	}
}
