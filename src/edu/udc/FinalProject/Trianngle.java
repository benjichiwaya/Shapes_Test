package edu.udc.FinalProject;

public class Trianngle
{
		private Point pointA;
		private Point pointB;
		private Point pointC;
		
		public Trianngle(Point pointA,Point pointB, Point pointC)
	{
		this.pointA= pointA;
		this.pointB= pointB;
		this.pointC= pointC;
	}
		public double getArea()
		{
	
			double height=(pointB.getY()-pointA.getY());
			System.out.println(height);
			double base=(pointB.getX()-pointC.getX());
			double area=(0.5)*base*height;
			
			return area;
		}
		public double getPerimeter()
		{
		double side1=Math.sqrt(Math.pow(pointA.getX() - pointB.getX(),2)
		+ Math.pow(pointA.getY() - pointB.getY(),2));
		double base=(pointB.getX()-pointC.getX());
		double side2=Math.sqrt(Math.pow(pointC.getX() - pointA.getX(),2)
				+ Math.pow(pointC.getY() - pointA.getY(),2));
		
		double perimeter= base+side1+side2;
		return perimeter;
		}
		
		public Point getPointA() {
			return pointA;
		}
		public void setPointA(Point pointA) {
			this.pointA = pointA;
		}
		public Point getPointB() {
			return pointB;
		}
		public void setPointB(Point pointB) {
			this.pointB = pointB;
		}
		public Point getPointC() {
			return pointC;
		}
		public void setPointC(Point pointC) {
			this.pointC = pointC;
		}


}
