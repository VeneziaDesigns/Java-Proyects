package personas;

public class Personas {
	/*Atributos*/
	protected String nombre;
	protected String apellido1;
	protected String apellido2;            //private => encapsulamiento
	protected char sexo;
	protected int edad;
	protected String direccion;

	
	//Metodo Constructor
	public Personas() {
		nombre = "Misko";             //Sobrecarga de metodos
		apellido1 = "Jones";          //Un objeto puede acceder a distintos
		apellido2 = "Morenos";        //metodos/contructores con el mismo  
		sexo = 'V';                   //nombre en funcion de los parmetros 
		edad = 8;                     //de los parametros que se le pasan
		direccion = "Tocateloswebs";
	}
	public Personas(String nombre, String apellido1, String apellido2, char sexo, int edad, String direccion) {
	//Con this se relaciona el atributo nombre con el parametro nombre
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.apellido2=apellido2;
		this.sexo=sexo;
		this.edad=edad;
		this.direccion=direccion;
	}
	
	/*Metodos getter y setter*/
	
	public String getnombre() {
		return nombre;
	}
	
	public void setnombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getapellido1() {
		return apellido1;
	}
	
	public void setapellido1(String apellido1) {
		this.apellido1=apellido1;
	}
	
	public String getapellido2() {
		return apellido2;
	}
	
	public void setapellido2(String apellido2) {
		this.apellido2=apellido2;
	}
	
	public char getsexo() {
		return sexo;
	}
	
	public void setsexo(char sexo) {
		this.sexo=sexo;
	}
	
	public int getedad() {
		return edad;
	}
	
	public void setedad(int edad) {
		this.edad=edad;
	}
	
	public String getdireccion() {
		return direccion;
	}
	
	public void setdireccion(String direccion) {
		this.direccion=direccion;
	}
	
	//Metodo para mostrar todos los datos
	public String mostrarDatos() {
		return nombre+" "+apellido1+" "+apellido2+
				" sexo "+sexo+" edad "+edad+
				" y vive en "+direccion;
	}
	//Metodo (procedimiento,"void" no tiene return)para 
	//saber si un Objeto Persona es mayor de edad
	public void mayorEdad() {
		if (edad >= 18) {
			System.out.println("Es mayor de edad");
		} else {
			System.out.println("Es menor de edad");
		}
	}
	
}
