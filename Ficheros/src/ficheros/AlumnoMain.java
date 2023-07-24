package ficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class AlumnoMain {
	
	public static Alumno[] crearAlumnos() {
		Alumno[] listadoAlumnos = {
				new Alumno("Juan", "Perez", 20, "Monteperdido", new String[] {"Programacion", "BBDD"}),
				new Alumno("Maria", "Garcia", 22, "Cebolleta", new String[] {"Interfaces web", "LDM"}),
				new Alumno("Pedro", "Martinez", 19, "Plz España", new String[] {"Sistemas", "Redes"})
		};
		return listadoAlumnos;
	}
	
	public static void EscribirFicheroBinarioDOS(Alumno[] listado) {
		
		try (DataOutputStream f = new DataOutputStream(new FileOutputStream("alumnos.bin"))){
			for (Alumno alumno: listado) {
				f.writeUTF(alumno.getnombre());
				f.writeUTF(alumno.getapellido1());
				f.writeInt(alumno.getedad());
				f.writeUTF(alumno.getdireccion());
				f.writeInt(alumno.getModulos().length);
				for (String modulo: alumno.getModulos()) {
					f.writeUTF(modulo);
				}
			}
			f.close();
			
		} catch (IOException e) {
			System.out.println("Error al escribir el archivo: " + e.getMessage());
		}
		
		
	}
	
	public static void LeerFicheroBinarioDIS() throws IOException {
		
		DataInputStream in = null;
		
		try {
			in = new DataInputStream(new FileInputStream("alumnos.bin"));
				while (true) {
					String nombre = in.readUTF();
					String apellido1 = in.readUTF();
					int edad = in.readInt();
					String direccion = in.readUTF();
					int numModulos = in.readInt();
					String[] modulos = new String[numModulos];
					
					for (int i = 0; i < numModulos; i++) {
						modulos[i] = in.readUTF();
					}
			//Imprimir los datos de cada alumno en la consola
					System.out.printf("%s %s (%d años)%n", nombre, apellido1, edad);
					System.out.println("Direccion: " + direccion);
					System.out.print("Modulos: ");
					
					for (String modulo: modulos) {
						System.out.print(modulo + ", ");
					}
					System.out.println();
				}
				
		} catch (EOFException e) {
			System.out.println("Fin de fichero");
		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		} finally {
			in.close();
		}
	}
	
	public static void EscribirFicheroBinarioRAF(Alumno al) {
		
		try (RandomAccessFile file = new RandomAccessFile("alumnos.bin", "rw")){
			//Nos posicionamos en el final del fichero
			file.seek(file.length());
			
			file.writeUTF(al.getnombre());
			file.writeUTF(al.getapellido1());
			file.writeInt(al.getedad());
			file.writeUTF(al.getdireccion());
			file.writeInt(al.getModulos().length);
			for (String modulo : al.getModulos()) {
				file.writeUTF(modulo);
			}
			file.close();
			
		} catch (IOException e) {
			System.out.println("Error al escribir el archivo: " + e.getMessage());
		}
	}
	
	public static void LeerFicheroBinarioRAF() {
		
		try (RandomAccessFile file = new RandomAccessFile("alumnos.bin", "r")){
			while (file.getFilePointer() < file.length()) {
				String nombre = file.readUTF();
				String apellido1 = file.readUTF();
				int edad = file.readInt();
				String direccion = file.readUTF();
				int numModulos = file.readInt();
				String[] modulos = new String[numModulos];
				
				for (int i = 0; i < numModulos; i++) {
					modulos[i] = file.readUTF();
				}
		//Imprimir los datos de cada alumno en la consola
				System.out.printf("%s %s (%d años)%n", nombre, apellido1, edad);
				System.out.println("Direccion: " + direccion);
				System.out.print("Modulos: ");
				
				for (String modulo: modulos) {
					System.out.print(modulo + ", ");
				}
				System.out.println();
			}
			file.close();
		} catch (IOException e) {
			System.out.println("Error al leer el archivo: " + e.getMessage());
		}
	}

	public static void EscribirFicheroTextoBW(Alumno[] alumnos) {
		//Escribir los datos de los alumnos en un fichero de texto
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("alumnos.txt"))) {
			
			for (Alumno alumno : alumnos) {
				writer.write(alumno.getnombre() + " ");
				writer.write(alumno.getapellido1() + " ");
				//OJO - los enteros no son String
				writer.write(String.valueOf(alumno.getedad()) + " ");
				writer.write(alumno.getdireccion() + " ");
				writer.write(String.valueOf(alumno.getModulos().length) + " ");
				
				for (String modulo : alumno.getModulos()) {
					
					writer.write(modulo + ",");
				}
				writer.write(".");
				writer.newLine();;
			}
			writer.close();
			
		} catch (IOException e) {
			System.out.println("Error al escribir el archivo: " + e.getMessage());
		}
	}
	
	public static void LeerFicheroTextoBR() {
		//Leer los datos de los alumnos desde el archivo de texto
try (BufferedReader reader = new BufferedReader(new FileReader("alumnos.txt"))) {
			
	String linea;
	
	while ((linea = reader.readLine()) != null) {
		String[] datos = linea.split(" ");
		String nombre = datos[0];
		String apellido1 = datos[1];
		int edad = Integer.parseInt(datos[2]);
		String direccion = datos[3];
		int numModulos = Integer.parseInt(datos[4]);
		String[] auxModulos = datos[5].split(",");
		//elimino el ultimo, que es el punto final
		String[] modulos = Arrays.copyOf(auxModulos, auxModulos.length - 1 );
		
//Imprimir los datos de cada alumno en la consola
		System.out.printf("%s %s (%d años)%n", nombre, apellido1, edad);
		System.out.println("Direccion: " + direccion);
		System.out.print("Modulos: ");
		
		for (String modulo: modulos) {
			System.out.print(modulo + ", ");
		}
		System.out.println();
	}
	reader.close();
} catch (IOException e) {
	System.out.println("Error al leer el archivo: " + e.getMessage());
}
	}
	
	public static void main(String[] args) throws IOException {
		Alumno[] alumnos = crearAlumnos();
		
		System.out.println("## ESCRITURA Y LECTURA FICHERO BINARIO DataInputStream y DataOutputStream");
		EscribirFicheroBinarioDOS(alumnos);
		
		System.out.println("Escrito1");
		LeerFicheroBinarioDIS();
		System.out.println("FIN");
		
		System.out.println("## ESCRITURA Y LECTURA FICHERO BINARIO RandomAccessFile" + " ##");
		Alumno nuevoAlumno = new Alumno("Onliner", "Ilerna", 20, "Catalunya", new String[] {"Servidor", "Proyecto"});

		EscribirFicheroBinarioRAF(nuevoAlumno);
		System.out.println("Escrito2");
		
		LeerFicheroBinarioRAF();
		System.out.println("FIN");
		
		System.out.println("## ESCRITURA Y LECTURA FICHERO texto alumnos.txt ##");
		EscribirFicheroTextoBW(alumnos);
		
		System.out.println("Escrito3");
		LeerFicheroTextoBR();
		
		System.out.println("FIN");
	}

}
