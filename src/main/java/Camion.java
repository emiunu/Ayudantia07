public class Camion extends Vehiculo {

	private String tipo;
	private int capacidadCargaToneladas;

	public String getTipo(){
		return this.tipo;
	}
	public int getCapacidadCargaToneladas() {
		return this.capacidadCargaToneladas;
	}

	/**
	 *
	 * @param capacidadCargaToneladas
	 */
	public void setCapacidadCargaToneladas(int capacidadCargaToneladas) {
		this.capacidadCargaToneladas = capacidadCargaToneladas;
	}

	public Camion(String marca, String modelo, int anio, int precio, int capacidadCargaToneladas) {
		super(marca, modelo, anio, precio);
		this.tipo = "Camion";
		this.capacidadCargaToneladas = capacidadCargaToneladas;
	}

	public Camion(){
		super(null,null,0,0);
		this.tipo = "Camion";
	}
}