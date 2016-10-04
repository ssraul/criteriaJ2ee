package crazy.service;

import crazy.client.Client;

public class ClientService {
	
	public Client getClient(String email){
		Client c = new Client();
		c.setNombre("Raul");
		c.setApellido("Sanchez");
		c.setEmail("Raul@gmial.com");
		
		return c;
		
	}

}
