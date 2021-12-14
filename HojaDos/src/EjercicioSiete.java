import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class EjercicioSiete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		
		int cont = 0;
		int nin = 0;
		int nfi = 0;
		int res = 0;
		boolean ejec = true;
		
		System.out.print("Numero de inicio: ");
		nin = inp.nextInt();
		
		System.out.print("Numero de fin: ");
		nfi = inp.nextInt();
		
		while(ejec == true) {
			if (nin <= nfi) {
				for (int i = nin; i <= nfi; i++) {
					if ((i % 2) == 0) {
						System.out.println(i + " + " + res + " = " + (i + res));
						res = i + res;
						cont++;
					}

				}
				ejec = false;
				System.out.println("En total, se han sumado " + cont + " números contando los pares desde " + nin + " hasta " + nfi);

			} else {
				System.out.println("Error: el número de inicio no puede ser mayor que el número de fin");
				System.out.println("******************************************************************");
				System.out.print("Numero de inicio: ");
				nin = inp.nextInt();
				
				System.out.print("Numero de fin: ");
				nfi = inp.nextInt();
			}

		}

	}

}
