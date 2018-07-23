package edu.udc.FinalProject;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import draw.DrawPanel;
import draw.DrawPanelBlue;




public class ShapesTest
  {
	  public static void getShapesTest(String []args)
	  {   
		  String sHape= JOptionPane.showInputDialog("Enter the number that represents your desired Shape\n\n1. Square\n2. Rectangle\n3."
		  		                                                         + " Triangle\n4. Circle\n5. Oval\n6. Diamond");
		  int shape = Integer.parseInt (sHape);
		 // int color=1;
		  while(shape!=0){
		  switch(shape)
		  {
		    //The Square case
			  case 1:
			  {
				 String xCoordinate= JOptionPane.showInputDialog("Enter the frist X.");
				  int x1 = Integer.parseInt (xCoordinate);
				  
				 String yCoordinate=JOptionPane.showInputDialog("Enter the frist Y.");
				  int y1=Integer.parseInt (yCoordinate);
				  
				  xCoordinate= JOptionPane.showInputDialog("Enter the second X.");
				  int x2=Integer.parseInt(xCoordinate);
				  
				  yCoordinate=JOptionPane.showInputDialog("Enter the second Y.");
				  int y2=Integer.parseInt (yCoordinate);
				  
				  xCoordinate= JOptionPane.showInputDialog("Enter the third X.");
				  int x3=Integer.parseInt (xCoordinate);
				  
				  yCoordinate=JOptionPane.showInputDialog("Enter the third Y.");
				  int y3=Integer.parseInt (yCoordinate);
				  
				  xCoordinate= JOptionPane.showInputDialog("Enter the fourth X.");
				  int x4=Integer.parseInt (xCoordinate);
				  
				  yCoordinate=JOptionPane.showInputDialog("Enter the fourth Y.");
				  int y4=Integer.parseInt (yCoordinate);
				  
			         
				    Point a= new Point(x1,y1);
			        Point b= new Point(x2,y2);
			        Point c= new Point(x3,y3);
			        Point d= new Point(x4,y4);
			        
				    Square mySquare =new Square(a,b,c,d);
				    
				  //  int height= mySquare.getHeight();
				    
				    JOptionPane.showMessageDialog( null, "The area of the square is "+mySquare.getArea()+" and it's perimeter"
				                                     		+ " is "+mySquare.getPerimeter() ); 
				    
				    
				 String colro=JOptionPane.showInputDialog( null,"The program will now draw the shape for you. What color would you like your "
				                                  	+  "shape to be?\n*You can only type in RED BLUE GREEN or YELLOW");
				 switch(colro)
				 {
				 case "RED":
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
				            	
				            }break;
				            
				 case "BLUE": {
					     DrawPanel drawPanel = new DrawPanel();
						
						
						
						JFrame frame = new JFrame();
						// Setting my frame dimensions
						frame.setSize(5000, 1000);
						// Telling what it does when frame gets closed
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						// Adding my drawing canvas to my frame
						frame.add(drawPanel);
					
						drawPanel.setForeground(Color.BLUE);
						// Making visible my frame
						frame.setVisible(true);
					 
				               }break;
				 
				 }
				    
			    	
				   }
			                   break;
				    	
			//The Rectangle case
			  case 2:{
					  String xCoordinate= JOptionPane.showInputDialog("Enter the frist X.");
				      int x1 = Integer.parseInt (xCoordinate);
					  
					 String yCoordinate=JOptionPane.showInputDialog("Enter the frist Y.");
					  int y1=Integer.parseInt (yCoordinate);
					  
					  xCoordinate= JOptionPane.showInputDialog("Enter the second X.");
					  int x2=Integer.parseInt(xCoordinate);
					  
					  yCoordinate=JOptionPane.showInputDialog("Enter the second Y.");
					  int y2=Integer.parseInt (yCoordinate);
					  
					  xCoordinate= JOptionPane.showInputDialog("Enter the third X.");
					  int x3=Integer.parseInt (xCoordinate);
					  
					  yCoordinate=JOptionPane.showInputDialog("Enter the third Y.");
					  int y3=Integer.parseInt (yCoordinate);
					  
					  xCoordinate= JOptionPane.showInputDialog("Enter the fourth X.");
					  int x4=Integer.parseInt (xCoordinate);
					  
					  yCoordinate=JOptionPane.showInputDialog("Enter the fourth Y.");
					  int y4=Integer.parseInt (yCoordinate);
					  
				       
					    Point a= new Point(x1,y1);
				        Point b= new Point(x2,y2);
				        Point c= new Point(x3,y3);
				        Point d= new Point(x4,y4);
				        
					    Rectangle myRectangle =new Rectangle(a,b,c,d);
					    
					    JOptionPane.showMessageDialog (  null, "The area of the rectangle is "+myRectangle.getArea()+" and it's perimeter is"
					    	                           	+ " "+myRectangle.getPerimeter() ); 

			       }
			         break;
			  
		   //The  Triangle case
			  case 3:
			  {

				  String xCoordinate= JOptionPane.showInputDialog("Enter the frist X.");
				  int x1 = Integer.parseInt (xCoordinate);
				  
				 String yCoordinate=JOptionPane.showInputDialog("Enter the frist Y.");
				  int y1=Integer.parseInt (yCoordinate);
				  
				  xCoordinate= JOptionPane.showInputDialog("Enter the second X.");
				  int x2=Integer.parseInt(xCoordinate);
				  
				  yCoordinate=JOptionPane.showInputDialog("Enter the second Y.");
				  int y2=Integer.parseInt (yCoordinate);
				  
				  xCoordinate= JOptionPane.showInputDialog("Enter the third X.");
				  int x3=Integer.parseInt (xCoordinate);
				  
				  yCoordinate=JOptionPane.showInputDialog("Enter the third Y.");
				  int y3=Integer.parseInt (yCoordinate);
				  
				  Point a= new Point(x1,y1);
			      Point b= new Point(x2,y2);
			      Point c= new Point(x3,y3);
			      
			      Trianngle myTriangle =new Trianngle(a,b,c);
				    
				    JOptionPane.showMessageDialog (  null, "The area of the Triangle is "+myTriangle.getArea()+" and it's perimeter is"
				    	                           	+ " "+myTriangle.getPerimeter() );
				  
				  
			  }
			         break;
			  
		   //The Circle case
			  case 4:
   			     {  
			       String cRadius=JOptionPane.showInputDialog("Enter the radius of the circle.");
				             int radius=Integer.parseInt (cRadius);
				             
				             String centralx=JOptionPane.showInputDialog("Enter the center point of the circle.");
				             int x=Integer.parseInt (centralx);
				             String centraly=JOptionPane.showInputDialog("Enter the center point of the circle.");
				             int y=Integer.parseInt (centraly);
			      
			    	        Point center= new Point(x,y);
			    	        Circle myCircle=new Circle(radius,center);
			    	       JOptionPane.showMessageDialog (  null, "The area of the Circle is "+myCircle.getArea()+" and it's perimeter is"
                         	+ " "+myCircle.getPerimeter() );
			                                          break;
			      
			      }
				 
			  
	      //The Oval case
			  case 5:
			          {
			        	  String xCoordinate= JOptionPane.showInputDialog("Enter the first X of the height.");
					      int x1 = Integer.parseInt (xCoordinate);
						  
						 String yCoordinate=JOptionPane.showInputDialog("Enter the frist Y of the height.");
						  int y1=Integer.parseInt (yCoordinate);
						  
						  xCoordinate= JOptionPane.showInputDialog("Enter the second X of the height.");
						  int x2=Integer.parseInt(xCoordinate);
						  
						  yCoordinate=JOptionPane.showInputDialog("Enter the second Y of the height.");
						  int y2=Integer.parseInt (yCoordinate);
						  
						  xCoordinate= JOptionPane.showInputDialog("Enter the first X of the width.");
						  int x3=Integer.parseInt (xCoordinate);
						  
						  yCoordinate=JOptionPane.showInputDialog("Enter the first Y of the width.");
						  int y3=Integer.parseInt (yCoordinate);
						  
						  xCoordinate= JOptionPane.showInputDialog("Enter the second X of the width.");
						  int x4=Integer.parseInt (xCoordinate);
						  
						  yCoordinate=JOptionPane.showInputDialog("Enter the second Y of the width.");
						  int y4=Integer.parseInt (yCoordinate);
						  
					       
						    Point a= new Point(x1,y1);
					        Point b= new Point(x2,y2);
					        Point c= new Point(x3,y3);
					        Point d= new Point(x4,y4);  
					        
					      Oval myOval= new Oval(a,b,c,d); 
					      
						    JOptionPane.showMessageDialog (  null, "The area of the rectangle is "+myOval.getArea()+". It's pperimeter exists but it cannot be easily found"); 

		        	  }
			                                        break;
			  case 6:  
			           {
			        	   String xCoordinate= JOptionPane.showInputDialog("Enter the frist X.");
							  int x1 = Integer.parseInt (xCoordinate);
							  
							 String yCoordinate=JOptionPane.showInputDialog("Enter the frist Y.");
							  int y1=Integer.parseInt (yCoordinate);
							  
							  xCoordinate= JOptionPane.showInputDialog("Enter the second X.");
							  int x2=Integer.parseInt(xCoordinate);
							  
							  yCoordinate=JOptionPane.showInputDialog("Enter the second Y.");
							  int y2=Integer.parseInt (yCoordinate);
							  
							  xCoordinate= JOptionPane.showInputDialog("Enter the third X.");
							  int x3=Integer.parseInt (xCoordinate);
							  
							  yCoordinate=JOptionPane.showInputDialog("Enter the third Y.");
							  int y3=Integer.parseInt (yCoordinate);
							  
							  xCoordinate= JOptionPane.showInputDialog("Enter the fourth X.");
							  int x4=Integer.parseInt (xCoordinate);
							  
							  yCoordinate=JOptionPane.showInputDialog("Enter the fourth Y.");
							  int y4=Integer.parseInt (yCoordinate);
							  
						        {  
							    Point a= new Point(x1,y1);
						        Point b= new Point(x2,y2);
						        Point c= new Point(x3,y3);
						        Point d= new Point(x4,y4);
						        
							    Diamond myDiamond =new Diamond(a, b, c, d);
							    JOptionPane.showMessageDialog (  null, "The area of the diamond is "+myDiamond.getArea()+" and it's perimeter is "+myDiamond.getPerimeter() ); 

					        }	
						 }
			                                        break;
		  }//End of the switch
		   sHape= JOptionPane.showInputDialog("If you wuold like to run this application again please enter\n\n1. Square\n2. Rectangle\n3. Triangle\n4. Circle\n5. Oval\n6. Diamond\n0. To exit.");
		   shape = Integer.parseInt (sHape);
		 }//End of loop
		    JOptionPane.showMessageDialog (  null,"************\n*     End     *\n************\n HAVE A NICE DAY");  
      }//End of static void
	  
		  }
