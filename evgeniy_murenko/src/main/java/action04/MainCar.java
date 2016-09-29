package action04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainCar {
	public static void main(String[] args) {
		List<Car> list = new ArrayList<>();
		list.add(new Car("aa5124", "Black"));
		list.add(new Car("bb1234", "Red"));
		list.add(new Car("cc5677", "Grey"));
		list.add(new Car("dd8907", "Yellow"));
		
		Collections.sort(list, new MyComporator());
		System.out.println(list);
	}
}

class MyComporator implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		return o1.getColor().compareTo(o2.getColor());
	}
	
}
