import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeDesc {
	
	public static void main(String args[])
	{
		SortedSet<String>fruits = new TreeSet<>(Comparator.reverseOrder());
	
	
	//SortedSet<String>fruits = new TreeSet<>(Comparator<String>());
//	{
	//	public int compare(String s1, String s2)
	//	{
	//		return s2.compareTo(s1);
	//	}
	//};
	
	fruits.add("Banana");
	fruits.add("Apple");
	fruits.add("Mango");
	fruits.add("Watermelon");
	System.out.println(fruits);
}}
