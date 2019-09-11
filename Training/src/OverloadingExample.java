import java.util.*;
public class OverloadingExample {
	public void print(int a,char c)
	{
		System.out.println("Here the first sequence is integer and the second sequence is character " +a+" and "+c);
	}
	public void print(char c,int a)
	{
		System.out.println("Here the first sequence is character and the second sequence is integer "+c+ " and "+a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingExample o = new OverloadingExample();
		o.print('A', 1);
		o.print(1, 'S');
	}

}
