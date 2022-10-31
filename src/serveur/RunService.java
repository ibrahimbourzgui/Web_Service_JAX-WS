package serveur;

import javax.xml.ws.Endpoint;

import metier.ContactService;

public class RunService {
	public static void main(String[] args) {
		//url: @IP et du n port
		String url= "http://localhost:5555/";
		//publier le WS Point d'accès au WebService
		Endpoint.publish(url, new ContactService());
		System.out.println("Démarrage du serveur....");
		
	}
	
}
