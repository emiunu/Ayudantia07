import java.util.*;

public class Automotora {

	private ArrayList<Vehiculo> vehiculos;

	public Automotora() {
		vehiculos = cargarDatos("vehiculos.json");
		if (vehiculos == null) {
			vehiculos = new ArrayList<Vehiculo>();
		}
	}
	/**
	 * 
	 * @param auto
	 */
	public void agregarAuto(Auto auto) {
		vehiculos = cargarDatos("vehiculos.json");
		vehiculos.add(auto);
		guardarDatos(vehiculos, "vehiculos.json");
	}

	/**
	 * 
	 * @param camion
	 */
	public void agregarCamion(Camion camion) {
		vehiculos = cargarDatos("vehiculos.json");
		vehiculos.add(camion);
		guardarDatos(vehiculos, "vehiculos.json");

	}

	/**
	 * 
	 * @param bicicleta
	 */
	public void agregarBicicleta(Bicicleta bicicleta) {
		vehiculos = cargarDatos("vehiculos.json");
		vehiculos.add(bicicleta);
		guardarDatos(vehiculos, "vehiculos.json");
	}

	public List<Auto> ListarAutos() {
		List<Auto> autos = new ArrayList<Auto>();
		for (Vehiculo vehiculo : cargarDatos("vehiculos.json")) {
			if (vehiculo instanceof Auto) {
				autos.add((Auto) vehiculo);
			}
		}

		return autos;
	}

	public List<Camion> ListarCamiones() {
		List<Camion> camiones = new ArrayList<Camion>();
		for (Vehiculo vehiculo : cargarDatos("vehiculos.json")) {
			if (vehiculo instanceof Camion) {
				camiones.add((Camion) vehiculo);
			}
		}

		return camiones;
	}

	public List<Bicicleta> ListarBicicletas() {
		List<Bicicleta> bicicletas = new ArrayList<Bicicleta>();
		for (Vehiculo vehiculo : cargarDatos("vehiculos.json")) {
			if (vehiculo instanceof Bicicleta) {
				bicicletas.add((Bicicleta) vehiculo);
			}
		}
		return bicicletas;
	}

	public Auto buscarAuto(String marca,String modelo, int numeroPuertas) {
		for (Vehiculo vehiculo : cargarDatos("vehiculos.json")) {
			if (vehiculo instanceof Auto) {
				Auto auto = (Auto) vehiculo;
				if (auto.getMarca().equals(marca) && auto.getModelo().equals(modelo) && auto.getNumeroPuertas() == numeroPuertas) {
					return auto;
				}
			}
		}
		return null;
	}

	public Camion buscarCamion(String marca, String modelo, int capacidadCargaToneladas) {
		for (Vehiculo vehiculo : cargarDatos("vehiculos.json")) {
			if (vehiculo instanceof Camion) {
				Camion camion = (Camion) vehiculo;
				if (camion.getMarca().equals(marca) && camion.getModelo().equals(modelo) && camion.getCapacidadCargaToneladas() == capacidadCargaToneladas) {
					return camion;
				}
			}
		}
		return null;

	}

	public Bicicleta buscarBicicleta(String marca, String modelo, String tipoBicicleta) {
		for (Vehiculo vehiculo : cargarDatos("vehiculos.json")) {
			if (vehiculo instanceof Bicicleta) {
				Bicicleta bicicleta = (Bicicleta) vehiculo;
				if (bicicleta.getMarca().equals(marca) && bicicleta.getModelo().equals(modelo) && bicicleta.getTipoBicicleta().equals(tipoBicicleta)) {
					return bicicleta;
				}
			}
		}
		return null;
	}

	public ArrayList<Vehiculo> cargarDatos(String nombreArchivo) {
		return GestorDeDatos.leerVehiculos(nombreArchivo);
	}

	/**
	 * 
	 * @param vehiculo
	 */
	public void guardarDatos(ArrayList<Vehiculo> vehiculo, String nombreArchivo) {
		GestorDeDatos.guardarVehiculos(vehiculo, nombreArchivo);
	}

}