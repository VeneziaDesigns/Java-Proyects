package libro;

import java.util.Scanner;

public class Main_Libro {

	public static void main(String[] args) {
		
		Libro elQuijote=new Libro(123456, "Miguel de Cervantes", "Don Quijote", 1665, "Planeta de agostini", 2564);
		Libro harryPetas=new Libro(654321, "J.K.Rowling", "Harry Petas 1", 1997, "RBA", 589);
		
		System.out.println(elQuijote.toString());
		System.out.println(harryPetas);
		//Aqui estoy invocando el constructor de la clase Teclado para introducir datos mediante teclado
        Teclado diario= new Teclado();
        System.out.println(diario);
        
        Teclado libro = new Teclado();
        System.out.println(libro);
        
        
	}
}
class Teclado {
	//Atributos
	private int ISBN;
	private String autor;
	private String titulo;
	private int añoPublicacion;
	private String editorial;
	private int nPaginas;
	
	//Contructor por teclado
	public Teclado() {
		//suprime la advertencia de scsnner abierto
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
        System.out.println("Digite el ISBN: ");
        int ISBN=sc.nextInt();
        this.ISBN=ISBN;
        
        sc.nextLine(); //Solucion para que no salte a la sig instruccion
        
        System.out.println("Digite el Autor: ");
        String autor=sc.nextLine();
        this.autor=autor;
        
        System.out.println("Digite el titulo: ");
        String titulo=sc.nextLine();
        this.titulo=titulo;
        
        System.out.println("Digite el año de publicacion: ");
        int anioPubli=sc.nextInt();
        this.añoPublicacion=anioPubli;
        
        sc.nextLine(); //Solucion para que no salte a la sig instruccion
        
        System.out.println("Digite la editorial: ");
        String editorial=sc.nextLine();
        this.editorial=editorial;
        
        System.out.println("Digite el numero de paginas: ");
        int numPaginas=sc.nextInt();
        this.nPaginas=numPaginas;
               
	}

	public int getISBN() {
		return ISBN;
	}
	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAñoPublicacion() {
		return añoPublicacion;
	}
	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getnPaginas() {
		return nPaginas;
	}
	public void setnPaginas(int nPaginas) {
		this.nPaginas = nPaginas;
	}
	@Override
	public String toString() {
		return "Libro [ISBN:" + ISBN + ", titulo:" + titulo + ", autor:" +
			autor + ", año de publicacion:" + añoPublicacion + ", editorial:" + 
			editorial + ", numero de paginas:" + nPaginas + "]";
	}
}
