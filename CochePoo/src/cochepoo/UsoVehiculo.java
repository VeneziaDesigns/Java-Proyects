package cochepoo;

import javax.swing.*; //PAQUETE PARA UTILIZAR JOPTIONPANE

public class UsoVehiculo {

	public static void main(String[] args) {
		
//		Coche micoche=new Coche(); 
//
//		micoche.setColor(JOptionPane.showInputDialog("Introduce color"));
//		
//		System.out.println(micoche.datosGenerales());
//		System.out.println(micoche.getColor());
//		
//		micoche.configuraAsientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
//		System.out.println(micoche.getAsientos());
//		
//		micoche.configuraClimatizador(JOptionPane.showInputDialog("Tiene climatizador?"));
//		System.out.println(micoche.getClimatizador());
//		
//		System.out.println(micoche.dimePesoCoche());
//		
//		System.out.println("El precio final del coche es: " + micoche.precioCoche());
	
		Coche micoche1=new Coche();
		micoche1.setColor("Rojo");
		
		Furgoneta mifurgo=new Furgoneta(7, 580);
		mifurgo.setColor("Blanco");
		mifurgo.configuraAsientos("si");
		mifurgo.configuraClimatizador("si");
		
		System.out.println(micoche1.datosGenerales() +" "+ micoche1.getColor());
		System.out.println(mifurgo.datosGenerales() +" "+ mifurgo.getColor() +" "+ mifurgo.getDatosFurgo());
	}

}
