package freeStyle;

import javax.swing.JOptionPane;

public class Tecnicatura {
	
	/**
	 *  Mensaje sin correlativas
	 */
	public static void mensaje() {
		JOptionPane.showMessageDialog(null, "No tiene correlativas", "Correlativas", JOptionPane.INFORMATION_MESSAGE);
	}
	
	/**
	 * Mensaje materias con 1 correlativa
	 * @param materia
	 */
	public static void mensaje(String materia) {
		JOptionPane.showMessageDialog(null, ("- " + materia), "Correlativas", JOptionPane.INFORMATION_MESSAGE);
	}
	
	/**
	 * Mensaje materias con 2 correlativas
	 * @param materia
	 * @param materia2
	 */
	public static void mensaje(String materia, String materia2) {
		JOptionPane.showMessageDialog(null, ("- " + materia + "\n- " + materia2), "Correlativas", JOptionPane.INFORMATION_MESSAGE);
	}
	
	/**
	 *  Mensaje materias con 3 correlativas
	 * @param materia
	 * @param materia2
	 * @param materia3
	 */
	public static void mensaje(String materia, String materia2, String materia3) {
		JOptionPane.showMessageDialog(null, ("- " + materia + "\n- " + materia2 + "\n- " + materia3), "Correlativas", JOptionPane.INFORMATION_MESSAGE);
	}
	
	/**
	 * Mensaje con cantidad de materias aprobadas
	 * @param total
	 */
	public static void complete(int total) {
		double prom = 0;
		
		if(total != 0) {
			prom = (double)total / 20 * 100;
			System.out.println(prom);
		}
		JOptionPane.showMessageDialog(null, "Materias aprobadas: " + (int)total + "/20 (" + prom + "%)", "Total", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void about() {
		JOptionPane.showMessageDialog(null, "Version 1.2\n\nBy Maggie \n\n2020", "Programita", JOptionPane.INFORMATION_MESSAGE);
	}
}


/*
 * Cosas que AGREGAR:
 *  - -  Bloquear combobox si la materia anterior no esta aprobada
 *  - -  Reiniciar combo box 
 *  - -  Siguiente no va a siguiente
 *  - -  Mostrar % completo al tocar siguiente 
*/