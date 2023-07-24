package ficheros;

import personas.Personas;

public class Alumno extends Personas {
	
	private String[] modulos;
	
	public Alumno(String nombre, String apellido1, int edad, String direccion, String[] modulos) {
		this.nombre=nombre;
		this.apellido1=apellido1;
		this.edad=edad;
		this.direccion=direccion;
		this.modulos=modulos;
	}

	public String[] getModulos() {
		return modulos;
	}

	public void setModulos(String[] modulos) {
		this.modulos = modulos;
	}
}
