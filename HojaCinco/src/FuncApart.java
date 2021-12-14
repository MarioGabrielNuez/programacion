/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class FuncApart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	/**
	 * Función que genera un número aleatorio entre un rango especifico 
	 * @return Integer
	 */
	public static Integer randomize(int x, int y) {
		double rndmz; // declaramos la variable que contandrá el numero aleatorio generado
		do {
			rndmz = (Math.round(Math.random() * y)); // Generamos un número aleatorio menor que 'y'
		} while (rndmz < x); // volvemos a generar un número mientras que el número generado sea menor que 'x' 
		
		return (int) rndmz; // devolvemos el número random generado
	}

}
