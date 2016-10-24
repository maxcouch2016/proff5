/* Задача0: Вывести все методы класса String

Задача1:(ReflectionTask1Example) Написать метод принимающий любой объект.
 Метод возвращает все классы в иерархию которых входит данный объект. 

Задача2:(ReflectionTask2Example) Написать метод, принимающий любой объект, выводящий список всех интерфейсов по иерархии наследования классов.
*/
package action08;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionApi {
	private String str;// str = "";
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		ReflectionApi myObj = new ReflectionApi();

		Class<?> cl = myObj.getClass();
 
		ReflectionApi obj1 = (ReflectionApi)cl.newInstance();

		
		Field[] fields = cl.getFields();
		cl.getDeclaredFields();
		
		Method[] methods = cl.getMethods();
		cl.getDeclaredMethods();
		
		cl.getInterfaces();  
		cl.getSuperclass();
		
		
		
		//methods[0].isAnnotationPresent(MyAnnotation.class);
 	}	
}
