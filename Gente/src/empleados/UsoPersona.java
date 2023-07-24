package empleados;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

	public static void main(String[] args) {
		
		Persona[] lasPersonas=new Persona[2];
		
		lasPersonas[0]= new Empleado2("Machete Machote", 50000, 2009, 11, 3);

		lasPersonas[1]= new Alumno("Pablo Echenaik", "Fisica");

		for (Persona p: lasPersonas) {
			
			System.out.println(p.getNombre() + ", " + p.getDescripcion());
		}
		
	}
}

//--------------------------------------------------------------------------------

abstract class Persona {
	
private String nombre;
	
	public Persona(String nom) {                   //Siempre que definamos un metodo 
												   //abstracto habra que definir a  
		nombre=nom;								   //la clase como abstracta
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract String getDescripcion();     //Los metodos abstractos no tienen 
												 //llaves ni instrucciones y se 
}											     //sobreescriben en cada subclase

//-------------------------------------------------------------------------------

class Empleado2 extends Persona {
	
	//CONSTRUCTOR 1
	public Empleado2(String nom, double sue, int anio, int mes, int dia) {
		
		super(nom);
		
		sueldo=sue;
		
		Id=IdSiguiente;
		IdSiguiente++;
		
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		
		altaContrato = calendario.getTime();
		
	}
										//Siempre que definamos un metodo  
	public String getDescripcion() {    //abtracto en una superclase estamos 
										//obligados a reescribirlo en las subclases
		return "Este empleado tiene un Id= " + Id + " con un sueldo= " + sueldo;
	}
	
	public double dameSueldo() { //getter  Si declararamos el metodo como final
		return sueldo;					 //nos asegurariamos de que no se pudiera 	
	}									 //sobreescribir el metodo en una subclase
	
	public Date dameFechaContrato() { //getter
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) { //setter => recibe como parametro un double
		double aumento = sueldo*porcentaje/100; //se crea la var aumento y se calcula a partir del parametro
		
		sueldo += aumento;
	}
	
	private double sueldo;
	private Date altaContrato;
	private int Id;
	private static int IdSiguiente=1;
}

//-----------------------------------------------------------------------------------------------------------------------------

class Alumno extends Persona{
	
	private String carrera;
	
	public Alumno(String nom, String car) {
		
		super(nom);
		
		carrera=car;
	}
	
	public String getDescripcion() {    
		
return "Este alumno esta estudiando la carrera de " + carrera;
}
}
