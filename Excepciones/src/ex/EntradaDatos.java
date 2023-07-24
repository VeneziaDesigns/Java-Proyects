package ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		
		System.out.println("¿Que deseas hacer?");
		System.out.println("1. Introducir datos");
		System.out.println("2. salir del programa");
		
		Scanner entrada = new Scanner(System.in);
		
		int decision = entrada.nextInt();
		
		if (decision == 1) {
			
			try {
				pedirDatos();
			} catch(Exception e) {
				System.out.println("Que has introducido en la edad?");
			}
			

		} else {
			
			System.out.println("Adios");
			
			System.exit(0);
		}
		
		entrada.close();

	}
	
	static void pedirDatos() throws InputMismatchException{
		
		//try {
		
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Introduce tu nombre");
			
			String nombreUsuario=entrada.nextLine();
			
			System.out.println("Introduce tu edad");
			
			int edad = entrada.nextInt();
			
			System.out.println("Hola " + nombreUsuario + ". El año que viene tendras " + (edad+1) + " años");
			
			entrada.close();
		
		//} catch(Exception e) {
			//System.out.println("Que has introducido en la edad?");
		//}
		System.out.println("Hemos terminado");
	}

}
