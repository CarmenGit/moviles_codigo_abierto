package com.cice.tutorialjava.poo.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

import com.cice.tutorialjava.poo.Persona;

public class OrdenacionPersonasTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Persona> list=new ArrayList<>();
		list.add(new Persona("Luis", 24));
		list.add(new Persona("Juan", 28));
		list.add(new Persona("lola", 26));
		list.add(new Persona("Paco", 14));
		list.add(new Persona("Eva", 44));
		Collections.sort(list, new Comparator<Persona>(){
			
			public int compare(Persona a1, Persona a2) {
				return a1.getEdad()-a2.getEdad();
			}
		});
		for(Persona p:list){
			p.print();
		}
		
	}

}
