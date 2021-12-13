import java.util.Scanner;

/**
 * Una empresa de coches de alquiler tiene una base de datos de coches con identificadores, marca y número de plazas.
 * Cada coche tiene un precio determinado de alquiler por hora, siendo diferente en función del numero de plazas y de la marca.
 * Se pide desarrollar un programa en el que el usuario pueda coger un coche y en funcion total del uso tenga información sobre el precio.
 * Es necesario tener en cuenta primero el mnumero de personas que van a utilizar el coche
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class Base {
	private static String[] idcoche = {"7654LST", "1234GGG", "3333BBC", "7777CGR", "8372DFS"};
	private static String[] marcacoche = {"Mercedes", "Renoult", "Ferrary", "Seat", "RENAULT BILBAO"};
	private static int[] plazascoche = {5, 7, 2, 5, 342};
	private static double[] preciocoche = {13.5, 15, 35, 8, 21};
	private static Scanner entrada =  new Scanner(System.in);
	
	/**
	 * Función primcipal del programa
	 * @param args
	 */
	public static void main(String[] args) {
		alquilarCoche();
	}
	
	/**
	 * Descripcion: solicitamos el numeor de personas y el limite de precio
	 */
	private static void alquilarCoche() {
		int numeroPersonas = entrada.nextInt();
		if(numeroPersonas < 1 || numeroPersonas > 7) {
			System.out.println("no hay coches disponibles");
		} else {
			double limitePrecio = entrada.nextDouble();
			listaCoches(numeroPersonas, limitePrecio);
		}
	}
	
	/**
	 * Metodo que lista los coches en funcion del precio y las plazas solicitadas
	 * @param numeroPersonas
	 * @param limitePrecio
	 */
	private static void listaCoches(int numeroPersonas, double limitePrecio) {
		for (int i = 0; i < idcoche.length; i++) {
			if (plazascoche[i] >= numeroPersonas && preciocoche[i] >= limitePrecio) {
				System.out.printf("%d - El Coche %s de la marca %s tiene %d plazas tiene un precio por hora de %.2f €/hora %n", i, idcoche[i], marcacoche[i], plazascoche[i], preciocoche[i]);
			}
			elegircoche();
		}
	}
	
	private static void elegircoche() {
		System.out.println("-----------------------------------------");
		System.out.println("Elige el coche que necesites");
		int cocheElegido = entrada.nextInt();
		
		for (int i = 0; i < idcoche.length; i++) {
			if (cocheElegido == i) {
				int numerohoras = entrada.nextInt();
				System.out.println("desglose de precio");
				System.out.printf("Precio por hora -------- %.2f %n", preciocoche[i]);
				System.out.printf("Numero de horas -------- %d %n", numerohoras);
				System.out.printf("Total -------- %.2f %n", preciocoche[i] * numerohoras);
			}
		}
	}

}
