package hwWeek1;

public class Test {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.name = "Gavchik";
		d.size = 21;
		d.breed ="Dvor";
		
		Dog d1 = new Dog();
		d1.name = "Roma";
		d1.size = 12;
		d1.breed ="Cat";
		
		Dog d2 = new Dog();
		d2.name = "Vasya";
		d2.size = 56;
		d2.breed ="Teryer";
		
		Dog d3 = new Dog();
		d3.name = "Tifa";
		d3.size = 21;
		d3.breed ="hichnic";
		
		Dog d4 = new Dog();
		d4.name = "Grrr";
		d4.size = 21;
		d4.breed ="Dvor";
		
		System.out.println(d.toSting(20));
	}

}
