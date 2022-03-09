package base;

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
public class Centro {
	/**
	 * Código interno del centro
	 */
	private String codigoCentro;
	
	/**
	 * Nombre del centro.
	 */
	private String nombre;
	
	/**
	 * Direccion Física del centro
	 */
	private String direccionFisica;
	
	/**
	 * Telefono del centro
	 */
	private String telefono;
	
	/**
	 * Correo Electronico del centro
	 */
	private String correoElectronico;
	
	/**
	 * Horario de apertura del centro
	 */
	private String horario;

	/**
	 * @param codigoCentro
	 * @param nombre
	 * @param direccionFisica
	 * @param telefono
	 * @param correoElectronico
	 * @param horario
	 */
	public Centro(String codigoCentro, 
				  String nombre, 
				  String direccionFisica, 
				  String telefono, 
				  String correoElectronico, 
				  String horario) {
		
		this.codigoCentro = codigoCentro;
		this.nombre = nombre;
		this.direccionFisica = direccionFisica;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
		this.horario = horario;
	}

	/**
	 * @return the codigoCentro
	 */
	public String getCodigoCentro() {
		return codigoCentro;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the direccionFisica
	 */
	public String getDireccionFisica() {
		return direccionFisica;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @return the correoElectronico
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	/**
	 * @return the horario
	 */
	public String getHorario() {
		return horario;
	}
}
