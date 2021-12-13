import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel N��ez Alc�zar de Velasco
 *
 */
public class EjercicioCuatro {
	static Scanner inp = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Introduce un A�o: ");
		int yr = inp.nextInt();
		
		if (yr > 0) {
			if (((yr % 4) == 0) && ((yr % 100) != 0)) {
				System.out.print("El A�o " + yr + " es bisiesto");
			} else if (((yr % 4) == 0) && ((yr % 100) == 0) && ((yr % 400) == 0)) {
				System.out.print("El A�o " + yr + " es bisiesto");
			} else {
				System.out.print("El A�o " + yr + " no es bisiesto");
			}
		} else {
			System.out.print("El rango de a�o admitido es de 0001 a 9999");
		}

	}

}
