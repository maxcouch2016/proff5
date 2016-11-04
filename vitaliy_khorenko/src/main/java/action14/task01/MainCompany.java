package action14.task01;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCompany {
	
	private static final Logger logger = LogManager.getLogger(MainCompany.class.getName());

	public static void main(String[] args) {

		logger.info("Start app");
		ApplicationContext context = new ClassPathXmlApplicationContext("action14/task01.xml");
		
		Company myCompany = (Company) context.getBean("myCompany");
		//Human boss = (Human) context.getBean("boss");
		//Car car = (Car) context.getBean("car");		
		logger.info(myCompany);
		
		
		Human boss = (Human) context.getBean("boss");
		
		logger.info("Проверяем ссылки нашего boss и human из компании");		
		logger.info(boss.equals(myCompany.getHuman()));
		
		logger.info("Проверяем ссылки нашего boss и human из компании автомобиля");		
		logger.info(boss.equals(myCompany.getCar().getHuman()));
		
		Car car = (Car) context.getBean("car");
		
		logger.info("Проверяем ссылки нашего boss и human из автомобиля");
		logger.info(boss.equals(car.getHuman()));
		
		
		
		logger.info(">>>>   Изменим имя boss");
		boss.setName("NOT BOSS");
		logger.info(myCompany);
		
		
		
		
		logger.info("Проверяем ссылки нашего boss и human из компании");		
		logger.info(boss.equals(myCompany.getHuman()));
		
		logger.info("Проверяем ссылки нашего boss и human из компании автомобиля");		
		logger.info(boss.equals(myCompany.getCar().getHuman()));
		
		logger.info("Проверяем ссылки нашего boss и human из автомобиля");
		logger.info(boss.equals(car.getHuman()));
		
		
		logger.info(">>>> Достанем ещё одного боса из контейнера");
		Human boss1 = (Human) context.getBean("boss");
		logger.info(boss1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
