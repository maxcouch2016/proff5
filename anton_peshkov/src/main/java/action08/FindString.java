package action08;

import java.lang.reflect.Field;

public class FindString {

	public static void main(String[] args) {
		DownTown down = new DownTown();
		down.print();
		try {
			findS(down);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		down.print();
		

	}

	public static void findS(Object obj) throws IllegalArgumentException, IllegalAccessException {
		Class<?> clazz = obj.getClass();
		Field[] field = clazz.getDeclaredFields();

		for (int i = 0; i < field.length; i++) {
			if ((field[i].getType().getSimpleName().equals("String")) && (field[i].get(obj) == null)) {
				field[i].setAccessible(true);
				field[i].set(obj, "empty");
			}

		}
	}

}

class DownTown {
	static String s1 = null;
	static String s2 = "not null";
	static String s3 = null;

	public static void print() {
		System.out.println(s1 + " " + s2 + " " + s3);
	}
}