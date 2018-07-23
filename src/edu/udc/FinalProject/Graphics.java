package draw;

import java.awt.Color;

import edu.udc.FinalProject.ShapesTest;
import edu.udc.FinalProject.Square;


public class Graphics  extends ShapesTest

{
	Square mySquare= new Square();
	
	int height= mySquare.getHeight();
	int x1= mySquare.getxCoordinates();
	int y1=mySquare.getyCoordinates();
	
	public void draw(Graphics graphics)
	    {
	    int color=1;
		switch(color)
	    
	    {
	    case 1:
	    {
	    	graphics.setColor(Color.red);
    	    graphics.drawRect(x1,y1,height,height);
	    }
	                            break;
	     
	    }
	    }


	public void drawRect(int x1, int y1, int height, int height1) {
		// TODO Auto-generated method stub
		
	}

	public void setColor(Color red) {
		// TODO Auto-generated method stub

	}
}

	
