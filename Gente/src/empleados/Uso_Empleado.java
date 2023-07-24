package empleados;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {

		//FORMA CLASICA
		
//		Empleado empleado1 = new Empleado("Puta Guarra",23000,1990,12,23);
//		
//		Empleado empleado2 = new Empleado("Puta Lova",30000,1998,6,2);
//		
//		Empleado empleado3 = new Empleado("Matias Prats",55000,2005,8,14);
//
//		empleado1.subeSueldo(5);
//		empleado2.subeSueldo(5);
//		empleado3.subeSueldo(5);
//		
//		System.out.println("Nombre : " +empleado1.dameNombre() + " Sueldo: " + 
//		empleado1.dameSueldo() + "Fecha de alta: " + empleado1.dameFechaContrato());
//		System.out.println("Nombre : " +empleado2.dameNombre() + " Sueldo: " + 
//		empleado2.dameSueldo() + "Fecha de alta: " + empleado2.dameFechaContrato());
//		System.out.println("Nombre : " +empleado3.dameNombre() + " Sueldo: " + 
//		empleado3.dameSueldo() + "Fecha de alta: " + empleado3.dameFechaContrato());

//------------------------------------------------------------------------------------------------------------------		
		
		//CON ARRAYS
		
		Jefes jefeRRHH=new Jefes("Bebe Jefaso", 55000, 2006, 9, 25);
		
		jefeRRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados = new Empleado[6];
		
		misEmpleados[0]=new Empleado("Puta Guarra",23000,1990,12,23);
		misEmpleados[1]=new Empleado("Puta Lova",45000,1998,6,2);
		misEmpleados[2]=new Empleado("Matias Prats",55000,2005,8,14);
		misEmpleados[3]=new Empleado("Rosa Melano"); 	//=>Sobrecarga de constructores
		misEmpleados[4]=jefeRRHH; 													//Polimorfismo "Principio de sustitucion"
//No permite aplicarle un incentivo con misEmpleados[5].establece incentivo()		//Podemos crear objetos de la clase Padre
//Al ser un objeto de la clase Empleado												//y de las subclases
		misEmpleados[5]=new Jefes("Maria DelaO",75000,2002,2,16);					
		// hay que hacer casting														
		Jefes jefaFinanzas=(Jefes) misEmpleados[5];
//Ahora podemos establecer incentivo porque ya es de la clase Jefes
		jefaFinanzas.estableceIncentivo(5000);
		
		
		
		//FOR CLASICO
//		for (int i=0; i<misEmpleados.length; i++) {
//			
//			misEmpleados[i].subeSueldo(5);
//			
//			System.out.println("Nombre : " +misEmpleados[i].dameNombre() + " Sueldo: " + 
//				misEmpleados[i].dameSueldo() + " Fecha de alta: " + misEmpleados[i].dameFechaContrato());
//		}
		
	//Ordenarlo por sueldo y se pasa como parametro el tipo de objeto
		Arrays.sort(misEmpleados);
		
//		Empleado directorComercial=new Jefes("Misko Jones", 56000, 2003, 7, 25);
//		
//		//Podemos instanciar una interfaz con el principio de sustitucion
//		Comparable ejemplo=new Empleado("Aitor Tilla", 88000, 2008, 4, 13);
//		
//		if (directorComercial instanceof Empleado) {
//			
//			System.out.println("Es de tipo Jefes");
//		}
//		if (ejemplo instanceof Comparable) {
//			
//			System.out.println("Implementa la interfaz Comparable");
//		}
		
		System.out.println(jefaFinanzas.tomarDecisiones("Despedir a " + misEmpleados[1].dameNombre()));  //Rosa Melano es misEmpleados[1] debido a que los ordenamos por salario
		
		//Obtiene el bono del metodo establece bonus de Trabajadores=>Jefes
		System.out.println("El jefe " + jefaFinanzas.dameNombre() + " tiene un bonus de: " + jefaFinanzas.estableceBonus(500));
		
		//Obtiene el bono del metodo establece bonus de Trabajadores=>Empleado
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de: " + misEmpleados[3].estableceBonus(200));
		
	//FOR EACH (e:) variable del tipo que tenemos almacenado dentro del array (Empleado)
		for (Empleado e: misEmpleados) {
			
			e.subeSueldo(5);
			
			System.out.println("Nombre : " + e.dameNombre() + " Sueldo: " + 
					e.dameSueldo() + " Fecha de alta: " + e.dameFechaContrato());
		}			//Cuando el for llega a los objetos de tipo Jefes accede al 
	}				//metodo de la clase Jefes y añade el incentivo (Enlazado dinamico)

}

class Empleado implements Comparable, Trabajadores { //implementa la interfaz Comparable
									   				 //necesaria para usar el metodo
					   				   				 //Array.sort(object[] a)
	//CONSTRUCTOR 1	
	public Empleado(String nom, double sue, int anio, int mes, int dia) {
		
		nombre=nom;
		sueldo=sue;
		
		Id=IdSiguiente;
		IdSiguiente++;
		
		GregorianCalendar calendario = new GregorianCalendar(anio, mes-1, dia);
		
		altaContrato = calendario.getTime();
		
	}
	
	//CONSTRUCTOR 2
	public Empleado(String nom) {
//		Para darle datos por defecto y que no salga sueldo = 0 y
//		altaContrato=null le pasamos los parametros con this() y
//		este llama al contructor que coincide con el numero de 
//		parametros del this()
		
		this(nom, 30000, 2000, 01, 01);
	}
	
//	CONSTRUCTOR 3 => SIN CONSTRUCTOR
// 	Si la clase no tuviera contructor, por defecto es como si
//  tuviera un contructor sin parametros
	public Empleado() {
		
	}
	
public double estableceBonus(double bonificacion) {
		
		return Trabajadores.bunusBase+bonificacion;
	}
	
	public String dameNombre() { //getter
		
		return nombre + " Id: " + Id;
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
	
	public String datosEmpleado() { //getter
		return "El nombre es: " + nombre + " la seccion es " + seccion + " y el Id es " + Id;
	}
	
	public int compareTo(Object miObjeto) {
		
		Empleado otroEmpleado=(Empleado) miObjeto;
														//Al implementar la interfaz 
		if (this.sueldo < otroEmpleado.sueldo) {		//Comparable es necesario redefinir
			return -1;									// el metodo compareTo
		}
		if (this.sueldo > otroEmpleado.sueldo) {
			return 1;
		}
			return 0;
		
	}
	
	private String nombre;
	private String seccion;
	private double sueldo;
	private Date altaContrato;
	private int Id;
	private static int IdSiguiente=1;
}
