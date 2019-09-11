import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestStreamExample {
	
	public static List<Employe> createEmployee(){
		
		return Arrays.asList(new Employe(30,"Priyanka",Gender.female),
				new Employe(10,"Kirti",Gender.female),
				new Employe(50,"Ahsan",Gender.male),
				new Employe(30,"Shikhar",Gender.male),
				new Employe(20,"Sanchit",Gender.male),
				new Employe(25,"Sumit",Gender.male),
				new Employe(15,"pria",Gender.female),
				new Employe(30,"Priyanka",Gender.female),
				new Employe(60,"Priyanka",Gender.female));
		
		
	}
	
	public static void main(String[] a) {
		List<Employe> employe= createEmployee();
		
		System.out.println("list before stream");
		System.out.println(employe);
		List<String> empName=new ArrayList<>();
		
		for(Employe emp:employe) {
			if(emp.getAge()<20) 
			{
				empName.add(emp.getName().toUpperCase());
				
			}
		}
		
		System.out.println(empName);
		List<String> empName1=employe.stream().filter(emp->emp.getAge()<20)
				/*.map(emp->emp.getName())
				.map(name->name.toUpperCase())*/
				.map(Employe:: getName)
				.map(String:: toUpperCase)//same done with scope resolution operator
				.collect(Collectors.toList());
		System.out.println("printing name with stream");
		System.out.println(empName1);
		
		//to list male employees with upperCase
		
		employe.stream()
		.filter(emp->emp.getGender()==Gender.male)
		.map(emp->new Employe(emp.getAge(),emp.getName().toUpperCase(),emp.getGender()))
		.forEach(System.out::println);
		
		//print sum of ages
		System.out.println("----------------------");
		System.out.println("printing sum of ages");
		System.out.println(employe.stream().mapToInt(Employe:: getAge)
				.sum());
		
		//to find the oldest employee
		
		System.out.println(
				employe.stream()
				.max((emp1,emp2)->
		emp1.getAge() > emp2.getAge() ? 1 : -1));
		
		//check multi conditions and non concurrency operations i.e mutability
		
		List<String> empName3=employe.stream()
				.filter(emp->emp.getAge()>18)
				.map(emp->emp.getName().toUpperCase())
				.collect(Collectors.toList());
		System.out.println(empName3);
		
		
		//make set of male employees
		
		Set<Employe> males= 
				employe.stream()
				.filter(emp->emp.getGender()==Gender.male)
				.collect(Collectors.toSet());
		System.out.println(males);
		
		
		//make a set of  male employee with only name
		System.out.println("male employee+++++++++++++++++");
		Set<String> name= employe.stream()
				.filter(emp->emp.getGender()==Gender.male)
				.map(Employe:: getName)
				.collect(Collectors.toSet());
		System.out.println(name);
		
	
	}

}
