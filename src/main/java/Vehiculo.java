import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "tipo")
@JsonSubTypes({
		@JsonSubTypes.Type(value = Auto.class, name = "Auto"),
		@JsonSubTypes.Type(value = Camion.class, name = "Camion"),
		@JsonSubTypes.Type(value = Bicicleta.class, name = "Bicicleta")
})


public abstract class Vehiculo {

	private String marca;
	private String modelo;
	private int anio;
	private int precio;

	public Vehiculo(){}

	public String getMarca() {
		return this.marca;
	}

	/**
	 * 
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	/**
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return this.anio;
	}

	/**
	 * 
	 * @param anio
	 */
	public void setAnno(int anio) {
		this.anio = anio;
	}

	public int getPrecio() {
		return this.precio;
	}

	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Vehiculo(String marca, String modelo, int anio, int precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.precio = precio;
	}
}