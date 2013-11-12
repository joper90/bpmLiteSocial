package servlets;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import engine.ServiceConfig;

public class StartupListener  implements ServletContextListener{



	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("JmsConnector distroyed..");
	}

	public void contextInitialized(ServletContextEvent arg0) {

		System.out.println("\n\n====>Starting to init the system...");
		
		System.out.println("\n\n====>Setting ServiceConfig and connecting to the database...");
		ServiceConfig.instance.isAlive();
		
		System.out.println("====>End init the system...\n\n");
		
	}

}
