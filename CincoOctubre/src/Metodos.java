/**
 * 
 */

/**
 * @author Alumno
 *
 */
public class Metodos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*
		 * CLASE MATH
		 */
		
		double resultado;
		
		/***************************sqrt -> Raiz Cuadrada**********************************/
		resultado = Math.sqrt(-1);
		System.out.println("el resultado es: " + resultado);
		
		resultado = Math.sqrt(-0);
		System.out.println("el resultado es: " + resultado);
		
		resultado = Math.sqrt(5);
		System.out.println("el resultado es: " + resultado);

		/***************************pw -> potencia*****************************************/
		resultado = Math.pow(4,2);
		System.out.println("el resultado es: " + resultado);
		
		resultado = Math.pow(4,+0);
		System.out.println("el resultado es: " + resultado);
		
		resultado = Math.pow(0,4);
		System.out.println("el resultado es: " + resultado);
		
		resultado = Math.pow(0,Math.sqrt(4));
		System.out.println("el resultado es: " + resultado);
		
		/***************************round -> redondeo**************************************/
		resultado = Math.round(2.5);
		System.out.println("el resultado es: " + resultado);
		
		resultado = Math.round(Math.PI);
		System.out.println("el resultado es: " + resultado);
		
		
		/*
		 * CLASE STRING
		 */
		
		String algo = "Hello World";
		System.out.println("Varable Clase: " + algo);
		
		/***************************length -> longitud**************************************/
		System.out.println("Varable Clase: " + algo.length());
		
		/***************************charAt -> obtener caracter concreto**************************************/
		System.out.println("Varable Clase: " + algo.charAt(6));
		
		/***************************Substring -> obtener Subcadena**************************************/
		System.out.println("Varable Clase: " + algo.substring(6));
		System.out.println("Varable Clase: " + algo.substring(6,9));
		
		/***************************Equals -> compara cadenas**************************************/
		String pass = "erpepe";
		String pass2 = "ERPEPE";
		
		System.out.println("Equals -> ¿Son iguales?" + pass.equals(pass2));
		System.out.println("equalsIgnoreCase -> ¿Son iguales?" + pass.equalsIgnoreCase(pass2));
	}

}
