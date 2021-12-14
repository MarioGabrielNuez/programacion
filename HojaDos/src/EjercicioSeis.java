import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class EjercicioSeis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte fet = 0;
		byte x = 0;
		String op;
		Scanner inp = new Scanner(System.in);
		
		System.out.println("Opción A -> Imprimir y contar los multiplos de 2 que hay entre 0 y 100");
		System.out.println("Opción B -> Imprimir y contar los multiplos de 3 que hay entre 0 y 100");
		System.out.println("**********************************************************************");
		System.out.print("A/B: ");
		op = inp.next();
		
		if (op.equals("a")) {
			op = "A";
		} else if (op.equals("b")) {
			op = "B";
		}
		
		while(!op.equals("")) {
			switch(op){
			case "A":
				fet = 2;
				op = "";
				break;
			case "B":
				fet = 3;
				op = "";
				break;
			default:
				System.out.println("ERROR: opción no valida");
				System.out.println("**********************************************************************");
				System.out.println("Opción A -> Imprimir y contar los multiplos de 2 que hay entre 0 y 100");
				System.out.println("Opción B -> Imprimir y contar los multiplos de 3 que hay entre 0 y 100");
				System.out.println("**********************************************************************");
				System.out.print("A/B: ");
				op = inp.next();
			}
			
			if (op.equals("")) {
				for(byte i = 0;i <= 100;i+=fet) {
					System.out.println(i);
					x++;
				}
				
				System.out.println("Se han localizado " + x + " multiplos de " + fet);
			}
			
		}
		
	}

}
