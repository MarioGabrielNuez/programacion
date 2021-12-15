import java.util.*;

/**
 * Una empresa de coches de alquiler tiene una base de datos de coches con identificadores, marca y n�mero de plazas.
 * Cada coche tiene un precio determinado de alquiler por hora, siendo diferente en funci�n del numero de plazas y de la marca.
 * Se pide desarrollar un programa en el que el usuario pueda coger un coche y en funcion total del uso tenga informaci�n sobre el precio.
 * Es necesario tener en cuenta primero el mnumero de personas que van a utilizar el coche
 */

/**
 * @author Mario Gabriel N��ez Alc�zar de Velasco
 *
 */
public class Main {
	static public Scanner inp = new Scanner(System.in);
	static public boolean ej = true;
	
	static public Car coche1 = new Car("1","3432HGD", "Mercedes", (byte) 4, 24.32);
	static public Car coche2 = new Car("2", "4376FGD", "Toyota", (byte) 6, 32);
	static public Car coche3 = new Car("3", "1276RTD", "Renauld", (byte) 2, 13.5);
	static public Car coche4 = new Car("4","0978RCT", "Ferrary", (byte) 4, 56);
	
	/**
	 * Funci�n principal del programa, se ejecutar� el primero.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		do {
			/*
			 * Men�
			 */
			System.out.println("Coche Ya -- HEGEVE (Herramienta de Gesti�n y Venta)");
			System.out.println("*************************************************");
			System.out.println("1 - Nuevo arrendamiento");
			System.out.println("2 - Salir");
			System.out.println("*************************************************");
			System.out.print("> ");
			byte sel = inp.nextByte(); // recogemos la selecci�n del usuario
			
			/*
			 * identificamos la selecci�n realizada en el men�
			 */
			switch (sel) {
				case 1: 
					System.out.println("Selecciona un vehiculo de la siguiente lista");
					System.out.println("*************************************************");
					System.out.println("Numero de Vehiculo -- Matricula -- Marca -- N�mero de plazas -- �/Hora");
					listCar(coche1);
					listCar(coche2);
					listCar(coche3);
					listCar(coche4);
					System.out.println("*************************************************");
					System.out.print("> ");
					
					switch (inp.next()) {
						case "1":
							alqCar(coche1);
							break;
						/*a medias*/
						default:
							break;
					}
					
					break;
				case 2:
					ej = false;
					break;
				default:
					System.out.println("Opcion no valida");
					break;
			}
		} while (ej);
	}
	
	/**
	 * Funci�n para gestionar el alquiler del coche seleccionado
	 * @param nextInt - Selecci�n realizada por el usuario
	 */
	private static void alqCar(Car c) {
		System.out.println("> especifica el tiempo de alquiler");
		System.out.print("> ");
		double tmp = ExtFunc.suspc(inp.nextDouble());
		/*a medias*/
	}
	
	private static void listCar(Car c) {
		System.out.println(c.getIdentif() + " .- " + c.getMatricula() + " -- " + c.getMarca() + " -- " + c.getNumPlazas() + " -- " + c.getPrecHora());
	}
}
