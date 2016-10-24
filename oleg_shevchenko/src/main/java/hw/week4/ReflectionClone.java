package hw.week4;
/*1. ReflectionClone - класс, который позволяет клонировать любой объект.
 (по сути перенос только значений полей)
 */

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectionClone<T> {
	public T cloneObj(T obj) throws IllegalArgumentException, IllegalAccessException, InstantiationException {
		Class<?> clazz = obj.getClass();
		Field[] fields = clazz.getDeclaredFields();
		T newObj = (T) obj.getClass().newInstance();
		for(Field fld: fields) {
			int modifiers = fld.getModifiers();
			if(Modifier.isStatic(modifiers)) continue;
			fld.setAccessible(true);
			fld.set(newObj, fld.get(obj));			
		}
		return newObj;
	}
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException, InstantiationException {
		ReflectionClone<TestType> rc = new ReflectionClone();
		TestType obj1 = new TestType(1234567, "HI");
		TestType obj2 = rc.cloneObj(obj1);
		
		//А так нифига не работает...
//		ReflectionClone<Integer> rc = new ReflectionClone();
//		Integer obj1 = 1234;
//		Integer obj2 = rc.cloneObj(obj1);
		System.out.println(obj2);		
	}
}

class TestType {
	private static final Double statVar = 1.0;
	private Integer i;
	private String str;
	
	TestType() {
		i = 123;
		str = "hello";
	}
	
	TestType(Integer i, String str) {
		this.i = i;
		this.str = str;
	}
	
	@Override
	public String toString() {
		return str+ " " + i + " " + statVar;
	}
}
