package action08;

import java.util.ArrayList;
import java.util.List;

/*
 * Задача1:(ReflectionTask1Example) Написать метод принимающий любой объект.
 * Метод возвращает все классы в иерархию которых входит данный объект.
 */

public class ReflectionTask1Example {
	
	Object myObj;

	public static void main(String[] args) {
		
		ReflectionTask1Example reflectionTask1Example = new ReflectionTask1Example();
		List<String> myArrayList = new ArrayList<>();		
		System.out.println(reflectionTask1Example.getFullClass(myArrayList));	

	}
	
	
	public List<String> getFullClass(Object object){
		List<Class<?>> listO = new ArrayList<>();
		Class<?> clazz = object.getClass();
		while(clazz != null) {
			listO.add(clazz);
			clazz = clazz.getSuperclass();
		}


		List<String> list = new ArrayList<>();
		for(Class classs : listO){
			list.add(classs.getName());
		}
		
		
		
		return list;
	}
	
	
	
	

}
