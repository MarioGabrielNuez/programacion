/**
 * 
 */
package controlador;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Producto;

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
public class Query {
	/**
	 * Prepared Statment
	 */
	private PreparedStatement prepStat;
	
	/**
	 * Resultado de la query
	 */
	private ResultSet resul;
	
	/**
	 * Constructor declarativo del objeto
	 */
	public Query() {}
	
	/**
	 * Descargar todos los datos de la base de datos
	 */
	public ArrayList<Producto> descargar(Conexion conex){
		String query = "select * from lista_compra";

		/**
		 * Array que contendrá la lista de la compra ya guardada en la base de datos
		 */
		ArrayList<Producto> arr = new ArrayList<Producto>();
		
		try {
			conex.conect();
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("error: " + e1);
		}
		
		try {
			/*
			 * Preparamos la query
			 */
			prepStat = conex.getConexion().prepareStatement(query);

			/*
			 * Ejecutamos la query
			 */
			resul = prepStat.executeQuery();//ejecutamos y recogemos los datos.
			
			/*
			 * Guardamos el resultado
			 */
			while(resul.next() == true) {
				Producto prod = new Producto(resul.getString("NombreProducto"), resul.getInt("Cantidad"));
				arr.add(prod);
			}
		} catch (SQLException e) {//si se sucede alguna excepción a la hora de recoger Datos
			System.out.println("error: " + e);
		} finally {
			conex.desconexion();
		}
		
		return arr;
	}
}
