import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class EjercicioSeis {
	static Scanner inp = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Longitud del Lado: ");
		int lad = inp.nextInt();
		
		for(int x = 0;x <= (lad - 1);x++) {
			if (x >= 1 && x != (lad - 1)) {
				for(int i = 0;i <= (lad - 1);i++) {
					if (i >= 1 && i != (lad - 1)) {
						System.out.print(" ");
					} else if (i == 0 || i == (lad - 1)){
						System.out.print("*");
					}
				}
				
			} else {
				for(int i = 0;i <= (lad - 1);i++) {
					System.out.print("*");
				}
			}
			
			System.out.print("\n");
		}
		
	}
		
}