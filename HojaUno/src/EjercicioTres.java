import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class EjercicioTres {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Edad = new Scanner(System.in);
		
		System.out.print("¿Cuantos años tienes?: ");
		byte EdD = Edad.nextByte();
		
		if (EdD > 0) {
			if (EdD < 18) {
				System.out.println("Tu Edad Es: " + EdD + "; Eres Menor de Edad");
			} else {
				System.out.println("Tu Edad Es: " + EdD + "; Eres Mayor de Edad");
			}
		} else {
			System.out.println("Es imposible que existieras antes de nacer ;)");
		}
		
	}

}
