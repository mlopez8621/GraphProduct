package ejemplo.fabrica.conInstanciacion;

import java.io.FileReader;
import java.util.Properties;

import ejemplo.AlgoritmoHash;

public class FabricaConInstanciacion {

	public static String getOpcionConfigurada() {		

		// lee el archivo de configuración
		Properties opciones = new Properties();
		
		try {
			opciones.load(new FileReader("config-instanciacion.properties"));			
		} catch (Exception e) {
			// ignora cualquier error leyendo el archivo
		}
				
		// obtiene el valor. por defecto use "ejemplo.sha256"
		return opciones.getProperty("algoritmoHash", "ejemplo.Sha256");

	}
	
	public static AlgoritmoHash  getAlgoritmo() {
				
		// obtiene la opción configurada
		String opcion = FabricaConInstanciacion.getOpcionConfigurada();
		
		// crea el objeto de acuerdo a la opción configurada
		AlgoritmoHash algoritmo = null;
		try {
			algoritmo = (AlgoritmoHash) Class.forName(opcion).newInstance();

		} catch (Exception e) {
			// No se pudo crear el algoritmo
			throw new RuntimeException("No se pudo crear el algoritmo de hash");
		}
		return algoritmo;
	}
	
}
