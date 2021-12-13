import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class EjercicioDos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);

		int sum = 0;
		int cont = 0;
		int x = 0;
		
		System.out.print("Introduce un Número: ");
		int N = inp.nextInt();
		
		while(cont <= (N - 1)){
			x++;
			if ((x % 2) == 0 && x != 0) {
				System.out.println(x + " + " + sum + " = " + (x + sum));
				sum = x + sum;
				cont++;
			}
			
		};
		
		System.out.println("la Suma de los " + N + " primeros numeros pares es: " + sum);
	}

}