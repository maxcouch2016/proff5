package action04;


public class Car implements Comparable<Car>{
	private String number;
	private String color;
	
	@Override
	public int compareTo(Car obj) {
		//Car obj1 = (Car)obj;
		return this.getNumber().compareTo(
					obj.getNumber());
	}
	
	
	@Override
	public String toString() {
		return "Car [number=" + number + ", color=" + color + "]";
	}
	public Car(String number, String color) {
		super();
		this.number = number;
		this.color = color;
	}
	public Car() {
		super();
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}