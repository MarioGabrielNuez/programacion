import javax.swing.*;

/**
 * 
 */

/**
 * @author mario
 *
 */
public class TareaTres {
	static String inpt; // Variable que almacena le dato introducido por el usuario
	static Boolean ok = true; // Boolean que controla la ejecución.
	static Integer p; // Número de preguntas
	static Double v; // Puntucación máxima de cada pregunta
	static Double n; // Nota obtenida sobre le computo global
	static Double r; // Valor real de la nota (nota sobre 10)
	static Byte numlist; // Número total de alumnos que hay en clase
	
	/*
	 * Listas de alumnos y notas, la cardinalidad entre ambos es 1 - 1
	 */
	static String[] alumnos; // lista de alumnos
	static Double[] Notas; // lista de notas
	static Double[] compu; // lista de computo sobre v * p
	
	/**
	 * Proceso main de la clase TareaTres, siempre se ejecutará
	 * @param args
	 */
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Bienvenido al sistema de conversión y listado de nota", "TareaTres.class", 1);
		
		/* 
		 * Solicitamos el número total de alumnos que hay en la clase
		 */
		do {
			inpt = JOptionPane.showInputDialog(null,"Numero de alumnos alistados en el curso","TareaTres.class", JOptionPane.INFORMATION_MESSAGE); //Recogemos el valor del usuario mediente una caja de texto
			
			if (inpt.matches("[+-]?\\d*(\\.\\d+)?")) { // si el valor introducido no es numerico, muestra un error
				numlist = Byte.parseByte(inpt);// convierte a numerico Byte el valor introducido por el usuario para operar con el mismo
				
				if(numlist <= 0) {
					JOptionPane.showMessageDialog(null, "ERROR: el numero de alumnos no puede ser inferior o igual a 0", "TareaTres.class", 0);
					ok = false; // si el usuario introduce un valor negativo o igual a cero, volvemos a pedir el dato
				} else {
					ok = true; // si esta todo okey, continuamos
				}
			} else {
				JOptionPane.showMessageDialog(null, "ERROR: Has de introducir un valor numerico", "TareaTres.class", 0);
				ok = false; // si el usuario introduce un valor no numerico, volvemos a pedir el dato
			}
			
		} while(!ok); // si la variable "ok" no es "true", seguimos pidiendo el dato
		
		/* 
		 * Solicitamos el número total de preguntas que hay en el examen
		 */
		do {
			inpt = JOptionPane.showInputDialog(null,"Introduce el número de preguntas","TareaTres.class", JOptionPane.INFORMATION_MESSAGE); // Recogemos el valor del usuario mediente una caja de texto
			
			if (inpt.matches("[+-]?\\d*(\\.\\d+)?")) { // si el valor introducido no es numerico, muestra un error
				p = Integer.parseInt(inpt);// convierte a numerico Int el valor introducido por el usuario para operar con el mismo
				
				if(p < 0) {
					JOptionPane.showMessageDialog(null, "ERROR: el numero de preguntas no puede ser inferior a 0", "TareaTres.class", 0);
					ok = false; // si el usuario introduce un valor negativo, volvemos a pedir el dato
				} else {
					ok = true; // si esta todo okey, continuamos
				}
			} else {
				JOptionPane.showMessageDialog(null, "ERROR: Has de introducir un valor numerico", "TareaTres.class", 0);
				ok = false; // Si el usuario introduce un valor no numerico, volvemos a pedir el dato
			}
		} while(!ok); // Si la variable "ok" no es "true", seguimos pidiendo el dato
		
		/* 
		 * solicitamos la puntuación máxima posible en cada pregunta
		 */
		do {
			inpt = JOptionPane.showInputDialog(null,"Introduce el valor de cada pregunta","TareaTres.class", JOptionPane.INFORMATION_MESSAGE); // Recogemos el valor del usuario mediante una caja de texto
			
			if (inpt.matches("[+-]?\\d*(\\.\\d+)?")) { // si el valor introducido no es numerico, muestra un error
				v = Double.parseDouble(inpt);// convierte a numerico Double el valor introducido por el usuario para operar con el mismo
				
				if(v < 0) {
					JOptionPane.showMessageDialog(null, "ERROR: el numero de preguntas no puede ser inferior a 0", "TareaTres.class", 0);
					ok = false; // si el usuario introduce un valor negativo, volvemos a pedir el dato
				} else {
					ok = true; // si esta todo okey, continuamos
				}
			} else {
				JOptionPane.showMessageDialog(null, "ERROR: Has de introducir un valor numerico", "TareaTres.class", 0);
				ok = false; // si el usuario introduce un valor no numerico, volvemos a pedir el dato
			}
		} while(!ok);// si la variable "ok" no es "true", seguimos pidiendo el dato
		
		/*
		 * Realizamos el proceso de asignación de nota por cada alumno
		 */
		System.out.println();
		JOptionPane.showMessageDialog(null, "Introduce el nombre del/los alumno/s y su correspondiente nota obtenida sobre " + Math.round(v * p), "TareaTres.class", 1);
		
		alumnos = new String[numlist]; // Inicializamos el Array alumnos[]
		Notas = new Double[numlist]; // Inicializamos el Array Notas[]
		compu = new Double[numlist]; // Inicializamos el Array compu[]
		
		for (byte i = 0;i < numlist;i++) {
			String alum = JOptionPane.showInputDialog(null,"Alumno: ","TareaTres.class", JOptionPane.INFORMATION_MESSAGE); // Recogemos el valor del usuario mediente una caja de texto
			alumnos[i] = alum; // Almacenamos el nombbre y los apellidos del alumno en el Array correspondiente
			
			/* 
			 * Solicitamos la puntuación obtenida sobre el computo global 
			 */
			do {
				inpt = JOptionPane.showInputDialog(null,"Nota: ","TareaTres.class", JOptionPane.INFORMATION_MESSAGE); // Recogemos el valor del usuario mediente una caja de texto
				
				if (inpt.matches("[+-]?\\d*(\\.\\d+)?")) { // si el valor introducido no es numerico, muestra un error
					n = Double.parseDouble(inpt);// convierte a numerico Double el valor introducido por el usuario para operar con el mismo
					
					if(n < 0) {
						JOptionPane.showMessageDialog(null, "ERROR: la nota obtenida no puede ser inferior a 0", "TareaTres.class", 0);
						ok = false; // si el usuario introduce un valor negativo, volvemos a pedir el dato
					} else if (n > (v * p)){
						JOptionPane.showMessageDialog(null, "ERROR: la nota obtenida no puede mayor al computo " + Math.round(v * p), "TareaTres.class", 0);
						ok = false; // si el usuario introduce un valor Mayor que el computo de v * p, volvemos a pedir el dato
					} else {
						ok = true;
						compu[i] = n; // Almacenamos, como String, el computo sobre v * p de cada alumno
					}
				} else {
					JOptionPane.showMessageDialog(null, "ERROR: Has de introducir un valor numerico", "TareaTres.class", 0);
					ok = false; // si el usuario introduce un valor no numerico, volvemos a pedir el dato
				}
			} while(!ok); // si la variable "ok" no es "true", seguimos pidiendo el dato
			
			r = (n * 10) / (v * p); // Calculamos con una regla de tres la nota sobre 10 obtenida.
			Notas[i] = r; // Almacenamos, como String, la nota realde cada alumno
			
		}
		
		/*
		 * Imprimimos la lista con los alumnos y sus correspondientes notas.
		 * 
		 * Primero revisamos que las longitudes de las listas concuerdan para evitar descuadres
		 */
		if (numlist == alumnos.length && numlist == Notas.length && numlist == compu.length) { 
			for (byte i = 0;i < numlist;i++) {
				System.out.printf("Alumno: %s; Nota real: %.2f; Computo sobre %d: %.2f %n", alumnos[i], Notas[i], (int) (v * p), compu[i]);
			}
		} else {
			JOptionPane.showMessageDialog(null, "ERROR en ejecución", "TareaTres.class", 0);
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

}
