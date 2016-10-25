package action08;

import java.lang.reflect.Method;

public class ReflectionString {
	
	

	public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		
		String myString = "";
		
		Class<?> clazz = myString.getClass();
		
		//Object refStr = clazz.newInstance();
		
		Method[] methods = clazz.getMethods();
		
		for(Method method : methods){
			System.out.println(method.getName());
		}		
	}
}
