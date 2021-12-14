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
			System.out.println("1 - Gestionar salida / Nuevo arrendamiento");
			System.out.println("2 - Gestionar entrada / Cobrar arrendamiento");
			System.out.println("3 - Salir");
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
				System.out.println(coche1.getIdentif() + " .- " + coche1.getMatricula() + " -- " + coche1.getMarca() + " -- " + coche1.getNumPlazas() + " -- " + coche1.getPrecHora());
				System.out.println(coche2.getIdentif() + " .- " + coche2.getMatricula() + " -- " + coche2.getMarca() + " -- " + coche2.getNumPlazas() + " -- " + coche2.getPrecHora());
				System.out.println(coche3.getIdentif() + " .- " + coche3.getMatricula() + " -- " + coche3.getMarca() + " -- " + coche3.getNumPlazas() + " -- " + coche3.getPrecHora());
				System.out.println(coche4.getIdentif() + " .- " + coche4.getMatricula() + " -- " + coche4.getMarca() + " -- " + coche4.getNumPlazas() + " -- " + coche4.getPrecHora());
				System.out.println("*************************************************");
				System.out.print("> ");
				
				switch (inp.next()) {
				case "1":
					AlqCar(coche1);
					break;

				default:
					break;
				}
				
				break;
			case 2: 
				
				break;
			case 3:
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
	private static void AlqCar(Car c) {
		
		
	}
}
