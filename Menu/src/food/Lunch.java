package food;

import java.util.Scanner;

public class Lunch {
	public void lunch_menu()
	{
		System.out.println("Select your choice :");
		System.out.println(" 1. DAL MAKHNI \t\t Rs 100 \n 2. PANEER BHURJI \t Rs 120 \n 3. RAJMA CHAWAL \t Rs 80 \n 4. BUTTER NAAN \t Rs 25 \n " );
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		switch(b)
		{
		case 1:  //System.out.println(" DAL MAKHNI : Rs 100");
				System.out.println(" BILL : Rs 100");
			break;
		case 2 : //System.out.println(" PANEER BHURJI : Rs 120");
				System.out.println(" BILL : Rs 120");
			break;
		case 3 :// System.out.println(" RAJMA CHAWAL : Rs 80");
				System.out.println(" BILL : Rs 80");
			break;
		case 4 : //System.out.println(" BUTTER NAAN : Rs 25");
				System.out.println(" BILL : Rs 25");
			break;
		default : System.out.println("WRONG INPUT!!!");
		}
	}


}
