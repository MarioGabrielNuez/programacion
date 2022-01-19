import java.util.*;

/**
 * Ejemplo de Array List con BDD banco
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class Main {
	public static ArrayList<Cuenta> Cuenta;
	public static ArrayList<Asignacion> Asignacion;
	public static ArrayList<Persona> Personas;
	public static ArrayList<Transferencia> Transferencias;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Personas = Back.selectPe();
		Cuenta = Back.selectCu();
		Asignacion = Back.selectAs();
		Transferencias = Back.selectTr();
	}
}
