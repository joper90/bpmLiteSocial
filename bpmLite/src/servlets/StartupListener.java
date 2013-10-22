package servlets;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartupListener  implements ServletContextListener{


	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("JmsConnector distroyed..");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {

		System.out.println("\n\n====>Starting to init the system...");
		
		
		System.out.println("====>End init the system...\n\n");
		
	}

}
