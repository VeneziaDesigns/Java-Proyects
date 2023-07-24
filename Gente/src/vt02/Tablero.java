package vt02;

public class Tablero {

	/*Solo se pueden declarar las variables de fila y columna
	 Solo se pueden usar estructuras de repeticion
	 No esta permitido el uso de estructuras de seleccion 
	 System.out.println("\u2588\u2588"); */
	
	public static void main(String[] args) {
		
		//Llamamos al metodo Ajedrez y le pasamos un valor de 0 a la variable c
		System.out.println("El tablero tiene " + Ajedrez(0) + " casillas");
	    }
		
	
	
		//Metodo que va a dibujar todo el tablero y a contar las casillas
		public static int Ajedrez(int c) {
		
		int[] fila = new int [10];
		int[] columna = new int [8];
		int[] numeros = {1,2,3,4,5,6,7,8};
		
		System.out.println("   A B C D E F G H");
		
		/*For anidado para filas/columnas*/
		for (int i=0; i < columna.length;i++) 
		{		
			/*1ª Comprobacion: Si la fila es par o impar*/  //_____________________________________________________________________________________________
			if (i % 2 == 1) {
				for (int j=0; j < fila.length;j++) {
				
				//Si j es 0 o 9 tenemos que poner el nº de fila y si es 9 tambien una salto de linea	
				if (j == 0 || j == 9) {
					if (j == 0) {
						System.out.print(numeros[i] + " ");
						}
						if (j == 9) {
							System.out.println(" " + numeros[i]);
						}	
						//Si no es ni 0 ni 9, se evaluara si j es impar,
						//si lo es se ejecutara el if y si no el else	          //Si la fila es impar
				 } else {                                                         //ejecuta este bloque  

							 if (j % 2 == 1) {
								System.out.print("  ");
								c++;
							}  else {
								System.out.print("\u2588\u2588");
								c++;
							}
						
						}
					}                                          //_________________________________________________________________________________________
			} else {
						for (int k=0; k < fila.length;k++) {
							
							//Si k es 0 o 9 tenemos que poner el nº de fila y si es 9 tambien una salto de linea
							if (k == 0 || k == 9) {
								if (k == 0) {
								System.out.print(numeros[i] + " ");
								}
								if (k == 9) {
									System.out.println(" " + numeros[i]);
								}
							//Si no es ni 0 ni 9, se evaluara si k es par,
							//si lo es se ejecutara el if y si no el else	
							} else {							
								 if (k % 2 == 0) 
								 {													//Si la fila es par 
									System.out.print("  ");  
									c++;										//ejecuta este bloque  
								 } 
								 else 
								 {
									System.out.print("\u2588\u2588");
									c++;
								 }
							}
						}
			
				}
		}                                                     //_____________________________________________________________________________________________
		System.out.println("   A B C D E F G H");
		return c;
	}
}
