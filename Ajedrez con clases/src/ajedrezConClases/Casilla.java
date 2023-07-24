package ajedrezConClases;

public class Casilla {

	//Atributos
	private int fila;
	private int columna;
	
	//Constructor
	public Casilla(int f, int c) {
		
		this.fila=f;
		this.columna=c;
	}

	public int getFila() {
		return fila;

	}
	
	public void setFila(int fila) {
		this.fila = fila;
	}

	public int getColumna() {
		return columna;
	}

	
	public void setColumna(int columna) {
		this.columna = columna;
	}
	
	public String getBlanco() {
		return "  ";
	}
	
	public String getNegro() {
		return "\u2588\u2588";
	}
	
		
}
