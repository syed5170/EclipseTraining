
public class GetSet {
	
	private int Id;
	private String Name;

	public void setId(int id) {
		this.Id = id;
	}
	
	public int getId() {
		return Id;
	}
	
	public void setName(String name) {
		this.Name = name;
	}
	
	public String getName() {
		return Name;
	}
	
	public static class GetProperty{
	
	public static void main(String args[])
	{
		GetSet obj = new GetSet();
		obj.setId(45);
		obj.setName("Ahsan");
		System.out.println(obj.getId());
		System.out.println(obj.getName());
	}
}
}