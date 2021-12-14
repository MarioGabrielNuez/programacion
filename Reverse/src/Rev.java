/**
 * 
 */

/**
 * @author mario
 *
 */
public class Rev {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String Pal = "Hola Mundo";
		System.out.println(rev(Pal, Pal.length() - 1));
	}

	/**
	 * Devuelve una palabra invertida.
	 * 
	 * Caso Base: palabra con longitud 0.
	 * 
	 * @param p - String introducido
	 * @param i - Caracter del String a invertir
	 */
	private static String rev(String p, int i) {
		String inv = "";
		if (i == 0) {
			return p.charAt(i) + "";
		} else {
			inv =  p.charAt(i) + rev(p, i - 1);
		}
		return inv;
	}
}
