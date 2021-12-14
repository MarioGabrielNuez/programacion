import java.util.Scanner;
/**
 * 
 */

/**
 * 
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class Libreria {
	static Scanner inp = new Scanner(System.in); // Declaramos el input del programa 
	static boolean ej = true; // Controla la ejecución
	/*
	 * Inicializamos la estantería, entendemos que los datos se extraén de una Base de Datos por lo que
	 * cada valor ubicado en el array contendrá la siguiente sintaxis:
	 * 		
	 * 		[Identificador];[libro]
	 */
	static String[] Libros = {"00001;El Conde de Romanones", "00002;La batalla interminable", "00003;Barbastro"}; //array que contiene los Id y los nombres de los libros situados en la estantería número 5
	static String[] identifs = new String[20];
	static String[] nombres = new String[20];
	
	/**
	 * Función principal del programa
	 * @param args
	 */
	public static void main(String[] args) {
		do {
			/*
			 * Menú
			 */
			System.out.println("Menú");
			System.out.println("*************************************************");
			System.out.println("1 - consultar libro mediante identificador");
			System.out.println("2 - guardar libro mediante identificador");
			System.out.println("3 - Salir");
			System.out.println("*************************************************");
			System.out.print("> ");
			byte sel = inp.nextByte(); // recogemos la selección del usuario
			
			/*
			 * identificamos la selección realizada en el menú
			 */
			switch (sel) {
			case 1: 
				/*
				 * inciamos consulta
				 */
				identifs = expdat(Libros, 0); //extraemos los identificadores del array
				nombres = expdat(Libros, 1); //extraemos los nombres del array
				
				System.out.print("introduce el identificador del libro: ");
				System.out.print("> ");
				consultar(inp.next(), 50); // llamamos a la funcion consultar() recogiendo el id del libro introducido por el usuario
				break;
			case 2: 
				/*
				 * inciamos consulta
				 */
				System.out.print("introduce el identificador del libro: ");
				System.out.print("> ");
				if (Libros.length < 20) {
					guardar(inp.nextShort()); // llamamos a la funcion guardar() recogiendo el id del libro introducido por el usuario
				} else {
					System.out.println("libreria llena");
				}
				
				break;
			case 3:
				ej = false;
				break;
			default:
				System.out.println("opcion no valida");
				break;
			}
		} while (ej);
	}

	/**
	 * proceso para guardar el libro en el array.
	 * @param nextShort
	 */
	private static void guardar(short id) {
		System.out.print("introduce un nombre: ");
		System.out.print("> ");
		String nom = inp.next(); // recojemos el nombre introducido por el usuario
		
		/*
		 * insertamos el dato el ultimo en el array
		 */
		
	}

	/**
	 * proceso para obtener el nombre del libro partiendo del identificador usando recursividad
	 * 
	 * Casos base:
	 * 	1 .- Caso en el que el identificador no sea un número de 5 cifras
	 *  2 .- Caso en el que exista el identificador
	 * @param short id
	 * @return String[]
	 */
	private static void consultar(String id, int ind) {
		if (identifs.length > (identifs.length - 1)) {
			if (id.length() != 5) {
				System.out.println("ERROR: el identificador debe estar compuesto por cinco cifras númericas");
			} else if (identifs[ind].equals(id)){
				System.out.println("Nombre del libro: " + nombres[ind]); // imprimimos el nombre
			} else {
				ind = ind + 1;
				consultar(id, ind);
			}
		} else {
			System.out.println("Libro no encontrado");
		}
	}
	
	/**
	 * Funcion que extrae uno de los dos datos de cada libro.
	 * @param int dat Indice del dato solicitado
	 * @return String[] dats Array con los datos obtenidos
	 */
	private static String[] expdat(String[] arr, int dat) {
		String[] dats = new String[arr.length]; // Declaramos el Array  
		int i = 0; // Declaramos el contador, lo usaremos como indice para el array secundario que vamos a generar
		
		/*
		 * recorremos el array principal introduciendo, usando Split para cada dato, los datos del indice 'dat' especificado ubicado dentro del
		 * String de cada indice del array
		 */
		for (String d: arr) { // 'For Each' para recorrer el array principal y obtener el valor de cada indice en 'd'
			dats[i] = d.split(";")[dat]; // guardamos el dato ubicado en el indice 'dat' dentro del dato actual del array
			i++; // Incrementamos en 1 el valor del indice/contador para grabar el siguiente dato 
		}
		
		return dats; // Retornamos el Array generado con los datos solicitados.
	}
}
