package hw.week14_01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("hw/week14_01/spring01.xml");
		Company company = ctx.getBean("company", Company.class);
		System.out.println(company);
	}
}
