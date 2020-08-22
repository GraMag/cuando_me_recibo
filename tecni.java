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
		tabbedPane.setBounds(12, 101, 758, 347);
		contentPane.add(tabbedPane);

		//PESTANIA CUATRIMESTRE 1

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 128, 128));
		tabbedPane.addTab("1er Cuatrimestre", null, panel_1, null);
		panel_1.setLayout(null);
		
		///////// PROG 1
		JLabel lblNewLabelProg1 = new JLabel(tecnicatura.get(0).getMateria());
		lblNewLabelProg1.setBounds(91, 37, 121, 16);
		panel_1.add(lblNewLabelProg1);
		
		JComboBox<String> comboBoxProg1 = new JComboBox<>();
		comboBoxProg1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acciones.estadoMateria(comboBoxProg1.getSelectedIndex(), tecnicatura2, 0);
			}
		});
		comboBoxProg1.setModel(new DefaultComboBoxModel<String>(estado));
		comboBoxProg1.setMaximumRowCount(2);
		comboBoxProg1.setBounds(224, 34, 244, 22);
		panel_1.add(comboBoxProg1);
		
		JButton btnVerProg1 = new JButton("Ver correlativas");
		btnVerProg1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acciones.mostrarCorrelativas(tecnicatura2, 5, 6);
			}
		});
		btnVerProg1.setBounds(491, 33, 150, 25);
		panel_1.add(btnVerProg1);

		/////////// LAB 1
		JLabel lblNewLabelLab1 = new JLabel(tecnicatura.get(1).getMateria());
		lblNewLabelLab1.setBounds(91, 83, 121, 16);
		panel_1.add(lblNewLabelLab1);

		JComboBox<String> comboBoxLab1 = new JComboBox<>();
		comboBoxLab1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acciones.estadoMateria(comboBoxLab1.getSelectedIndex(), tecnicatura2, 1);
			}
		});
		comboBoxLab1.setModel(new DefaultComboBoxModel<String>(estado));
		comboBoxLab1.setMaximumRowCount(2);
		comboBoxLab1.setBounds(224, 80, 244, 22);
		panel_1.add(comboBoxLab1);
		
		JButton btnVerLab1 = new JButton("Ver correlativas");
		btnVerLab1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acciones.mostrarCorrelativas(tecnicatura2, 5, 6);
			}
		});
		btnVerLab1.setBounds(491, 79, 150, 25);
		panel_1.add(btnVerLab1);
		
		
		////////// SPD
		JLabel lblNewLabelSPD = new JLabel(tecnicatura.get(2).getMateria());
		lblNewLabelSPD.setBounds(91, 126, 121, 16);
		panel_1.add(lblNewLabelSPD);

		JComboBox<String> comboBoxSPD = new JComboBox<>();
		comboBoxSPD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acciones.estadoMateria(comboBoxSPD.getSelectedIndex(), tecnicatura2, 2);
			}
		});
		comboBoxSPD.setModel(new DefaultComboBoxModel<String>(estado));
		comboBoxSPD.setMaximumRowCount(2);
		comboBoxSPD.setBounds(224, 123, 244, 22);
		panel_1.add(comboBoxSPD);
		
		JButton btnVerSPD = new JButton("Ver correlativas");
		btnVerSPD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acciones.mostrarCorrelativas(tecnicatura2, 9);
			}
		});
		btnVerSPD.setBounds(491, 122, 150, 25);
		panel_1.add(btnVerSPD);

		///////////// INGLES 1
		JLabel lblNewLabelIngles1 = new JLabel(tecnicatura.get(3).getMateria());
		lblNewLabelIngles1.setBounds(91, 171, 121, 16);
		panel_1.add(lblNewLabelIngles1);

		JComboBox<String> comboBoxIngles1 = new JComboBox<>();
		comboBoxIngles1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acciones.estadoMateria(comboBoxIngles1.getSelectedIndex(), tecnicatura2, 3);
			}
		});
		comboBoxIngles1.setModel(new DefaultComboBoxModel<String>(estado));
		comboBoxIngles1.setMaximumRowCount(2);
		comboBoxIngles1.setBounds(224, 168, 244, 22);
		panel_1.add(comboBoxIngles1);
		
		JButton btnVerIngles1 = new JButton("Ver correlativas");
		btnVerIngles1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acciones.mostrarCorrelativas(tecnicatura2, 7);
			}
		});
		btnVerIngles1.setBounds(491, 167, 150, 25);
		panel_1.add(btnVerIngles1);

		
		//////// MATEMATICA
		JLabel lblNewLabelMate = new JLabel(tecnicatura.get(4).getMateria());
		lblNewLabelMate.setBounds(91, 217, 121, 16);
		panel_1.add(lblNewLabelMate);

		JComboBox<String> comboBoxMate = new JComboBox<>();
		comboBoxMate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acciones.estadoMateria(comboBoxMate.getSelectedIndex(), tecnicatura2, 4);
			}
		});
		comboBoxMate.setModel(new DefaultComboBoxModel<String>(estado));
		comboBoxMate.setMaximumRowCount(2);	
		comboBoxMate.setBounds(224, 214, 244, 22);
		panel_1.add(comboBoxMate);

		JButton btnVerMate = new JButton("Ver correlativas");
		btnVerMate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acciones.mostrarCorrelativas(tecnicatura2, 8, 11);
			}
		});
		btnVerMate.setBounds(491, 213, 150, 25);
		panel_1.add(btnVerMate);		
		
	
		JButton btnNewButtonSiguiente = new JButton("Siguiente");
		btnNewButtonSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tecnicatura.complete(Acciones.totalAprobado(tecnicatura2));
			}
		});
		btnNewButtonSiguiente.setBounds(571, 255, 131, 49);
		panel_1.add(btnNewButtonSiguiente);

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("2do Cuatrimestre", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("3er Cuatrimestre", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("4to Cuatrimestre", null, panel_4, null);

		/*
		JProgressBar progressBar = new JProgressBar(0,19);
		progressBar.setBounds(0, 445, 796, 25);
		progressBar.setValue(0);
		progressBar.setStringPainted(true);
		contentPane.add(progressBar);
		*/
	}

}