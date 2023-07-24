package cochepoo;

public class Furgoneta extends Coche {
	
	private int capacidadCarga;
	private int plazasExtra;
	
	public Furgoneta(int plazasExtra, int capacidadCarga) {
		
		super();   //Llama al contructor de la clase padre
		
		this.capacidadCarga=capacidadCarga;
		this.plazasExtra=plazasExtra;
		
	}
	
	public String getDatosFurgo() {
		
		return "La capacidad de carga es: " + capacidadCarga + ". Y las plazas son: " + plazasExtra;
	}

}
