package springTest;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	Client client;
	ConsoleEventLogger eventLogger;
	
	public App(Client client, ConsoleEventLogger eventLogger) {
		super();
		this.client = client;
		this.eventLogger = eventLogger;
	}


	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("springRes/simple.xml");
		System.out.println("tut");
		App app = (App) ctx.getBean("app");
		
		app.logEvent(app.client.getFullName());
		app.logEvent(app.client.getId());

	}
	
	private void logEvent(String msg){
		String message = msg.replaceAll(client.getId(), client.getFullName());
		eventLogger.logEvent(msg);
	}

}
