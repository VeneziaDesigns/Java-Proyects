package vehiculos;

//CLASE BARCO HEREDA DE CLASE VEHICULO
public class Barco extends Vehiculo{
	
	//CONSTRUCTOR DE CLASE VEHICULO
	public Barco(String color, int numSerie) {
		super(color, numSerie);
	}
	//NO TIENE METODOS PROPIOS

	@Override
	public void arrancar() {
		System.out.println("Glupglup");		
	}
}
