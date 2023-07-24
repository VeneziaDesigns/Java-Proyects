package vt02;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int fib1 = 0;
			int fib2 = 1;
			int fibNew = 0;
			boolean exit = false;
		
		while (!exit) {
			
			System.out.println("El siguiente nº de fibonacci es " + fib1);
			fibNew = fib1 + fib2;
			fib1 = fib2;
			fib2 = fibNew; 
			System.out.println("¿Quieres salir? 0=salir, 1=continuar");
			if (sc.nextInt() == 0) {
				exit = true;
			}
			sc.close();
		}
	}
}
