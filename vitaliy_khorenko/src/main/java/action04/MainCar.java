package action04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainCar {

	public static void main(String[] args) {
		List<Car> list = new ArrayList<>(); 
		
		list.add(new Car("AA 1111", "Black"));
		list.add(new Car("AA 2222", "Gren"));
		list.add(new Car("DD 3333", "Red"));
		list.add(new Car("BB 1111", "Pink"));
		list.add(new Car("CC 5555", "Blue"));
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, new MyComparator());
		System.out.println(list);

	}

}

class MyComparator implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		// TODO Auto-generated method stub
		return o1.getColor().compareTo(o2.getColor());
	}
	
}
