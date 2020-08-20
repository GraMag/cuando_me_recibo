package freeStyle;

import java.util.ArrayList;
import java.util.List;

public class Materia {

	private int id;
	private String materia;
	private boolean aprobado;
	
	
	public Materia() {

		this.id = 0;
		this.materia = "";
		this.aprobado = false;
	}


	public Materia(int id, String materia, boolean aprobado) {
		this.id = id;
		this.materia = materia;
		this.aprobado = aprobado;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}


	public boolean isAprobado() {
		return aprobado;
	}


	public void setAprobado(boolean aprobado) {
		this.aprobado = aprobado;
	}
	
	public static List<Materia> listaMaterias(List<Materia> tecnicatura) {
		

		//final List<Materia> tecnicatura = new ArrayList<Materia>();
		
		String[] materias = { "Programacion I", "Laboratorio I", "SPD", "Ingles I", "Matematica", "Programacion II",
				"Laboratorio II", "Ingles II", "Estadistica", "Arquitectura y SO",
				"Metodologia de la investigacion", "Organizacion Contable de la Empresa",
				"Elementos de investigacion Operativa", "Organizacion Empresarial", "Programacion III",
				"Laboratorio III", "Legislacion", "Metodologia de Sistemas", "Diseño de BBDD",
				"Laboratorio IV" };
		
		
		for (int i = 0; i < 20; i++) {
			tecnicatura.add(new Materia(i, materias[i], false));
			System.out.println(tecnicatura.get(i).getId() + " " + tecnicatura.get(i).getMateria() + " " + tecnicatura.get(i).isAprobado());
		}
		return tecnicatura;
	}

	public static List<Materia> resetMaterias(List<Materia> mate) {

		for (int i = 0; i < 20; i++) {
			mate.get(i).setAprobado(false);
		}
		return mate;
	}
/*
	public void totalAprobado(Materia[] mate) {

		int aprobado = 0;
		float promedio = 0;

		for (int i = 0; i < mate.length; i++) {
			if (mate[i].isAprobado()) {
				aprobado++;
			}
		}

		promedio = aprobado / mate.length;

		System.out.println("Materias aprobadas: " + aprobado + "Carrera completa: " + promedio);
	}
	
	public static int totalAprobado(String estado, int totalAprobado) {	
		
		
		if(estado.equals("Aprobada")) {
			totalAprobado++;
		} else {
			totalAprobado--;
		}
		System.out.println(totalAprobado + " " + estado);
		return totalAprobado;
	}*/
	public static int totalAprobado(boolean aprobado , int totalAprobado) {	
		
		
		if(aprobado) {
			totalAprobado++;
		} else {
			totalAprobado--;
		}
		System.out.println(totalAprobado + " " + aprobado); //borrar cuando funcione
		return totalAprobado;
	}
}
