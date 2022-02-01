
/**
 * 
 */

/**
 * @author mario
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Repartidor repar = new Repartidor("Antonio", "lopez", 24, 600, "norte");
		System.out.println(repar.getApellido());
		repar.setApellido("manolo");
		System.out.println(repar.getApellido());
	}

}
