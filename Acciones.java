package freeStyle;

import java.util.List;

public class Acciones {

	/**
	 * Recorre la lista contando la cantidad de materias aprobadas
	 * 
	 * @param tecnicatura
	 * @param totalAprobado
	 * @return
	 */
	
	public static int totalAprobado(List<Materia> tecnicatura) {	
		int totalAprobado = 0;
		
		for (int i = 0; i < 20; i++) {
			if(tecnicatura.get(i).isAprobado()) {
				totalAprobado++;
			}
		}
		return totalAprobado;
	}
	public static void estadoMateria(int estado, List<Materia> tecnicatura, int index) {
		if(estado == 1) {
			tecnicatura.get(index).setAprobado(true);
		} else {
			tecnicatura.get(index).setAprobado(false);
		}
	}
	
	public static void mostrarCorrelativas(List<Materia> tecnicatura2, int index) {
		Tecnicatura.mensaje(tecnicatura2.get(index).getMateria());  
	}
	
	public static void mostrarCorrelativas(List<Materia> tecnicatura2, int index, int index2) {
			Tecnicatura.mensaje(tecnicatura2.get(index).getMateria(), tecnicatura2.get(index2).getMateria());  
	}
	
	public static List<Materia> resetMaterias(List<Materia> tecnicatura) {

		for (int i = 0; i < 20; i++) {
			tecnicatura.get(i).setAprobado(false);
		}
		return tecnicatura;
	}
}
