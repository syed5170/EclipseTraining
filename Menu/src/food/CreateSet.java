package food;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateSet {
	
	public static void main(String args[])
	{
		ArrayList<Integer>arraylist = new ArrayList<>();
		arraylist.add(10);
		arraylist.add(80);
		arraylist.add(60);
		arraylist.add(20);
		arraylist.add(50);
		
		ArrayList<Integer>arraylist1 = new ArrayList<>();
		arraylist1.add(10);
		arraylist1.add(15);
		arraylist1.add(35);
		arraylist1.add(25);
		arraylist1.add(5);
		
		Set<Integer>div= new HashSet(arraylist);
		div.addAll(arraylist1);
		System.out.println(div);
	}

}
