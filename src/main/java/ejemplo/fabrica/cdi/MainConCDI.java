package ejemplo.fabrica.cdi;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

import ejemplo.AlgoritmoHash;

public class MainConCDI {

	public static void main(String[] args) {
		
		try {
			SeContainer container = SeContainerInitializer.newInstance().initialize();			
			AlgoritmoHash algoritmo = container.select(AlgoritmoHash.class).get();
			
			System.out.println(algoritmo.codificar("Este es un ejemplo"));
			
		} catch (Exception e) {
			// muestra mensajes de error
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	
}
