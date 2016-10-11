package action08;

import java.lang.reflect.Method;

public class WorkTask {
	
	public WorkTask() {
		
	}
	
	public static void main(String[] args) {
		String str="";// str = "";

		Class<?> clazz = str.getClass();
		Method []ArrayString = clazz.getMethods();
		
		for (Method method : ArrayString) {
			System.out.println(method.getName());
			
		}
		
		
	}
 
	

}
