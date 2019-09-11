import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
	

	
	public static void main(String args[])
	{
		LinkedList<String> sun = new LinkedList<>();
		
		sun.add("Ahsan");
		sun.add("Dimple Garg");
		sun.add("Shikhar");
		sun.add("Sumit");
		sun.add("Sanchit");
		
		System.out.println("Initial LinkedList : " + sun);
		sun.add("Archit");
		System.out.println("After Adding \"Archit\" : " + sun);
		sun.addFirst("Sugandha");
		System.out.println("After AddFirst \"Sugandha\" : " + sun);
		sun.addLast("Rajat");
		System.out.println("After AddLast \"Rajat\" : " + sun);
		
		List<String> day = new ArrayList<>();
		
		day.add("Rahul");
		day.add("Shivangi");
		
		sun.addAll(day);
		System.out.println("After AddAll : "+ sun);
		
		
		
	}



}
