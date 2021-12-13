import java.util.*;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class Alumno {

	/*
	 * Variables que corresponden a las caracteristicas de un alumno
	 */
	 private String nombre;
	 private String apellido1;
	 private String apellido2;
	 private Date fechaNacimiento;
	 private String dni;
	 private String numeroMatricula;
	 private String email;
	 private int edad;
	 
	 public Alumno() {
		 
	 }
	 
	 public Alumno(String nombre) {
		 this.nombre = nombre;
	 }
	
	/**
	 * @param nombre
	 * @param apellido1
	 * @param apellido2
	 * @param fechaNacimiento
	 * @param dni
	 * @param numeroMatricula
	 * @param email
	 * @param edad
	 */
	public Alumno(String nombre, String apellido1, String apellido2, Date fechaNacimiento, String dni,
			String numeroMatricula, String email, int edad) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.fechaNacimiento = fechaNacimiento;
		this.dni = dni;
		this.numeroMatricula = numeroMatricula;
		this.email = email;
		this.edad = edad;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
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
	 * @return the apellido1
	 */
	public String getApellido1() {
		return apellido1;
	}
	/**
	 * @param apellido1 the apellido1 to set
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	/**
	 * @return the apellido2
	 */
	public String getApellido2() {
		return apellido2;
	}
	/**
	 * @param apellido2 the apellido2 to set
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	/**
	 * @return the fechaNacimiento
	 */
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	/**
	 * @param fechaNacimiento the fechaNacimiento to set
	 */
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return the numeroMatricula
	 */
	public String getNumeroMatricula() {
		return numeroMatricula;
	}
	/**
	 * @param numeroMatricula the numeroMatricula to set
	 */
	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}	 
}
