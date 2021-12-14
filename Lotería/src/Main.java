import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * <p>Programa que Generar� un N�mero de Loter�a al Azar, de tal manera que este sea el N�mero premiado</p>
 * <p>Pendiente de subirlo a un repositorio de GitHub.</p>
 * @author Mario Gabriel N��ez Alc�zar de Velasco
 *
 */
public class Main {

	/**
	 * Funci�n principal del programa
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
		Integer dats[] = new Integer[Integer.parseInt(JOptionPane.showInputDialog(null, "Indica el numero de cifras del boleto", "Loter�a", JOptionPane.QUESTION_MESSAGE))]; 
		
		for(int x = 0;x < dats.length;x++) { // rellenamos el array posici�n por posici�n 
			dats[x] = FuncApart.randomize(0, 9); // introducimos, en la posici�n actual, un n�mero aleatorio entre el 0 y el 9
		}
		
		return dats; // devolvemos el array relleno

	}
	
	/**
	 * Funcion que suma todos los valores del array y muestra los datos por consola
	 * @param dts Integer[]
	 */
	private static void mstr(Integer[] dts){
		for (Integer d: dts) { // Recorremos el Array imprimiendo el dato correspondiente y su indice 			
			System.out.print(d); // Imprimimos las cifras una detras de otra
		}
	}

}
