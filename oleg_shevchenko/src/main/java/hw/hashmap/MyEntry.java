package hw.hashmap;

public class MyEntry<K, V> {
	
	private K key;
	private V value;
	private int hash;
	private MyEntry<K, V> nextEntry;
	
	public MyEntry(K key, V value) {
		this.key = key;
		this.value = value;
		this.hash = hash(key.hashCode());
	}
	
	static int hash(int h) {
//	    h ^= (h >>> 20) ^ (h >>> 12);
//	    return h ^ (h >>> 7) ^ (h >>> 4);
		return h;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public int getHash() {
		return hash;
	}

	public void setHash(int hash) {
		this.hash = hash;
	}

	public MyEntry<K, V> getNextEntry() {
		return nextEntry;
	}

	public void setNextEntry(MyEntry<K, V> nextEntry) {
		this.nextEntry = nextEntry;
	}

}
