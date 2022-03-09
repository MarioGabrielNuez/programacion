/**
 * 
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
public class Back extends Conexion{
	/**
	 * Resultado de la query
	 */
	private static ResultSet result;
	
	/**
	 * Query a ejecutar
	 */
	private static PreparedStatement prepStat;
	
	/**
	 * 
	 * @param usuario
	 * @param contraseña
	 */
	public Back(String usuario, String contraseña) {
		super(usuario, contraseña);
	}

	public static ArrayList<String> getAllData(){
		prepStat = null;
		result = null;
		ArrayList<String> res = new ArrayList<String>();
		
		String query = "select profesor.nombre as nombre_profesor, profesor.apellidos as apellidos_profesor, profesor.email as email_profesor, profesor.edad as edad_profesor, alumno.nombre as nombre_alumno, alumno.apellidos as apellidos_alumno, alumno.email as email_alumno, alumno.edad as edad_alumno from profesor inner join asignacion on profesor.idProfesor = asignacion.idProfesor inner join alumno on alumno.idAlumno = asignacion.idAlumno;";
		
		try {
			conect();
		} catch (ClassNotFoundException | SQLException e1) {
			System.out.println("error en la consulta");
		} 
		
		try {
			prepStat = getConexion().prepareStatement(query);
			result = prepStat.executeQuery();
			
			while (result.next()) {
				for (int i = 1; i < 8; i++) {
					res.add(result.getString(i));
				}
			}
			
			System.out.println(res);
		} catch (SQLException e) {
			System.out.println("error en la consulta");
		}
		
		desconexion();
		return null;
	}
	
	public static void addProfesor() {
		prepStat = null;
		result = null;
		
		JTextField nombre = new JTextField();
		JTextField apellidos = new JTextField();
		JTextField email = new JTextField();
		JTextField edad = new JTextField();
		
		Object[] campos = new Object[] {
			"Nombre", nombre,
			"Apellidos", apellidos,
			"Email", edad,
			"Apellidos", email
		};
		
		int o = JOptionPane.showConfirmDialog(null, campos, "IFP", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);
		
		switch (o) {
		case 0:
			String query = "insert into profesor(nombre, apellidos, email, edad) values ('" + nombre.getText() + "', '" + apellidos.getText() + "', '" + email.getText() + "', '" + edad.getText() + "');";
			
			try {
				conect();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("error en la consulta");
			}
			
			try {
				prepStat = getConexion().prepareStatement(query);
				prepStat.executeQuery();
			} catch (SQLException e) {
				System.out.println("error en la consulta");
			}
			
			desconexion();
			break;
		}
	}
	
	public static void addAlumno() {
		prepStat = null;
		result = null;
		
		JTextField nombre = new JTextField();
		JTextField apellidos = new JTextField();
		JTextField email = new JTextField();
		JTextField edad = new JTextField();
		
		Object[] campos = new Object[] {
			"Nombre", nombre,
			"Apellidos", apellidos,
			"Email", edad,
			"Apellidos", email
		};
		
		int o = JOptionPane.showConfirmDialog(null, campos, "IFP", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);
		
		switch (o) {
		case 0:
			String query = "insert into profesor(nombre, apellidos, email, edad) values ('" + nombre.getText() + "', '" + apellidos.getText() + "', '" + email.getText() + "', '" + edad.getText() + "');";
			
			try {
				conect();
			} catch (ClassNotFoundException | SQLException e) {
				System.out.println("error en la consulta");
			}
			
			try {
				prepStat = getConexion().prepareStatement(query);
				prepStat.executeQuery();
			} catch (SQLException e) {
				System.out.println("error en la consulta");
			}
			
			desconexion();
			break;
		}
	}
}
