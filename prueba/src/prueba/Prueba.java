package prueba;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		
		/*CARACTERES ESCAPE
		 * \n = nueva linea
		 * \t = tabulador
		 * \\ = contrabarra
		 * \" = comillas dobles
		 * \' = comillas simples
		 * \r = retorno de carro
		 * */

		/*Para introducir datos por consola hay que utilizar 
		la clase Scanner que utiliza el constructor Scanner*/
		Scanner scanner = new Scanner(System.in);
		//Console.WriteLine();
		System.out.println("Introduce una línea...");
		String line = scanner.nextLine();
		System.out.println(line);
		//Cerrar siempre el objeto Scanner 
		//cuando terminemos de usarlo
		scanner.close(); 
	
	}

}
