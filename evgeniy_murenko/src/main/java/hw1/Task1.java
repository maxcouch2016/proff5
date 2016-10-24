package hw1;

import java.util.ArrayList;
import java.util.LinkedList;

/*Сравнить ArrayList vs LinkedList с помощью механизма System.nanoTime().
Вставка чисел от 1 до 10000.
 - вставка вначало( в индекс 0)
 - вставка в середину ( в индекс size()/2)
 - вставка в конец ( в индекс size())
10000 элементов
какая разница в скорости ArrayList, если в конструкторе задавать capacity 10000 или не задавать.
кто быстрее и насколько при подсчете суммы чисел из ArrayList vs LinkedList.

  long time1 = System.nanoTime();
   //
  long time2 = System.nanoTime();
  long score = time2 - time1;
 */

public class Task1 {

	public static void main(String[] args) {
		arayList1();
		linkedList1();
		System.out.println();
		arayList2();
		linkedList2();
		System.out.println();
		arayList3();
		linkedList3();
	}

	private static void linkedList1() {
		LinkedList<Integer> list = new LinkedList<>();
		long time1 = System.nanoTime();
		for (int i = 1; i <= 10000; i++) {
			list.addFirst(i);
		}
		long time2 = System.nanoTime();
		long score = time2 - time1;
		System.out.println("LinkedList to start: " + score);
	}

	private static void linkedList2() {
		LinkedList<Integer> list = new LinkedList<>();
		long time1 = System.nanoTime();
		for (int i = 1; i <= 10000; i++) {
			list.add(list.size() / 2, i);
		}
		long time2 = System.nanoTime();
		long score = time2 - time1;
		System.out.println("LinkedList to midle: " + score);
	}

	private static void linkedList3() {
		LinkedList<Integer> list = new LinkedList<>();
		long time1 = System.nanoTime();
		for (int i = 1; i <= 10000; i++) {
			list.addLast(i);
		}
		long time2 = System.nanoTime();
		long score = time2 - time1;
		System.out.println("LinkedList to end: " + score);
	}

	private static void arayList1() {
		ArrayList<Integer> list = new ArrayList<>();
		long time1 = System.nanoTime();
		for (int i = 1; i <= 10000; i++) {
			list.add(0, i);
		}
		long time2 = System.nanoTime();
		long score = time2 - time1;
		System.out.println("ArrayList to start: " + score);
	}

	private static void arayList2() {
		ArrayList<Integer> list = new ArrayList<>();
		long time1 = System.nanoTime();
		for (int i = 1; i <= 10000; i++) {
			list.add(list.size() / 2, i);
		}
		long time2 = System.nanoTime();
		long score = time2 - time1;
		System.out.println("ArrayList to midle: " + score);
	}

	private static void arayList3() {
		ArrayList<Integer> list = new ArrayList<>();
		long time1 = System.nanoTime();
		for (int i = 1; i <= 10000; i++) {
			list.add(i);
		}
		long time2 = System.nanoTime();
		long score = time2 - time1;
		System.out.println("ArrayList to end: " + score);
	}

}