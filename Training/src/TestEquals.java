
public class TestEquals {
	public static void main(String args[])
	{
		myDate date1 = new myDate(13, 8, 2019);
		myDate date2 = new myDate(13, 8, 2019);
		if(date1==date2)
		{
			System.out.println("date1 is identical to date2");
		}
		else
		{
			System.out.println("date1 is not identical to date2");
		}
		
		if(date1.equals(date2))
		{
			System.out.println("date1 is equal to date2");
		}
		else
		{
			System.out.println("date1 is not equal to date2");
		}
	}

}
