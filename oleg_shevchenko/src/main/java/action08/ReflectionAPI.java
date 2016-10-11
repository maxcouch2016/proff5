package action08;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReflectionAPI {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		methods(list);
		System.out.println(getClasses(list));
		interfaces(list);
	}
	
	public static void methods(Object obj) {
		Method[] methods = obj.getClass().getMethods();
		System.out.print("[");
		for(Method meth : methods) {
			System.out.print(meth.getName() + ", ");
		}
		System.out.print("]\n");
		
	}
	
	public static List<?> getClasses(Object obj) {
		List<Class<?>> list = new ArrayList<>();
		Class<?> clazz = obj.getClass();
		while(clazz != null) {
			list.add(clazz);
			clazz = clazz.getSuperclass();
		}
		return list;
	}
	
	public static void interfaces(Object obj) {
		List<Class> classList = (List<Class>) getClasses(obj);
		Set<Class> intSet = new HashSet<>();
		for(Class clazz : classList) {
			for(Class interfaze : clazz.getInterfaces())
				intSet.add(interfaze);
		}
		System.out.println(intSet);
	}
	
	
}
