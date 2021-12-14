import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class EjercicioTres {
	static Integer rndmz = 0;
	static Boolean bool = true;
	static Integer dats[];
	static Integer nummay;
	
	/**
	 * Función primaria del programa
	 * @param args String[]
	 */
	public static void main(String[] args) {
		/*
		 * Calculamos el mayor número situado en el array y lo imprimimos por pantalla con su indice
		 */
		dats = rllnr();
		
		System.out.println("\nEl Mayor Número Aleatorio primo generado de entre []" + "es: " + nummay);
	}
	
	/**
	 * funcion que rellena el array con los datos correspondientes 
	 * @return dats Integer[]
	 */
	private static Integer[] rllnr() {
		/*
		 * Generamos el Array con una longitud especificada por el usuario
		 */
		dats = new Integer[Integer.parseInt(JOptionPane.showInputDialog(null, "Indica el numero de cifras del array", "EjercicioDos.class", JOptionPane.QUESTION_MESSAGE))]; 
		
		for(int x = 0;x < dats.length;x++) { // rellenamos el array posición por posición 
			rndmz = FuncApart.randomize(0, 9); // generamos un número aleatorio del 0 al 9
			
			/*
			 * recorremos los numeros menores que el generado y sacamos el modulo entre el mismo
			 * Si el resultado es '0' el numero no es primo
			 */
			for (int i = rndmz;i > 0;i--) { // recorremos todos los menores de rndmz
				if (rndmz % i == 0) { // si el modulo de i % rndmz es distinto de '0'
					bool = false; // movemos false a bool; no es primo
				}
			}
			
			if (!bool) { // si bool es distinto de true
				dats[x] = rndmz; // añadimos el dato a la posición del array
			}
		}
		
		return dats; // devolvemos el array relleno

	}

}
