package cochepoo;

public class Coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int pesoPlataforma;
	private String color;
	private int pesoTotal;
	private boolean asientosCuero, climatizador;
	
	public Coche() {
		
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		pesoPlataforma=500;
		
	}
	
	public String datosGenerales() { //getter
		
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas " +
			". Mide " + largo/1000 + " metros con un ancho de " + ancho +
			" cm y un peso de plataforma de " + pesoPlataforma + "kg";
	}
	
	public void setColor(String colorCoche) { //setter
		
		color=colorCoche;
	}
	
	public String getColor() { //getter
		
		return "El color del coche es " + color;
	}
	
	public void configuraAsientos(String asientosCuero) { //setter
		//Forma correcta de hacer comparacion de strings
		if (asientosCuero.equalsIgnoreCase("si")) {
			
			this.asientosCuero=true;
		} else {
			this.asientosCuero=false;
		}
	}
	
	public String getAsientos() { //getter
		
		if (asientosCuero==true) {
			
			return "El coche tiene asientos de cuero";
		} else {
			return "El coche tiene asientos de serie";
		}
	}
	
	public void configuraClimatizador(String climatizador) { //setter
		//Forma correcta de hacer comparacion de strings
		if (climatizador.equalsIgnoreCase("si")) {
			
			this.climatizador=true;
		} else {
			this.climatizador=false;
		}
	}
	
	public String getClimatizador() { //getter
		
		if (climatizador==true) {
			
			return "El coche tiene climatizador";
		} else {
			return "El coche tiene aire acondicionado";
		}
	}
	
	//NO RECOMENDABLE
	public String dimePesoCoche() { //getter + setter
		
		int pesoCarroceria=500;
		
		pesoTotal=pesoPlataforma+pesoCarroceria;
		
		if (asientosCuero==true) {
			
			pesoTotal += 50;
		}
		if (climatizador==true) {
			
			pesoTotal += 20;
		}
		
		return "El peso del coche es " + pesoTotal + " kg";
		
	}
	
	public int precioCoche() { //getter + setter
		
		int precioBase=15000;
		
		if (asientosCuero==true) {
			
			precioBase += 3000;
		}
		if (climatizador==true) {
			
			precioBase += 2000;
		}
		
		return precioBase;
		
	}
}
