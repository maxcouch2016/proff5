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
	}
}
