package edu.udc.FinalProject;

public class Point 
{
		private double x, y;

		public Point(double xCoordinate, double yCoordinate)

		{
			x = xCoordinate;
			y = yCoordinate;
		}

		public double getX()

		{
			return x;
		}

		public double getY()

		{
			return y;
		}

		public String toString()

		{
			return "( " + getX() + ", " + getY() + " )";
		}
} // end class Point
