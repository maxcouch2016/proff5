package action08;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

// Задача0: Вывести все методы класса String

public class Test0 {

	public static void main(String[] args) {
		// String str = new String();
		// Class<?> cl = str.getClass();
		//
		// Method[] methods = cl.getMethods();
		// for (Method i : methods) {
		// System.out.println(i.toString());
		// }

		List<Class> f = reflectionTask2Example(new ArrayList());
		f.forEach((e) -> System.out.println(e.getName()));

	}

	// Задача1:(ReflectionTask1Example) Написать метод принимающий любой объект.
	// Метод возвращает все классы в иерархию которых входит данный объект.

	public static List<String> reflectionTask1Example(Object obj) {
		Class<?> cl = obj.getClass();
		List<String> s = new ArrayList();

		System.out.println("before while");
		while (cl.getSuperclass() != null) {

			s.add(cl.getSuperclass().getName());
			cl = cl.getSuperclass();
		}

		return s;

	}

	// Задача2:(ReflectionTask2Example) Написать метод, принимающий любой
	// объект,
	// выводящий список всех интерфейсов по иерархии наследования классов.

	public static List<Class> reflectionTask2Example(Object obj) {
		Class<?> cl = obj.getClass();
		List<Class> s = new ArrayList();

		System.out.println("before while");
		while (cl.getSuperclass() != null) {
			for (int i = 0; i < cl.getInterfaces().length; i++) {
				s.add(cl.getInterfaces()[i]);
			}
			cl = cl.getSuperclass();
		}

		return s;

	}
}
