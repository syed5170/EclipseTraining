package food;
import java.util.ArrayList;
import java.util.List;
class Users 
{
	private String name;
	private int age ;
	public Users(String name,int age)
	{
		this.name = name;
		this.age = age ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}

public class User
{
	public static void main(String args[])
	{
		List<Users> user = new ArrayList<>();
		user.add(new Users("Ahsan ",26));
		user.add(new Users("Dimple ",30));
		user.add(new Users("Shikhar ",24));
		user.add(new Users("Sumit ",25));
		user.add(new Users("Sanchit ",24));

		user.forEach(User->
		{
			System.out.println("Name: "+ User.getName()+ "Age: " + User.getAge());
			
		}
		);
	}

}
