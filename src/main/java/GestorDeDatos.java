import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;


public class GestorDeDatos {

	private static final ObjectMapper mapper = new ObjectMapper();

	public static ArrayList<Vehiculo> leerVehiculos(String nombreArchivo) {
		try {
			ClassLoader classLoader = GestorDeDatos.class.getClassLoader();
			File archivo = new File(classLoader.getResource(nombreArchivo).getFile());
			return mapper.readValue(archivo, mapper.getTypeFactory().constructCollectionType(List.class, Vehiculo.class));
		} catch (Exception e) {
			System.err.println("Error al leer lista: " + e.getMessage());
			return null;
		}
	}

	/**
	 * 
	 * @param vehiculos
	 */
	public static void guardarVehiculos(ArrayList<Vehiculo> vehiculos, String nombreArchivo) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.OBJECT_AND_NON_CONCRETE);
			mapper.writeValue(new File(nombreArchivo), vehiculos);
		} catch (Exception e) {
			System.err.println("Error al guardar lista: " + e.getMessage());
		}
	}


	public static Vehiculo leerVehiculo(String nombreArchivo){
		try {
			return mapper.readValue(new File(nombreArchivo), Vehiculo.class);
		} catch (Exception e) {
			System.err.println("Error al leer vehiculo");
			return null;
		}
	}
}