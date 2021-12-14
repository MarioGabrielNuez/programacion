/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class ExtFunc {

	/**
	 * Función que sustituye el formato decimal con el separador ',' (coma), por el formato con el separador '.' (punto)
	 * @param String num //Número real con el separador ',' (coma)
	 * @return Double //Número real con el separador '.' (punto) 
	 */
	public static Double suspc(Double num) {
		String nume = num.toString();
		/*
		 * Realizamos un 'For' para recorrer el número en busca del carácter coma (',')
		 */
		for(int i = 0;i <= (nume.length() - 1);i++) { // Contamos desde 0 hasta el número máximo de carácteres que contiene sumando uno cada vez
			char comma = nume.charAt(i); // Recogemos el carácter actual del string
			
			if(comma == ',') { // Si el carácter actual es una coma (',')
				nume = nume.replace(',','.'); // Lo reemplazamos por punto
			}
		}
		return Double.parseDouble(nume); // Retornamos como Double el número obtenido con el punto como separador de décimales
	}
}
