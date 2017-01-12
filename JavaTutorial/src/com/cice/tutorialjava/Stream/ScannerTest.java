package com.cice.tutorialjava.Stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int suma=0;
		
		try {
			Scanner sc=new Scanner(new FileInputStream("palabras2.txt"));
			//sc.useDelimiter("\\s*bla\\s*");
			while(sc.hasNext()){
				try{
				  	int x=sc.nextInt();
				  	System.out.println("Entero:" + x);
				  	suma=suma+x;
				} catch(InputMismatchException e){
						sc.next();
					}
		    }
				//System.out.println(sc.next());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("suma=" +suma); 

	}

}
