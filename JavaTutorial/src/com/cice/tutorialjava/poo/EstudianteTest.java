package com.cice.tutorialjava.poo;

public class EstudianteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante e1 = new Estudiante("Juanita", 23, "222222", "POO", "Android", "IOS");
		System.out.println("Número de cursos de estudiante1: " + e1.getNumeroCursos());
		Estudiante e2 = new Estudiante("Manolo", 70, "11111");
		System.out.println("Número de cursos de estudiante2: " + e2.getNumeroCursos());
		e1.print();
		System.out.println("Añadiendo curso Phyton..........");
		e1.addCurso("Python");
		e1.print();
		e1.mostrarCursos();
		System.out.println("Eliminando curso IOS...........");
		e1.removeCurso("IOS");
		e1.print();
		e1.mostrarCursos();
	}

}
