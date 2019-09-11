package food;
import java.util.Scanner;
public class Menu {
	
	private static Scanner sc;

	public static void main(String args[])
	{
	System.out.println("******************* \n");
	System.out.println("Welcome to the Menu \n");
	System.out.println(" 1. **SNACKS** \n 2. **LUNCH** \n 3. **DINNER** \n 4. **BEVERAGES** \n " );
	System.out.println("Enter Your Choice!!!");
	sc = new Scanner(System.in);
	int a = sc.nextInt();
	Snacks obj = new Snacks();
	Lunch obj1 = new Lunch();
	//do
	//{
		switch (a) 
		{
			case 1 : obj.snacks_menu();
					break;
			case 2 : obj1.lunch_menu();
					break;
			case 3 : System.out.println("Select your choice :");
					break;
			case 4 : System.out.println("Select your choice :");
					break;
			default: System.out.println("WRONG CHOICE ");
					
		}
	//}while(a<=4);
	
	
	}
}