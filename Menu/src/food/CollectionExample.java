package food;

import java.util.ArrayList ;
import java.util.List ;

public class CollectionExample {
	
	public static void main(String args[])
	{
		List<Integer>FirstFivePrimeNumbers = new ArrayList<>();
		FirstFivePrimeNumbers.add(2);
		FirstFivePrimeNumbers.add(5);
		FirstFivePrimeNumbers.add(3);
		FirstFivePrimeNumbers.add(7);
		FirstFivePrimeNumbers.add(6);
		
		List<Integer>FirstTenPrimeNumbers = new ArrayList<>(FirstFivePrimeNumbers);
		List<Integer>NextFivePrimeNumbers = new ArrayList<>();
		NextFivePrimeNumbers.add(10);
		NextFivePrimeNumbers.add(15);
		NextFivePrimeNumbers.add(20);
		NextFivePrimeNumbers.add(16);
		NextFivePrimeNumbers.add(18);
		
		FirstTenPrimeNumbers.addAll(NextFivePrimeNumbers);
		
		System.out.println(FirstTenPrimeNumbers);
	}
	

}
