
public class Gasto extends Dinero {
	
	public Gasto(double gasto, String description) {
		this.dinero=gasto;
		this.description=description;
	}
	
	public String toString() {
		
		//Cambiamos el formato de (dinero) para que se muestre con coma y 2 decimales
		String resultado = String.format("%.2f", dinero);
		
		//Devolvemos el String con el formato correcto
		return "El dinero gastado es: " + resultado + "€  descripcion: " + description;
	}
}
