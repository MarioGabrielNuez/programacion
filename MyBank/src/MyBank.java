import javax.swing.*;

/**
 * 
 */

/**
 * Enunciado: Un cliente de un banco tiene que realizar una transferencia de cr�dito de una cuenta a otra.
 * Para ello, se quiere implementar un programa donde el usuario pueda decidir el valor de la
 * transferencia y desde que cuenta se transfiere el dinero. 
 * 
 * Las cuentas vienen fijadas en un array con una longitud libre. Las cuentas de cr�dito tienen una
 * longitud de 12 d�gitos. 
 * 
 * Cuando una transferencia se realiza con �xito, el usuario recibe un mensaje de confirmaci�n
 * con formato libre pero que contenga un desglose de los datos, por ejemplo, cuenta origen,
 * cuenta destino, valor ambas cuentas ... etc 
 * 
 * Interpretaci�n: para la realizaci�n de este ejercicio, entendemos que los datos del usuario est�n
 * ubicados en una base de datos, por lo que, para la obtrenci�n de los datos, crearemos dos m�todos que 
 * rellenar�n dos arrays, uno, que contendra la cuenta origen desde la que se realizar� la transferencia 
 * (en un entorno real, este descargara los datos del cliente que incie sesi�n desde una base de datos, 
 * para este ejercicio, obiaremos el proceso de login y de descarga desde la base de datos y rellenaremos
 * el array directamente con datos ficticios en dicho m�todo), y otro que se rellenar� con los datos que 
 * indique el usuario, una vez el usuario introduzca los datos, incluyendo la cantidad a transferir,     
 * realizaremos el c�lculo de la transferencia en otro m�todo y la propia transferencia, para ello, restaremos la cantidad transferida
 * al saldo de la cuenta origen y sumaremos la misma al saldo de la cuenta destino, para posteriormente actualizar los arrays; para finalizar, crearemos 
 * un nuevo metodo para desglosar la transferencia en: cuenta origen, saldo incial, cantidad 
 * transferida, saldo final, cuenta destino, saldo inicial, saldo final.
 * 
 * Entremedias, usare m�todos para interpretar y tratar los datos, la explicacion de estos, la realizare al 
 * inicio de cada uno.
 * 
 * por otra parte, todos los imput se realizar�n con Java Swing, a su vez, para el desglose tambien se usar�
 * java Swing, con el fin, de que en un futuro se pueda reciclar este codigo y usar en una interfaz grafica mas
 * seria, quedando este c�digo en el backend. 
 * 
 * el formato de los Array de las cuentas origen y destino ser�:
 * 	
 * 		{"[0: N�mero de cuenta]","[1: Saldo]"}
 * 
 * @author Mario Gabriel N��ez Alc�zar de Velasco
 *
 */
public class MyBank {
	/*
	 * declaraci�n de variables globales. 
	 */
	/*
	 * Arrays, los arrays de cuenta origen y destino tienen una longitud de 2, una 
	 * posicion para le numero de cuenta y otra para el saldo, ya que solo se puede
	 * realizar a la vez una transferencia desde una cuenta a otra.
	 */
	static String[] dccc = new String[2]; // array que contendr� los datos de la cuenta destino 
	static String[] occc = new String[2]; // array que contendr� los datos de la cuenta origen
	
	static String saloco; // saldo inicio de la cuenta de origen
	static String salocd; // saldo incio de la cuenta destino
	
	/**
	 * Inicio del programa. 
	 * @param args String[]
	 */
	public static void main(String[] args) {
		obtnDatOri(); //obtenemos los datos de la cuenta origen
		
		/*
		 * Solicitamos los datos de la cuenta destino.
		 * el saldo de la cuenta destino la incializamos en bruto con 5000�, en un entorno real
		 * el saldo se obtendria de la base de datos buscando a partir del numero de cuenta o IBAN.
		 * 
		 * el proceso entero lo ejecutaremos controlando los errores que nos podemos encontrar en el camino
		 */
		String ncd = JOptionPane.showInputDialog("Introduce el N�mero de la cuenta destino (debe tener 12 car�cteres)");
		if (ncd.length() == 12) {// si el numero de cuenta cumple con el requisito de tener m�ximo 12 cr�cteres 
			obtnDatDes(ncd, "5000"); // llamamos a la funci�n para obtener los datos
			
			/*
			 * Solicitamos el importe de la transferencia, este no puede ser menor o igual a 0, 
			 * ni superior al saldo de la cuenta origen, esto lo comprovaremos dentro del metodo rlzrTrnsf()
			 * 
			 * a su vez el dato introducido debe ser numerico.
			 */
			String ctrnsf = JOptionPane.showInputDialog("Introduce la cantidad a transferir");
			if (ctrnsf.matches("[+-]?\\d*(\\.\\d+)?\\d*(,\\d+)?")) { // si el valor introducido es numerico
				if (suspc(ctrnsf) <= 0 || suspc(ctrnsf) > suspc(occc[1])) { // si el importe no cumple los requisitos
					/*
					 * Mostramos mensaje de error
					 */
					JOptionPane.showMessageDialog(null, "ERROR: Cantidad no v�lida", "MyBank", JOptionPane.ERROR_MESSAGE);
				} else {
					rlzrTrnsf(suspc(ctrnsf)); // realizamos la transferencia
					
					/*
					 * para finalizar imprimimos el desglose en la propia consola, ya que en un entrono real, este se
					 * imprimiria en un recibo, salvo que el usuario desee verlo en pantalla, de este modo, usamos la 
					 * consola para simular la impresi�n del recibo. 
					 */
					imprmrDsgls(ctrnsf);
				}
			} else { // si no
				/*
				 * mostramos error
				 */
				JOptionPane.showMessageDialog(null, "ERROR: Has de introducir un valor numerico", "MyBank", JOptionPane.ERROR_MESSAGE);
			}
		} else { // si no
			/*
			 * mostramos mensaje de error
			 */
			JOptionPane.showMessageDialog(null, "ERROR: el numero de cuenta debe tener 12 car�cteres, ni mas ni menos", "MyBank", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * Funci�n que sustituye el formato decimal con el separador ',' (coma), por el formato con el separador '.' (punto)
	 * @param String num N�mero real con el separador ',' (coma)
	 * @return Double N�mero real con el separador '.' (punto) 
	 */
	private static Double suspc(String num) {
		/*
		 * Realizamos un 'For' para recorrer el n�mero en busca del car�cter coma (',')
		 */
		for(int i = 0;i <= (num.length() - 1);i++) { // Contamos desde 0 hasta el n�mero m�ximo de car�cteres que contiene sumando uno cada vez
			char comma = num.charAt(i); // Recogemos el car�cter actual del string
			
			if(comma == ',') { // Si el car�cter actual es una coma (',')
				num = num.replace(',','.'); // Lo reemplazamos por punto
			}
		}
		return Double.parseDouble(num); // Retornamos como Double el n�mero obtenido con el punto como separador de d�cimales
	}

	/**
	 * Funcion que imprime el desglose de la transferencia
	 * @param imp importe de la transferencia.
	 */
	private static void imprmrDsgls(String imp) {
		System.out.println("******************************************************************");
		System.out.printf("Numero de la cuenta origen: %s%n", occc[0]);
		System.out.printf("Saldo inicial de la cuenta origen: %.2f%n", suspc(saloco));
		System.out.printf("saldo final de la cuenta origen: %.2f%n", suspc(occc[1]));
		System.out.println("******************************************************************");
		System.out.printf("Numero de la cuenta destino: %s%n", dccc[0]);
		System.out.printf("Saldo inicial de la cuenta destino: %.2f%n", suspc(salocd));
		System.out.printf("Saldo final de la cuenta destino: %.2f%n", suspc(dccc[1]));
		System.out.println("******************************************************************");
		System.out.printf("importe de la Transferencia: %.2f%n", suspc(imp));
		System.out.println("******************************************************************");
	}

	/**
	 * Realizamos la transferencia
	 * @param cntTrnfr Double corresponde con el importe a transferir
	 */
	private static void rlzrTrnsf(double cntTrnfr) {
		/*
		 * para realizar la transferencia sumamos la cantidad a transferir al saldo de la cuenta destino
		 * y posteriormente lo restamos de la cuenta de origen
		 */
		if (cntTrnfr <= 0 || cntTrnfr > suspc(occc[1])) { // si el importe no cumple los requisitos
			/*
			 * Mostramos mensaje de error
			 */
			JOptionPane.showMessageDialog(null, "ERROR: Cantidad no v�lida", "MyBank", JOptionPane.ERROR_MESSAGE);
		} else {
			/*
			 * guardamos los saldos previos a la transferencia
			 */
			saloco = occc[1]; //saldo inciial de la cuenta origen
			salocd = dccc[1]; // saldo incial de la cuenta de destino
			
			/*
			 * Restamos el importe a transferir a la cuenta origen, actualizando el array
			 */
			occc[1] = Double.toString(suspc(occc[1]) - cntTrnfr);
			
			/*
			 * sumamos el importe a transferir a la cuenta destino, actualizando el array
			 */
			dccc[1] = Double.toString(suspc(dccc[1]) + cntTrnfr);
		}
	}

	/**
	 * Funci�n que obtiene los datos de la cuenta destino
	 * @param numCD Numero de la cuenta destino
	 * @param sal Saldo de la cuenta destino
	 */
	private static void obtnDatDes(String numCD, String sal) {
		/*
		 * rellenamos el array con los datos obtenidos de la cuenta Destino
		 */
		dccc[0] = numCD; // guardamos el numero de cuenta en el array
		dccc[1] = sal; // rellenamos el saldo de la cuenta destino
	}
	
	/**
	 * M�todo que obtiene los datos de la cuenta origen
	 */
	private static void obtnDatOri() {
		/*
		 * Rellenamos el Array directamente con datos introducidos en bruto
		 */
		occc[0] = "273828377243"; //N�mero de Cuenta de Credito
		occc[1] = "89.00"; //Saldo de la cuenta origen
	}

}
