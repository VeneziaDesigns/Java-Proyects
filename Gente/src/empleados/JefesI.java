package empleados;

public interface JefesI extends Trabajadores { //Hereda de la interfaz Trabajadores
	
	//Por defecto si no ponemos nada es public abstract debido a que se debe redefinir en cada clase
	String tomarDecisiones(String decision);
	
}
