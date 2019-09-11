import java.util.*;
import java.util.Scanner;

public class Traverse {
	
	public static void main(String args[])
	{
		ArrayList<String> obj = new ArrayList<String>();
		int n;
		String a[] = null;
	//	obj.add("Ahsan");
	//	obj.add("Dimple");
	//	obj.add("Shikhar");
	//	obj.add("Sumit");
	//	obj.add("Sanchit");
	//	obj.add("Archit");
	//	obj.add("Ahsan");
	//	obj.add("Dimple");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of list : ");
		n = sc.nextInt();

		for(int i=1; i<=n; i++)
		{
			obj.add(sc.next());
			//a[i] = sc.toString();

		}
		System.out.println("The size of the list is: " +obj.size());
		Iterator<String> itr = obj.iterator();
		System.out.println("\nThe list is as follows: ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
