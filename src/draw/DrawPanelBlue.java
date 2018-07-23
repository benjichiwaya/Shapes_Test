package draw;
import java.awt.Color;
import java.awt.Graphics;




import javax.swing.JPanel;

import edu.udc.Shapes.BlueSquare;
public class DrawPanelBlue 
{
	private BlueSquare myBlue;
	
	public DrawPanelBlue(BlueSquare BlueSquare)
	{
	
		  myBlue = BlueSquare;
	}
	
	protected void paintComponent(Graphics g) {
		
		// This will draw my line
		 myBlue.draw(g);
;
	}

	public void setForeground(Color blue) {
		// TODO Auto-generated method stub
		
	}


}
