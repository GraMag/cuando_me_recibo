package freeStyle;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class Visual {


	public static Component labelMateria(List<Materia> tecnicatura2, int indexMateria, int y) {
		JLabel lblNewLabel = new JLabel(tecnicatura2.get(indexMateria).getMateria());
		lblNewLabel.setBounds(81, y, 125, 16);
		return lblNewLabel;
	}
	
	public static Component comboMateria(List<Materia> tecnicatura2, int indexMateria, int y) {
		String[] estado = {"No aprobada", "Aprobada"};
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acciones.estadoMateria(comboBox.getSelectedIndex(), tecnicatura2, indexMateria);
			}
		});
		comboBox.setModel(new DefaultComboBoxModel<String>(estado));
		comboBox.setMaximumRowCount(2);
		comboBox.setBounds(224, y, 244, 22);
		return comboBox;
	}
	
	public static Component bottonMateria(List<Materia> tecnicatura2, int indexCorrelativa, int y){
		JButton btnVer = new JButton("Ver correlativas");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acciones.mostrarCorrelativas(tecnicatura2, indexCorrelativa);
			}
		});
		btnVer.setBounds(491, y, 150, 25);
		return btnVer;
	}
	
	public static Component bottonMateria(List<Materia> tecnicatura2, int indexCorrelativaA, int indexCorrelativaB, int y){
		JButton btnVer = new JButton("Ver correlativas");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acciones.mostrarCorrelativas(tecnicatura2, indexCorrelativaA, indexCorrelativaB);
			}
		});
		btnVer.setBounds(491, y, 150, 25);
		return btnVer;
	}
	
	public static Component bottonMateria(List<Materia> tecnicatura2, int indexCorrelativaA, int indexCorrelativaB, int indexCorrelativaC, int y){
		JButton btnVer = new JButton("Ver correlativas");
		btnVer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acciones.mostrarCorrelativas(tecnicatura2, indexCorrelativaA, indexCorrelativaB, indexCorrelativaC);
			}
		});
		btnVer.setBounds(491, y, 150, 25);
		return btnVer;
	}
	
	public static Component bottonSiguiente(List<Materia> tecnicatura2, String accion) {
		JButton btnNewButtonSiguiente = new JButton(accion);
		btnNewButtonSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tecnicatura.complete(Acciones.totalAprobado(tecnicatura2));
			}
		});
		btnNewButtonSiguiente.setBounds(571, 255, 131, 49);
		return btnNewButtonSiguiente;
	}
}
