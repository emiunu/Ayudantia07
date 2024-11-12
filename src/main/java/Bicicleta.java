public class Bicicleta extends Vehiculo {
	private String tipo;
	private String tipoBicicleta;

	public String getTipo(){
		return this.tipo;
	}
	public String getTipoBicicleta() {
		return this.tipoBicicleta;
	}

	/**
	 * 
	 * @param tipoBicicleta
	 */
	public void setTipoBicicleta(String tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}

	public Bicicleta(String marca, String modelo, int anio, int precio, String tipoBicicleta) {
		super(marca, modelo, anio, precio);
		this.tipo = "Bicicleta";
		this.tipoBicicleta = tipoBicicleta;
	}

	public Bicicleta(){
		super(null,null,0,0);
		this.tipo = "Bicicleta";
	}
}