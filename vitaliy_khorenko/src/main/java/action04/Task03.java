package action04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Task03 {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(
				Arrays.asList(new Integer[]{10,20,80,40,15})
				);
		
		
		list.forEach(new MyConsumer());
	}
	
	
	
	
	
	
	static class MyConsumer implements Consumer<Integer>{

		@Override
		public void accept(Integer t) {
			System.out.println(t);			
		}
		
	}

}
