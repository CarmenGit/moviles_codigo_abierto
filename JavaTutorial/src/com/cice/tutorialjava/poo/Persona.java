package com.cice.tutorialjava.poo;

public class Persona {
	//Un miembro de la clase es un atributo o un método
	private String nombre;
	private int edad;
	private String domicilio;
	//Los métodos definen la funcionalidad de un objeto
	
	//Un constructor es un método especial que solo se puede invocar en la construcción
	//De un objeto y define la forma en que el objeto se inicializa
	//Debe llamarse igual que la clase
	
	public Persona(String nombre, int edad){
		this.nombre = nombre;
		setEdad(edad);
	}
	public Persona(String nombre, int edad, String domicilio){
		this.nombre = nombre;
		setEdad(edad);
		setDomicilio(domicilio);
	}
	
	//modificador void para indicar que el método no devuelve nada
	void print(){
		System.out.println("Persona[nombre: " + nombre + ", domicilio: " + domicilio + " ,edad:" + edad + "]");
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public void setEdad(int edad) {
		if(edad>=0)
		  this.edad = edad;
	}

	//Método getter, accede al valor del atributo edad, devuelve un entero
	public int getEdad(){
		return edad;
	}
}
