package freeStyle;

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

}
