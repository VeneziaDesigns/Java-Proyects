package vt03;

public class prueba555 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 5;
		int contador = 0;
		boolean primo = false;
		
		for (int i = numero; i>0 && !primo; i--) {
			 
			if (numero%i == 0) {
				contador++;
				System.out.println(contador<=2 ? "Es primo" : "No es primo");
			}
		}
		
		String cadena1 = "Misko Jones Morenos";
		String[] cadena2 = cadena1.split(" ");
		//System.out.print(cadena2);
		for (int i = 0; i < cadena2.length; i++) {
			System.out.print(cadena2[i]);
		}
	}

}
