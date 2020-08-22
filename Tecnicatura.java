package freeStyle;

import javax.swing.JOptionPane;

public class Tecnicatura {

	public static void mensaje() {
		JOptionPane.showMessageDialog(null, "No tiene correlativas", "Correlativas", JOptionPane.INFORMATION_MESSAGE);
	}
	public static void mensaje(String materia) {
		JOptionPane.showMessageDialog(null, ("- " + materia), "Correlativas", JOptionPane.INFORMATION_MESSAGE);
	}
	public static void mensaje(String materia, String materia2) {
		JOptionPane.showMessageDialog(null, ("- " + materia + "\n- " + materia2), "Correlativas", JOptionPane.INFORMATION_MESSAGE);
	}
	public static void mensaje(String materia, String materia2, String materia3) {
		JOptionPane.showMessageDialog(null, ("- " + materia + "\n- " + materia2 + "\n- " + materia3), "Correlativas", JOptionPane.INFORMATION_MESSAGE);
	}
	public static void complete(int total) {
		JOptionPane.showMessageDialog(null, "Materias aprobadas: " + total + "/20", "Total", JOptionPane.INFORMATION_MESSAGE);
	}
	public static void about() {
		JOptionPane.showMessageDialog(null, "Version 1.1\n\nBy Maggie \n\n2020", "Programita", JOptionPane.INFORMATION_MESSAGE);
	}
}
