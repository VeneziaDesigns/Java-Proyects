package prueba;

import java.util.*;

public class UsoEnum {
	
	//enum Talla {S, M, XL, XXL};  //El tipo enum no se puede 
								 //declarar dentra del Main
	
	enum Talla{
		
		MINI("S"), MEDIANO("M"), GRANDE("XL"), MUYGRANDE("XXL");	//Tambien se puede hacer un constructor 
																	//con un parametro para que al pasarle 	
		private Talla(String abreviatura) {							//"M" lo asocie a mediano y es private 
			 this.abreviatura=abreviatura;							//porque enum no admite la creacion de objetos
		}
		
		public String getAbrebiatura() { //getter
			return abreviatura;
		}
		
		private String abreviatura;
	}
	
	public static void main(String[] args) {
		
//		Talla pequeña=Talla.S;
//		Talla mediana=Talla.M;
//		Talla grande=Talla.XL;
//		Talla muyGrande=Talla.XXL;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE, MUYGRANDE");
		
		String entrada=sc.next().toUpperCase();
		
		Talla laTalla=Enum.valueOf(Talla.class, entrada); //Pide 2 params (clase a la que pertenece) y (String introducido)
		
		System.out.println("Talla=" + laTalla);
		
		System.out.println("Abrebiatura=" + laTalla.getAbrebiatura());
		
		sc.close();
		
	}

}
