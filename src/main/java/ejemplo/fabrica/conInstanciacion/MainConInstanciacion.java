package ejemplo.fabrica.conInstanciacion;

import ejemplo.AlgoritmoHash;

public class MainConInstanciacion {

	public static void main(String[] args) {
		
		AlgoritmoHash algoritmo;
		algoritmo = FabricaConInstanciacion.getAlgoritmo();
		
		System.out.println(algoritmo.codificar("Este es un ejemplo"));
		
	}
	
}
