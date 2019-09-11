
public class CalArea {
	
	public void Area(int l , int b)
	{
		System.out.println("The area of Rectangle is:" +l*b);
	}
	
	public void Area(double h , double b)
	{
		System.out.println("The area of Tringle is:"+(0.5*h*b));
	}
	
	public void Area(double r)
	{
		System.out.println("The area of Circle is:"+(3.14*r*r));
	}
	
	public static void main(String args[])
	{
		CalArea obj = new CalArea();
		obj.Area(4,5);
		obj.Area(4.5,3.5);
		obj.Area(5);
	}

}
