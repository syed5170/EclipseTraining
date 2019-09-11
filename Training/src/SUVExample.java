import java.util.List;
import java.util.Arrays;

public class SUVExample 
{
	public static void main(String args[])
	{
		List<Integer> list1 = Arrays.asList(5,10,15,20);
		SuperClass(list1);
		List<Number> list2 = Arrays.asList(5.0,20,55,60);
		SuperClass(list2);
	}
	public static void SuperClass(List<? super Integer> list)
	{
		System.out.println(list);
	}
	
}
