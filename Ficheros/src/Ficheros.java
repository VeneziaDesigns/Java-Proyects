import java.io.File;
import java.io.IOException;


public class Ficheros {

	public static void main(String[] args) {
		
		//Definir la ruta del directorio y del fichero de texto
		File miDirectorio = new File("C:\\PruebaJava");
		File miFichero = new File("C:\\PruebaJava\\miFichero.txt");
		
		try {
			miDirectorio.mkdir();  //Creamos directorio
			if (miFichero.createNewFile()) {
				System.out.println("Fichero creado correctamente");
			} else {
				System.out.println("ERROR: No se ha podido crear el fichero");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Fin del programa");
	}

}
