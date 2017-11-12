/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.pkg1;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.applet.*;  
import java.applet.Applet;

/**
 *
 * @author ankitJain
 */



public class Assignmentq2 extends Applet implements ActionListener{
	
	
	TextArea a1;
	TextField t1, t2;
	Button b1;		

	public void init(){  
		
		//Graphics g=getGraphics();	
		
		a1=new TextArea();  	    
	    add(a1);
	    a1.setBounds(10,10,200,400);	    
	    
		b1=new Button("Encrypt Message");    
		add(b1);  
		b1.setBounds(80,440,100,100);
		
		t1 = new TextField(10);		 
		add(t1);
		t1.setBounds(400,15,300,30);		
		t1.setText("0");
		
		t2 = new TextField(10);		 
		add(t2);
		t2.setBounds(400,85,300,30);		
		t2.setText("0");	
		
		setLayout(new BorderLayout());
		
	}	
	
	public void actionPerformed(ActionEvent e){  
			
		String str = "hey";
		
		try{
                str = a1.getText();
        }
        catch(Exception ex){
        	ex.printStackTrace();
        }
		
		t1.setText(encMsg(str));
		t2.setText(vowelCount(str));
		
		repaint();
		
	}  
	
	public void paint(Graphics g){
			
		g.drawString("Enter Text Above ",70,420);
		g.drawString("Encpryted Message",400,10);
		g.drawString("Vowel Count",400,80);		
		
		b1.addActionListener((ActionListener) this);
	}
	
	public String encMsg(String s){
		
		char[] c = s.toCharArray();
		
		for(int i = 0; i < c.length; i++)
			c[i] += 1;
		
		String ss = new String(c);
		return ss;
	}
	
	public String vowelCount(String s){
		
		char[] c = s.toCharArray();
		
		int count = 0;
		for(int i = 0; i < c.length; i++)
			if(
			c[i] == 'a' || 
			c[i] == 'e' || 
			c[i] == 'i' || 
			c[i] == 'o' || 
			c[i] == 'u' || 
			c[i] == 'A' || 
			c[i] == 'E' || 
			c[i] == 'I' || 
			c[i] == 'O' || 
			c[i] == 'U'
			)
				count++;
		
		String ss = "" + count;
		return ss;
	}
}


	
