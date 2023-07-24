package interfaces;

import personas.Personas;

//LA CLASE TRIATLETA EXTIENDE DE LA CLASE PERSONA E IMPLEMENTA CORREDOR Y NADADOR
public class Triatleta extends Personas implements Corredor, Nadador{
	
	public Triatleta() {
		super();
	}
	
	public void correr() {
		System.out.println("El triatleta esta corriendo...");
	}
	
	public void nadar() {
		System.out.println("El triatleta esta nadando...");
	}
}
