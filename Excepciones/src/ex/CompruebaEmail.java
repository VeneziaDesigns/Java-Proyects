package ex;

import java.io.EOFException;

import javax.swing.JOptionPane;

public class CompruebaEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email = JOptionPane.showInputDialog("Introduce el email");
		
		try {
			examinaEmail(email);
			
		} catch (EOFException e) {
			System.out.println("La direccion de email no es correcta");
		}
			
	}
	
	static void examinaEmail(String email) throws EOFException {
		 
		int arroba = 0;
		
		boolean punto = false;
											//Lanzamos manualmente la 
		if (email.length() <= 3) {			//excepcion con throw e  
											//indicamos al metodo que 
											//capture la excepcion
		
			throw new EOFException(); //Simplificar codigo
		
		} else {
			
		for (int i = 0; i < email.length(); i++) {
			
			if (email.charAt(i)=='@') {
				
				arroba++;
			}
			if (email.charAt(i)=='.') {
				
				punto = true;
			}
		}
		
		if (arroba==1 && punto==true) {
			System.out.println("Es correcto");
		} else {
			System.out.println("No es correcto");
		}
	}
  }

}
