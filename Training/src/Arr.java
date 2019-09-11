import java.util.Scanner;
public class Arr {
	
	public static void main(String[] args) 	
	{
		int i,j = 0;
		System.out.println("Enter length of array:");
		Scanner sc= new Scanner(System.in);
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]= new int [r][c];
	
		for( i=0 ;i<r ;i++) 
		{
			for(j =0 ;j<c;j++)
			{
			a[i][j] = sc.nextInt();
			}
			
		} 
		System.out.println("The User Input Array is:");
		for( i=0 ;i<r ;i++) 
		{
			for(j =0 ;j<c;j++)
			{
				System.out.print(a[i][j]+"\t");
			
			}
			System.out.println();
		} 
		
	}

}
