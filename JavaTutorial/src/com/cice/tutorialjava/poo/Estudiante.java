package com.cice.tutorialjava.poo;

public class Estudiante extends Persona {
	

	//ATRIBUTOS añadidos además de los de Persona
	private String nie;
	private String[] cursos;

	//cursos puede tener 0, 1, 2,...strings
	public Estudiante(String nombre, int edad,String nie, String...cursos) {
		//super hace referencia al objeto de la superclase, a su constructor
		super(nombre, edad);
		this.nie= nie;
		// TODO Auto-generated constructor stub
		this.cursos=cursos;
	}
	public int getNumeroCursos(){
		return cursos.length;
	}
	public String getNie() {
		return nie;
	}
	public void setNie(String nie) {
		this.nie = nie;
	}
	
	public void mostrarCursos(){
		for(int i=0; i<cursos.length; i++){
			System.out.println(cursos[i]);
		}
	}
	
	public void addCurso(String curso){
		//copiamos la matriz antes de hacer una nueva referencia
		String[] copia = cursos;
		//una nueva matriz
		cursos=new String[cursos.length+1];
		//para no perder el valor de i después del for
		int i;
		for(i=0; i<copia.length; i++){
			cursos[i]=copia[i];
		}
		cursos[i]=curso;
	}
	
	/**
	 * Elimina el parámetro curso del atributo cursos, ajustando su tamaño
	 * @param curso representa el curso que se desea eliminar del atributo cursos
	 */
	
	public void removeCurso(String curso){
		/*String[] copia = cursos;
		cursos=new String[cursos.length-1];
		int j=0;
		for(int i=0; i<copia.length; i++){
			if(!curso.equals(copia[i])){
				cursos[j]=copia[i];
				j++;
		*/	
		 String[] newCursos=cursos.length>0? 
				 new String[cursos.length-1]:null;
		 if(newCursos==null)return;
		 for (int i=0;i<cursos.length; i++){
		      if(cursos[i].equals(curso)){
		    	  for(int j=i+1;j<cursos.length;j++){
		    		newCursos[j-1]=cursos[j];  
		    	  }
		    	  cursos=newCursos;
		    	  return;
		      }else{
		    	  try{
		    		  
		    	  newCursos[i]=cursos[i];
		    	  }catch(ArrayIndexOutOfBoundsException e){
		    		  return;
		    	  }
		      }
		 }
		
	}
	public void print(){
		System.out.println("Alumno[" + getNombre() + ", edad: " + getEdad() + ", domicilio: " + getDomicilio() +
				", NIE: " + getNie() + ", numero cursos: " + getNumeroCursos() + "]");
	}
}
