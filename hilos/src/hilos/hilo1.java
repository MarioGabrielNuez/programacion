/**
 * 
 */
package hilos;

/**
 * @author mario
 *
 */
public class hilo1 extends Thread {

	/**
	 * 
	 */
	public hilo1() {
		System.out.println("iniciando hilo 1...");
	}
	
	@Override
    public void run(){
        for(int i=0;i<1000;i++){
            System.out.println("Hilo1: "+i);
        }
    }

	/**
	 * @param target
	 */
	public hilo1(Runnable target) {
		super(target);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 */
	public hilo1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param group
	 * @param target
	 */
	public hilo1(ThreadGroup group, Runnable target) {
		super(group, target);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param group
	 * @param name
	 */
	public hilo1(ThreadGroup group, String name) {
		super(group, name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param target
	 * @param name
	 */
	public hilo1(Runnable target, String name) {
		super(target, name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param group
	 * @param target
	 * @param name
	 */
	public hilo1(ThreadGroup group, Runnable target, String name) {
		super(group, target, name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param group
	 * @param target
	 * @param name
	 * @param stackSize
	 */
	public hilo1(ThreadGroup group, Runnable target, String name, long stackSize) {
		super(group, target, name, stackSize);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param group
	 * @param target
	 * @param name
	 * @param stackSize
	 * @param inheritThreadLocals
	 */
	public hilo1(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals) {
		super(group, target, name, stackSize, inheritThreadLocals);
		// TODO Auto-generated constructor stub
	}

}
