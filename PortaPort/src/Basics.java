import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * Una Empresa Llamada SeñoraX necesita un sistema para que los alumnos puedan coger prestados ordenadores.
 * Esta empresa guarda sus ordenadores en un armario con capacidad de 25 ordenadores.
 * Los ordenadores tienen una identificación de 4 dígitos y, aparte de este dato, en la base de datos se guardan otros datos
 * como su marca y una escala del 0 al 10 en el que se muestra su potencia siendo el 0 como el ordenador menos potente 10 el más potente.
 * esto sirve para que los distintos ciclos puedan coger el más adecuado para su trabajo, es decir, DAM necesitará un ordenador más potente
 * que MK al igual que SON necesita un ordenador tipo MAC.
 * 
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
public class Basics {
	/**
	 *  Array que equivale al armario que contiene los portátiles
	 *  
	 *  PortaPort.Basics.armr[];
	 */
	public static String[] armr = new String[25];
	private static String[] dts = new String[25]; // Array comodín que se usará para extraer un dato concreto sobre los portátiles del armario
	
	/**
	 * Método principal de la clase
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Rellenar el Array con Datos
		 */
		armr[0] = "0001;MAC;2;F";
		armr[1] = "0002;ASUS;6;F";
		armr[2] = "0003;MSI;9;F";
		armr[3] = "0004;DELL - Alienware;10;F";
		armr[4] = "0005;MAC;2;F";
		
		/*
		 * Mostrar todos los datos del array principal en Bruto
		 */
		plist();
		
		/*
		 * Mostrar los datos de todos los portatiles de la marca solicitada
		 */
		System.out.println("*********************************************");
		pdat(bMarca("MAC"));
		pdat(bMarca("abc"));
		
		/*
		 * Mostrar los datos de todos los portatiles de la potencia solicitada
		 */
		System.out.println("*********************************************");
		pdat(bpot("2"));
		System.out.println("*********************************************");
		pdat(bpot("9"));
		
		/*
		 * Muestra los datos del portatil que posee el id solicitado
		 */
		System.out.println("*********************************************");
		bid("0002", 0);
		System.out.println("*********************************************");
		bid("0009", 0);
	}
	
	/**
	 * Muestra los datos del portatil que posee el id solicitado
	 * @param id
	 * @param ind
	 */
	public static void bid(String id, int ind) {
		String[] ids = expdat(armr, 0); //extraemos los id del array
		
		if (id.length() != 4) {
			System.out.println("ERROR: el identificador debe estar compuesto por cuatro cifras númericas");
		} else if (ids[ind].equals(id)){
			System.out.println(armr[ind]); // imprimimos el portatil
		} else {
			ind++;
			
			if (ids[ind] != null) {
				bid(id, ind);
			} else {
				System.out.println("Id no encontrado");
			}
		}
	}
	
	/**
	 * Muestra los datos de todos los portatiles que poseen la potencia solicitada
	 * 
	 * 		PortaPort.Basics.bpot();
	 * 
	 * @param pot Termino de busqueda, en este caso la potencia
	 * @return String[] Devuelve un array con los resultados de busqueda
	 */
	public static String[] bpot(String pot){
		dts = new String[25]; // inicializamos el array comodin
		String[] pote = expdat(armr, 2); //extraemos las potencias del array
		byte i = 0; // inicializamos el señalador de indices
		byte x = 0; // inicializamos el contador para almacenar los resultados encontrados
		
		/*
		 * recorremos el array en busca de la marca solicitada
		 */
		for(String d: pote){
			if (d == null) {// Si ya no hay mas datos
				if (dts[0] == null) {
					JOptionPane.showInternalMessageDialog(null, "El termino de busqueda no ha dado resultados", "PortaPort", JOptionPane.INFORMATION_MESSAGE);
					return dts; // retornamos la lista con los datos encontrados
				} else {
					return dts; // Retornamos el Array generado con los datos solicitados.
				}
			} else {
				if (d.equals(pot)) { // si la marca encontrada coincide con la solicitada
					dts[x] = armr[i];// devolvemos el dato completo del array señalando el indice donde se ha encontrado
				}
				i++; // sumamos uno al señalador 
				x++; // sumamos uno al contador
			}
		}
		return dts; // retornamos la lista con los datos encontrados
	}
	
	/**
	 * Muestra los datos de todos los portatiles de la marca solicitada
	 * 
	 * 		PortaPort.Basics.plist();
	 * 
	 * @param marca String que contiene la cadena con el termino de busqueda
	 * @return String[] Rtorna un array con los resultados de la busqueda
	 */
	public static String[] bMarca(String marca){
		dts = new String[25]; // Reinicializamos el array comodin
		String[] marc = expdat(armr, 1); //Extraemos las marcas del array
		byte i = 0; // Inicializamos el señalador de indices
		byte x = 0; // Inicializamos el contador para almacenar los resultados encontrados
		
		/*
		 * Recorremos el array en busca de la marca solicitada
		 */
		for(String d: marc){
			if (d == null) {// Si ya no hay mas datos
				if (dts[0] == null) {
					JOptionPane.showInternalMessageDialog(null, "El termino de busqueda no ha dado resultados", "PortaPort", JOptionPane.INFORMATION_MESSAGE);
					return dts; // retornamos la lista con los datos encontrados
				} else {
					return dts; // Retornamos el Array generado con los datos solicitados.
				}
			} else { // De lo contrario, seguimos buscando
				if (d.equals(marca)) { // Si la marca encontrada coincide con la solicitada
					dts[x] = armr[i];// Devolvemos el dato completo del array señalando el indice donde se ha encontrado
				}
				i++; // sumamos uno al señalador 
				x++; // sumamos uno al contador
			}
		}
		return dts; // retornamos la lista con los datos encontrados
	}
	
	/**
	 * Muestra todos los datos del array solicitado en bruto
	 */
	public static void pdat(String[] rry) {
		/*
		 * Recorremos el Array en busca de todos los datos y lo mostramos de uno en uno
		 */
		for (byte i = 0;i < rry.length; i++){
			if (rry[i] != null) {
				System.out.println(rry[i]);
			} else {
				System.out.print("");
			}
		}
	}
	
	/**
	 * Muestra todos los datos del array principal en bruto
	 * 
	 * 		PortaPort.Basics.plist();
	 */
	public static void plist() {
		/*
		 * Recorremos el Array posición por posición en busca de todos los datos 
		 */
		for (byte i = 0;i < armr.length; i++){
			System.out.print(pmEl(i)); // llamamos a PmEl para mostrar el dato situado en la posición actual
		}
	}
	
	/**
	 * Obtiene el dato situado en la posición especificada en los argumentos dentro del array principal
	 * 
	 * 		PortaPort.Basics.pmEl();
	 * 
	 * @param ndx byte Posicion solicitada
	 * @return String Retorna un String con el dato situado en la posición del array solicitada
	 */
	public static String pmEl(byte ndx) {
		if (armr[ndx] != null) { // Si hay datos en el indice especificado
			return armr[ndx] + "\n"; // Devuelve el dato con retorno de carro
		} else { // si no
			if (ndx == 0) { // Si el indice es 0
				/*
				 * no hay datos en el array, por lo que hacemos saltar un mensaje de error
				 */
				JOptionPane.showInternalMessageDialog(null, 
													  "WARNING: No hay datos disponibles", 
													  "PortaPort", 
													  JOptionPane.WARNING_MESSAGE, 
													  null
													 );
				return ""; // Retornamos un campo vacío
			}
			return ""; // Retornamos un campo vacío
		}
	}
	
	/**
	 * Función que sustituye el formato decimal con el separador ',' (coma), por el formato con el separador '.' (punto)
	 * @param String num Número real con el separador ',' (coma)
	 * @return Double Número real con el separador '.' (punto) 
	 */
	public static Double suspc(String num) {
		/*
		 * Realizamos un 'For' para recorrer el número en busca del carácter coma (',')
		 */
		for(int i = 0;i <= (num.length() - 1);i++) { // Contamos desde 0 hasta el número máximo de caracteres que contiene sumando uno cada vez
			char comma = num.charAt(i); // Recogemos el carácter actual del string
			
			if(comma == ',') { // Si el carácter actual es una coma (',')
				num = num.replace(',','.'); // Lo reemplazamos por punto
			}
		}
		return Double.parseDouble(num); // Retornamos como Double el número obtenido con el punto como separador de decimales
	}
	
	/**
	 * Función que extrae uno de los dos datos de cada libro.
	 * @param int dat Indice del dato solicitado
	 * @return String[] dats Array con los datos obtenidos
	 */
	public static String[] expdat(String[] arr, int dat) {
		String[] dats = new String[arr.length]; // Declaramos el Array  
		int i = 0; // Declaramos el contador, lo usaremos como indice para el array secundario que vamos a generar
		
		/*
		 * recorremos el array principal introduciendo, usando Split para cada dato, los datos del índice 'dat' especificado ubicado dentro del
		 * String de cada índice del array
		 */
		for (String d: arr) { // 'For Each' para recorrer el array principal y obtener el valor de cada índice en 'd'
			if (d == null) {// si ya no hay mas datos
				return dats; // Retornamos el Array generado con los datos solicitados.
			} else { // mientras haya datos
				dats[i] = d.split(";")[dat]; // Guardamos el dato ubicado en el índice 'dat' dentro del dato actual del array
				i++; // Incrementamos en 1 el valor del índice/contador para grabar el siguiente dato 
			}
		}
		
		return dats; // Retornamos el Array generado con los datos solicitados.
	}

}
