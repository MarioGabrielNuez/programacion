package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * Clase para conectar a la base de datos; esta clase es la que se encargará de realizar la conexión a la base de datos.
 * 
 * @author Alumno
 */
public class Conexion {
	/**
	 * Nombre de la base de datos.
	 */
	private static String nombreDB = "compralista"; 
	/**
	 * Nombre de usuario de acceso a la base de datos.
	 */
	private static String usuario; 
	/**
	 * Contraseña de acceso a la base de datos.
	 */
	private static String contraseña;
	/**
	 * URL de acceso a la base de datos.
	 */
	private static String url = "jdbc:mysql://Localhost:3306/" + nombreDB;
	
	/**
	 * Variable de tipo Connection, se usará para establecer la conexion a true o false, según se haya podido o no conectar a la base de datos.
	 */
	private static Connection conexion = null; //Establecemos la conexion por defecto a null
	
	/**
	 * Constructor con datos de entrada, se usará para establecer el objeto conexion.
	 * 
	 * @param usuario - el usuario de acceso a la base de datos.
	 * @param contraseña - la contraseña de acceso a la base de datos.
	 */
	public Conexion(String usuario, String contraseña) {
		Conexion.usuario = usuario;
		Conexion.contraseña = contraseña;
	}

	/**
	 * Metodo conect, se usará para establecer la conexion a la base de datos.
	 */
	public void conect() throws SQLException, ClassNotFoundException {
		try {
			//Cargamos el DriverManager con el Class Loader
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				//Establecemos la conexion a la base de datos
				conexion = DriverManager.getConnection(url, usuario, contraseña); 
				if (conexion != null) {
					//Si la conexion ha sucedido correctamente, mostramos mensaje de entrada
					System.out.print("\n" + new SimpleDateFormat("yyyy/MM/dd.HH:mm:ss").format(new Date()) + " - Conected to: " + url);
				}
			} catch (SQLException e) {
				/*
				 * Mostramos error en el caso de no poder conectar al abase de datos solicitada
				 */
				//Escribimos en el log de eventos
				System.out.print("\n" + new SimpleDateFormat("yyyy/MM/dd.HH:mm:ss").format(new Date()) + " - Unable to conected to: " + url);
				System.out.print("\n" + new SimpleDateFormat("yyyy/MM/dd.HH:mm:ss").format(new Date()) + " - SQL exception returned: " + e);
				//Mostramos el Mensaje
				JOptionPane.showMessageDialog(null, 
						                      "Usuario o contraseña incorrectos.\nSi ha olvidado su contraseña, pongase en contacto con el administrador de sistemas", 
										      "IFP", 
										      0, 
										      null);
			}
		} catch (ClassNotFoundException e) {
			//En el caso de no cargar el DriverManager, mostramos error interno
			System.out.print("\n" + new SimpleDateFormat("yyyy/MM/dd.HH:mm:ss").format(new Date()) + " - Internal:" + e);
		}
	}
	
	/**
	 * Metodo para recibir el Objeto de la conexion establecida.
	 * @return conexion - Connection.
	 */
	public Connection getConexion(){
		return conexion; // devolvemos el Objeto conexion
	}
	
	/**
	 * Método para romper la conexión a la base de datos.
	 */
	public void desconexion() {
		conexion = null; //Establecemos el valor de la conexion a null
	}
}
