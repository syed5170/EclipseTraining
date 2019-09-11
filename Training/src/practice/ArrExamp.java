package practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;


public class ArrExamp {
	
	
	public static void main(String[] args) {
	
		ArrayList<String> list=new ArrayList<String>(); 
		int n;
		System.out.println("Enter Number of Elements : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 1;i<=n; i++)
		{
			list.add(sc.next());
		}
		
	/*	for(String a:list)
		{
			System.out.println(a);
		}
*/
		Iterator itr= list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} 
	}

}
