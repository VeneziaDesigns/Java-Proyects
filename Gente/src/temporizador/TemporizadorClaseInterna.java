package temporizador;

import javax.swing.*; //Para importar el objeto Timer

import java.awt.Toolkit;

import java.awt.event.*; //Para importar el ActionListener

import java.util.*; //Para importar el objeto Date

import javax.swing.Timer; //=>         Importamos la clase para que no de conflictos entre  
									//las diferentes clases Timer de javax.swing.*; y java.util.*;
									//que ocurre al importar los 2 paquetes enteros

public class TemporizadorClaseInterna {

	public static void main(String[] args) {

		Reloj miReloj=new Reloj(3000, true);
		
		miReloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para continuar");

		System.exit(0);
	}

}


class Reloj {
	
	private int intervalo;
	private boolean sonido;
	
	public Reloj(int intervalo, boolean sonido) {
		
		this.intervalo=intervalo;
		this.sonido=sonido;
		
	}
	
	public void enMarcha() {
		
		ActionListener oyente=new DameHora2();
		
		Timer miTemporizador=new Timer(intervalo, oyente);
		
		miTemporizador.start();
		
	}
	
	private class DameHora2 implements ActionListener { 		// => Clase interna (dentro de la clase Reloj) 
																//que implementa la interfaz ActionListener
		public void actionPerformed(ActionEvent evento) {		//Son las unicas clases que admiten el modificador
																//de acceso private
			Date ahora=new Date();
			
			System.out.println("Te pongo la hora cada 3 seg " + ahora);
			
			if (sonido) {  		// => Clase interna puede acceder directamente a los campos private
						   		//     de la clese que la contiene sin crear los getter/setter
				Toolkit.getDefaultToolkit().beep();
			}
			
		}
		
	}
	
}
