import java.util.Scanner;
/**
 * 
 */

/**
 * Examen de Programaci�n
 * 
 * nota: no he podido implementar, por falta de tiempo el caso en el que meten un identificador mayor de 5 cifras
 * @author Mario Gabriel N��ez Alc�zar de Velasco
 *
 */
public class Test3 {
	static Scanner inp = new Scanner(System.in); // Declaramos el input del programa 
	static boolean ej = true; // controla la ejecuci�n
	static boolean enctrd = true; // controla la l�gica de la busqueda
	
	/*
	 * Inicializamos la estanter�a, entendemos que los datos se extra�n de una Base de Datos por lo que
	 * cada valor ubicado en el array contendr� la siguiente sintaxis:
	 * 		
	 * 		[Identificador];[libro]
	 */
	static String[] Libros = {"00001;El Conde de Romanones", "00002;La batalla interminable", "00003;Barbastro"}; //array que contiene los Id y los nombres de los libros situados en la estanter�a n�mero 5
	
	/**
	 * Funci�n principal del programa
	 * @param args
	 */
	public static void main(String[] args) {
		do {
			/*
			 * Men�
			 */
			System.out.println("Men�");
			System.out.println("*************************************************");
			System.out.println("1 - consultar libro mediante identificador");
			System.out.println("2 - guardar libro mediante identificador");
			System.out.println("3 - Salir");
			System.out.println("*************************************************");
			System.out.print("> ");
			byte sel = inp.nextByte(); // recogemos la selecci�n del usuario
			
			/*
			 * identificamos la selecci�n realizada en el men�
			 */
			switch (sel) {
			case 1: 
				/*
				 * inciamos consulta
				 */
				System.out.print("introduce el identificador del libro: ");
				System.out.print("> ");
				consultar(inp.next()); // llamamos a la funcion consultar() recogiendo el id del libro introducido por el usuario
				if (!enctrd) {
					System.out.println("libro no encontrado");
				}
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
		Libros[Libros.length + 1] = id + ";" + nom; // falto meterlo en un for para localizar realmente la ultima posicion libre.	
	}

	/**
	 * proceso para obtener el nombre del libro partiendo del identificador
	 * @param short id
	 * @return String[]
	 */
	private static void consultar(String id) {
		String[] identifs = expdat(Libros, 0); //extraemos los identificadores del array
		String[] nombres = expdat(Libros, 1); //extraemos los nombres del array
		
		/*
		 * recorremos en busca del nombre
		 */
		for (int i = 0;i < identifs.length;i++) {
			if (identifs[i].equals(id)) { // si coincide con el id introducido
				System.out.println("Nombre del libro: " + nombres[i]); // imprimimos el nombre
				enctrd = true;
			} else {
				enctrd = false;
			}
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
