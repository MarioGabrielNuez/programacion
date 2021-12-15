import java.util.*;

/**
 * Objeto que representa al trabajador
 */

/**
 * @author mario
 *
 */
public class Trabajador {
	private String nombre; // Nombre del Trabajador
	private String apellidos; // apellidos del Trabajador
	private String nif; // NIF del Trabajador
	private Departamento departamento; // departamento del Trabajador
	private Date fechaInicio; // fecha de inicio de contrato
	
	/**
	 * Constructor vacío
	 */
	public Trabajador() {
	}

	/**
	 * @param nombre
	 * @param apellidos
	 * @param nif
	 * @param departamento
	 * @param fechaInicio
	 */
	public Trabajador(String nombre, String apellidos, String nif, Departamento departamento, Date fechaInicio) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nif = nif;
		this.departamento = departamento;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
	 * @return the departamento
	 */
	public Departamento getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
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
}
