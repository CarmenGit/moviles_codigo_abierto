package com.cice.tutorialjava.Streamj8;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ProcesandoFicheroStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*String[]tokens ="kljñlj ljñlds".split("\\s+");
		for(String token:tokens){
			
		}
		Stream.of(tokens)
				.forEach(token->System.out.println(token));
		*/
		try {
			//Files.lines(Paths.get("palabras2.txt")).forEach(line->System.out.println(line));
			//fitramos líneas que tenga más de 10 car
			//Files.lines(Paths.get("palabras2.txt")).filter(line->line.length()>10)
			//	.forEach(line->System.out.println(line));
			
			
			Serializable opt=Files.lines(Paths.get("palabras2.txt"))
				.flatMap(line->Stream.of(line.split("\\s+")))
				.filter(token->{
								try{
									//dejamos pasar solo las palabras que pueden convertirse a double
									Double.parseDouble((String)token);
									return true;
					
									}catch(NumberFormatException e){
											return false;
									}
								}
				//cambiamos el tipo de los eventos para poder sumarlos
				).mapToDouble(x->Double.parseDouble(x.toString()))
				.reduce(0,(x,y)->x+y);
			System.out.println(opt);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
