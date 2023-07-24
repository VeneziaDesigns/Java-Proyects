package prueba;

public class Pruebas2 {

	public static void main(String[] args) {

		Empleados empleado1 = new Empleados("Paco Porras");
		Empleados empleado2 = new Empleados("Ana Banana");
		Empleados empleado3 = new Empleados("Antonio Machine");
		
		empleado1.cambiaSeccion("RRHH");
		empleado2.cambiaSeccion("Compras");
		
		System.out.println(empleado1.devuelveDatos() + "\n" + 
		empleado2.devuelveDatos() + "\n" + empleado3.devuelveDatos());
		
		System.out.println(Empleados.dameIdSiguiente());
	}

}

class Empleados{
	
	private final String nombre; //final=>No puede ser modificado de ninguna manera(const)
	
	private String seccion; //Sin static cada objeto tiene una copia de las variables

	private int Id; 
	
	private static int IdSiguiente=1; //static la variable Id es compartida por todos los objetos
	                               //     \
	public Empleados(String nom) { //      \
								   //       |
		nombre=nom;				   //       |
							       //       |
		seccion="Administracion";  //       | 
								   //		|
		Id=IdSiguiente;    //Declaramos Id=IdSiguiente para que asigne Id=1
						   //al primer objeto y hacemos un incremento de
		IdSiguiente++;     //IdSiguiente para que sea autoincremental
		
	}
	
	public void cambiaSeccion(String seccion) { //setter
		this.seccion=seccion;
	}
	
	public String devuelveDatos() { //getter
		return "El nombre es: " + nombre +", la seccion es " + seccion
				+ " y el ID es " + Id;
	}
	
	public static String dameIdSiguiente(){
		
		return "El IdSiguiente es: " + IdSiguiente;
	}
}
