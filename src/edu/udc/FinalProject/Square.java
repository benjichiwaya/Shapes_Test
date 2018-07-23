package edu.udc.FinalProject;

public class Square 
{	
		private Point pointA;
		private Point pointB;
		private Point pointC;
		private Point pointD;
				
	public Square(Point pointA,Point pointB, Point pointC, 
				Point pointD)
	{
		this.pointA= pointA;
		this.pointB= pointB;
		this.pointC= pointC;
		this.pointD= pointD;
			
	}
	public Square() {
		// TODO Auto-generated constructor stub
	}
	public int getHeight()
	{   int height= (int) (pointA.getY() - pointB.getY());
		
		return height;
	}
	 public int getxCoordinates()
	 {  int x1= (int) pointA.getX();
		 
		 return x1;
	 }
	 public int getyCoordinates()
	 {  int y1= (int) pointA.getY();
		 
		 return y1;
	 }
	 public double getArea()
	  {
		double d =Math.pow(pointA.getX() - pointB.getX(),2)
				+ Math.pow(pointA.getY() - pointB.getY(),2);
		double d2= Math.sqrt(d);
		
		return Math.pow(d2, 2);
  	  }
	   public double getPerimeter()
		{
			double d =Math.pow(pointA.getX() - pointB.getX(),2)
					+ Math.pow(pointA.getY() - pointB.getY(),2);
			double d2= Math.sqrt(d);
			
		     double pemetr= d2*4;
			
		     return pemetr;
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
	public Point getPointD() {
		return pointD;
	}
	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}
	
	   
	

}
