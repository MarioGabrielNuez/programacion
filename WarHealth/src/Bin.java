import java.util.Scanner;

/**
 * 
 */

/**
 * @author mario
 *
 */
public class Bin {
	private static Scanner inp = new Scanner(System.in);
	private static String[] salaesp = new String[15];
	private static String[] cabez = {"Numero de paciente","Apellido","Nombre","Identificación","Rango","Gravedad"};
	private static String[] salaespAux = new String[15];
	private static boolean ejec = true;
	private static byte i = 0;
	private static int graveda = 0;
	private static String[] apell = new String[15];
	private static String[] nom = new String[15];
	private static String[] identf = new String[15];
	private static String[] rang = new String[15];
	private static String[] gravedad = new String[15];
	
	/**
	 * Función principal del programa
	 * @param args
	 */
	public static void main(String[] args) {
		do {
			System.out.println("**************************************************************************************************");
			System.out.println("A - introducir paciente");
			System.out.println("C - Mostrar lista de espera");
			System.out.println("D - Despachar paciente");
			System.out.println("E - Asignar gravedad a un paciente");
			System.out.println("B - salir");
			System.out.println("**************************************************************************************************");
			System.out.print("> ");
			String opt = inp.next().toUpperCase();
			System.out.println("**************************************************************************************************");
			
			
			switch (opt) {
				case "A": 
					solicPac();
					break;
				case "C":
					mstrList();
					break;
				case "D":
					despPac();
					break;
				case "E":
					asigGrav();
					break;
				case "B":
					ejec = false;
					break;
				default:
					System.out.println("opcion no existente");
					System.out.println("**************************************************************************************************");
					break;
			}
		} while (ejec);
		
	}
	
	/**
	 * Función para que el medico asigne la gravedad del paciente
	 */
	private static void asigGrav() {
		if (dataTrue()) {
			System.out.println("de la siguiente lista selecciona el paciente que esta siendo atendido: ");
			System.out.println("**************************************************************************************************");
			mstrList();
			System.out.println("**************************************************************************************************");
			System.out.print("> ");
			int i = inp.nextInt();
			
			if (salaesp[i] != null) {
				System.out.println("**************************************************************************************************");
				mstrPac(i);
				System.out.println("**************************************************************************************************");
				System.out.println("Introduce del 1 al 10 el nivel de gravedad, sinedo 10 la maxima gravedad");
				System.out.print("> ");
				graveda = inp.nextInt();
				updtPac(i);
				System.out.println("Datos Actualizados correctamente");
			}
		}
	}
	
	/**
	 * Actualiza los datos de un paciente
	 * @param i2
	 */
	private static void updtPac(int i) {
		obtnrDat();
		salaesp[i] = apell[i] + ";" + nom[i] + ";" + identf[i] + ";" + rang[i] + ";" + graveda;
	}

	/**
	 * Función para mostrar un paciente concreto
	 */
	private static void mstrPac(int i) {
		obtnrDat();
		
		System.out.printf("%s %d %n", cabez[0], i);
		System.out.printf("%s %s %n", cabez[1], apell[i]);
		System.out.printf("%s %s %n", cabez[2], nom[i]);
		System.out.printf("%s %s %n", cabez[3], identf[i]);
		System.out.printf("%s %s %n", cabez[4], rang[i]);
		System.out.printf("%s %s %n", cabez[5], gravedad[i]);
	}

	/**
	 * Obtiene los datos de todos los pacientes
	 */
	private static void obtnrDat() {
		apell = expdat(salaesp, 0);
		nom = expdat(salaesp, 1);
		identf = expdat(salaesp, 2);
		rang = expdat(salaesp, 3);
		gravedad = expdat(salaesp, 4);
	}

	/**
	 * Funicon que Despacha paciente
	 */
	private static void despPac() {
		if (dataTrue()) {
			System.out.println("de la siguiente lista selecciona el paciente:");
			System.out.println("**************************************************************************************************");
			mstrList();
			System.out.println("**************************************************************************************************");
			System.out.print("> ");
			int i = inp.nextInt();
			
			if (salaesp[i] != null) {
				salaesp[i] = null;
			}
			
			System.out.println("paciente despachado correctamente");
		}
	}
	
	/**
	 * comprueba que el array no esta vacío
	 * @return devuelve false si el array esta vacío, true si esta lleno
	 */
	private static boolean dataTrue() {
		if (salaesp[0] == null) {
			System.out.println("No existen datos a mostrar");
			return false;
		} else {
			return true;
		}
	}

	/**
	 * muestra la lista de espera formateando los campos
	 */
	private static void mstrList() {
		if (dataTrue()) {
			obtnrDat();
			
			System.out.print(cabez[0] + " ---- ");
			System.out.print(cabez[1] + " ---- ");
			System.out.print(cabez[2] + " ---- ");
			System.out.print(cabez[3] + " ---- ");
			System.out.print(cabez[4] + " ---- ");
			System.out.print(cabez[5] + "\n");
			
			for(byte i = 0; i < salaesp.length;i++) {
				if (salaesp[i] != null) {
					System.out.printf("%d ---- ", i);
					System.out.printf("%s ---- ", apell[i]);
					System.out.printf("%s ---- ", nom[i]);
					System.out.printf("%s ---- ", identf[i]);
					System.out.printf("%s ---- ", rang[i]);
					System.out.printf("%s%n", gravedad[i]);
				}
			}
		}
	}

	/**
	 * Función que extrae uno de los datos del array
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
	
	/**
	 * alta de pacientes
	 * @param datPac datos del paciente a dar de alta
	 */
	private static void altaEspera(String datPac){		
		if (!salaFull()) {
			salaesp[srchNull(salaesp)] = datPac;
		}
	}
	
	/**
	 * Funcion que devuelve la primera posición vacia de un array
	 * @return
	 */
	private static int srchNull(String[] arr) {
		for (int i = 0;i < arr.length;i++) {
			if (salaesp[i] == null) {
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * Funcion que comprueba si la sala esta o no llena
	 * @return
	 */
	private static boolean salaFull() {
		if (i >= salaesp.length) {
			System.out.println("la sala esta llena, espere antes de meter otro paciente");
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * funcion para solicitar datos de los pacientes
	 */
	private static void solicPac() {
		graveda = 0;
		
		System.out.print("introduce el apellido del paciente: ");
		String apell = inp.next();
		
		System.out.print("introduce el nombre del paciente: ");
		String nom = inp.next();
		
		System.out.print("introduce el DNI del paciente: ");
		String identf = inp.next();
		
		System.out.print("introduce el rango del paciente: ");
		String rang = inp.next();
		
		String dat = apell + ";" + nom + ";" + identf + ";" + rang + ";" + graveda;  
		
		altaEspera(dat);
	}
}
