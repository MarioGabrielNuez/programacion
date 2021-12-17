import java.sql.*;

/**
 * Clase para conectar a la base de datos (Pruebas)
 */

/**
 * @author Mario Gabriel N��ez Alc�zar de Velasco
 */
public class ConexionPrueba {
	/*
	 * valores predeterminados para realizar pruebas
	 */
	private String nombreDB = "NBA";
	private String usuario = "root";
	private String contrase�a = "";
	private String url = "jdbc:mysql://Localhost:3316/" + nombreDB;
	
	Connection conexion = null;
	
	public ConexionPrueba() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				conexion = DriverManager.getConnection(url, usuario, contrase�a);
				if (conexion != null) {
					System.out.println("Conexi�n establecida");
				}
			} catch (SQLException e) {
				System.out.println("BDD no encontrada");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Error de conexion");
		}
	}
	
	public Connection getConexion(){
		return conexion;
	}
	
	public void desconectar() {
		conexion = null;
	}
}
