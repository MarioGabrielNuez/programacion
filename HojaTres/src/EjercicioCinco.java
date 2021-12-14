import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class EjercicioCinco {
	static Scanner inp = new Scanner(System.in);	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Escribe las notas requeridas");
		
		System.out.print("Examen: ");
		double exam = inp.nextDouble();
		
		System.out.print("Practica: ");
		double prac = inp.nextDouble();
		
		System.out.print("Test: ");
		double test = inp.nextDouble();
		
		System.out.print("Actitud y Participación (S/N): ");
		String acpa = inp.next();
		
		if (acpa.equals("S")) {
			acpa = "s";
		} else if (acpa.equals("N")) {
			acpa = "n";
		}
		
		if (((exam >= 0) && (exam <= 10)) && ((test >= 0) && (test <= 10)) && ((prac >= 0) && (prac <= 10))){
			switch(acpa){
			case "s":
					System.out.println("La nota final es: " + (((exam * 3) + (prac * 3) + (test * 2) + 20) / 10));
					break;
			case "n":
					System.out.println("La nota final es: " + (((exam * 3) + (prac * 3) + (test * 2)) / 10));
					break;	
			}
			
		} else {
			System.out.println("solo se admiten notas en rango 0/10");
		}

	}

}
