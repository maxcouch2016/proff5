package hw1;


import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.HashSet;


public class MainBase {

	public static void main(String[] args) throws FileNotFoundException, ParseException {
		Base base = new Base();
		//base.toString();
		//base.usersToFile("fileName");
		//User[] users = base.usersFromFile("fileName");
		//System.out.println(Arrays.toString(users));
		
//		MyArrayList<Integer> list = new MyArrayList<>();
//		list.add(33);
//		list.add(35);
//		list.add(31);
//		list.add(32);
//		list.add(36);
//		list.add(34);
//		list.add(39);
//		list.add(30);
//		list.add(38);
//		list.add(37);
//		list.add(25);
//		list.add(333);
//		
//		System.out.println(list);
//		list.sort();
//		System.out.println(list);
		
		HashSet<Integer> set = new HashSet<>();
		set.add(120);
		set.add(13);
		set.add(12);
		set.add(12);
		set.add(12);
		set.add(12);
		System.out.println(set);
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(22);
		
		System.out.println(set.contains(set));
		
	}
}
