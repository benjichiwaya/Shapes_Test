package draw;
	
import java.awt.Color;
import java.awt.Graphics;


import javax.swing.JPanel;






import edu.udc.FinalProject.Square;
import edu.udc.Shapes.MyLine;

public class DrawPanel extends JPanel {

	static final long serialVersionUID = 1L;
	
	private MyLine myLine;
	
	public DrawPanel()
	{
	
		  myLine = new MyLine(100, 100, 100, 100, Color.RED,2);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// This will draw my line
		 myLine.draw(g);
	}

}

