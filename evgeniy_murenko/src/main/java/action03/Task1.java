package action03;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task1 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		f(map);
		
		map.put(10, "a10");
		map.put(11, "b11");
		map.put(12, "c12");
		
		
		Set<Integer> set1 = map.keySet();
		Collection <String> list = map.values();
		
		Set<Entry<Integer, String>> set2 = map.entrySet();
		for(Entry<Integer, String> entry: set2){
			System.out.print("["+entry.getKey());
			System.out.print(", ");
			System.out.println(entry.getValue()+"]");
		}
	}
	
	public static void f(Map<Integer, String> map){
		
	}
}
