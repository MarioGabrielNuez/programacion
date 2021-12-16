import java.util.*;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class MainPruebas {
	private static Cuenta[] cuentas = new Cuenta[5];
	private static Cliente[] clientes = new Cliente[5];
	private static Transferencia[] transferencia = new Transferencia[5];
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		clientes[0] = new Cliente("María Antonia de las Nieves", "56323846G");
		clientes[1] = new Cliente("Juan Alvárez de las Torres", "56333235J");
		clientes[2] = new Cliente("Miguel Hernandez Castroso", "04353287K");
		cuentas[0] = new Cuenta("ES74;5643;2443;33;000000001", clientes[0], 12345);
		cuentas[1] = new Cuenta("ES74;3123;4543;87;" + nuevaCuenta(clientes[1], cuentas[0].getNumero().split(";")[4]), clientes[1], 1890);
		transferencia[0] = new Transferencia(cuentas[0], cuentas[1], 232);
		
		System.out.println(Arrays.toString(clientes));
		System.out.println(Arrays.toString(cuentas));
		System.out.println(Arrays.toString(transferencia));
		
		System.out.println(Arrays.toString(cuentas[0].getNumero().split(";")));
		System.out.println(Arrays.toString(cuentas[1].getNumero().split(";")));
		System.out.println(nuevaCuenta(clientes[1], cuentas[1].getNumero().split(";")[4]));
	}
	
	public static String nuevaCuenta(Cliente cli, String numG) {
		Long numN = Long.parseLong(numG); 
		numN++;
		String num = numN.toString();
		
		if (numN < 100000000) {
			for(int i = 0; i < numG.length() - 1;i++) {
				num = "0" + num;
			}
		} else {
			
		}
		
		return num;
	}
}

