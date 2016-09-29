package action03;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task1 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		f(map);
		
		map.put(10, "v10");
		map.put(30, "v30");
		map.put(20, "v20");
		
		Set<Integer> set1 = map.keySet();
		Collection<String> values = map.values();

		Set<Entry<Integer, String>> set2 = map.entrySet();
		for(Entry<Integer, String> entry:set2){
			System.out.print("["+entry.getKey());
			System.out.print(", ");
			System.out.println(entry.getValue()+"]");
		}
		
		System.out.println(map);
		
		
		
	}	
	public static void f(Map<Integer, String> map){
		
	}
}