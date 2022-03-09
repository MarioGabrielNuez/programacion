package main;

import java.awt.EventQueue;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import controller.Back;
import view.Panel;

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 */
public class Main {
	/**
	 * Ventana del programa
	 */
	private static Panel ventana;
	
	/**
	 * Usuario de acceso a la base de datos
	 */
	private static String user;
	
	/**
	 * Contraseña de acceso a la base de datos
	 */
	private static String pass;
	
	/**
	 * Método principal del programa
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Conexion con la base de datos
		 */
		if (conectarDB()) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						ventana = new Panel();
						ventana.frmIfp.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}
	}

	private static boolean conectarDB() {
		JTextField usuario = new JTextField();
		JTextField contraseña = new JPasswordField();
		
		Object[] campos = new Object[] {
			"Usuario", usuario,
			"Contraseña", contraseña
		};
		
		int o = JOptionPane.showConfirmDialog(null, campos, "IFP", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);
		
		switch (o) {
		case 0:
			user = usuario.getText();// recoge el usuario
			pass = contraseña.getText();// recoge la conetraseña
			
			new Back(user, pass);// Establece los datos de conexion
			
			try {
				Back.conect();// Conecta a la base de datos
				if (Back.getConexion() != null) {
					Back.desconexion();
					return true;
				}
			} catch (ClassNotFoundException | SQLException e) {
				/*
				 * en caso de error mostramos mensaje y reinicializamos los datos de acceso
				 */
				JOptionPane.showMessageDialog(null, "Error de acceso a la base de datos");
			} 
			
			break;
		}
		
		return false;
	}
}
