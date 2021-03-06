import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mario Gabriel N??ez Alc?zar de Velasco
 *
 */
public class otraManera {
	static Scanner inp = new Scanner(System.in);
	static byte numres1;
	static byte numres2;
	static String nums;
	static boolean ok = false;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Introduce un numero del 1 al 10: ");
		byte num = inp.nextByte();
			
		if(num < 1 || num > 10) {
			System.out.println("Error: solo se permite un numero entre el 1 y el 10: ");
		} else {
			while(!ok){
				outOfRandom(num);
			}
			
			System.out.print("Te han tocado los grupos: " + nums);
		}
		
	}
	
	private static void outOfRandom(byte num) {
		numres1 = (byte) Math.round(Math.random() * 7 + 1);
		numres2 = (byte) Math.round(Math.random() * 7 + 1);
		
		if (num != numres1 && num != numres2) {
				nums = comp(numres1,numres2);
		} else {
			numres1 = (byte) Math.round(Math.random() * 7 + 1);
			numres2 = (byte) Math.round(Math.random() * 7 + 1);
		}
	}
	
	private static String comp (byte numres1, byte numres2) {
		if (numres1 != numres2) {
			nums = numres1 + " y " + numres2;
			ok = true;
		} else {
			numres1 = (byte) Math.round(Math.random() * 7 + 1);
			numres2 = (byte) Math.round(Math.random() * 7 + 1);
		}
		return nums;
	}
}