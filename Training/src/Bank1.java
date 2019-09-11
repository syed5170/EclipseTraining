import java.util.*;
public class Bank1 {
	int getBalance()
	{
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankA a=new BankA();
		System.out.println(a.getBalance());
		BankB b=new BankB();
		System.out.println(b.getBalance());
		BankC c=new BankC();
		System.out.println(c.getBalance());
	}

}
class BankA extends Bank1
{
	int amount=25000;
	public int getBalance()
	{
	   	//System.out.println(amount);
		return 25000;
	}
}
class BankB extends Bank1
{
	public int getBalance()
	{
	   	//System.out.println(amount);
		return 30000;
	}
}
class BankC extends Bank1
{
	public int getBalance()
	{
	   	//System.out.println(amount);
		return 50000;
	}
}
