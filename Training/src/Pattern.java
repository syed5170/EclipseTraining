import java.util.Scanner;
public class Pattern {

	public static void main(String args[])
	{
		int space, size, k ;
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		for(int i=0; i<size;i++)
		{
			for(space= 1; space<size; space++)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
				
	}
}
