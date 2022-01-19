import java.sql.*;

/**
 * Clase para conectar a la base de datos; esta clase es la que se encargará de realizar al conexión a la base de datos.
 * 
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
public class Conexion {
	/**
	 * Nombre de la base de datos.
	 */
	private String nombreDB = "banco"; 
	/**
	 * Nombre de usuario de acceso a la base de datos.
	 */
	private String usuario = "root"; 
	/**
	 * Contraseña de acceso a la base de datos.
	 */
	private String contraseña = "ladesiempre";
	/**
	 * URL de acceso a la base de datos.
	 */
	private String url;
	
	/**
	 * Variable de tipo Connection, se usará para establecer la conexion a true o false, según se haya podido o no conectar a la base de datos.
	 */
	Connection conexion = null; //Establecemos la conexion por defecto a null
	
	/**
	 * Constructor con datos. 
	 * 
	 * <br>Se usará para declarar el objeto Conexion con los datos de la base de datos a la que vamos a conectar
	 * 
	 * @param usuario - Usuario de la base de datos
	 * @param contraseña - Contraseña de la base de datos
	 */
	public Conexion(String usuario, String contraseña) {
		this.usuario = usuario;
		this.contraseña = contraseña;
	}

	/**
	 * Declaracion del objeto vacio.
	 */
	public Conexion() {}

	/**
	 * Metodo conect, se usará para establecer la conexion a la base de datos.
	 */
	public void conect() {
		this.url = "jdbc:mysql://Localhost:3306/" + nombreDB;
		
		try {
			//Cargamos el DriverManager con el Class Loader
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				//Establecemos la conexion a la base de datos
				conexion = DriverManager.getConnection(url, usuario, contraseña); 
				if (conexion != null) {
					//Si la conexion ha sucedido correctamente, mostramos mensaje de entrada
					System.out.println("Conected to: " + url); 
				}
			} catch (SQLException e) {
				//Mostramos error en el caso de no poder conectar al abase de datos solicitada
				System.out.println("Unable to conected to: " + url);
				System.out.println("SQL exception returned: " + e);
			}
		} catch (ClassNotFoundException e) {
			//En el caso de no cargar el DriverManager, mostramos error interno
			System.out.println("Internal:" + e);
		}
	}
	
	/**
	 * Metodo para recibir el HashCode de la conexion establecida.
	 * @return conexion - Connection (HashCode).
	 */
	public Connection getConexion(){
		return conexion; // devolvemos el HashCode de conexion
	}
	
	/**
	 * Método para romper la conexión a la base de datos.
	 */
	public void desconexion() {
		conexion = null; //Establecemos el valor de la conexion a null
	}

	/**
	 * @return the nombreDB
	 */
	public String getNombreDB() {
		return nombreDB;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @return the contraseña
	 */
	public String getContraseña() {
		return contraseña;
	}

	/**
	 * @param nombreDB the nombreDB to set
	 */
	public void setNombreDB(String nombreDB) {
		this.nombreDB = nombreDB;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @param contraseña the contraseña to set
	 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
}
