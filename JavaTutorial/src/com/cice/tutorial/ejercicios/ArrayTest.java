package com.cice.tutorial.ejercicios;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] miMatriz={"Perro", "Gato","Pez","Rinoceronte","Elefante","Araña","Buitre","Tortuga","Tigre","Ornitorrinco"};
		
		String cadenaMasCorta=miMatriz[0];
		String cadenaMasLarga=miMatriz[0];;
		for (int i=0;i<miMatriz.length;i++){
			if (miMatriz[i].length()<=cadenaMasCorta.length()){
				cadenaMasCorta=miMatriz[i];
			}else if (miMatriz[i].length()>=cadenaMasLarga.length()){
				cadenaMasLarga=miMatriz[i];
			}
			
		} 
		
		System.out.println("La cadena más corta es: " + cadenaMasCorta);
		System.out.println("La cadena más larga es: " + cadenaMasLarga);
	}
		


}
