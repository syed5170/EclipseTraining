public class Customer{
	
	public static void main(String arg[])
	{
		SBI s=new SBI();
		s.newAccount();
		s.showAccount();
		s.deposit();
		s.withdrawl();
		
		ICICI i = new ICICI();
		i.newAccount();
		i.showAccount();
		i.deposit();
		i.withdrawl();
		
		RBI r = new RBI();
		r.GetInterestRate();
		r.getWithdrawlLimit();
		
		Bank c = new Bank();
		c.getCname();
		c.getAddress();
	}
}