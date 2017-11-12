/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.pkg1;
/**
 *	author:  Ankit Jain
 * */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;  

public class Assignmentq1 extends Applet implements ActionListener{
	
	//Used during deserialization
	private static final long serialVersionUID = 1L;
	
	TextField t1;
	Button b1;		
	
	int init_xc = 600;
	int init_yc = 400;
	
	int xc = init_xc;
	int yc = init_yc;
	
	int init_dia = 2;
	int dia = init_dia;
	
	int incr = 6;
	int count = 0;

	public void init(){  
		
		//Graphics g=getGraphics();	
		
		t1 = new TextField(10);
		t1.setBounds(250,250,400,20); 
		add(t1);
		t1.setText("0");
		
		b1=new Button("Make Concentric circles");  
		b1.setBounds(50,50,60,50);  
		add(b1);  	 	
		
	}
	
	
	public void actionPerformed(ActionEvent e){  
		  
		dia = init_dia;
		xc = init_xc;
		yc = init_yc;
		
		String str;
		
		try{
                str = t1.getText();
                count = Integer.parseInt(str);
        }
        catch(Exception ex){
        	ex.printStackTrace();
        }
		
		repaint();
		
	}  
	
	public void paint(Graphics g){
			
		g.drawString("Enter number of circles: ",430,30);	
		
		for(int i = 0; i < count; i++){
			
			Color c = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
			g.setColor(c);
		    
			g.drawOval(xc, yc, dia, dia);
			
			dia += incr;
			xc -= incr/2;
			yc -= incr/2;
			
			try{
				Thread.sleep(50);
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
		}		
		
		b1.addActionListener((ActionListener) this);
	}
	
}
