package action04;

public class Car implements Comparable<Car>{
	private String number;
	private String color;
	
	public Car() {
	}
	
	public Car(String number, String color) {
		this.number = number;
		this.color = color;
	}
	
	@Override
	public int compareTo(Car obj) {
		return this.getNumber().compareTo(obj.getNumber());
	}
	
	@Override
	public String toString() {
		return "Car [number=" + number + ", color=" + color + "]";
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
