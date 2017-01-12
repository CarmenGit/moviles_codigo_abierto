package com.cice.tutorialjava.Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fs=System.getProperty("file.separator");
		File file=new File("src" + fs +"com" + fs + "cice" + fs + "tutorialjava" + fs+ "ArrayTest.java");
		
		if(file.exists()){
			try(InputStream in = new FileInputStream(file);
				OutputStream out=new FileOutputStream("copy.txt")){
				
			    int bytesLeidos=0;
			    byte[] buffer=new byte[1024];
			    System.out.println("Iniciando la copia de ficheros....");
			    /*while((byteLeido=in.read())!=-1){
			    	out.write(byteLeido);
			    }*/
			
			do{
				bytesLeidos=in.read(buffer);
				if(bytesLeidos>0){
					out.write(buffer, 0, bytesLeidos);
				}
			}while(bytesLeidos==buffer.length);
			System.out.println("Copia de ficheros terminada....");
			/*InputStream in=null;
			try{
				in = new FileInputStream(file);
			*/	
				//OutputStream out=new FileOutputStream("copy.txt");
			}catch (FileNotFoundException e){
				e.printStackTrace();
			}catch(IOException e1){
				e1.printStackTrace();
			}
				
				
		/*	}finally{
				try{
					if(in!=null)in.close();
					
				} catch (IOException e){
					e.printStackTrace();
				}
			}
			*/
		}
	
		
	}

	}
