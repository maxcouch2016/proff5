package hw1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*3. Создать клас MyArrayList<T> с дженериком T
 с полем T[] arr;
 с методами:
 - add
 - get
 - size
 - toArray()
 - sort
 */

public class MyArrayList<T> {
	private T[] list;
	private int size;
	private int capacity = 10;

	public MyArrayList() {
		Object[] arr = new Object[capacity];
		list = (T[]) arr;
	}

	public boolean add(T element) {
		if (this.size < capacity) {
			list[size] = element;
			size++;
		} else {
			capacity += 10;
			Object[] arr = new Object[capacity];
			for (int i = 0; i < size; i++) {
				arr[i] = list[i];
			}
			arr[size] = element;
			list = (T[]) arr;
			size++;
		}
		return false;
	}

	public T get(int index) {
		return list[index];
	}

	public int size() {
		return size;
	}

	public T[] toArray() {
		T[] array = (T[]) new Object[size];
		for (int i = 0; i < size; i++) {
			array[i] = (T) list[i];
		}
		return array;
	}

	public void sort() {
		Arrays.sort((T[])list);
	}

}
