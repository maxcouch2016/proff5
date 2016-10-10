package hw.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMain {
	public static void main(String[] args) {
		MyMap<Integer, String> map = new MyHashMap<>();
		map.put(12, "Hello12");
		map.put(17, "Hello17");
		map.put(5, "Hello5");
		map.put(1, "Hello1");
		map.put(100, "Hello100");		
		map.put(0, "Hello0");	
		map.put(5, "Hello--5");	
		map.put(17, "Hello--17");	
		map.put(-6, "Hello-6");	
		System.out.println(map);
		
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(12, "Hello12");
		map1.put(17, "Hello17");
		map1.put(5, "Hello5");
		map1.put(1, "Hello1");
		map1.put(100, "Hello100");		
		map1.put(0, "Hello0");	
		map1.put(5, "Hello--5");	
		map1.put(17, "Hello--17");	
		map1.put(-6, "Hello-6");	
		System.out.println(map1);
	}
}
