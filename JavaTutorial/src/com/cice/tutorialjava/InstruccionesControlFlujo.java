package com.cice.tutorialjava;

public class InstruccionesControlFlujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Alternativa Simple
		int puntuacion=3;
		if (puntuacion<5){
			System.out.println("Suspenso");
		}else{
			
			System.out.println("Aprobado");

		}
		
		
		switch (puntuacion){
			case 0:
				System.out.println("Ni palo al agua");
				break;
			case 1:
				System.out.println("Suspenso");
				break;
			case 2:
				System.out.println("Suspenso");
				break;
			case 3:
				System.out.println("Casi casi");
				break;
			case 4:
				System.out.println("Casi casi");
				break;
			case 5:
				System.out.println("Aprobado");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 7:
				System.out.println("Notable");
				break;
			case 8:
				System.out.println("Notable");
				break;
			case 9:
				System.out.println("Sobr");
				break;
			case 10:
				System.out.println("Matrícula");
				break;
			default:
				System.out.println("Puntuación no válida");
				
				
		}
		
		puntuacion=0;
		while (puntuacion<10){
			System.out.println("Puntuación final " + puntuacion);
			puntuacion++;
		}
	}

}

