
public class Usuario {

	private String nombre;
	private int edad;
    private String DNI;
	
	public Usuario() {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDNI() {
		return DNI;
	}
	public boolean setDNI(String DNI) {
		
//Comprobamos si las 8 primeras posiciones son numeros, seguida de un guion (opcional(?)), seguida de letra mayuscula de la A a la Z hubiese o no guion
		if (DNI.matches("\\d{8}[-]?[A-Z]")) {
			
			//Si se cumple asignamos DNI y devolvemos true para salir del do while
			this.DNI=DNI;
			return true;
			
		} else { 
			
			//Si no se cumple imprimimos mensaje por pantalla y retornamos falso
			System.out.println("El formato de DNI no es válido");
			return false;
		}
		
	}
	public String toString() {
		return "El usuario se llama " + nombre + ", tiene " + edad + " años y el DNI es " + DNI;
	}
	
}
