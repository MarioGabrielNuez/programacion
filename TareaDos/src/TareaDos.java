import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel N��ez Alc�zar de Velasco
 *
 */
public class TareaDos {
	static Scanner inp = new Scanner(System.in); // Variable de tipo Scanner para leer los datos introducidos por el usuario.
	static Boolean ok = true; // Boolean que controla la ejecuci�n.
	static double p; // N�mero de preguntas
	static double v; // Puntucaci�n m�xima de cada pregunta
	static double n; // Nota obtenida sobre le computo global
	static double r; // Valor real de la nota (nota sobre 10)
	
	/**
	 * Proceso main de la clase TareaDos, siempre se ejecutar�
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bienvenido al sistema de conversi�n de nota");
		
		/* 
		 * solicitamos el n�mero total de preguntas que hay en el examen
		 */
		do {
			System.out.print("Introduce el n�mero de preguntas: ");
			p = inp.nextInt();
			
			if(p < 0) {
				System.out.println("ERROR: el numero de preguntas no puede ser inferior a 0");
				ok = false; // si el usuario introduce un valor negativo, volvemos a pedir el dato
			} else {
				ok = true;
			}
		} while(!ok); // si la variable "ok" no es "true", seguimos pidiendo el dato
		
		/* 
		 * solicitamos la puntuaci�n m�xima posible en cada pregunta
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
		 * solicitamos la puntuaci�n obtenida sobre el computo global 
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
