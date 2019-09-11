package training;

class Student implements Cloneable
{
	int id;
	String name;
	Student(int i, String n)
	{
		this.id=i;
		this.name=n;
		
	}
	public void GetDetails()
	{
		System.out.println("Id is " + id + "\nName is " + name);
	}
	public Object TestClone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class StudentCloneDemo {
	
	public static void main(String args[])
	{
		Student s1 =new Student(202,"Ahsan");
		System.out.println("The original object of Student is ");
		s1.GetDetails();
		try {
			Student s2 = (Student) s1.TestClone();
			System.out.println("The object is CLONED ...");
			s2.GetDetails();
			System.out.println("The details of s1 " + s1 +"The details of s2 "+s2);
		}catch (CloneNotSupportedException ce) 
		{
			ce.printStackTrace();
		
		}
		
	}

}
