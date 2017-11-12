/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.pkg1;

/**
 *
 * @author ankitJain
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.applet.*;  

public class Assignment2q7 extends Applet implements MouseListener{
	
	//Used during deserialization
	private static final long serialVersionUID = 1L;	
	
	int x1 = 0, y1 = 0;
	int x2 = 0, y2 = 0;
    
	public void init(){  
	    addMouseListener(this);
	}	
	
	public void actionPerformed(ActionEvent e){ 		
	}  
	
	public void paint(Graphics g){		
	}	
	
	public void mousePressed(MouseEvent e) {
		x1 = e.getX();
		y1 = e.getY();
		//repaint();
	}

	public void mouseReleased(MouseEvent e) {
		x2 = e.getX();
		y2 = e.getY();
		//repaint();
		Graphics g = getGraphics();	
		Color c = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
		g.setColor(c);		
		g.drawLine(x1, y1, x2, y2);
		
		g.setColor(Color.BLACK);
		g.fillOval(x1, y1, 5, 5);
		g.fillOval(x2, y2, 5, 5);
	}
	
	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {	      
	}

	public void mouseClicked(MouseEvent e) {
		
	}
	
}

