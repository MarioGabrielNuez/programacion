import java.util.*;
import java.sql.*;

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
	private static ConexionPrueba conexion = new ConexionPrueba();
	private static ResultSet result = null;
	
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
		
		System.out.println(conexion.getConexion());
		
		select("JUGADORES","*");
		insert("JUGADORES", "CODIGO, NOMBRE, PROCEDENCIA, ALTURA, PESO, POSICION, NOMBRE_EQUIPO", "?,?,?,?,?,?,?");
		
		mostrarJugadores();
		update();
		delete();

		conexion.desconectar();
		System.out.println(conexion.getConexion());
		
	}
	
	private static void insert(String table, String columnas, String valores) {
		String put = "INSERT INTO " + table + "(" + columnas + ")" + "VALUES (" + valores + ");";
		PreparedStatement statement = null;
		
		try {
			statement = conexion.getConexion().prepareStatement(put);
			statement.setInt(1, 614);
			statement.setString(2, "twometersmen");
			statement.setString(3, "tunbugtu");
			statement.setString(4, "9-3");
			statement.setInt(5, 432);
			statement.setString(6, "G-F");
			statement.setString(7, "Timberwolves");
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error al insertar");
		}
	}
	
	private static void delete() {
		String del = "DELETE FROM JUGADORES WHERE CODIGO = ?";
		PreparedStatement statement = null;
		
		try {
			statement = conexion.getConexion().prepareStatement(del);
			statement.setInt(1, 614);
			statement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("no funciono, algo va mal");
		}
	}
	private static void update() {
		String up = "UPDATE JUGADORES SET NOMBRE = ? WHERE CODIGO = ?";
		PreparedStatement statement = null;
		
		try {
			statement = conexion.getConexion().prepareStatement(up);
			statement.setString(1, "pollaman");
			statement.setInt(2, 614);
			statement.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("no funciono, algo va mal");
		}
	}

	private static void mostrarJugadores() {
		try {
			while(result.next() == true) {
				System.out.print(result.getString("nombre") + ";");
				System.out.print(result.getString("procedencia") + ";");
				System.out.print(result.getString("altura") + ";");
				System.out.print(result.getInt("peso") + ";");
				System.out.print(result.getString("posicion") + ";");
				System.out.println(result.getString("nombre_equipo"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error: Dato no encontrado");
		}
		
	}

	private static void select(String table, String columns) {
		String query = "SELECT " + columns + " FROM " + table;
		PreparedStatement statment = null;
		result = null;
		
		try {
			statment = conexion.getConexion().prepareStatement(query);
			result = statment.executeQuery();
		} catch (SQLException e) {
			System.out.println("error en la consulta");
		}
		
	}

	public static String nuevaCuenta(Cliente cli, String numG) {
		Long numN = Long.parseLong(numG); 
		numN++;
		String num = numN.toString();
		
		for(int i = 9; i <= numG.length() && i > 1;i--) {
			num = "0" + num;
		}
		
		return num;
	}
}

