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

public class Assignmentq5 extends Applet implements ActionListener{
	
	
	
	public void init(){   					
	}	
	
	public void actionPerformed(ActionEvent e){ 		
	}  
	
	public void paint(Graphics g){
		g.setColor(Color.blue);
        g.drawOval(30,50,100,100);

        g.setColor(Color.black);
        g.drawOval(140,50,100,100);

        g.setColor(Color.red);
        g.drawOval(250,50,100,100);

        g.setColor(Color.yellow);
        g.drawOval(85,120,100,100);

        g.setColor(Color.green);
        g.drawOval(195,120,100,100);
        
	}	
	
}

