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

public class Assignmentq3 extends Applet implements ActionListener{
	

	TextField t1, t2;
	Button b1;	
	
	int num;

	public void init(){  
		
		//Graphics g=getGraphics();	    		
		
		t1 = new TextField(10);		 
		add(t1);
		t1.setBounds(100,25,300,30);		
		//t1.setText("0");
		
		t2 = new TextField(10);		 
		add(t2);
		t2.setBounds(100,185,300,30);		
		//t2.setText("0");	
		
		b1=new Button("Convert to Roman");    
		add(b1);  
		b1.setBounds(200,60,200,50);
		
		setLayout(new BorderLayout());
		
	}	
	
	public void actionPerformed(ActionEvent e){  
			
		String str = "hey";
		
		try{
                str = t1.getText();
                num = Integer.parseInt(str);
        }
        catch(Exception ex){
        	ex.printStackTrace();
        }
		
		t2.setText(roman(num));
		
		repaint();
		
	}  
	
	public void paint(Graphics g){
			
		g.drawString("Enter Number Below: ",100,10);
		g.drawString("Roman Value: ",100,170);		
		
		b1.addActionListener((ActionListener) this);
	}
	
	public String roman(int input){
		
		if (input < 1 || input > 3999)
	        return "Invalid Roman Number Value";
		
	    String s = "";
	    
	    while (input >= 1000) {
	        s += "M";
	        input -= 1000;   
	    }
	    
	    while (input >= 900) {
	        s += "CM";
	        input -= 900;
	    }
	    
	    while (input >= 500) {
	        s += "D";
	        input -= 500;
	    }
	    
	    while (input >= 400) {
	        s += "CD";
	        input -= 400;
	    }
	    
	    while (input >= 100) {
	        s += "C";
	        input -= 100;
	    }
	    
	    while (input >= 90) {
	        s += "XC";
	        input -= 90;
	    }
	    
	    while (input >= 50) {
	        s += "L";
	        input -= 50;
	    }
	    
	    while (input >= 40) {
	        s += "XL";
	        input -= 40;
	    }
	    
	    while (input >= 10) {
	        s += "X";
	        input -= 10;
	    }
	    
	    while (input >= 9) {
	        s += "IX";
	        input -= 9;
	    }
	    
	    while (input >= 5) {
	        s += "V";
	        input -= 5;
	    }
	    
	    while (input >= 4) {
	        s += "IV";
	        input -= 4;
	    }
	    
	    while (input >= 1) {
	        s += "I";
	        input -= 1;
	    }
	    
	    return s;
	
	}
	
}
