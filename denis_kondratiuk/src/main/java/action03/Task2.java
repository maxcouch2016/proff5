package action03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Task2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(new Integer[]{1,5,6,8,7,1}));
		
		System.out.print(list);
		Iterator<Integer> iter = list.iterator();
		System.out.println();
		System.out.print("[");
		for (;iter.hasNext();) {
			System.out.print(", "+iter.next());
			
		}
		list.forEach(new Consumer<Integer>(){

			@Override
			public void accept(Integer arg0) {
				
			}
				// TODO Auto-generated method stub
				
			});
		System.out.print("]");
	}

}
