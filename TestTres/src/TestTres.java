import javax.swing.*;

/**
 * 
 */

/**
 * Un cliente de un banco tiene que realizar una transferencia de crédito de una cuenta a otra.
 * Para ello, se quiere implementar un programa donde el usuario pueda decidir el valor de la
 * transferencia y desde que cuenta se transfiere el dinero. 
 * 
 * Las cuentas vienen fijadas en un array con una longitud libre. Las cuentas de crédito tienen una
 * longitud de 12 dígitos. 
 * 
 * Cuando una transferencia se realiza con éxito, el usuario recibe un mensaje de confirmación
 * con formato libre pero que contenga un desglose de los datos, por ejemplo, cuenta origen,
 * cuenta destino, valor ambas cuentas ... etc 
 * 
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class TestTres {
	/*
	 * Variables Globales
	 *
	 * (1):
	 * 	Array que contiene las cuentas bancarias destino, sus saldos y el número de cuenta de usuario separados por ';'
	 * 
	 * 	Formato de datos:
	 * 	[Número de cuenta];[ Número de cueta de credito (IBAN)];[Saldo]
	 * 
	 * 	De esta manera, preparamos el programa para poder importar datos directamente de una Base de Datos, de momento,
	 *  para cumplir con las condiciones y especificaciones del ejercicio, introducimos datos por defecto correspondiente a tres cuentas
	 */
	static String[] CCC = {"001;273828377243;89.00","002;839203930101;8783.43","003;648202130023;762.76"}; //(1)
	static String[] MCCC = {"004", "735209438721", "189.32"}; // los Datos de la cuenta corriente del usuario (Array preparado para importar datos desde SQL)
	
	/**
	 * Proceso principal del programa
	 * @param args String[]
	 */
	public static void main(String[] args) {
		double cantTransF = 0.0; // declaramos la variable que contendrá el importe a transferir
		
		/*
		 * Solicitamos el importe a transferir
		 */
		do {
			cantTransF = valimpsal(Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el importe a transferir","TestTres.java",JOptionPane.QUESTION_MESSAGE))); // almacenamos el valor del importe introducido por el cliente
			
			if ((cantTransF <= 0) && (cantTransF != -99.99)) { // si el importe introducido por el cliente es menor o igual a 0 y distinto de -99.9
				/*
				 * Mostramos error por importe negativo
				 */
				JOptionPane.showMessageDialog(null, "ERROR: El importe que usted quiere transferir menor o igual a cero introduzca algún otro valor", "TestTres.java", JOptionPane.ERROR_MESSAGE);
			} else if (cantTransF == -99.99){ // De lo contrario, si el importe es igual a -99.9
				System.out.println("Operación Denegada"); // Mostramos error por operación denegada en consola 
			}
		} while (cantTransF <= 0); // si el importe introducido por el cliente es menor o igual a 0, volvemos a pedir el dato
		
		/*
		 * solicitamos el número de cuenta del destinatario 
		 */
		String cuenta = (String) JOptionPane.showInputDialog(null, "Selecciona la cuenta del destinatario","TestTres.java",JOptionPane.QUESTION_MESSAGE, null, expdat(0), expdat(0)[0]);
		
		/*
		 * obtenemos el saldo de la cuenta destino
		 */
		for (String d: CCC) { // Recorremos el Array principal
			int i = 0; // Contador de indice
			if (d.split(";")[0] == cuenta) {
				double saldo = Double.parseDouble(expdat(3)[i]);
			} else {
				JOptionPane.showMessageDialog(null, "ERROR INTERNO", "TestTres.java", JOptionPane.ERROR_MESSAGE); // mostramos mensaje 'ERROR INTERNO'
				main(args); // Reiniciamos la ejecución 
			}
		}
	}
	
	/**
	 * Funcion que extrae uno de los tres datos de cada cuenta.
	 * @param int dat Indice del dato solicitado
	 * @return String[] dats Array con los datos obtenidos
	 */
	private static String[] expdat(int dat) {
		String[] dats = new String[CCC.length]; // Declaramos el Array  
		int i = 0; // Declaramos el contador, lo usaremos como indice para el array secundario que vamos a generar
		
		/*
		 * recorremos el array principal introduciendo, usando Split para cada dato, los datos del indice 'dat' especificado ubicado dentro del
		 * String de cada indice del array
		 */
		for (String d: CCC) { // 'For Each' para recorrer el array principal y obtener el valor de cada indice en 'd'
			dats[i] = d.split(";")[dat]; // guardamos el dato ubicado en el indice 'dat' dentro del dato actual del array
			i++; // Incrementamos en 1 el valor del indice/contador para grabar el siguiente dato 
		}
		
		return dats; // Retornamos el Array generado con los datos solicitados.
	}
	
	/**
	 * Función que valida el importe con respecto al saldo en la cuenta
	 * @param Double imp Importe introducido
	 * @return Double imp or -99.9 Importe validado o -99.9 en caso de denegar la operación
	 */
	private static double valimpsal(double imp) {
		if ((imp - Double.parseDouble(MCCC[2])) <= 0) { // si la diferencia entre importe introducido y el saldo en la cuenta es menor o igual a 0
			/*
			 * Denegamos la operación y retornamos un valor negativo para relanzar de nuevo la solicitud
			 */
			JOptionPane.showMessageDialog(null, "DENEGADO: El importe que usted quiere transferir es mayor al de su saldo actual introduzca algún otro valor", "TestTres.java", JOptionPane.ERROR_MESSAGE);
			return -99.9;
		} else { // en caso contrario
			return imp; // devolvemos el importe
		}
	}
}
