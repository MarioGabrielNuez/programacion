import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class EjercicioCinco {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 0;
		Scanner inp = new Scanner(System.in);
		
		System.out.print("¿hasta donde quieres contar?: ");
		int nend = inp.nextInt();
		
		for(int i = 0;i <= nend;i++) {
			if ((i % 3) == 0) {
				System.out.println(i);
				x++;
			}
		}
		
		System.out.println("Se han localizado " + x + " multiplos de Tres");
	}
	
}
