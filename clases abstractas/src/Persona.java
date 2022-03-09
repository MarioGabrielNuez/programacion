/**
 * 
 */

/**
 * @author mario
 *
 */
public abstract class Persona {
	private String nombre;
	private String apellidos;
	
	/**
	 * 
	 */
	public Persona() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract String getDatos();

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

}
