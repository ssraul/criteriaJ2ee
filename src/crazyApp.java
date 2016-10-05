import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import crazy.client.Client;
import crazy.service.ClientService;

public class crazyApp {

	public static void main(String[] args) {
		//Con esta linea añadimos el framework de Spring
		//ApplicationContext appCtx = new ClassPathXmlApplicationContext("app-ctx.xml");
		//Esto es una prueba hecha en clase.
		
		ClientService cs = new ClientService();
		Client c = cs.getClient("raul@gmail.com");
		
		
		System.out.println(c.getNombre());
		System.out.println(c.getApellido());
		System.out.println(c.getEmail());
		
	}

}

