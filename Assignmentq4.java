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

public class Assignmentq4 extends Applet implements ActionListener{
	

	TextField t1, t2, t3, t4, t5, t6, t7, t8;
	Button b1;	
	
	int x = 600;
	int y = 250;
	int n1, n2, n3, n4, n5, n6, n7, n8;
	
	int R = 200;
	
	public void init(){  
		
		//Graphics g=getGraphics();	    		
		
		t1 = new TextField(10);		 
		add(t1);
		t1.setBounds(100,25,300,20);		
		t1.setText("7");
		
		t2 = new TextField(10);		 
		add(t2);
		t2.setBounds(100,50,300,20);		
		t2.setText("2");
		
		t3 = new TextField(10);		 
		add(t3);
		t3.setBounds(100,75,300,20);		
		t3.setText("3");
		
		t4 = new TextField(10);		 
		add(t4);
		t4.setBounds(100,100,300,20);		
		t4.setText("4");
		
		t5 = new TextField(10);		 
		add(t5);
		t5.setBounds(100,125,300,20);		
		t5.setText("6");
		
		t6 = new TextField(10);		 
		add(t6);
		t6.setBounds(100,150,300,20);		
		t6.setText("1");
		
		t7 = new TextField(10);		 
		add(t7);
		t7.setBounds(100,175,300,20);		
		t7.setText("8");
		
		t8 = new TextField(10);		 
		add(t8);
		t8.setBounds(100,200,300,20);		
		t8.setText("5");
		
		b1=new Button("Go");    
		add(b1);  
		b1.setBounds(200,260,60,50);
		
		setLayout(new BorderLayout());
		
	}	
	
	public void actionPerformed(ActionEvent e){  
			
		String str = "hey";
		
		try{
                str = t1.getText();
                n1 = Integer.parseInt(str);
                
                str = t2.getText();
                n2 = Integer.parseInt(str);

                str = t3.getText();
                n3 = Integer.parseInt(str);
                
                str = t4.getText();
                n4 = Integer.parseInt(str);
                
                str = t5.getText();
                n5 = Integer.parseInt(str);
                
                str = t6.getText();
                n6 = Integer.parseInt(str);
                
                str = t7.getText();
                n7 = Integer.parseInt(str);
                
                str = t8.getText();
                n8 = Integer.parseInt(str);
                
        }
        catch(Exception ex){
        	ex.printStackTrace();
        }
		
		repaint();
		
	}  
	
	public void paint(Graphics g){
			
		g.drawString("Enter Numbers Below: ",100,10);	
		int sum = n1+n2+n3+n4+n5+n6+n7+n8;
		
		int max=n1;if(max<=n2)max=n2;if(max<=n3)max=n3;if(max<=n4)max=n4;
		if(max<=n5)max=n5;if(max<=n6)max=n6;if(max<=n7)max=n7;if(max<=n8)max=n8;
		
		if(max==0)max=1;
		if(sum==0)sum=1;
		int prev=0;
		int next=(int)(((n1*360)/sum));
		
		g.setColor(Color.RED);g.fillRect(100,650-((n1*320)/max),40,((n1*320)/max));
		g.fillRect(850, 100, 10, 10);
		g.drawString("" + n1 + "  :  " + ((n1*100)/sum) + "%"+max, 870, 110);
		g.fillArc(x,y,R,R,prev,next);
		
		prev=next;
		next+=(int)(((n2*360)/sum));
		g.setColor(Color.GREEN);g.fillRect(140,650-((n2*320)/max),40,((n2*320)/max));
		g.fillRect(850, 125, 10, 10);
		g.drawString("" + n2 + "  :  " + ((n2*100)/sum) + "%", 870, 135);
		g.fillArc(x,y,R,R,prev,next-prev);
		
		prev=next;
		next+=(int)(((n3*360)/sum));
		g.setColor(Color.BLUE);g.fillRect(180,650-((n3*320)/max),40,((n3*320)/max));
		g.fillRect(850, 150, 10, 10);
		g.drawString("" + n3 + "  :  " + ((n3*100)/sum) + "%", 870, 160);
		g.fillArc(x,y,R,R,prev,next-prev);
		
		prev=next;
		next+=(int)(((n4*360)/sum));
		g.setColor(Color.YELLOW);g.fillRect(220,650-((n4*320)/max),40,((n4*320)/max));
		g.fillRect(850, 175, 10, 10);
		g.drawString("" + n4 + "  :  " + ((n4*100)/sum) + "%", 870, 185);
		g.fillArc(x,y,R,R,prev,next-prev);
		
		prev=next;
		next+=(int)(((n5*360)/sum));
		g.setColor(Color.PINK);g.fillRect(260,650-((n5*320)/max),40,((n5*320)/max));
		g.fillRect(850, 200, 10, 10);
		g.drawString("" + n5 + "  :  " + ((n5*100)/sum) + "%", 870, 210);
		g.fillArc(x,y,R,R,prev,next-prev);
		
		prev=next;
		next+=(int)(((n6*360)/sum));
		g.setColor(Color.BLACK);g.fillRect(300,650-((n6*320)/max),40,((n6*320)/max));
		g.fillRect(850, 225, 10, 10);
		g.drawString("" + n6 + "  :  " + ((n6*100)/sum) + "%", 870, 235);
		g.fillArc(x,y,R,R,prev,next-prev);
		
		prev=next;
		next+=(int)(((n7*360)/sum));
		g.setColor(Color.ORANGE);g.fillRect(340,650-((n7*320)/max),40,((n7*320)/max));
		g.fillRect(850, 250, 10, 10);
		g.drawString("" + n7 + "  :  " + ((n7*100)/sum) + "%", 870, 260);
		g.fillArc(x,y,R,R,prev,next-prev);
		
		prev=next;
		next+=(int)(((n8*360)/sum));
		g.setColor(Color.MAGENTA);g.fillRect(380,650-((n8*320)/max),40,((n8*320)/max));
		g.fillRect(850, 275, 10, 10);
		g.drawString("" + n8 + "  :  " + ((n8*100)/sum) + "%", 870, 285);
		g.fillArc(x,y,R,R,prev,next-prev);			
		
		g.setColor(Color.BLACK);
		g.fillRect(98, 300, 2, 350);
		g.fillRect(100, 650, 350, 2);
		g.drawString("O", 90, 660);
		g.fillRect(100, 650, 350, 2);
		g.drawString("Y", 95, 295);
		g.fillRect(100, 650, 350, 2);
		g.drawString("X", 455, 655);	
		
		
		b1.addActionListener((ActionListener) this);
	}	
	
}

