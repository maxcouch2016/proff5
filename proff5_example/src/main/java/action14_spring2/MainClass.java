package action14_spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("action17_spring2/config.xml");
		//App1 app = (App1)context.getBean("app"); Error
		Perform app = (Perform)context.getBean("app");// normal
		app.perform();
	}
}
