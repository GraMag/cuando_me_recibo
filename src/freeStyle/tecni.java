package freeStyle;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class tecni extends JFrame {

	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tecni frame = new tecni();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public tecni() {
		String[] estado = {"No aprobada", "Aprobada"};
		List<Materia> tecnicatura = new ArrayList<Materia>();
		tecnicatura = Materia.listaMaterias(tecnicatura);
		final List <Materia> tecnicatura2 = tecnicatura;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 543);
		
		// BARRA MENU SUPERIOR
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Men\u00FA");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmReiniciar = new JMenuItem("Reiniciar");
		mntmReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acciones.resetMaterias(tecnicatura2);
			}
		});
		mnNewMenu.add(mntmReiniciar);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		mnNewMenu.add(mntmSalir);
		
		JMenu mnNewMenu_1 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("About");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tecnicatura.about();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		// TITULO
		JLabel lblNewLabel = new JLabel("Tecnicatura en programaci\u00F3n");
		lblNewLabel.setForeground(new Color(255, 255, 0));
		lblNewLabel.setBounds(39, 13, 729, 85);
		lblNewLabel.setFont(new Font("Colonna MT", Font.PLAIN, 55));
		contentPane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(new Color(255, 255, 255));
		tabbedPane.setBackground(new Color(0, 0, 128));
		tabbedPane.setBounds(12, 101, 758, 347);
		contentPane.add(tabbedPane);

		//PESTANIA CUATRIMESTRE 1

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 128));
		tabbedPane.addTab("1er Cuatrimestre", null, panel_1, null);
		panel_1.setLayout(null);
		
		// PROGRAMACION1
		panel_1.add(Visual.labelMateria(tecnicatura2, 0, 37));
		panel_1.add(Visual.comboMateria(tecnicatura2, 0, 34));
		panel_1.add(Visual.bottonMateria(tecnicatura2, 5, 6, 33));
		// LABORATORIO1
		panel_1.add(Visual.labelMateria(tecnicatura2, 1, 83));
		panel_1.add(Visual.comboMateria(tecnicatura2, 1, 80));
		panel_1.add(Visual.bottonMateria(tecnicatura2, 5, 6, 79));
		// SPD
		panel_1.add(Visual.labelMateria(tecnicatura2, 2, 126));
		panel_1.add(Visual.comboMateria(tecnicatura2, 2, 123));
		panel_1.add(Visual.bottonMateria(tecnicatura2, 9, 122));
		// INGLES 1
		panel_1.add(Visual.labelMateria(tecnicatura2, 3, 171));
		panel_1.add(Visual.comboMateria(tecnicatura2, 3, 168));
		panel_1.add(Visual.bottonMateria(tecnicatura2, 7, 167));
		// MATEMATICA
		panel_1.add(Visual.labelMateria(tecnicatura2, 4, 217));
		panel_1.add(Visual.comboMateria(tecnicatura2, 4, 214));
		panel_1.add(Visual.bottonMateria(tecnicatura2, 8, 11, 213));
				
		// SIGUIENTE
		panel_1.add(Visual.bottonSiguiente(tecnicatura2, "SIGUIENTE"));
		
		
		// PESTANIA CUATRIMESTRE 2
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 128));
		tabbedPane.addTab("2do Cuatrimestre", null, panel_2, null);
		panel_2.setLayout(null);
		
		// PROGRAMACION2
		panel_2.add(Visual.labelMateria(tecnicatura2, 5, 17));
		panel_2.add(Visual.comboMateria(tecnicatura2, 5, 14));
		panel_2.add(Visual.bottonMateria(tecnicatura2, 14, 15, 13));
		// LABORATORIO2
		panel_2.add(Visual.labelMateria(tecnicatura2, 6, 58));
		panel_2.add(Visual.comboMateria(tecnicatura2, 6, 55));
		panel_2.add(Visual.bottonMateria(tecnicatura2, 14, 15, 56));
		// INGLES2
		panel_2.add(Visual.labelMateria(tecnicatura2, 7, 101));
		panel_2.add(Visual.comboMateria(tecnicatura2, 7, 98));
		panel_2.add(Visual.bottonMateria(tecnicatura2, 20, 97));
		// ESTADISTICA
		panel_2.add(Visual.labelMateria(tecnicatura2, 8, 141));
		panel_2.add(Visual.comboMateria(tecnicatura2, 8, 138));
		panel_2.add(Visual.bottonMateria(tecnicatura2, 12, 13, 137));
		// ARQUITECTURA
		panel_2.add(Visual.labelMateria(tecnicatura2, 9, 182));
		panel_2.add(Visual.comboMateria(tecnicatura2, 9, 179));
		panel_2.add(Visual.bottonMateria(tecnicatura2, 20, 178));
		// METODOLOGIA INVEST
		panel_2.add(Visual.labelMateria(tecnicatura2, 10, 225));
		panel_2.add(Visual.comboMateria(tecnicatura2, 10, 221));
		panel_2.add(Visual.bottonMateria(tecnicatura2, 17, 220));
				
				
		// SIGUIENTE
		panel_2.add(Visual.bottonSiguiente(tecnicatura2, "SIGUIENTE"));
		
		
		//PESTANIA CUATRIMESTRE 3

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 128, 128));
		tabbedPane.addTab("3er Cuatrimestre", null, panel_3, null);
		panel_3.setLayout(null);
		
		// PROGRAMACION3
		panel_3.add(Visual.labelMateria(tecnicatura2, 14, 37));
		panel_3.add(Visual.comboMateria(tecnicatura2, 14, 34));
		panel_3.add(Visual.bottonMateria(tecnicatura2, 17, 18, 19, 33));
		// LABORATORIO3
		panel_3.add(Visual.labelMateria(tecnicatura2, 15, 83));
		panel_3.add(Visual.comboMateria(tecnicatura2, 15, 80));
		panel_3.add(Visual.bottonMateria(tecnicatura2, 17, 18, 19, 79));
		// ORGANIZACION CONTABLE
		panel_3.add(Visual.labelMateria(tecnicatura2, 11, 126));
		panel_3.add(Visual.comboMateria(tecnicatura2, 11, 123));
		panel_3.add(Visual.bottonMateria(tecnicatura2, 17, 122));
		// ELEMENTOS
		panel_3.add(Visual.labelMateria(tecnicatura2, 12, 171));
		panel_3.add(Visual.comboMateria(tecnicatura2, 12, 168));
		panel_3.add(Visual.bottonMateria(tecnicatura2, 20, 167));
		// ORGANIZACION EMPRESARIAL
		panel_3.add(Visual.labelMateria(tecnicatura2, 13, 217));
		panel_3.add(Visual.comboMateria(tecnicatura2, 13, 214));
		panel_3.add(Visual.bottonMateria(tecnicatura2, 17, 213));
				
		// SIGUIENTE
		panel_3.add(Visual.bottonSiguiente(tecnicatura2, "SIGUIENTE"));
		
		
		
		// PESTANIA CUATRIMESTRE 4
	
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 128, 128));
		tabbedPane.addTab("4to Cuatrimestre", null, panel_4, null);
		panel_4.setLayout(null);
		
		
		// LEGISLACION
		panel_4.add(Visual.labelMateria(tecnicatura2, 16, 58));
		panel_4.add(Visual.comboMateria(tecnicatura2, 16, 55));
		panel_4.add(Visual.bottonMateria(tecnicatura2, 20, 56));
		// METODOLOGIA DE SIST
		panel_4.add(Visual.labelMateria(tecnicatura2, 17, 114));
		panel_4.add(Visual.comboMateria(tecnicatura2, 17, 111));
		panel_4.add(Visual.bottonMateria(tecnicatura2, 20, 110));
		// BBDD
		panel_4.add(Visual.labelMateria(tecnicatura2, 18, 167));
		panel_4.add(Visual.comboMateria(tecnicatura2, 18, 164));
		panel_4.add(Visual.bottonMateria(tecnicatura2, 20, 163));
		// LAB 4
		panel_4.add(Visual.labelMateria(tecnicatura2, 19, 223));
		panel_4.add(Visual.comboMateria(tecnicatura2, 19, 219));
		panel_4.add(Visual.bottonMateria(tecnicatura2, 20, 218));
				
		// FINALIZAR
		panel_4.add(Visual.bottonSiguiente(tecnicatura2, "FINALIZAR"));
				
		/*
		JProgressBar progressBar = new JProgressBar(0,19);
		progressBar.setBounds(0, 445, 796, 25);
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
		contentPane.add(progressBar);
		*/
	}

}