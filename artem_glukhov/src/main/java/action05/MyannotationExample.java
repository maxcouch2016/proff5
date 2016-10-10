package action05;

@MyAnnotation
public class MyannotationExample {
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	@MyAnnotation
	public static void main(@MyAnnotation String[] args) {
		System.out.println("Hello annotaion!");
	}
}
