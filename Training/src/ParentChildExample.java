import java.util.*;
class A
{
	public void method()
	{
		System.out.println("Parent");
	}
}
class B extends ParentChildExample
{
public void method()
{
	System.out.println("Child");
}
}
public class ParentChildExample {

	public static void main(String[] args) {
ParentChildExample a=new ParentChildExample();
a.method();
B b=new B();
b.method();
ParentChildExample obj=new B();
obj.method();

	}

	private void method() {
		// TODO Auto-generated method stub
		
	}

}
