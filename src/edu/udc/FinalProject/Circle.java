package edu.udc.FinalProject;

public class Circle 

{       private double pi= 3.142;
		private Point center;
		private int radius;
		 public Circle(int radius, Point center)
		 {
			 this.radius=radius;
			 this.center= center;
		 }
		public double getArea()
		{    
			
			double area= pi*(Math.pow(radius,2));
			
			return area;
		}
			public double getPerimeter()
			{
				double perimeter=2*pi*radius;
				return perimeter;
		    }
			
		public Point getCenter() {
			return center;
		}
		public void setCenter(Point center) {
			this.center = center;
		}
		public int getRadius() {
			return radius;
		}
		public void setRadius(int radius) {
			this.radius = radius;
		}
		
		
}
