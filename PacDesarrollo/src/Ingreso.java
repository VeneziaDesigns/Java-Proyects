
public class Ingreso extends Dinero {

	public Ingreso(double ingreso, String description) {
		this.dinero=ingreso;
		this.description=description;
	}
	
	public String toString() {
		
		//Cambiamos el formato de (dinero) para que se muestre con coma y 2 decimales
		String resultado = String.format("%.2f", dinero);
		
		//Devolvemos el String con el formato correcto
		return "El dinero ingresado es: " + resultado + "€  descripcion: " + description;
	}
}
