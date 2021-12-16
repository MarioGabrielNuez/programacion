import java.util.*;

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
	private Date fechaInicio; // Fecha de inicio

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
	public Cliente(String nombre, String nif) {
		this.nombre = nombre;
		this.nif = nif;
		this.fechaInicio = new Date();
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
	public Date getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", nif=" + nif + ", fechaInicio=" + fechaInicio + "]";
	}
}
