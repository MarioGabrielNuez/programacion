/**
 * Objeto que representa al cliente
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class Cliente {
	private String nombre; // Nombre del cliente
	private String nif; // NIF del cliente
	private String fechaInicio; // Fecha de inicio

	/**
	 * Constructor Vacío 
	 */
	public Cliente() {
	
	}

	/**
	 * Constructor con todos los datos
	 * @param nombre
	 * @param nif
	 * @param fechaInicio
	 */
	public Cliente(String nombre, String nif, String fechaInicio) {
		this.nombre = nombre;
		this.nif = nif;
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the nif
	 */
	public String getNif() {
		return nif;
	}

	/**
	 * @param nif the nif to set
	 */
	public void setNif(String nif) {
		this.nif = nif;
	}

	/**
	 * @return the fechaInicio
	 */
	public String getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
}
