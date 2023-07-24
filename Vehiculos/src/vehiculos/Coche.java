package vehiculos;

//CLASE COCHE HEREDA DE CLASE VEHICULO
public class Coche extends Vehiculo {
	
	//ATRIBUTOS (propios los demas son heredados de vehiculo)
	private int cilindrada;
	
	//CONSTRUCTOR
	public Coche(String color, int numSerie, int cilindrada) {
  //Utilizamos el constructor de la clase padre con (super)
		super(color,numSerie);
		this.cilindrada=cilindrada;
	}
	
	//METODOS
	public int getCilindrada() {
		return cilindrada;
	}
	
	public void cambiarCilindrada(int cilindrada) {
		this.cilindrada=cilindrada;
	}

	@Override
	public void arrancar() {
		System.out.println("brumbrum");
	}
}
