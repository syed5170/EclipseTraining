package food;

import java.util.ArrayList ;
import java.util.List ;
import java.util.Scanner;

public class ElementSearch {
	
	private static Scanner sc;

	public static void main(String args[])
	{
		List<String> names = new ArrayList<>();
	Scanner	sc = new Scanner(System.in);
		for(int i=0; i<5;i++)
		{
		names.add(sc.nextLine());
		}
		if(names.contains("Dimple"))
				{
					System.out.println(" HELLO TO THE FUTURE");
				}
	}

}
