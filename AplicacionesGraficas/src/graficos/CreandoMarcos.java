package graficos;

import javax.swing.*; //Para crear aplicaciones graficas (utilizar JFrame)

public class CreandoMarcos {

	public static void main(String[] args) {
		
	//Intanciamos el objeto del la clase miMarco
		miMarco marco1=new miMarco();
		
		//Lo hacemos visible	
		marco1.setVisible(true);	//Ambos metodos se pueden meter en el constructor
		
	//Instrucciones a hacer cuando se cierre => el metodo pide un int por parametro(JFrame.EXIT_ON_CLOSE)
		//Sin esto no finaliza el programa
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class miMarco extends JFrame{ //Hay que heredar de Jframe para poder utilizar sus metodos
	
	public miMarco(){
		
		setSize(500, 300); //=>Le damos un tamaño
		
	}
	
}
