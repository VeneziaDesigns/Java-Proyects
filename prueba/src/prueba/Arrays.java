package prueba;

public class Arrays {

	public static void main(String[] args) {
		int [][][] matriz = new int [3][3][3];
		//Recorremos para rellenar la matriz
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					System.out.print((matriz[k][j][i] = k + 1 + j * 3) + " ");					
				}
				System.out.println();
			}
			System.out.println();
		}
//---------------------------------------------------------------------------------------------------------		
//		int [][][] matriz = new int [3][3][3];
//		//Recorremos para rellenar la matriz
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				for (int k = 0; k < 3; k++) {
//					matriz[i][j][k] = i + 1 + j * 3;					
//				}
//			}
//		}
//		
//		//Transponer matrices
//		for (int i = 0; i < 3; i++) {
//			for (int j = 0; j < 3; j++) {
//				for (int k = 0; k < 3; k++) {
//					System.out.print(matriz[k][j][i] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
		
//---------------------------------------------------------------------------------------------------------
		
//		int [][] matriz = new int [3][3];
//		//Recorremos para rellenar la matriz
//		
//			for (int j = 0; j < 3; j++) {
//				for (int k = 0; k < 3; k++) {
//					System.out.print((matriz[k][j] = k + 1 + j * 3) + " ");					
//				}
//				System.out.println();
//			}
	}
}
