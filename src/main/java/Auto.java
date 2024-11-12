public class Auto extends Vehiculo {

	private String tipo;
	private int numeroPuertas;

	public String getTipo(){
		return this.tipo;
	}

	public int getNumeroPuertas() {
		return this.numeroPuertas;
	}

	/**
	 * 
	 * @param numeroPuertas
	 */
	public void setNumeroPuertas(int numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}

	public Auto(String marca, String modelo, int anio, int precio, int numeroPuertas) {
		super(marca, modelo, anio, precio);
		this.tipo = "Auto";
		this.numeroPuertas = numeroPuertas;
	}

	public Auto() {
		super(null, null, 0, 0);
		this.tipo = "Auto";
	}
}