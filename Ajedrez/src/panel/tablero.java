package panel;
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.BorderLayout;
import javax.swing.border.BevelBorder;
import java.awt.Rectangle;

public class tablero {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tablero window = new tablero();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * constructor del tablero
	 */
	public tablero() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel tablero = new JPanel();
		tablero.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		tablero.setLayout(new GridLayout(8, 8, 0, 0));
		frame.getContentPane().add(tablero, BorderLayout.CENTER);
		
		JPanel PiezasComid = new JPanel();
		frame.getContentPane().add(PiezasComid, BorderLayout.NORTH);
		
		JPanel Command = new JPanel();
		frame.getContentPane().add(Command, BorderLayout.SOUTH);
		
		JPanel piezasMuert = new JPanel() {
			private static final long serialVersionUID = 1L;

			@Override
			public Dimension getPreferredSize(){
				return new Dimension(300, 0);
			}
		};
		
		frame.getContentPane().add(piezasMuert, BorderLayout.WEST);
		
		JPanel Contrario = new JPanel(){
			private static final long serialVersionUID = 1L;

			@Override
			public Dimension getPreferredSize(){
				return new Dimension(300, 0);
			}
		};
		
		frame.getContentPane().add(Contrario, BorderLayout.EAST);
		
		JPanel[][] celdas = new JPanel[][] {
			new JPanel[] {
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel()
			}, 
			new JPanel[] {
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel()
			}, 
			new JPanel[] {
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel()
			}, 
			new JPanel[] {
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel()
			}, 
			new JPanel[] {
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel()
			},
			new JPanel[] {
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel()
			},
			new JPanel[] {
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel()
			},
			new JPanel[] {
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel(),
				new JPanel()
			}
		};
		
		for (int i = 0;i<8;i++) {
			for (int x = 0;x<8;x++) {
				celdas[i][x].setLayout(new GridLayout(8, 8, 0, 0));
				
				if (i % 2 != 0) {

					if (x % 2 != 0) {
						celdas[i][x].setBackground(new Color(0,0,0));
					}
				} else {
					if (x % 2 == 0) {
						celdas[i][x].setBackground(new Color(0,0,0));
					}
				}
				tablero.add(celdas[i][x]);
			}
		}
	}
}
