package action08;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Field;

/*Задача3: Написать метод, принимающий любой объект, проверяющий есть ли в этом объекте строковая переменная.
 Если переменная равно NULL, то заменяем значение на "empty".
 */

public class Task4 {
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Object myO = new Object();
		Field field = myO.getClass().getFields()[0];
		field.setAccessible(true);
		field.get(myO);
		field.set(myO, null);
		if (field.getType() == Integer.class) {
		}
	}

	public void checkEmty(Object obj) {

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
