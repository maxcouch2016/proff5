package action04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.script.Compilable;

public class MainCar {
	public static void main(String[] args) {
		List<Car> list = new ArrayList<>();
		list.add(new Car("AA 1111", "Black"));
		list.add(new Car("AA 2222", "black"));
		list.add(new Car("DD 3333", "Red"));
		list.add(new Car("BB 1111", "White"));
		list.add(new Car("CC 1111", "Green"));
		
		Collections.sort(list);
		System.out.println(list);
		
		Collections.sort(list, new MyComparator());
		System.out.println(list);
		
		Set<Car> set1 = new TreeSet<>(list);
		System.out.println(set1);

		Set<Car> set2 = new TreeSet<>(new MyComparator());
		set2.addAll(set1);
		System.out.println(set2);
		
		Set<Car> set3 = new TreeSet<>(
			(o1, o2)->{return o1.getColor().compareTo(
					o2.getColor());}
		);
		set2.addAll(set1);
		System.out.println(set2);

	}
}

class MyComparator implements Comparator<Car>{

	@Override
	public int compare(Car o1, Car o2) {
		return o1.getColor().compareTo(
					o2.getColor());
	}
	
}

