package temporizador;

import javax.swing.*; //Para importar el objeto Timer

import java.awt.Toolkit;

import java.awt.event.*; //Para importar el ActionListener

import java.util.*; //Para importar el objeto Date

import javax.swing.Timer; //=>         Importamos la clase para que no de conflictos entre  
									//las diferentes clases Timer de javax.swing.*; y java.util.*;
									//que ocurre al importar los 2 paquetes enteros

public class TemporizadorClaseInternaLocal {

	public static void main(String[] args) {

		Reloj2 miReloj=new Reloj2(); //=>Sin claseInternaLocal (int intervalo, final boolean sonido)
		
		miReloj.enMarcha(3000, true); //Con claseInternaLocal
		
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para continuar");

		System.exit(0);
	}

}


class Reloj2 {
	
	//Podemos prescindir de la declaracion de atributos (intervalo y sonido)
	//pasandolos como parametros del metodo enMarcha()
	
	//Hay que declarar contantes los parametros a los 
	//que se acceda en la clase interna local (sonido)
	
	//Finalmente podemos prescindir del constructor de la clase Reloj2
	//pasandole los parametros al metodo en vez de al objeto de la clase Reloj2
	
	public void enMarcha(int intervalo, final boolean sonido) {
		
		class DameHora2 implements ActionListener { 		// => Clase interna local (dentro de la clase Reloj y del metodo enMarcha()) 
															//No deben llevar ningun modificador de acceso
			public void actionPerformed(ActionEvent evento) {		
																	
				Date ahora=new Date();

				System.out.println("Te pongo la hora cada 3 seg " + ahora);

				if (sonido) {  									//El ambito de esta clase es del metodo enMarcha()
																//Totalmente encapsulada (No es visible ni por la clase a la que pertenece "Reloj")
					Toolkit.getDefaultToolkit().beep();			//ni por otras clases
				}												
																//Es util cuando solo se va a instanciar la clase interna una vez, 
			}													//con el objetivo de simplificar el codigo

		}
		
		ActionListener oyente=new DameHora2();
		
		Timer miTemporizador=new Timer(intervalo, oyente);
		
		miTemporizador.start();
			
	}
		
}
