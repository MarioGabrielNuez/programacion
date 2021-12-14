import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class Ejercicios {
	static Scanner inp = new Scanner(System.in); //Creamos he inicializamos la entrada de Datos
	
	/**
	 * Main
	 * @param String[] args
	 */
	public static void main(String[] args) {
		/*
		 * Indicamos al usuario las instrucciones de uso
		 */
		System.out.println("Hay 19 ejercicios (utiliza X para salir)"); 
		System.out.print("Escoje el numero del ejercicio a mostrar (ej.: 8): ");
		int opt = inp.nextInt(); // Recogemos la opción escojida por el usuario
		
		/*
		 * Si escoje una opcion fuera del rango 0 - 19, salta error, porque no hay menos
		 * de 0 ejercicios ni más de 19. 
		 */
		if(opt > 19 || opt <= 0) {
			System.out.print("Error: la opción " + opt + " no esta contemplada"); //si escribe un dato fuera del rango, Notificamos el error 
		} else {
			/*
			 * Si escribe un valor dentro del rango, continuamos.
			 */
			switch (opt){
			case 1: //Caso en el que el usuario escoja el Ejercicio Uno
				System.out.println("************************************************************");
				System.out.println("Ejercicio 1: ");
				EjUno(); //llamamos a la función que contiene el ejercicio Uno
				break;
			case 2: //Caso en el que el usuario escoja el Ejercicio Dos
				System.out.println("************************************************************");
				System.out.println("Ejercicio 2: ");
				EjDos(); //llamamos a la función que contiene el ejercicio Dos
				break;
			case 3: //Caso en el que el usuario escoja el Ejercicio Tres
				System.out.println("************************************************************");
				System.out.println("Ejercicio 3: ");
				EjTres(); //llamamos a la función que contiene el ejercicio Tres
				break;
			case 4: //Caso en el que el usuario escoja el Ejercicio Cuatro
				System.out.println("************************************************************");
				System.out.println("Ejercicio 4: ");
				EjCuatro(); //llamamos a la función que contiene el ejercicio Cuatro
				break;
			case 5: //Caso en el que el usuario escoja el Ejercicio Cinco
				System.out.println("************************************************************");
				System.out.println("Ejercicio 5: ");
				EjCinco(); //llamamos a la función que contiene el ejercicio Cinco
				break;
			case 6: //Caso en el que el usuario escoja el Ejercicio Seis
				System.out.println("************************************************************");
				System.out.println("Ejercicio 6: ");
				EjSeis(); //llamamos a la función que contiene el ejercicio Seis
				break;
			case 7: //Caso en el que el usuario escoja el Ejercicio Siete
				System.out.println("************************************************************");
				System.out.println("Ejercicio 7: ");
				EjSiete(); //llamamos a la función que contiene el ejercicio Siete
				break;
			case 8: //Caso en el que el usuario escoja el Ejercicio Ocho
				System.out.println("************************************************************");
				System.out.println("Ejercicio 8: ");
				EjOcho(); //llamamos a la función que contiene el ejercicio Ocho
				break;
			case 9: //Caso en el que el usuario escoja el Ejercicio Nueve
				System.out.println("************************************************************");
				System.out.println("Ejercicio 9: ");
				EjNueve(); //llamamos a la función que contiene el ejercicio Nueve
				break;
			case 10: //Caso en el que el usuario escoja el ejercicio Diez
				System.out.println("************************************************************");
				System.out.println("Ejercicio 10: ");
				EjDiez(); //llamamos a la función que contiene el ejercicio Diez
				break;
			case 11: //Caso en el que el usuario escoja el Ejercicio Once
				System.out.println("************************************************************");
				System.out.println("Ejercicio 11: ");
				EjOnce(); //llamamos a la función que contiene el ejercicio Once
				break;
			}
		}
	}
	
	/**
	 * Función que sustituye el formato decimal con el separador ',' (coma), por el formato con el separador '.' (punto)
	 * @param String num //Número real con el separador ',' (coma)
	 * @return Double //Número real con el separador '.' (punto) 
	 */
	public static Double suspc(String num) {
		/*
		 * Realizamos un 'For' para recorrer el número en busca del carácter coma (',')
		 */
		for(int i = 0;i <= (num.length() - 1);i++) { // Contamos desde 0 hasta el número máximo de carácteres que contiene sumando uno cada vez
			char comma = num.charAt(i); // Recogemos el carácter actual del string
			
			if(comma == ',') { // Si el carácter actual es una coma (',')
				num = num.replace(',','.'); // Lo reemplazamos por punto
			}
		}
		return Double.parseDouble(num); // Retornamos como Double el número obtenido con el punto como separador de décimales
	}
	
	/**
	 * Ejercicio Uno: Crea un programa que pida dos números por teclado, los suma y muestra el resultado.
	 */
	public static void EjUno() {
		System.out.print("Introduce el primer numero");
		int x = inp.nextInt(); // Recibimos el primer número como entero
		
		System.out.print("Introduce el segundo numero");
		int y = inp.nextInt(); // Recibimos el segundo número como entero 
		
		System.out.println(x + " + " + y + " = " + (x + y)); // Realizamos e imprimimos el cálculo 'x + y'
	}

	/**
	 * Ejercicio Dos: Crea un programa en el que declares dos variables numéricas con un valor 
	 * determinado y muestra por consola la suma, resta, multiplicación, división y 
	 * módulo. 
	 */
	public static void EjDos() {
		System.out.print("Introduce el primer numero");
		int x = inp.nextInt(); // Recibimos el primer número como entero
		
		System.out.print("Introduce el segundo numero");
		int y = inp.nextInt(); // Recibimos el segundo número como entero 
		
		System.out.println(x + " + " + y + " = " + (x + y)); // Realizamos e imprimimos el cálculo 'x + y'
		System.out.println(x + " - " + y + " = " + (x - y)); // Realizamos e imprimimos el cálculo 'x - y'
		System.out.println(x + " * " + y + " = " + (x * y)); // Realizamos e imprimimos el cálculo 'x * y'
		System.out.println(x + " / " + y + " = " + (x / y)); // Realizamos e imprimimos el cálculo 'x / y'
		System.out.println(x + " MOD " + y + " = " + (x % y)); // Realizamos e imprimimos el cálculo 'x MOD y'
	}
	
	/**
	 * Ejercicio Tres: Crea un programa que pida una edad por teclado y devuelve un mensaje en 
	 * función de si es mayor o menor de edad. 
	 */
	public static void EjTres() {
		System.out.print("¿Cuantos años tienes?: ");
		byte EdD = inp.nextByte(); // recibimos la edad como numero Byte
		
		if (EdD > 0) { // si la Edad es mayor de 0
			if (EdD < 18) { // si la edad es menor de 18
				System.out.println("Tu Edad Es: " + EdD + "; Eres Menor de Edad"); // mostramos mensaje de menor de edad
			} else { // sino
				System.out.println("Tu Edad Es: " + EdD + "; Eres Mayor de Edad"); // mostramos mensaje de mayor de edad 
			}
		} else { //sino
			System.out.println("Es imposible que existieras antes de nacer ;)"); //mostramos error
		}
	}
	
	
	/**
	 * Ejercicio Cuatro: Crea un programa que pida un número por teclado y nos indique si es par o 
	 * impar.
	 */
	public static void EjCuatro() {
		System.out.print("Introduce un numero: ");
		int N1 = inp.nextInt(); // recibimos el numero como Integer
		
		if ((N1 % 2) == 0) { // si el resultado del modulo entre dos es '0'
			System.out.println("El numero introducido es par"); // el número es par
		} else { // sino
			System.out.println("El numero introducido es impar"); // el número es impar
		}
	}
	
	/**
	 * Ejercicio Cinco: Crea un programa en el que declares tres variables con tres notas distintas y 
     * devolver un mensaje con la mayor nota de todas. 
	 */
	public static void EjCinco() {
		System.out.print("Introduce un numero: ");
		int N1 = inp.nextInt(); // recibimos el numero como Integer
		
		if ((N1 % 2) == 0) { // si el modulo sobre dos del numero introducido es 0 
			System.out.println("El numero introducido es par"); // el número es par
			
		} else { // si no
			System.out.println("El numero introducido es impar"); // es impar
		}
	}
	
	/**
	 * Ejercicio Seis: Crea un programa que pida al usuario dos números y muestre el resultado de 
	 * su división. Si el segundo número es 0, debe mostrar un mensaje de error. 
	 */
	public static void EjSeis() {
		System.out.print("Introduce el primer numero: ");
		int N1 = inp.nextInt();
		
		System.out.print("Introduce el primer numero: ");
		int N2 = inp.nextInt();
		
		if (N2 == 0) {
			System.out.println("Error: no se puede dividir entre 0");
		} else {
			System.out.println(N1 + " / " + N2 + " = " + (N1 / N2));
		}
	}
	
	public static void EjSiete() {
		System.out.print("Introduce un Año: ");
		int yr = inp.nextInt();
		
		if (yr > 0) {
			if (((yr % 4) == 0) && ((yr % 100) != 0)) {
				System.out.print("El Año " + yr + " es bisiesto");
			} else if (((yr % 4) == 0) && ((yr % 100) == 0) && ((yr % 400) == 0)) {
				System.out.print("El Año " + yr + " es bisiesto");
			} else {
				System.out.print("El Año " + yr + " no es bisiesto");
			}
		} else {
			System.out.print("El rango de año admitido es de 0001 a 9999");
		}
	}
	
	public static void EjOcho() {
		System.out.println("Aplicar descuento del 5% a compras superiores a 200€");
		System.out.print("Introduce le el Importe: ");
		double imp = suspc(inp.next());
		
		if (imp <= 200) {
			System.out.println("Error: el descuento solo es aplicable a importes superiores a 200€");
			System.out.println("Importe Final: " + imp + "€");
		} else {
			System.out.println("Descuento del 5% sobre " + imp + "€");
			System.out.println("Importe Final: " + (imp - ((5 * imp) / 100))  + "€");
		}
	}
	
	public static void EjNueve() {
		System.out.print("Horas Trabajadas: ");
		double h = suspc(inp.next());
		
		System.out.println("*********************************************");
		System.out.println("* Horas trabajadas__" + h + "h");
		
		if ((h - 30) <= 0) {
			System.out.println("* Horas extras______" + 0 + "h");
			System.out.println("* Sueldo total______" + (h * 20) + "€");
		} else {
			System.out.println("* Horas extras______" + (h - 30) + "h");
			System.out.println("* Sueldo total______" + ((h * 20) + ((h - 30) * 30)) + "€");
		}
		System.out.println("*********************************************");
	}
	
	public static void EjDiez() {
		System.out.print("Introduce el peso: ");
		Double p = suspc(inp.next());
		
		System.out.print("Introduce la altura: ");
		Double a = suspc(inp.next());
		
		System.out.print("IMC = " + p + " / " + a + "^2 = " + (p/(Math.pow(a, 2))));
	}
	
	public static void EjOnce() {
		System.out.print("Introduce un número: ");
		int n = inp.nextInt();
		
		System.out.print("introduce el peso de la potencia: ");
		int m = inp.nextInt();
		
		int res = 0; //Resultado de la Potencia
		
		for(int i = 0;i <= (m - 1);i++) {
			res = n * m;
		}
		
		System.out.println(n + "^" + m + " = " + res);
	}
}
