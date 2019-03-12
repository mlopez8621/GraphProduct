package ejemplo.fabrica.conIf;

import ejemplo.AlgoritmoHash;

public class MainConIf {

	public static void main(String[] args) {
		
		AlgoritmoHash algoritmo;
		algoritmo = FabricaConIf.getAlgoritmo();
		
		System.out.println(algoritmo.codificar("Este es un ejemplo"));
		
	}
	
}
