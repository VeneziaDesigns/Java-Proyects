package ex;

import javax.swing.JOptionPane;

public class ExEjem {

	public static void main(String[] args) {
	
		int[] miMatriz=new int[5];

		miMatriz[0]=5;
		miMatriz[1]=38;
		miMatriz[2]=-15;
		miMatriz[3]=92;
		miMatriz[4]=71;
		miMatriz[5]=82; //Exception Clase ArrayIndexOutOfBounds
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Posicion " + i + " = " + miMatriz[i]);
		}
		
		//Peticion de datos
		
		String nombre = JOptionPane.showInputDialog("Introduce tu nombre");
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
		
		System.out.println("Hola " + nombre + " Tienes " + edad + " años." + " El programa termino su ejecucion");
	}

}
