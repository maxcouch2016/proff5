package hw.week14_01;

public class Company {
	private String name;
	private Human director;
	private Car car;
	
	public Company(String name, Human director, Car car) {
		this.name = name;
		this.director = director;
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Human getDirector() {
		return director;
	}

	public void setDirector(Human director) {
		this.director = director;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", director=" + director + ", car=" + car + "]";
	}
}
