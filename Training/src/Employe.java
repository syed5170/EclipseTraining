
public class Employe {

   public Employe(int age, String name, Gender gender) {
		super();
		this.age = age;
		this.name = name;
		this.gender = gender;
	}
public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
private	int age;
   private	String name;
   private Gender gender;
   
   public String toString() {
	   return String.format("%s----%s--%d \n",name,gender,age);
   }
}
