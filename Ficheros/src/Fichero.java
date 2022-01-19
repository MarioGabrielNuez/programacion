import java.util.*;
import java.io.*;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class Fichero {
	public static String dir;
	public static String name;
	public static File fich;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		dir = "c:\\Users\\mario\\Desktop";
		name = "prueba.txt";
		
		fich = new File(dir, name);
		
		try {
			System.out.println(fich.createNewFile());
			System.out.println(fich.delete());
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
