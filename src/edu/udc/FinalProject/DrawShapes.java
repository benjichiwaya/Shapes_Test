package edu.udc.FinalProject;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;

public class DrawShapes 
{
	String colour= JOptionPane.showInputDialog("Enter the color number of your choice\n1. RED\n2. Blue\n3. Black\n4. Green");
	  int color = Integer.parseInt (colour);
	
	 String xCoordinate= JOptionPane.showInputDialog("Enter the frist X.");
	 private  int x1 = Integer.parseInt (xCoordinate);
	  
	 String yCoordinate=JOptionPane.showInputDialog("Enter the frist Y.");
	 private  int y1=Integer.parseInt (yCoordinate);
	  
	 String height=JOptionPane.showInputDialog("Enter the the height.");
	   int hght=Integer.parseInt (height);
	 
	 String width= JOptionPane.showInputDialog("Enter the width.");
	   int wdth=Integer.parseInt (width);
	
	 void draw(Graphics g)
	 {
	    switch(color)
	    
	    {
	    case 1:  g.setColor(Color.red);
	                           break;
	    case 2:  g.setColor(Color.red);
                               break;
	    case 3:  g.setColor(Color.red);
                               break;
	    case 4:  g.setColor(Color.red);
                               break;
	    }
		g.setColor(Color.red);
		
		g.drawRect(x1,y1,hght,wdth);
	}

}
