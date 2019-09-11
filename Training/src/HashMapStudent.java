import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapStudent {
	
	public static void main(String args[])
	{
		Map<String, Integer> staffMap = new HashMap<>();
		
		staffMap.put("Science", 10);
		staffMap.put("Commerce", 20);
		staffMap.put("Arts", 30);
		staffMap.put("English", 60);
		
		System.out.println("Staff Map: "+ staffMap);
		Set<String> keys = staffMap.keySet();
		Collection<Integer> values = staffMap.values();
		Set<Entry<String,Integer>> entries = staffMap.entrySet();
		System.out.println("Keys for Map: "+ keys);
		System.out.println("Values for Map: "+ values);
		System.out.println("Entries for Map: "+ entries);
		
	}

}
