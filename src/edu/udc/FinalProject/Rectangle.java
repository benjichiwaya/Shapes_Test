package edu.udc.FinalProject;
public class Rectangle 
{ 
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private Point pointD;
	
	public Rectangle(Point pointA,Point pointB, Point pointC, 
			         Point pointD)
{
	this.pointA= pointA;
	this.pointB= pointB;
	this.pointC= pointC;
	this.pointD= pointD;
		
}
 public double getArea()
  {
	 double width =Math.pow(pointA.getX() - pointB.getX(),2)
				+ Math.pow(pointA.getY() - pointB.getY(),2);
		double w= Math.sqrt(width);
		double height =Math.pow(pointC.getX() - pointB.getX(),2)
				+ Math.pow(pointC.getY() - pointB.getY(),2);
		double h= Math.sqrt(height);
		
	     double area= w*h;

	
	return area;
	  }
 
   public double getPerimeter()
	{
		double width =Math.pow(pointA.getX() - pointB.getX(),2)
				+ Math.pow(pointA.getY() - pointB.getY(),2);
		double w= Math.sqrt(width);
		double height =Math.pow(pointC.getX() - pointB.getX(),2)
				+ Math.pow(pointC.getY() - pointB.getY(),2);
		double h= Math.sqrt(height);
		
	     double pemetr= 2*(w+h);
		
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
