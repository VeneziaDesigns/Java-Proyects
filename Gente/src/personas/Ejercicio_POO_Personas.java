package personas;

public class Ejercicio_POO_Personas {

	public static void main(String[] args) {
		//Contruccion de los objetos
		//Instanciar clases
		Personas Ana=new Personas("Ana", "Casquero", "Havrylova", 'M', 30, "Monteperdido");
		Personas Adrian=new Personas("Adrian", "Huarte", "Franceschini", 'V', 32, "Chorriflautis");
		Personas Ivan=new Personas("Ivan", "Huarte", "Franceschini", 'V', 25, "Matheu");
		Personas Cristina=new Personas("Cristina", "Franceschini", "Minchole", 'M', 58, "Plz España");
		Personas Gustavo=new Personas("Gustavo", "Huarte", "Aibar", 'V', 57, "Baselga");

		//mostrarDatos
		System.out.println(Ana.mostrarDatos());
		System.out.println(Adrian.mostrarDatos());
		System.out.println(Ivan.mostrarDatos());
		System.out.println(Cristina.mostrarDatos());
		System.out.println(Gustavo.mostrarDatos());
			
		
		//Extraemos las edades de los objetos
		int[] edades = {Ana.getedad(), Adrian.getedad(),
				Ivan.getedad(), Cristina.getedad(),
				Gustavo.getedad()};
		int mayor = 0;
		//Imprimir el mayor de edad
		for	(int i=0; i<edades.length;i++) {
			if (edades[i] > mayor) {
			mayor = edades[i];
			}
		}
		System.out.println("La mayor edad son "+ 
		mayor +" años");
		
		//Cambiar los datos con set
		Adrian.setedad(17);
		
		
		/*Intanciamos un objeto de la clase persona llamado
		  XD pero no le pasamos ningun parametro asi que coge
		  la clase personas donde ya estan inicializados los 
		  parametros */
		Personas XD = new Personas();
		System.out.println(XD.mostrarDatos());
		
		//Imprimimos el metodo mayorEdad de Adrian, Ana y XD
				Adrian.mayorEdad();
				Ana.mayorEdad();
				XD.mayorEdad();
	}
	
}
