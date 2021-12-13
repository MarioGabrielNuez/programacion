import javax.swing.*; // importamos las librerias Java Swing

/**
 * EjercicioUno.class: . Crea un array de 10 posiciones de números con valores pedidos por teclado.
 * Muestra por consola el índice y el valor al que corresponde. Haz dos métodos,
 * uno para rellenar valores y otro para mostrar.
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class EjercicioUno {

	/**
	 * Función principal del programa
	 * @param args String[]
	 */
	public static void main(String[] args) {		
		/*
		 * llamamos a la funcion mostrar el resultado con lo que nos devuelva la funcion que rellena el Array
		 * Le llamamos con Try Catch para mostrar mensajes de error en el caso de que algun dato salga mal
		 */
		try { // probamos
			mstr(rllnr()); //llamamos a mostrar con lo que devuelva rellenar
		} catch (Exception e) { // si hay algun error, muestra el mensaje
			JOptionPane.showMessageDialog(null, "ERROR: el dato introducido no es correcto; mensaje del sistema: " + e, "EjercicioTres.class", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * funcion que rellena el array con los datos correspondientes 
	 * @return dats Integer[]
	 */
	private static Integer[] rllnr() {
		Integer dats[] = new Integer[10]; // declaramos el array de 10 posiciones
		
		for(int x = 0;x < dats.length;x++) { // rellenamos el array posicion por posición solicitando los datos
			dats[x] = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número", "EjercicioUno.class", JOptionPane.QUESTION_MESSAGE));
		}
		
		return dats; // devolvemos el array relleno

	}
	
	/**
	 * Funcion que muestra los datos por consola
	 * @param dts Integer[]
	 */
	private static void mstr(Integer[] dts){
		int i = 0; // Declaramos le contador para mostrar el indice 
		for (Integer d: dts) { // Recorremos el Array imprimiendo el dato correspondiente y su indice 			
			System.out.println("Indice: " + i + " Dato Introducido: " + d); // Imprimimos el dato con su indice
			i++; // sumamos uno al indice para mostrar el siguiente indice
		}
	}
}
