import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class EjercicioCuatro {
	static Scanner inp = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Introduce un Año: ");
		int yr = inp.nextInt();
		
		if (yr > 0) {
			if (((yr % 4) == 0) && ((yr % 100) != 0)) {
				System.out.print("El Año " + yr + " es bisiesto");
			} else if (((yr % 4) == 0) && ((yr % 100) == 0) && ((yr % 400) == 0)) {
				System.out.print("El Año " + yr + " es bisiesto");
			} else {
				System.out.print("El Año " + yr + " no es bisiesto");
			}
		} else {
			System.out.print("El rango de año admitido es de 0001 a 9999");
		}

	}

}
