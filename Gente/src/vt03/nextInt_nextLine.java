package vt03;

import java.util.Scanner;

public class nextInt_nextLine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Escribe un numero entero: ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("Se guardara en el objeto String texto, lo que vas a escribir?: ");
		String texto = sc.nextLine();
		
		System.out.println("El numero que has introducido es "+num);
		if (texto.isEmpty()) {
			System.err.println("Te has comido el salto de linea; nextInt solo lee el entero,\n" +
		 "y despues del entero hay un salto de linea que introduce el usuario\n"+
					"para confirmar que introdujo el numero");
			System.out.println("Solucion: leer este salto de linea, para limpiar el canal/buffer");
		} else {
			System.out.println("Tu respuesta ha sido \""+texto+"\" se va a mostrar el texto introducido");
		}
		
		sc.close();
	}

}
