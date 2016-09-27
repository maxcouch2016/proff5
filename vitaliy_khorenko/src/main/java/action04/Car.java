package action04;

public class Car implements Comparable<Car> {
	
	private String number;
	private String color;

	

	public Car() {
		
	}

	public Car(String number, String color) {
		super();
		this.number = number;
		this.color = color;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int compareTo(Car o) {
		
		return this.getNumber().compareTo(o.getNumber());
		
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

	@Override
	public String toString() {
		return "Car [number=" + number + ", color=" + color + "]";
	}
	
	
	
	
	
	
	
	

}
