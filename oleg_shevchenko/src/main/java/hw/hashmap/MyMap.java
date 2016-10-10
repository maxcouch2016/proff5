package hw.hashmap;

import java.util.Set;

public interface MyMap<K, V>{
	
	boolean put(K key, V value);
	
	V get(K key);
	
	int size();
	
	boolean remove(K key);
	
	Set<MyEntry<K, V>> entrySet();
}
