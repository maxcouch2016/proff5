package hw.hashmap;

import java.util.Iterator;
import java.util.Set;

public class MyHashMap<K, V> implements MyMap<K, V>, Iterable<K> {

	private final static int DEFAULT_SIZE = 16;
	private final static double DEFAULT_LOAD_FACTOR = 0.75;
	private MyEntry<K, V>[] store;
	private double loadFactor;
	private double threshold;
	private int size = 0;
	private int modCount = 0;
	
	/**********************Constructors*************************/
	public MyHashMap(int size, double loadFactor) {
		if(size%2 != 0) {
			throw new IllegalArgumentException("Указанный размер HashMap должен быть кратный двум");
		}
		store = new MyEntry[size];
		this.loadFactor = loadFactor;
		this.threshold = size * loadFactor;
		
	}
	public MyHashMap(int size) {
		this(size, DEFAULT_LOAD_FACTOR);
	}
	public MyHashMap() {
		this(DEFAULT_SIZE, DEFAULT_LOAD_FACTOR);
	}
	/***********************************************************/
	
	/*Добавление нового элемента*/
	@Override
	public boolean put(K key, V value) {
		MyEntry<K, V> newEntry = new MyEntry<K, V>(key, value);
		if(key == null) {
			return addForNullKey(value);
		}
		int index = getIndex(newEntry.getHash());
		if(store[index] == null) {
			store[index] = newEntry;
			System.out.println("new basket " +index + " --- " + newEntry.getValue());
			size++;
		} else {
			MyEntry entry = store[index];
			MyEntry lastEntry = store[index];
			
			while(entry != null) {
				if(entry.getHash() == newEntry.getHash()
						&& (entry.getKey() == key || entry.getKey().equals(key))) {
					entry.setValue(newEntry.getValue());
					System.out.println("replace " + index + " --- " + newEntry.getValue());
					return true;
				}
				lastEntry = entry;
				entry = entry.getNextEntry();
			}
			
			lastEntry.setNextEntry(newEntry);
			size++;
			System.out.println("Add link " + index + " --- "+ newEntry.getValue());
		}
		return true;
	}
	
	private boolean addForNullKey(V value) {
		
		return true;
	}

	@Override
	public Object get(Object key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean remove(Object key) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set entrySet() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private MyEntry<K, V> findEntry(int hash) {
		
		return null;	
	}
	
	private int getIndex(int hash) {
		return (hash & store.length-1);
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		int curIndex = 0;
		sb.append("{");
		while(curIndex < store.length) {
			if(store[curIndex] != null) {
				MyEntry entry = store[curIndex];
				do{
					sb.append(entry.getKey());
					sb.append("=");
					sb.append(entry.getValue());
					entry = entry.getNextEntry();
					sb.append(", ");
					
				} while (entry != null);
			}
			curIndex++;
		}
		sb.append("}");
		return sb.toString();
	}
	@Override
	public Iterator<K> iterator() {
		return new Iterator<K>() {
			int elements = size;
			int curIndex = 0;
			
			@Override
			public boolean hasNext() {
				if(elements > 0) return true;
				return false;
			}

			@Override
			public K next() {
				if(hasNext() == false) return null;
				
				return null;
			}
		};
	}
}
