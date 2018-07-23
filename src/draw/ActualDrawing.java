package draw;

import java.awt.Color;

import javax.swing.JFrame;
import draw.DrawPanel;

public class ActualDrawing {
	
	public static void mdraw(String[] args)
	{
		DrawPanel drawPanel = new DrawPanel();
		
		drawPanel.setForeground(Color.RED);
		
		JFrame frame = new JFrame();
		// Setting my frame dimensions
		frame.setSize(5000, 1000);
		// Telling what it does when frame gets closed
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Adding my drawing canvas to my frame
		frame.add(drawPanel);
		// Making visible my frame
		frame.setVisible(true);
	}
	
}
