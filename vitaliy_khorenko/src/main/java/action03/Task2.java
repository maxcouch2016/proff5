package action03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Task2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(
				Arrays.asList(new Integer[]{10,20,80,40,15})
				);
		
		
		System.out.println(list);
		
		Iterator<Integer> iter = list.iterator();
		for(; iter.hasNext();){
			System.out.print(iter.next() + ",");
		}
		
		for(Integer k : list){
			System.out.println();
			System.out.print(" - " + k.intValue());
		}
		
		
		list.forEach(new Consumer<Integer>(){
			@Override
			public void accept(Integer t) {
				System.out.println(t);				
			}			
		});
		
		System.out.println("*************");
		list.forEach(System.out::print);
		System.out.println();
		
		list.forEach(t->{System.out.print(", " +t);});
		

	}

}
