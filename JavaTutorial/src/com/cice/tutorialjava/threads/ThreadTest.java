package com.cice.tutorialjava.threads;

public class ThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Notación Lambda
		new Thread(()->{
			while(true){//bucle infinito
				System.out.println("Ejecutando hilo1....");
			}
			
		}).start();
		//IMplementación anónima de la interfaz Runnable
		new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true){//bucle infinito
					System.out.println("Ejecutando hilo2....");
				}
			}
			
		}).start();

	}

}
