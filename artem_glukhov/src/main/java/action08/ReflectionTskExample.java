package action08;
/* Задача0: Вывести все методы класса String

Задача1:(ReflectionTask1Example) Написать метод принимающий любой объект.
 Метод возвращает все классы в иерархию которых входит данный объект. 

Задача2:(ReflectionTask2Example) Написать метод, принимающий любой объект, выводящий список всех интерфейсов по иерархии наследования классов.
Задача3: Написать метод, принимающий любой объект, проверяющий есть ли в этом объекте строковая переменная.
 Если переменная равно NULL, то заменяем значение на "empty".
*/
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;



public class ReflectionTskExample {

	
		private String str;// str = "";
		
		public static void main(String[] args) throws InstantiationException, IllegalAccessException {
		}
public List<Class<?>> reflectImportObject (Object obj)throws InstantiationException, IllegalAccessException{
	
	
	List<Class<?>>list = new ArrayList();
	  Class<?> clazz = obj.getClass();
	  while(clazz.getSuperclass()!=null){
	   list.add(clazz.getSuperclass());
	   clazz=clazz.getSuperclass();
	  }
	  return list;
			
}			
	
//	  public static void interfaces(Object obj){
//		  List<Class> classList = (List<Class>)getClasses(obj);
//			Set<Class> intSet = new HashSet<>();
//			for(Class clazz : classList) {
//				for(Class interfaze : clazz.getInterfaces())
//					intSet.add(interfaze);
//			}
//			System.out.println(intSet); 
//	
	
 	
	

	
};
			

