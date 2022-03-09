/**
 * 
 */
package hilos;

/**
 * @author mario
 *
 */
public class hilosClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		hilo1 hiloUno = new hilo1();
		
		hilo1 hiloDos = new hilo1();
		
		hiloUno.start();
		hiloDos.start();
	}

}
