import java.util.Scanner;

/**
 * 
 */

/**
 * @author mario
 *
 */
public class EjercicioDiez {
	static Scanner inp = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Introduce la altura (h): ");
		int h = inp.nextInt();
		
		System.out.print("Introduce el radio (r): ");
		int r = inp.nextInt();
		
		System.out.println("V = PI * H * R^2");
		System.out.println("Por lo que el Volumen (V) es " + (Math.PI * (h * (Math.pow(r, 2)))));
	}

}
