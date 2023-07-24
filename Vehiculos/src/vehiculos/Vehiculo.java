package vehiculos;

//CLASE ABSTRACTA (NO SE PUEDEN CREAR OBJETOS DE LAS CLASES ABSTRACTAS)
public abstract class Vehiculo {
	//ATRIBUTOS	
	
	//Colores de los que se puede pintar un vehiculo
	public static enum Color {ROJO, VERDE, AZUL}
	protected static String color;
	protected final int numSerie;

//	//CONSTRUCTOR 1
//		public Vehiculo() {
//			Vehiculo.color="";
//			this.numSerie=0;
//		}
	
	//CONSTRUCTOR 2
	public Vehiculo(String color, int numSerie) {
		this.color=color;
		this.numSerie=numSerie;
	}
	//METODOS
	
	//Retorna el color del vehiculo
	public String color() {
		return color;
	}
	//Retorna el nº de serie del vehiculo
	public int getNumSerie() {
		return numSerie;
	}
	//Recibe un parametro de la clase color
	public void pintarVehiculo(String c) {
		this.color = c;
	}
	//Metodo base que va a sobreescribir cada clase Hija (Metodo abstracto)
	public abstract void arrancar();
}
