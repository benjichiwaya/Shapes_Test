package edu.udc.FinalProject;

public class Oval 
{   private double pi=3.142;
	private Point pointA;
    private Point pointB;
    private Point pointC;
    private Point pointD;
    
    public Oval(Point pointA,Point pointB, Point pointC, 
			Point pointD)
{
	this.pointA= pointA;
	this.pointB= pointB;
	this.pointC= pointC;
	this.pointD= pointD;
		
}
   
	public double getArea()
   
    {
    	double height=(pointB.getY()-pointA.getY());
		System.out.println(height);
		double width=(pointD.getX()-pointC.getX());
    	
		double area= pi*width*height;
    	return area;
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
