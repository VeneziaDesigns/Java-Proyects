package ajedrezConClases;

public class Tablero {

	//Atributos
		private Casilla [][] casillas;
		
		//Constructor vacio
		public Tablero() {
			casillas= new Casilla[8][8];
			for (int fila=0; fila<8; fila++) {
				for (int columna=0; columna<8; columna++) {
					casillas[fila][columna] = new Casilla(fila, columna);
				}
			}			
		}

		public Casilla[][] getCasillas() {
			return casillas;
		}

		public void setCasillas(Casilla[][] casillas) {
			this.casillas = casillas;
		}
		
		public void mostrarTablero() {
			
			System.out.println("   A B C D E F G H");
			
//		for (int fila=0; fila<8; fila++) {
//				System.out.print((8 - fila) + " ");
//				for (int columna=0; columna<8; columna++) {
//					if ((fila + columna) % 2 == 1) {                                  //Sin usar clases ni objetos
//						System.out.print("  ");
//					} else {
//						System.out.print("\u2588\u2588");
//					}
//				}
//				System.out.print(" " + (8 - fila));
//				System.out.println();
//			}
			
			int i = 0;
			int j = 0;
			
			Casilla cas = new Casilla(j, i);
			
			for (i = 0; i < 8; i++) {
				System.out.print((8 - i) + (cas.getBlanco()));                 //Usando el objeto cas de la clase casilla
				for (j = 0; j < 8; j++) {                                      //y los metodos getBlanco y get Negro de
					if ((i + j) % 2 == 1) {                                    //esa clase.
						System.out.print(cas.getBlanco());
					} else {
						System.out.print(cas.getNegro());
					}
				}
				System.out.print((cas.getBlanco()) + (8 - i));
				System.out.println();
			}
			
			System.out.println("   A B C D E F G H");
		

		
		}		
}
