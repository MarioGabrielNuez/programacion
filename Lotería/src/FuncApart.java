/**
 * 
 */

/**
 * @author Mario Gabriel N��ez Alc�zar de Velasco
 *
 */
public class FuncApart {

	/**
	 * Funci�n que genera un n�mero aleatorio entre un rango especifico 
	 * @param x n�mero inicial del rango de aleatoriedad
	 * @param y n�mero final del rango de aleatoriedad
	 * @return Integer - N�mero aleatorio generado 
	 */
	public static Integer randomize(int x, int y) {
		double rndmz; // declaramos la variable que contandr� el numero aleatorio generado
		do {
			rndmz = (Math.round(Math.random() * y)); // Generamos un n�mero aleatorio menor que 'y'
		} while (rndmz < x); // volvemos a generar un n�mero mientras que el n�mero generado sea menor que 'x' 
		
		return (int) rndmz; // devolvemos el n�mero random generado
	}

}
