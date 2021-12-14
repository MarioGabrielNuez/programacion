import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class TareaDos {
	static Scanner inp = new Scanner(System.in); // Variable de tipo Scanner para leer los datos introducidos por el usuario.
	static Boolean ok = true; // Boolean que controla la ejecución.
	static double p; // Número de preguntas
	static double v; // Puntucación máxima de cada pregunta
	static double n; // Nota obtenida sobre le computo global
	static double r; // Valor real de la nota (nota sobre 10)
	
	/**
	 * Proceso main de la clase TareaDos, siempre se ejecutará
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bienvenido al sistema de conversión de nota");
		
		/* 
		 * solicitamos el número total de preguntas que hay en el examen
		 */
		do {
			System.out.print("Introduce el número de preguntas: ");
			p = inp.nextInt();
			
			if(p < 0) {
				System.out.println("ERROR: el numero de preguntas no puede ser inferior a 0");
				ok = false; // si el usuario introduce un valor negativo, volvemos a pedir el dato
			} else {
				ok = true;
			}
		} while(!ok); // si la variable "ok" no es "true", seguimos pidiendo el dato
		
		/* 
		 * solicitamos la puntuación máxima posible en cada pregunta
		 */
		do {
			System.out.print("Introduce el valor de cada pregunta: ");
			v = inp.nextInt();
			
			if(v < 0) {
				System.out.println("ERROR: el valor de cada pregunta no puede ser inferior a 0");
				ok = false; // si el usuario introduce un valor negativo, volvemos a pedir el dato
			} else {
				ok = true; // si la variable "ok" no es "true", seguimos pidiendo el dato
			}
		} while(!ok);
		
		/* 
		 * solicitamos la puntuación obtenida sobre el computo global 
		 */
		do {
			System.out.print("Introduce la nota obtenida sobre " + Math.round(v * p) + ": ");
			n = inp.nextInt();
			
			if(n < 0) {
				System.out.println("ERROR: la nota obtenida no puede ser inferior a 0");
				ok = false; // si el usuario introduce un valor negativo, volvemos a pedir el dato
			} else {
				ok = true;
			}
		} while(!ok); // si la variable "ok" no es "true", seguimos pidiendo el dato
		
		r = (n * 10) / (v * p); // calculamos con una regla de tres la nota sobre 10 obtenida.
		
		System.out.printf("Tu nota real es: %.2f", r); // imprimimos la nota sobre 10 obtenida en pantalla.
	}

}
