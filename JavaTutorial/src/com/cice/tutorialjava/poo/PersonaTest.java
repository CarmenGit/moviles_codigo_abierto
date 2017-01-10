package com.cice.tutorialjava.poo;

public class PersonaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Construyendo un objeto de tipo Persona...");
	
		Persona p2= new Persona("Luis",3);
		Persona p1= new Persona("Juan", 43, "Calle Arcas");
		System.out.println("Objeto Persona construido.."); 
		p1.print();
		p1.setNombre("Julia");
		p1.setEdad(34);
		p1.setDomicilio("Calle Río Duero 87");
		p1.print();
	}

}
