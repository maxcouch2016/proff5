package action08;

import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.annotation.ElementType;

@AddStrAnnot(prepend="a", append="z")
@MyAnnot2(10)
public class MyAnnotation {
	
	
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Object myO = new Object();
		Field field = myO.getClass().getFields()[0];
		field.setAccessible(true);
		field.get(myO);
		field.set(myO, null);
		
	}
}

@interface AddStrAnnot {
	public String append() default "";
	public String prepend();
}

@Target(ElementType.TYPE)
@interface MyAnnot2 {
	int value();
}
