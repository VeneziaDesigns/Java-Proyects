package vt03;

import java.util.Scanner;

import vt02.Libro;

public class LibroPasandoLaClaseScanner {
	
	public static Libro pedirDatos(Scanner sc) {
		
		String titulo, autor, editorial;
		int isbn, anio, numPags;
		
		System.out.println("Introduce los datos del libro 3:");
		System.out.print("\t- ISBN: ");
		isbn = sc.nextInt();
		
		sc.nextLine(); //Recogemos el retorno de carro tras insertar los numeros por teclado
		
		System.out.print("\t- Titulo: ");
		titulo = sc.nextLine();
		
		System.out.print("\t- Autor: ");
		autor = sc.nextLine();
		
		System.out.print("\t- Año de publicacion: ");
		anio = sc.nextInt();
		
		sc.nextLine(); //Recogemos el retorno de carro tras insertar los numeros por teclado
		
		System.out.print("\t- Editorial: ");
		editorial = sc.nextLine();
		
		System.out.print("\t- Numero de paginas: ");
		numPags = sc.nextInt();
		
		sc.nextLine(); //Recogemos el retorno de carro tras insertar los numeros por teclado
		
		return new Libro(isbn, titulo, autor, anio, editorial, numPags);
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Libro elQuijote=new Libro(123456, "Miguel de Cervantes", "Don Quijote", 1665, "Planeta de agostini", 2564);
		Libro harryPetas=new Libro(654321, "J.K.Rowling", "Harry Petas 1", 1997, "RBA", 589);
		
		Libro libro3 = pedirDatos(sc);
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Los datos de los libros son");
		System.out.println(elQuijote.toString());
		System.out.println(harryPetas.toString());
		System.out.println(libro3.toString());
		
		sc.close();
	}

}
