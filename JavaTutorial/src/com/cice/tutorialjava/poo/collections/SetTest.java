package com.cice.tutorialjava.poo.collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.cice.tutorialjava.poo.interfaces.Racional;



public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> myStringSet=new HashSet<>();
		Set<Racional> myRacionalSet=new HashSet<>();
		//buscamos una que implemente List
		
		myStringSet.add("Luis");
		myStringSet.add("Luis");
		myStringSet.add("Lola");
		myStringSet.add("Juan");
		myStringSet.add("Lui");
		System.out.println("Recorriendo la lista con for e");
		
		for(String str:myStringSet){
			System.out.println(str);
		}
		System.out.println("Recorriendo la lista con iterador");
		Iterator<String> it=myStringSet.iterator();
		while(it.hasNext()){
			String str=it.next();
			System.out.println(str);
		}
		System.out.println("prueba con racionales");
		myRacionalSet.add(new Racional(2,3));
		myRacionalSet.add(new Racional(1,3));
		myRacionalSet.add(new Racional(2,7));
		myRacionalSet.add(new Racional(9,3));
		myRacionalSet.add(new Racional(2,3));
		myRacionalSet.add(new Racional(2,6));
		Iterator<Racional> it2=myRacionalSet.iterator();
		System.out.println("recorriendo la lista con un iterador...");
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
		System.out.println(new String("Luis").hashCode());
		System.out.println(new String("Luis").hashCode());
		System.out.println(new String("Lola").hashCode());
	}

}