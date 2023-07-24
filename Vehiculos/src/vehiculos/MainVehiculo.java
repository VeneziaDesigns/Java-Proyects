package vehiculos;

//Importamos todas las clases del package vehiculos
import vehiculos.*;

public class MainVehiculo {

	public static void main(String[] args) {
		
//   No se pueden crear objetos de una clase abstracta
//		Vehiculo v = new Vehiculo("ROJO", 100);
		
		Coche twingo = new Coche("AZUL", 110, 1000);
		Barco velero = new Barco("VERDE", 150);
		
		
		System.out.println(twingo.getCilindrada());
		twingo.cambiarCilindrada(1500);
		System.out.println(twingo.getCilindrada());
		
		velero.pintarVehiculo("ROJO");
		System.out.println(velero.color());
		
		twingo.arrancar();
		velero.arrancar();
	}

}
