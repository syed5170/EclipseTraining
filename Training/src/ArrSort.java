import java.util.Scanner;
public class ArrSort {
	
	public static void main(String[] args) 	
	{
		int i, min, max;
		System.out.println("Enter length of array:");
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int [n];
	
		for( i=0 ;i<a.length ;i++) 
		{
			a[i] = sc.nextInt();
		}
			
		System.out.println("The User Input Array is:");
		for( i=0 ;i<a.length ;i++) 
		{
			System.out.print(a[i]+"\t");
		}
		System.out.println();
		min=a[0];
		max =a[0];
		for(i=0; i<a.length; i++)
		{
			
			if(min>a[i])
			{
				min=a[i];
			}
			if(max<a[i])
			{
				max = a[i];
			}
		}
		System.out.println("Minimum Value in the Array is : "+min);
		System.out.println("Maximum Value in the Array is : "+max);
		
	}

}


