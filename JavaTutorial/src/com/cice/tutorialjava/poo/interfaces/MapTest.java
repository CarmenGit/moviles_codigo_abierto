package com.cice.tutorialjava.poo.interfaces;

import java.util.Map;
import java.util.Set;

import com.cice.tutorialjava.poo.Persona;

import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//map es una interfaz...hay que buscar una implementación
		Map<String,Persona> myPersonMap=new HashMap<>();
		myPersonMap.put("p-8001", new Persona("Luis", 24));
		myPersonMap.put("p-8001", new Persona("Lola", 26));
		myPersonMap.put("p-8002", new Persona("Eva", 34));
		myPersonMap.put("p-8003", new Persona("Lolo", 54));
		myPersonMap.put("p-8004", new Persona("Manuel", 44));
		//keyset devuelve el conjunto claves
		Set<String>keys=myPersonMap.keySet();
		for(String key:keys){
			Persona p=myPersonMap.get(key);
			p.print();
		}
	}

}
