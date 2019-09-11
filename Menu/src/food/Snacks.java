package food;
import java.util.Scanner;
public class Snacks {
	public void snacks_menu()
	{
		System.out.println("Select your choice :");
		System.out.println(" 1. SAMOSA \t\t Rs 10 \n 2. PANEER PAKODA \t Rs 20 \n 3. BREAD CUTLET \t Rs 20 \n 4. BUTTER TOAST \t Rs 25 \n " );
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		switch(b)
		{
		case 1:  //System.out.println(" SAMOSA : Rs 10");
				System.out.println(" BILL : Rs 10");
			break;
		case 2 : //System.out.println(" PANEER PAKODA : Rs 20");
				System.out.println(" BILL : Rs 20");
			break;
		case 3 :// System.out.println(" BREAD CUTLET : Rs 20");
				System.out.println(" BILL : Rs 20");
			break;
		case 4 : //System.out.println(" BUTTER TOAST : Rs 25");
				System.out.println(" BILL : Rs 25");
			break;
		default : System.out.println("WRONG INPUT!!!");
		}
	}

}
