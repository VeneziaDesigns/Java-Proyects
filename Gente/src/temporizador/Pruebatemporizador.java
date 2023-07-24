package temporizador;

import javax.swing.*; //Para importar el objeto Timer

import java.awt.Toolkit;

import java.awt.event.*; //Para importar el ActionListener

import java.util.*; //Para importar el objeto Date

import javax.swing.Timer; //=>         Importamos la clase para que no de conflictos entre  
									//las diferentes clases Timer de javax.swing.*; y java.util.*;
public class Pruebatemporizador {   //que ocurre al importar los 2 paquetes enteros

	public static void main(String[] args) {
				
//Instanciamos objeto de la clase DameHora que implementa la interfaz ActionListener
		DameHora oyente=new DameHora();
		
//Tambien podriamos instanciar la interfaz a traves de la clase DameHora
		//ActionListener oyente=new DameHora();
		
//Params => Timer(int delay, ActionListener listener) Objeto de tipo interfaz
		Timer miTemporizador=new Timer(5000, oyente);
		
		//Metodo Start de la clase Timer
		miTemporizador.start();
//El programa no mostraria nada porque temina antes de que se muestre ningun mensaje
	
//Para evitarlo sacamos una ventana de tipo JOptionPane que detiene la ejecucion del codigo
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener");
	
	//Detiene la ejecucion del programa
		System.exit(0);
	}

}

class DameHora implements ActionListener { //Creamos la clase e implementamos la interfaz
	
	public void actionPerformed(ActionEvent e) { //Implementar el metodo de la interfaz
		
		Date ahora=new Date();
		
		System.out.println("Te pongo la hora cada 5 seg " + ahora);
		
		Toolkit.getDefaultToolkit().beep(); //Clase abstracta Toolkit => Podemos acceder a los recursos del sist. op. (resolucion, recursos de sonido, etc...) 
		
	}
	
}
