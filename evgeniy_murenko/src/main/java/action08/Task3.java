package action08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 Задача2:(ReflectionTask2Example) Написать метод, принимающий любой объект, выводящий список всех интерфейсов по иерархии наследования классов. 
 */

public class Task3 {

	public static void main(String[] args) {
		OutInterfacesOfObject(new ArrayList());
	}

	public static void OutInterfacesOfObject(Object obj) {
		List<Class> classList = (List<Class>) Task2.getAllClasses(obj);
		Set<Class> intSet = new HashSet<>();
		for (Class clazz : classList) {
			for (Class interfaze : clazz.getInterfaces())
				intSet.add(interfaze);
		}
		for (Class temp : intSet) {
			System.out.println(temp);
		}
	}
}
