import java.util.HashMap;
import java.util.Map;

public class CreateHashMap {
	
	public static void main(String args[])
	{
		Map<String, Integer> numberMapping = new HashMap<>();
		numberMapping.put("One", 1);
		numberMapping.put("Two", 2);
		numberMapping.put("Three",null);
		numberMapping.put("Four", 4);
		System.out.println(numberMapping);
	}

}
