/**
 * Construimos el objeto que representara el coche que sera alquilado 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class Car {
	private String identif; // identificador interno del coche
	private String matricula; // Matricula del coche
	private String marca; // Marca del coche
	private byte numPlazas; // Número de plazas del coche
	private double precHora; // Precio hora en euros
	
	/**
	 * @param identif
	 * @param matricula
	 * @param marca
	 * @param numPlazas
	 * @param precHora
	 */
	public Car(String identif, String matricula, String marca, byte numPlazas, double precHora) {
		this.identif = identif;
		this.matricula = matricula;
		this.marca = marca;
		this.numPlazas = numPlazas;
		this.precHora = precHora;
	}

	/**
	 * @return the identif
	 */
	public String getIdentif() {
		return identif;
	}

	/**
	 * @param identif the identif to set
	 */
	public void setIdentif(String identif) {
		this.identif = identif;
	}

	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	/**
	 * @return the numPlazas
	 */
	public byte getNumPlazas() {
		return numPlazas;
	}
	
	/**
	 * @param numPlazas the numPlazas to set
	 */
	public void setNumPlazas(byte numPlazas) {
		this.numPlazas = numPlazas;
	}
	
	/**
	 * @return the precHora
	 */
	public double getPrecHora() {
		return precHora;
	}
	
	/**
	 * @param precHora the precHora to set
	 */
	public void setPrecHora(double precHora) {
		this.precHora = precHora;
	}
}
