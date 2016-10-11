package action03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Task2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(
				Arrays.asList(
						new Integer[]{10,20,80,40,15})
				);
	
		System.out.println(list);
		
		Iterator<Integer> iter = list.iterator();
		System.out.println("[");
		for( ; iter.hasNext(); ){
			System.out.print(", "+iter.next());
		}
		System.out.println("]");
		
		System.out.println("[");
		for(Integer k: list){
			System.out.print(", "+k);
		}
		System.out.println("]");
		
		System.out.println("[");
		list.forEach(new Consumer<Integer>(){
			@Override
			public void accept(Integer t) {
				System.out.print(", "+t);				
			}
		});
		System.out.println("]");
		
		System.out.println("[");
		list.forEach(t->{System.out.print(", "+t);});
		System.out.println("]");
		
		//Function<T, R> f;
	}
}

