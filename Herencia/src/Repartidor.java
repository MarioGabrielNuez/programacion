
public class Repartidor extends Empleado {
	private String zona;

	/**
	 * Constrcutor Vacío, recoje los datos de la clase padre
	 */
	public Repartidor() {
		super();
	}

	/**
	 * Constructor con datos, recoje los datos de la clase padre
	 * 
	 * @param nombre
	 * @param apellido
	 * @param edad
	 * @param salario
	 */
	public Repartidor(String nombre, String apellido, int edad, double salario, String zona) {
		super(nombre, apellido, edad, salario);
		this.zona = zona; 
	}

	/**
	 * @return the zona
	 */
	public String getZona() {
		return zona;
	}

	/**
	 * @param zona the zona to set
	 */
	public void setZona(String zona) {
		this.zona = zona;
	}
}
