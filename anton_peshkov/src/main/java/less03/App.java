package less03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class App {
	
	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<Integer>(
				Arrays.asList(new Integer[]{
						10, 20, 30, 40, 50 
				})
				);
		
		list.forEach(new Consumer<Integer>(){

			@Override
			public void accept(Integer t) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
}
