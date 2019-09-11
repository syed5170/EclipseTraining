
 class TestGeneric<T> 
{
	T obj;
	TestGeneric(T obj) 
	{
		this.obj = obj;
	}
	public TestGeneric()
	{
		
	}
	public void display()
	{
		System.out.println("This type of object is: " +obj.getClass().getName());
	}
	public T getObj()
	{
		return obj;
	}
}
class GenExample
{
	public static void main(String args[])
	{
		TestGeneric tg = new TestGeneric();
		TestGeneric<String> tg1 = new TestGeneric<String>("HELLO");
		tg1.display();
		System.out.println(tg1.getObj());
		TestGeneric<Integer>tg2 = new TestGeneric<Integer>(12);
		tg2.display();
		System.out.println(tg2.getObj());
		TestGeneric<Double> tg3 = new TestGeneric<Double>(4.5);
		tg3.display();
		System.out.println(tg3.getObj());
		
	}
	

}
