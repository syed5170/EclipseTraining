package food;

class Practice{
	   public void myMethod(){
		System.out.println("Overridden Method");
	   }
	}
	public class Xyz extends Practice{

	   public void myMethod(){
		System.out.println("Overriding Method");
	   }


public class Practice {

	public void main (String[] args) {
		// TODO Auto-generated method stub

		Xyz obj = new Xyz();
		obj.myMethod();
		}
}
	}
