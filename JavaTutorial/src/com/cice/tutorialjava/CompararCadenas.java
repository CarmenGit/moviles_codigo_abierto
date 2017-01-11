package com.cice.tutorialjava;

public class CompararCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//str1 y str2 apuntan a bloques de memoria distintos aunque su contenido sea el mismo
		String str1= new String("Luis");
		String str2=new String("Luis");
		System.out.println(str1.equals(str2));

	}

}
