package vt02;

public class Libro {
	//Atributos
	private int ISBN;
	private String autor;
	private String titulo;
	private int añoPublicacion;
	private String editorial;
	private int nPaginas;
	
	//Contructor
	public Libro() {
	}
	public Libro(int ISBN, String autor, String titulo, int añoPublicacion, String editorial, int nPaginas) {
		
		this.ISBN=ISBN;
		this.autor=autor;
		this.titulo=titulo;
		this.añoPublicacion=añoPublicacion;
		this.editorial=editorial;
		this.nPaginas=nPaginas;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
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
