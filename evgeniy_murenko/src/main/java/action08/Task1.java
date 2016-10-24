package action08;

import java.lang.reflect.Method;
import java.util.Arrays;

/*
 Вывести все методы класса String 
 */
public class Task1 {
	public static void main(String[] args) {
		getMethods(new String());
	}

	public static void getMethods(Object obj) {
		Method[] methods = obj.getClass().getMethods();
		System.out.print("[");
		for (Method meth : methods) {
			System.out.println(meth.getName());
		}

	}

}
