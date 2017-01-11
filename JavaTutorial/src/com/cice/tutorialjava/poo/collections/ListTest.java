package com.cice.tutorialjava.poo.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cice.tutorialjava.poo.interfaces.Racional;



public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> myStringList=new ArrayList<>();
		//buscamos una que implemente List
		List<Racional> myRacionalList=new ArrayList<>();
		myStringList.add("Luis");
		myStringList.add("Luis");
		myStringList.add("Lola");
		myStringList.add("Juan");
		myStringList.add("Lui");
		System.out.println("Recorriendo la lista con for indexado");
		for(int i=0; i<=myStringList.size();i++){
			System.out.println(myStringList.get(i));
		}
		for(String str:myStringList){
			System.out.println(str);
		}
		System.out.println("Recorriendo la lista con iterador");
		Iterator<String> it=myStringList.iterator();
		while(it.hasNext()){
			String str=it.next();
			System.out.println(str);
		}
		System.out.println("Recorriendo la lista con racionales");
		myRacionalList.add(new Racional(2,3));
		myRacionalList.add(new Racional(1,3));
		myRacionalList.add(new Racional(2,7));
		myRacionalList.add(new Racional(9,3));
		myRacionalList.add(new Racional(2,3));
		myRacionalList.add(new Racional(2,6));
		Iterator<Racional> it2=myRacionalList.iterator();
		while(it2.hasNext()){
			System.out.println(it2.next());
		}
	}

}
