package action14.task01;

/*
 * Задача 1. Создать классы Company, Car, Human.
 Создать класс Компания, в компании есть ссылка на машину и на директора.
 У компании есть директор и машина, директор ездит внутри машины.
 Настроить бины с помощью xml-конфигураций.
 В MainClass создать три объекта и вывести их на экран.
 (example action17_spring1)
 */

public class Car {
	
	private String model;
	private Human human;
	
	public Car() {
		
	}
	
	public Car(String model) {
		this.model = model;
	}


	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Human getHuman() {
		return human;
	}

	public void setHuman(Human human) {
		this.human = human;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", human=" + human + "]";
	}	

}
