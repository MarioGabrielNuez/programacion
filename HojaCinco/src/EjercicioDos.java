import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class EjercicioDos {

	/**
	 * Función primaria
	 * @param args
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
		/*
		 * Generamos el Array con una longitusd especificada por el usuario
		 */
		Integer dats[] = new Integer[Integer.parseInt(JOptionPane.showInputDialog(null, "Indica el numero de cifras del array", "EjercicioDos.class", JOptionPane.QUESTION_MESSAGE))]; 
		
		for(int x = 0;x < dats.length;x++) { // rellenamos el array posición por posición 
			dats[x] = FuncApart.randomize(0, 9); // introducimos, en la posición actual, un número aleatorio entre el 0 y el 9
		}
		
		return dats; // devolvemos el array relleno

	}
	
	/**
	 * Funcion que suma todos los valores del array y muestra los datos por consola
	 * @param dts Integer[]
	 */
	private static void mstr(Integer[] dts){
		int sum = 0; // Declaramos la variable que contendrá la suma de todos los datos 
		int i = 0; // Declaramos le contador para mostrar el indice 
		for (Integer d: dts) { // Recorremos el Array imprimiendo el dato correspondiente y su indice 			
			System.out.println("Indice: " + i + " Dato aleatorio es: " + d); // Imprimimos el dato con su indice
			i++; // sumamos uno al indice para mostrar el siguiente indice
			sum = sum + d;
		}
		System.out.println("******************************************************************");
		System.out.println("la suma de todos los arrays es: " + sum);
	}

}
