class Square 
{
	public void Ares(double side)
	{
		  double CalArea=side*side;
		  System.out.println("Area of Square is:\t"+calArea);
	}
	public void perimeter(double side);
	{
		double calPerimeter=4*side;
		System.out.println("Perimeter of Square is:\t"+calPerimeter);
	}
}
 class Rectangle
 {
	 public void Area(double length,double breadth)
		 double calArea=length*breadth;
	 System.out.println("Area of Rectangle is:\t"+calArea);
 }
 public void perimeter(double length,ddouble breadth)
 {
	 double calperimeter=2*(length+breadth);
	 System.out.println("Perimeter of Rectangle is:\t"+calPerimeter);
 }
 }
 class Mainclass
 {
	public static void main(String[] args) 
	{
	 Square obj1=new Square();
	 Rectangle obj2= new Rectangle();

	 obj1.Area(5.0);
	 obj1.Perimeter(7.0);
	 obj2.Area(12.0,5.0);
	 obj2.Perimeter(5.0,1.0);
	}
}
