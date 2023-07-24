package vt02;

import java.util.Scanner;

public class EjemploClase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int notaEvCont, notaExamen;
		float notaFinal = 0;
		
		System.out.println("Introduce tu nota de la evaluacion continua: ");
		notaEvCont = sc.nextInt();
		System.out.println("Introduce tu nota del examen: ");
		notaExamen = sc.nextInt();
		
		/*Para multiplicar por decimales es necesario 
		  ponerle al final "f" de float o (float) delante*/
		notaFinal = (float) ((notaEvCont * 0.4) + (notaExamen * 0.6));
		
		sc.close();
		
		if (notaExamen >= 5){
			System.out.println("La nota de la evaluacion continua es " + notaEvCont + 
					", la nota del examen es " + notaExamen + " y la media es " + notaFinal);			
		}else {
			System.out.println("A recuperar");
		}
		
		/*Tambien se puede hacer con if, else if y else,
		  pero en este caso mejor un switch*/
		
		switch (Math.round(notaFinal)) {
		case 10:
			System.out.println("Matricula de honor");
			break;
		case 9:
			System.out.println("Sobresaliente");
			break;
		case 8:
			System.out.println("Notable Alto");
			break;
		case 7:
			System.out.println("Notable Bajo");
			break;
		case 6:
			System.out.println("Bien");
			break;
		case 5:
			System.out.println("Suficiente");
			break;
		default:
			System.out.println("Has suspendido");
			break;	
		}
	}

}
