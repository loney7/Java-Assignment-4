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
import java.awt.event.ActionListener;
import java.applet.*;  
import java.util.logging.Level;
import java.util.logging.Logger;

public class Assignmentq6 extends Applet implements ActionListener{

	
	int xi = 100;
	int xl = 600;
	int count = 10;
	int w=10;
	int l=20;
	
	public void init(){   					
	}	
	
	public void actionPerformed(ActionEvent e){ 		
	}  
	
	public void paint(Graphics g){
		
		
		int y = xi;
		for(int i = 0; i < count; i++){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ex) {
                        
                    }
			g.setColor(Color.RED);
			g.fillRect(xi, y, xl, w);
			g.setColor(Color.BLACK);
			int x=xi;
			for(int j=0;j < xl/l; j++)
			{g.drawRect(x, y, l, w);x+=l;}
			y += 2*w; 
		}
		
		xi=xi+w;
		y = xi;
		for(int i = 0; i < count; i++){
                      try {
                        Thread.sleep(50);
                    } catch (InterruptedException ex) {
                        
                    }
			g.setColor(Color.RED);
			g.fillRect(xi, y, xl, w);
			g.setColor(Color.BLACK);
			int x=xi;
			for(int j=0;j < xl/l; j++)
			{g.drawRect(x, y, l, w);x+=l;}
			y += 2*w; 
		}
	}	
	
}

