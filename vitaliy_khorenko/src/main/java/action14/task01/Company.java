package action14.task01;

public class Company {
	
	private String name;
	private Human human;
	private Car car;
	
	public Company(){
		
	}
	
	public Company(String name) {
		this.name = name;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Human getHuman() {
		return human;
	}

	public void setHuman(Human human) {
		this.human = human;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Company [human=" + human + ", car=" + car + "]";
	}

}
