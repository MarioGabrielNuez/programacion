package base;

import java.util.Date;

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class Miembro extends Centro {
	/**
	 * Codigo interno de la persona
	 */
	private String codigoMiembro;
	
	/**
	 * Nombre de la persona
	 */
	private String nombreMiembro;
	
	/**
	 * Apellidos de la persona
	 */
	private String apellidos;
	
	/**
	 * Fecha de Nacimiento de la persona
	 */
	private Date fechaNacimiento;
	
	/**
	 * Correo electronico de la persona
	 */
	private String correoElectronicoMiembro;
	
	/**
	 * Telefono de la persona
	 */
	private String telefonoMiembro;

	/**
	 * @param codigoCentro
	 * @param nombre
	 * @param direccionFisica
	 * @param telefono
	 * @param correoElectronico
	 * @param horario
	 * @param codigoMiembro
	 * @param nombreMiembro
	 * @param apellidos
	 * @param fechaNacimiento
	 * @param correoElectronicoMiembro
	 * @param telefonoMiembro
	 */
	public Miembro(String codigoCentro, 
				   String nombre, 
				   String direccionFisica, 
				   String telefono,
				   String correoElectronico, 
				   String horario, 
				   String codigoMiembro, 
				   String nombreMiembro, 
				   String apellidos,
				   Date fechaNacimiento, 
				   String correoElectronicoMiembro, 
				   String telefonoMiembro) {
		
		super(codigoCentro, nombre, direccionFisica, telefono, correoElectronico, horario);
		
		this.codigoMiembro = codigoMiembro;
		this.nombreMiembro = nombreMiembro;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.correoElectronicoMiembro = correoElectronicoMiembro;
		this.telefonoMiembro = telefonoMiembro;
	}

	/**
	 * @return the codigoMiembro
	 */
	public String getCodigoMiembro() {
		return codigoMiembro;
	}

	/**
	 * @return the nombreMiembro
	 */
	public String getNombreMiembro() {
		return nombreMiembro;
	}

	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * @return the correoElectronicoMiembro
	 */
	public String getCorreoElectronicoMiembro() {
		return correoElectronicoMiembro;
	}

	/**
	 * @return the telefonoMiembro
	 */
	public String getTelefonoMiembro() {
		return telefonoMiembro;
	}
}
