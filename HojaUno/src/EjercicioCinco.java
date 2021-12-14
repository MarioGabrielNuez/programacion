/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class EjercicioCinco {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte N1 = 5;
		byte N2 = 9;
		byte N3 = 3;
		
		if (N1 > N2 && N1 > N3) {
			System.out.println("la Nota N1 (" + N1 + ") es la mayor");
		} else if (N2 > N1 && N2 > N3) {
			System.out.println("la Nota N2 (" + N2 + ") es la mayor");
		} else {
			System.out.println("la Nota N3 (" + N3 + ") es la mayor");
		}

	}

}
