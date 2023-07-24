import java.util.List;
import java.util.ArrayList;

public class Cuenta {

	private double saldo;
	private Usuario usuario;
	private List<Gasto> gastos;
	private List<Ingreso> ingresos;
	
	public Cuenta(Usuario usuario) {
		
		this.usuario=usuario;
		this.gastos = new ArrayList<>();
	    this.ingresos = new ArrayList<>();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo += saldo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public void addIngresos(String description, double cantidad) {
		
		//Añadimos el ingreso al saldo de la cuenta
		this.saldo = saldo + cantidad;
		
		//Añadimos el movimiento a la lista
		ingresos.add(new Ingreso(cantidad, description));
		
		//Cambiamos el formato de (saldo) para que se muestre con coma y 2 decimales 
		String resultado = String.format("%.2f", saldo);
		
		//Imprimimos saldo actualizado posterior al ingreso con el formato aplicado
		System.out.println("Su saldo actual es de " + resultado + "€");
	}
	
	public void addGastos(String description, double cantidad) throws GastoException {
		
		//Si gasto > saldo => Excepcion de tipo GastoException
		if (cantidad > saldo) {
			throw new GastoException();
		
		} else {  //Si no aplicamos el procedimiento normal
			
			//Restamos el gasto del dinero de la cuenta
			this.saldo = saldo - cantidad;
			
			//Añadimos el movimiento a la lista
			gastos.add(new Gasto(cantidad, description));
			
			//Cambiamos el formato de (saldo) para que se muestre con coma y 2 decimales 
			String resultado = String.format("%.2f", saldo);
			
			//Imprimimos saldo actualizado posterior al ingreso con el formato aplicado
			System.out.println("Su saldo actual es de " + resultado + "€");
			
		}
	}

	public List<Gasto> getGastos() {
			return gastos;
	}

	public List<Ingreso> getIngresos() {
		return ingresos;
	}
	
	public String toString() {
		
		//Cambiamos el formato de (saldo) para que se muestre con coma y 2 decimales 
		String resultado = String.format("%.2f", saldo);
		
		//Retornamos el String con el formato aplicado
		return "El usuario " + usuario.getNombre() + " tiene un saldo de " + resultado + "€";
	}

	
}
