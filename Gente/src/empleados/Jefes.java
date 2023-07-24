package empleados;

final class Jefes extends Empleado implements JefesI {  //Si se declara la clase como final 
									  					//ninguna clase puede heredar de esta	
	private double incentivo;
	
	public Jefes(String nom, double sue, int anio, int mes, int dia) {
		
		super(nom, sue, anio, mes, dia);
		
	}

	public void estableceIncentivo(double b) { //setter
		
		incentivo=b;
	}
	
	//sobreescribe el metodo dameSueldo de 
	//la clase Empleado solo en esta clase
	public double dameSueldo() { //getter
		
	//Ponemos super para que llame al metodo de 
	//la clase padre y no de la clase actual
		double sueldoJefe=super.dameSueldo();
		
		return sueldoJefe + incentivo;
	}
	
	public String tomarDecisiones(String decision) {
		
		return "Un miembro de la direccion ha tomado la decision de: " + decision;
		
	}
	
	public double estableceBonus(double bonificacion) {
		
		double prima=2000;
		
		return Trabajadores.bunusBase+bonificacion+prima;
	}
	
}

