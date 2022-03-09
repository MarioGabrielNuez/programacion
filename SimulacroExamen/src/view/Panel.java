package view;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import controller.Back;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Panel {

	public JFrame frmIfp;

	/**
	 * Create the application.
	 */
	public Panel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIfp = new JFrame();
		frmIfp.setTitle("IFP");
		frmIfp.setResizable(false);
		frmIfp.setBounds(100, 100, 438, 232);
		frmIfp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIfp.getContentPane().setLayout(null);
		
		JTextArea dataView = new JTextArea();
		dataView.setBounds(10, 10, 258, 147);
		frmIfp.getContentPane().add(dataView);
		
		JButton btnCrearProfesor = new JButton("Crear Profesor");
		btnCrearProfesor.setBounds(282, 12, 132, 21);
		frmIfp.getContentPane().add(btnCrearProfesor);
		
		JButton btnEditarProfesor = new JButton("Editar Profesor");
		btnEditarProfesor.setBounds(282, 43, 132, 21);
		frmIfp.getContentPane().add(btnEditarProfesor);
		
		JButton btnEliminarProfesor = new JButton("Eliminar Profesor");
		btnEliminarProfesor.setBounds(282, 74, 132, 21);
		frmIfp.getContentPane().add(btnEliminarProfesor);
		
		JButton btnCrearAlumno = new JButton("Crear Alumno");
		btnCrearAlumno.setBounds(282, 105, 132, 21);
		frmIfp.getContentPane().add(btnCrearAlumno);
		
		JButton btnEditarAlumno = new JButton("Editar Alumno");
		btnEditarAlumno.setBounds(282, 136, 132, 21);
		frmIfp.getContentPane().add(btnEditarAlumno);
		
		JButton btnEliminarAlumno = new JButton("Eliminar Alimno");
		btnEliminarAlumno.setBounds(282, 167, 132, 21);
		frmIfp.getContentPane().add(btnEliminarAlumno);
		
		JButton btnVerDatos = new JButton("Ver Datos");
		btnVerDatos.setBounds(10, 167, 103, 21);
		frmIfp.getContentPane().add(btnVerDatos);
		
		JButton btnExportarDatos = new JButton("Exportar Datos");
		btnExportarDatos.setBounds(123, 167, 145, 21);
		frmIfp.getContentPane().add(btnExportarDatos);
		
		btnVerDatos.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Back.getAllData();
			}
			
		});
	}
}
