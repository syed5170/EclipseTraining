

public class ExComp implements Comparable {

	int id,age;
	String name;
	
		
	public int getId() {
		
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public static void main(String[] args) 
	{
		ExComp obj = new ExComp();
		obj.setId(1);
		obj.setName("Ahsan");
		System.out.println(obj.getId());
		System.out.println(obj.getName());
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
