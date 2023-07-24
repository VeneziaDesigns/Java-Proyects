package prueba;

import java.util.Scanner;

import ajedrezConClases.Tablero;

import personas.Personas;

public class MainImportarClasesProyectos  {
	
	public static void muestraMenu() {
		System.out.println("==== Menu ====");
		System.out.println("1. Crear objeto Clase Tablero importandola de otro proyecto");
		System.out.println("2. Crear objeto Clase Personas importandola de otro proyecto");
		System.out.println("3. Exit");
		System.out.println("Enter your option: ");
	}
	
	public static void crearTablero() {
		Tablero tab = new Tablero();
		System.out.println("Vamos a mostrar el tablero: ");
		tab.mostrarTablero();
	}
	
	public static Personas crearPersona() {
		Personas Ana=new Personas("Ana", "Casquero", "Havrylova", 'M', 30, "Monteperdido");
		return Ana;	
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int option = 0;
		
		do {
			muestraMenu();
			option = sc.nextInt();
			
			switch(option) {
				case 1:
					System.out.println("Vamos a crear un objeto de la clase TableroAjedrez");
					crearTablero();
					break;
				case 2:
					System.out.println("Vamos a crear on objeto de la clase personas");
					Personas per = crearPersona();
					System.out.println(per.mostrarDatos());
					break;
				case 3:
					System.out.println("Un saludin,\n Goodbye!");
					break;
				default:
					System.out.println("Invalid option, plase try again");
					break;
			}
		} while (option != 3);
		sc.close();
	}

}
