/**
 * 
 */

/**
 * @author Mario Gabriel N��ez Alc�zar de Velasco
 *
 */
public class ExtFunc {

	/**
	 * Funci�n que sustituye el formato decimal con el separador ',' (coma), por el formato con el separador '.' (punto)
	 * @param String num //N�mero real con el separador ',' (coma)
	 * @return Double //N�mero real con el separador '.' (punto) 
	 */
	public static Double suspc(Double num) {
		String nume = num.toString();
		/*
		 * Realizamos un 'For' para recorrer el n�mero en busca del car�cter coma (',')
		 */
		for(int i = 0;i <= (nume.length() - 1);i++) { // Contamos desde 0 hasta el n�mero m�ximo de car�cteres que contiene sumando uno cada vez
			char comma = nume.charAt(i); // Recogemos el car�cter actual del string
			
			if(comma == ',') { // Si el car�cter actual es una coma (',')
				nume = nume.replace(',','.'); // Lo reemplazamos por punto
			}
		}
		return Double.parseDouble(nume); // Retornamos como Double el n�mero obtenido con el punto como separador de d�cimales
	}
}
