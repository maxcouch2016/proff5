package action08;

import java.util.ArrayList;
import java.util.List;

public class ReflectionTaskExample {
	public List<Class<?>> reflectImportObject (Object obj)throws InstantiationException, IllegalAccessException{
		
		
		List<Class<?>>list = new ArrayList();
		  Class<?> clazz = obj.getClass();
		  while(clazz.getSuperclass()!=null){
		   list.add(clazz.getSuperclass());
		   clazz=clazz.getSuperclass();
		  }
		  return list;
				
				
		

}

}