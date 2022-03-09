package main;

import controlador.Conexion;
import controlador.Query;
import modelo.Producto;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class Main {
	/**
	 * Conexion a la base de datos
	 */
	private static Conexion conexion = new Conexion("root","ladesiempre");
	
	/**
	 * querys que ejecutaremos
	 */
	private static Query query = new Query();
	
	/**
	 * Array List de productos
	 */
	private static ArrayList<Producto> productos;
	
	/**
	 * Array List de string con la lista de productos
	 */
	private static ArrayList<String> lista  = new ArrayList<String>();
	
	/**
	 * Proceso principal del programa.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Obtenemos todos los datos ubicados en la bdd
		 */
		productos = query.descargar(conexion);
		
		/*
		 * Abrimos la vista
		 */
		vistaP();
	}
	
	/**
	 * Vista principal
	 */
	public static void vistaP() {
		Object[] opciones = new Object[] {"añadir", "imprimir"};
		lista.clear();
		lista.add("Producto - Cantidad");
		
		for (Producto p : productos) {
			lista.add(p.getNombreProducto() + " - " + p.getCantidad());
		}
		
		int opt = JOptionPane.showOptionDialog(null, lista, "lista de la compra", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
		
		switch (opt) {
		case 0:
			vistaA();
			break;
		case 1:
			imprimir();
			break;
		}
	}

	/**
	 * funcion para imprimir en txt la lista 
	 */
	private static void imprimir() {
		JFileChooser fileChoo = new JFileChooser();
		fileChoo.showDialog(fileChoo, "Guardar");
		
		if (fileChoo.getSelectedFile() != null) {
			File fichero = new File(fileChoo.getSelectedFile().getAbsolutePath());
			FileWriter fileW = null;
			try {
				fichero.createNewFile();
				fileW = new FileWriter(fichero.getAbsolutePath());
				
				for (int i = 0;i < lista.size();i++) {
					fileW.write(lista.get(i).toString() + "\n");
				}
			} catch (IOException e) {
				System.out.println("Error: " + e);
			} finally {
				try {
					fileW.close();
				} catch (IOException e) {
					System.out.println("Error: " + e);
				}
			}
		}
		
		vistaP();
	}

	/**
	 * Vista de añadir objeto
	 */
	private static void vistaA() {
		JTextField producto = new JTextField();
		JTextField cantidad = new JTextField();
		
		Object[] campos = new Object[] {producto, cantidad};
		
		int opt = JOptionPane.showInternalConfirmDialog(null, campos, "Añadir producto", JOptionPane.OK_CANCEL_OPTION);
		
		switch (opt) {
		case 0:
			try {
				if (cantidad.getText().matches("[0-9]+")) {
					productos.add(new Producto(producto.getText(), Integer.parseInt(cantidad.getText())));
				} else {
					System.out.println("error: valor cantidad no admitido");
				}
			} catch (Exception e) {
				System.out.println("Error: " + e);
			}
			vistaP();
			break;
		case 1:
			vistaP();
			break;
		}
	}
}
