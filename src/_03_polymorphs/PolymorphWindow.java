package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseMotionListener, MouseListener{
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private JPanel panel;
    private Timer timer;
   JButton button;
    ArrayList<Polymorph> polys= new ArrayList<Polymorph>();
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
    	
   	 window = new JFrame("IT'S MORPHIN' TIME!");
   	 panel = new JPanel();
   	 window.addMouseMotionListener(this);
   	 window.add(this);
   	 window.getContentPane().setPreferredSize(new Dimension(500, 500));
   	 window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 window.pack();
   	 window.setVisible(true);
   	 
   	window.add(panel);     
	button = new JButton();
	panel.add(button);
	button.addMouseListener(this);
	button.setBounds(120, 10, 100, 100);
	
	
   	 BluePolymorph blue = new BluePolymorph(10,10,100,100);
   	 RedMorph red = new RedMorph(120,10,100,100);
   	 MovingMorph move = new MovingMorph(10,120,100,100);
   	 CircleMorph circle = new CircleMorph(120,120,100,100);
   	 
   	 
   	 

  
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
   	
   	 for(Polymorph p:polys) {
   		 p.draw(g);
   		 p.update();
   	 }

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
				repaint();
			}
		}
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		for(Polymorph p: polys) {
			if(p instanceof RedMorph) {
				if(e.getSource()==button) {
					JOptionPane.showMessageDialog(null, "RedMorph");
				}
			}
			
		}
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
