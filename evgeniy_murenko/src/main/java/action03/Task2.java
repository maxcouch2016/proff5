package action03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Task2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(
				Arrays.asList(new Integer[] { 10, 20, 30, 40, 50, 80, 90 })
		); // не изменяемый список
		
		System.out.println(list);
//------------------------------------------------------------
		Iterator<Integer> iter = list.iterator();
		System.out.print("[");
		for (; iter.hasNext();) {
			System.out.print(iter.next()+", ");
		}
		System.out.println("]");
//-------------------------------------------------------------
		System.out.print("[");
		list.forEach(new Consumer<Integer>(){
			@Override
			public void accept(Integer t) {
				System.out.print(t+", ");
			}
		});
		System.out.println("]");
//-------------------------------------------------------------
		list.forEach(t -> System.out.print(t+", "));
	}
}
