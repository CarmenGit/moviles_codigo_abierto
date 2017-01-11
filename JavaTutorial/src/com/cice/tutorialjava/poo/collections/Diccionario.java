package com.cice.tutorialjava.poo.collections;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Diccionario {
	//Character es la clase de objetos de tipo char pq la clave ene que ser una clase 
	Map<Character,List<String>> buffer;
	
	public Diccionario(String file) throws FileNotFoundException{
		buffer=new HashMap<>();
		FileInputStream in = new FileInputStream(file);
		Scanner sc=new Scanner(in);
		load(sc);
	}
	
	private void load(Scanner sc) {
		while(sc.hasNext()){
		 String line=sc.nextLine();	
		 
		 //Guardar la línea leída en el buffer
		 char c = line.charAt(0);
			List<String> l=buffer.get(c);
			if (l==null){
				l=new ArrayList<>();
				buffer.put(c, l);
			}
			l.add(line);
		 
		}
		
		
	}
	

}
