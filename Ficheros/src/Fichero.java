import javax.swing.*;
import java.awt.event.*;
import java.io.*;

/**
 * 
 */

/**
 * @author Mario Gabriel Núñez Alcázar de Velasco
 *
 */
public class Fichero {
	private static String ruta;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Object[] sel = new Object[] { 
				"Nuevo", 
				"Abrir" };
		
		int ini = JOptionPane.showOptionDialog(null, 
				"Opciones: ", 
				"Mi Notepad", 
				JOptionPane.DEFAULT_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				null, 
				sel, 
				sel[0]);
		
		switch (ini) {
		case 0:
			ruta = null;
			ventana("");
			break;

		case 1:
			ruta = null;
			ventana(readFile());
			break;
		}
	}

	/**
	 * Método para crear fichero
	 */
	private static void crte(File fich) {
		try {
			fich.createNewFile();//Creamos el fichero
		} catch (IOException e) {
			/*
			 * Mostramos mensaje de error interno
			 */
			JOptionPane.showMessageDialog(null, 
					                      "Imposible crear fichero: " + e, 
					                      "Mi Notepad", 
					                      0);
		}
	}
	
	/**
	 * ventana con area de escritura
	 */
	public static void ventana(String txt){
		JFrame frame = new JFrame();
		
		frame.setUndecorated(false);
		frame.setLayout(null);
		frame.setBounds(0, 0, 540, 400);
		frame.setTitle("Mi Notepad");
		frame.setResizable(false);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		JButton save = new JButton();
		save.setText("Guardar");
		save.setBounds(5, 5, 80, 30);
		frame.add(save);
		
		JTextArea textAr = new JTextArea(txt);
		textAr.setBounds(10, 50, 505, 300);
		textAr.setLineWrap(true);
		textAr.setWrapStyleWord(true);	
		frame.add(textAr);
		
		
		frame.setVisible(true);
		
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(ruta == null) {
					JFileChooser filechooser = new JFileChooser();
					filechooser.setDialogTitle("Mi Notepad");
					int retorno = filechooser.showOpenDialog(filechooser);
					
					if(retorno == JFileChooser.APPROVE_OPTION) {
						File fich = filechooser.getSelectedFile().getAbsoluteFile();
						
						try {
							crte(fich);
							FileWriter fw = new FileWriter(fich);
							fw.write(textAr.getText());
							fw.close();
						} catch (IOException e1) {
							/*
							 * Mostramos mensaje de error interno
							 */
							JOptionPane.showMessageDialog(null, 
									                      "Imposible guardar fichero: " + e, 
									                      "Mi Notepad", 
									                      0);
						}
					}
				} else {
					try {
						FileWriter fw = new FileWriter(new File(ruta));
						fw.write(textAr.getText());
						fw.close();
					} catch (IOException e1) {
						/*
						 * Mostramos mensaje de error interno
						 */
						JOptionPane.showMessageDialog(null, 
								                      "Imposible guardar fichero: " + e, 
								                      "Mi Notepad", 
								                      0);
					}
				}
			}
		});
	}
	
	/**
	 * leer fichero
	 */
	private static String readFile() {
		String data = null;
		
		JFileChooser filechooser = new JFileChooser();
		
		filechooser.setDialogTitle("Mi Notepad");
		
		int retorno = filechooser.showOpenDialog(filechooser);
		
		if(retorno == JFileChooser.APPROVE_OPTION) {
			ruta = filechooser.getSelectedFile().getAbsolutePath();
			
			try {
				FileReader fr = new FileReader(ruta);
				BufferedReader bf = new BufferedReader(fr);
				String line = bf.readLine();
				while (line != null) {
					data += line + "\n";
					line = bf.readLine();
				}
				
				bf.close();
				fr.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException i) {
				i.printStackTrace();
			}
		}
		
		return data;
	}
}
