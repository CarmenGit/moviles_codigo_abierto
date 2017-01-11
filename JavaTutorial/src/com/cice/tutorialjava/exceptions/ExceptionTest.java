package com.cice.tutorialjava.exceptions;
import java.io.FileInputStream;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		FileInputStream in = new FileInputStream("data.txt");
		}catch(FileNotFounException e){
			
		}

	}

}
