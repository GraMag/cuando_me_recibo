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
		int total = 0;
		
		List<Materia> tecnicatura = new ArrayList<Materia>();
		
		tecnicatura = Materia.listaMaterias(tecnicatura);
		
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
				tecnicatura = Materia.resetMaterias(tecnicatura);
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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		// TITULO
		JLabel lblNewLabel = new JLabel("Tecnicatura en programaci\u00F3n");
		lblNewLabel.setBounds(39, 13, 729, 85);
		lblNewLabel.setFont(new Font("Colonna MT", Font.PLAIN, 55));
		contentPane.add(lblNewLabel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(12, 101, 758, 347);
		contentPane.add(tabbedPane);

		//PESTANIA CUATRIMESTRE 1

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("1er Cuatrimestre", null, panel_1, null);
		panel_1.setLayout(null);
		
		JComboBox comboBoxProg1 = new JComboBox();
		
		comboBoxProg1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String yaTa = (String) comboBoxProg1.getSelectedItem();
				if(yaTa.equals("Aprobada")) {
					tecnicatura.get(0).setAprobado(true);
					
				} else {
					tecnicatura.get(0).setAprobado(false);
				}
				total = Materia.totalAprobado(tecnicatura.get(0).isAprobado(), total);
			}
		});
		comboBoxProg1.setModel(new DefaultComboBoxModel(estado));
		comboBoxProg1.setMaximumRowCount(2);
		comboBoxProg1.setBounds(224, 34, 244, 22);
		panel_1.add(comboBoxProg1);
		
		JButton btnVerProg1 = new JButton("Ver correlativas");
		String materia5 = tecnicatura.get(5).getMateria();
		String materia6 = tecnicatura.get(6).getMateria();
		btnVerProg1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tecnicatura.mensaje(materia5, materia6);  
			}
		});
		btnVerProg1.setBounds(491, 33, 150, 25);
		panel_1.add(btnVerProg1);
		
		JButton btnVerLab1 = new JButton("Ver correlativas");
		btnVerLab1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tecnicatura.mensaje(materia5, materia6);
			}
		});
		btnVerLab1.setBounds(491, 79, 150, 25);
		panel_1.add(btnVerLab1);
		
		JButton btnVerSPD = new JButton("Ver correlativas");
		String materia9 = tecnicatura.get(9).getMateria();
		btnVerSPD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tecnicatura.mensaje(materia9);
			}
		});
		btnVerSPD.setBounds(491, 122, 150, 25);
		panel_1.add(btnVerSPD);
		
		JButton btnVerIngles1 = new JButton("Ver correlativas");
		String materia7 =  tecnicatura.get(7).getMateria();
		btnVerIngles1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tecnicatura.mensaje(materia7);
			}
		});
		btnVerIngles1.setBounds(491, 167, 150, 25);
		panel_1.add(btnVerIngles1);
		
		JButton btnVerMate = new JButton("Ver correlativas");
		String materia8 =  tecnicatura.get(8).getMateria();
		String materia11 =  tecnicatura.get(11).getMateria();
		btnVerMate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tecnicatura.mensaje(materia8, materia11);
			}
		});
		btnVerMate.setBounds(491, 213, 150, 25);
		panel_1.add(btnVerMate);
		
		JLabel lblNewLabelProg1 = new JLabel(tecnicatura.get(0).getMateria());
		lblNewLabelProg1.setBounds(91, 37, 121, 16);
		panel_1.add(lblNewLabelProg1);
		
		JLabel lblNewLabelLab1 = new JLabel(tecnicatura.get(1).getMateria());
		lblNewLabelLab1.setBounds(91, 83, 121, 16);
		panel_1.add(lblNewLabelLab1);
		
		JLabel lblNewLabelSPD = new JLabel(tecnicatura.get(2).getMateria());
		lblNewLabelSPD.setBounds(91, 126, 121, 16);
		panel_1.add(lblNewLabelSPD);
		
		JLabel lblNewLabelIngles1 = new JLabel(tecnicatura.get(3).getMateria());
		lblNewLabelIngles1.setBounds(91, 171, 121, 16);
		panel_1.add(lblNewLabelIngles1);
		
		JLabel lblNewLabelMate = new JLabel(tecnicatura.get(4).getMateria());
		lblNewLabelMate.setBounds(91, 217, 121, 16);
		panel_1.add(lblNewLabelMate);
		
		JComboBox comboBoxLab1 = new JComboBox();
		comboBoxLab1.setModel(new DefaultComboBoxModel(estado));
		comboBoxLab1.setMaximumRowCount(2);
		comboBoxLab1.setBounds(224, 80, 244, 22);
		panel_1.add(comboBoxLab1);
		
		JComboBox comboBoxSPD = new JComboBox();
		comboBoxSPD.setModel(new DefaultComboBoxModel(estado));
		comboBoxSPD.setMaximumRowCount(2);
		comboBoxSPD.setBounds(224, 123, 244, 22);
		panel_1.add(comboBoxSPD);
		
		JComboBox comboBoxIngles1 = new JComboBox();
		comboBoxIngles1.setModel(new DefaultComboBoxModel(estado));
		comboBoxIngles1.setMaximumRowCount(2);
		comboBoxIngles1.setBounds(224, 168, 244, 22);
		panel_1.add(comboBoxIngles1);
		
		JComboBox comboBoxMate = new JComboBox();
		comboBoxMate.setModel(new DefaultComboBoxModel(estado));
		comboBoxMate.setMaximumRowCount(2);
		comboBoxMate.setBounds(224, 214, 244, 22);
		panel_1.add(comboBoxMate);
		
		JButton btnNewButtonSiguiente = new JButton("Siguiente");
		btnNewButtonSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tecnicatura.complete(total);
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

		
		JProgressBar progressBar = new JProgressBar(0,19);
		progressBar.setBounds(0, 445, 796, 25);
		progressBar.setValue(total);
		contentPane.add(progressBar);
		
	}

}