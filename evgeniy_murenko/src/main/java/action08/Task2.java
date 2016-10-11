package action08;

import java.util.ArrayList;
import java.util.List;

/*Задача1:(ReflectionTask1Example) Написать метод принимающий любой объект.
 Метод возвращает все классы в иерархию которых входит данный объект. */

public class Task2 {

	public static void main(String[] args) {
		List list = new ArrayList();
		String str = "";
		System.out.println(getAllClasses(list));
	}

	public static List<?> getAllClasses(Object obj) {
		List<Class<?>> list = new ArrayList<>();
		Class<?> clazz = obj.getClass();
		while (clazz != null) {
			list.add(clazz);
			clazz = clazz.getSuperclass();
		}
		return list;
	}

}
