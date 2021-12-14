import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class EjercicioSiete {
	static Scanner inp = new Scanner(System.in);
	
	static int cont = 0;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Escribe la altura: ");
		int alt = inp.nextInt();
		
		for(int x = 0;x <= (alt - 1);x++) {
			if (cont != 0) {
				for (int z = 0;z <= (cont - 1);z++) {
					System.out.print(" ");
				}
				
				for(int i = 1;i <= ((alt - 1) - (cont - 1));i++) {
					System.out.print("*");
				}
				
			} else {
				for(int i = 0;i <= (alt - 1);i++) {
					System.out.print("*");
				}
			}
			System.out.print("\n");
			cont++;
		}

	}

}
