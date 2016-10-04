package hwWeek1;

public class Dog {

	int size;
	String breed;
	String name;
	
	String toSting(int i){
		size+=i;
		return (size + " " + breed + " " + name);
	}
}
