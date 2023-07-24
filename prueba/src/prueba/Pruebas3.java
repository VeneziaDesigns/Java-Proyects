package prueba;

public class Pruebas3 {
	
	public static void main(String[] args) {
	    double numero = 1234.5678;
	    String numeroConComa = convertirDecimalConComa(numero);
	    System.out.println("El número con coma es: " + numeroConComa);
	    
	    double numeroConvertido = Double.parseDouble(numeroConComa);
	    System.out.println("El número convertido es: " + numeroConvertido);
	}

	public static String convertirDecimalConComa(double numero) {
	    return String.format("%.2f", numero).replace('.', ',');
	}

}
