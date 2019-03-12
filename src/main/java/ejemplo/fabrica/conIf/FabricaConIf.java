package ejemplo.fabrica.conIf;

import java.io.FileReader;
import java.util.Properties;

import ejemplo.AlgoritmoHash;
import ejemplo.Sha256;
import ejemplo.Sha512;

public class FabricaConIf {

	public static String getOpcionConfigurada() {
		// define un valor por defecto
		String opcionConfigurada = "sha512";  
		
		try {
			// lee el archivo de configuración
			Properties opciones = new Properties();
			opciones.load(new FileReader("config-if.properties"));
			
			// revisa las opciones configuradas
			if (opciones.getProperty("sha256", "false").equals("true")) {
				opcionConfigurada = "sha256";				
			}

			if (opciones.getProperty("sha512", "false").equals("true")) {
				opcionConfigurada = "sha512";				
			}	
		
		} catch (Exception e) {
			// ignora cualquier error leyendo el archivo
		} 
		
		return opcionConfigurada;
	}
	
	public static AlgoritmoHash  getAlgoritmo() {
				
		// obtiene la opción configurada
		String opcion = FabricaConIf.getOpcionConfigurada();
		
		// crea el objeto de acuerdo a la opción configurada
		AlgoritmoHash algoritmo = null;
		switch(opcion) {
		
		case "sha256":
			algoritmo = new Sha256();
			break;
		
		case "sha512":
			algoritmo = new Sha512();
			break;
		}
		
		return algoritmo;
	}
	
}
