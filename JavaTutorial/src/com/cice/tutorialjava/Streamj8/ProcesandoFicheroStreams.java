package com.cice.tutorialjava.Streamj8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ProcesandoFicheroStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Files.lines(Paths.get("palabras2.txt")).forEach(line->System.out.println(line));
			//fitramos líneas que tenga más de 10 car
			Files.lines(Paths.get("palabras2.txt")).filter(line->line.length()>10).forEach(line->System.out.println(line));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
