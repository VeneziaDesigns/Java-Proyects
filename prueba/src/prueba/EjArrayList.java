package prueba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Random;

public class EjArrayList {
	
	//Generar un ArrayList Random pasando como parametro ArrayList y longitud del ArrayList
	public static void generarNArrayList(ArrayList<Integer> listado, int n) {
		
		//Generar los numsAleatorios
		Random Al =new Random();
		
		for (int i = 0; i < n; i++) {
			int num = Al.nextInt(1492,5654);
			listado.add(num);
		}
		
	}
	//Obtener el maximo y el minimo valor del ArrayList
	public static void maxMin(ArrayList<Integer> listado) {
		
		int max=Collections.max(listado);
		int min=Collections.min(listado);      //=>Metodo Colection ArrayList
		
		
//		int max=0;
//		int min=10000;
//		
//		for (int i = 0; i < listado.size()1; i++) {    => Mi metodo
//			max = Math.max(max, listado.get(i));
//			min = Math.min(min, listado.get(i));	
//		}
		System.out.println("El numero maximo del ArrayList es " + max + " y el minimo es " + min);
	}//---------------------------------------------------------------------------------------------------------------------
	//Invertir el orden del ArrayList
	public static void invertiArrayList(ArrayList<Integer> listado) {
		
		ListIterator<Integer> iterador = listado.listIterator(listado.size());
																			
		while (iterador.hasPrevious()) {							//=>Con ListIterator
			System.out.print(iterador.previous() + (" "));
		}
		
//		ArrayList<Integer> reves = new ArrayList<Integer>();
//		
//		for (int i = 14; i >= 0; i--) {
//			reves.add(listado.get(i)); 						=>Mi forma de hacerlo
//		}
//		System.out.println("El listado al reves es " + reves);
	}//--------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		
		ArrayList<Integer> Numeros = new ArrayList<Integer>();
		
		//Llamamos al metodo para generar los numeros aleatorios
		generarNArrayList(Numeros, 15);
		
		System.out.print("ArrayList enteros: \n" + Numeros + "\n");
		
		maxMin(Numeros);
		
		invertiArrayList(Numeros);
		
	}

}
