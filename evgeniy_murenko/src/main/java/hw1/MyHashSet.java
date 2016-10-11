package hw1;

import java.util.Arrays;

/*
 Создать класс MyHashSet<T> с дженериком Т
 с полем Node<T>[] arr, где элемент Node<T> хранит односвязанный список
 с методами:
  - add()
  - contains()
  - size()
 class Node{
  Node next;
  T value;
 }
 */

public class MyHashSet<T> {
	private Node<T>[] arr;
	private int size = 0;
	private int capacity = 16;
	private double loadfactor = 0.75;

	public MyHashSet() {
		arr=new Node[capacity];
	}

	public boolean add(T value) {
		int index = value.hashCode() % capacity;
		System.out.println(index);
		for (int i = 0; i < arr.length; i++) {
			if (i == index) {
				if (arr[index] == null) {
					arr[index] = new Node();
					arr[index].setValue(value);
					size++;
					return true;
				}
				if (arr[index].getValue().equals(value)) {
					return false;
				}
				if (arr[index].getNext() == null) {
					arr[index].setNext(new Node(null, value));
					size++;
					return true;
				}
				if (arr[index].getNext() != null) {
					Node temp = arr[i].getNext();
					while (temp.getNext() != null) {
						if (temp.getValue().equals(value)) {
							return false;
						}
						if (!temp.getValue().equals(value)) {
							temp = temp.getNext();
						}
					}
					if (temp.getNext() == null) {
						temp.setNext(new Node(null, value));
						size++;
						return true;
					}
				}

			}
		}
		return false;

	}

	public int size() {
		return this.size;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(arr);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyHashSet other = (MyHashSet) obj;
		if (!Arrays.equals(arr, other.arr))
			return false;
		return true;
	}


}
