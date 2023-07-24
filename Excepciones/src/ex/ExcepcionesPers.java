package ex;

import java.io.EOFException;

import javax.swing.JOptionPane;

public class ExcepcionesPers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email = JOptionPane.showInputDialog("Introduce el email");
		
		try {
			examinaEmail(email);
			
		} catch (Exception e) {
			System.out.println("La direccion de email no es correcta");
		
			e.printStackTrace(); 	//Para obtener una pista de que 
		}							//clase ha generado la excepcion
			
	}
	
	static void examinaEmail(String email) throws LongitudMailErroneo {
		 
		int arroba = 0;
		
		boolean punto = false;
											//Lanzamos manualmente la 
		if (email.length() <= 3) {			//excepcion con throw e  
											//indicamos al metodo que 
											//capture la excepcion
		
//			throw new EOFException(); //Simplificar codigo
		
			throw new LongitudMailErroneo("El mail es demasiado corto");
			
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
//Crear excepcion personalizada: Crear una nueva clase que herede de 
//Exception, IOException o RuntimeException. En el caso de Exception 
//o IOException nos obliga a capturar la excepcion con un try catch,
//mientras que si heredamos de RuntimeException no estamos obligados
//por ser un error no controlado

class LongitudMailErroneo extends Exception{
	
	public LongitudMailErroneo(){}
													//Lo normal es que tengan 	
													//2 constructores, el 1º sin 
	public LongitudMailErroneo(String msjError){	//parametros y el 2º con un 
													//String pasado por parametro
		super(msjError);
	}											
												
}												