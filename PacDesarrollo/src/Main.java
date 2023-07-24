import java.util.Scanner;

public class Main {
	
	public static void mostrarMenu() {
		
		System.out.println("Realiza una nueva acción");	
		System.out.println("1 Introduce un nuevo gasto");
		System.out.println("2 Introduce un nuevo ingreso");
    	System.out.println("3 Mostrar gastos");
    	System.out.println("4 Mostrar ingresos");
		System.out.println("5 Mostrar saldo");
		System.out.println("0 Salir");
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int option;
		
		//Creamos el usuario
		Usuario usuario = new Usuario();
		
		System.out.println("1. Introduzca nombre");
		//Recogemos el String y lo pasamos al metodo setNombre de la clase Usuario para establecer el nombre		
		usuario.setNombre(sc.nextLine());
		
		System.out.println("2. Introduzca edad");
		//Recogemos el int y lo pasamos al metodo setEdad de la clase Usuario para establecer la edad		
		usuario.setEdad(sc.nextInt());
		
		//Limpiamos buffer
		sc.nextLine();
		
//Hacemos un do while para que nos impida pasar de esta intruccion a no ser que el metodo setDNI devuelva true
		do {
			System.out.println("3. Introduzca DNI");				
			
		} while (usuario.setDNI(sc.nextLine()) != true);
		
	
		System.out.println("Hola " + usuario.getNombre() + " con DNI nº " + usuario.getDNI());
		
		//Creamos la cuenta del usuario
		Cuenta cuentaUser = new Cuenta(usuario);
		
		//Hacemos un do while para que mientras (option) sea diferente de 0 
		//podamos navegar por el menú y acceder a las diatintas opciones
		do {
			//Mostramos menú
			mostrarMenu();
			
			//Recogemos el int y lo asignamos a (option)
			option = sc.nextInt();
			
			//Limpiamos buffer
			sc.nextLine();
			
			switch (option) {
				case 1:
					//Recogemos el concepto y la cantidad a gastar
					System.out.println("Introduce un concepto del gasto");
					String descripcionGas = sc.nextLine();
					
					System.out.println("Introduce la cantidad a gastar");
					double dineroGas = sc.nextDouble();
					
					//Limpiamos buffer
					sc.nextLine();
					
					//Comprobar GastoException
					try {
						
				//Llamamos al metodo addGastos y le pasamos com parametros el concepto y la cantidad a gastar
						cuentaUser.addGastos(descripcionGas, dineroGas);
						
					} catch (GastoException e) {
						
						//Si se da el caso de la excepcion imprimimos el siguiente mensaje
						System.out.println("El saldo de la cuenta es insuficiente");
					}
					break;
				case 2:
					//Recogemos el concepto y la cantidad a ingresar
					System.out.println("Introduce un concepto del ingreso");
					String descripcionIng = sc.nextLine();
					
					System.out.println("Introduce la cantidad a ingresar");
					double dineroIng = sc.nextDouble();
					
					//Limpiamos buffer
					sc.nextLine();
					
				//Llamamos al metodo addIngresos y le pasamos com parametros el concepto y la cantidad a ingresar
					cuentaUser.addIngresos(descripcionIng, dineroIng);
					break;
			    case 3:
	    	//Iteramos el metodo getGastos() para que se imprima en distintas líneas
			    	for (Gasto g : cuentaUser.getGastos()) {
			    	    System.out.println(g);
			    	}
			    	break;
			    case 4:
	    	//Iteramos el metodo getGastos() para que se imprima en distintas líneas
			    	for (Ingreso i : cuentaUser.getIngresos()) {
						System.out.println(i);
			    	}
			    	break;
				case 5:
		//Llamamos al metodo toString() que nos devuelve mas información a parte del saldo
					System.out.println(cuentaUser.toString());
					break;
				case 0:
					
					//Imprimimos estas 2 líneas y finaliza el programa
					System.out.println("Fin del programa.");
					System.out.println("Gracias por utilizar la aplicación de M03B en el curso 2s2223.");
					break;
				default:
					//Imprime esta línea si el case no esta entre los contemplados
					System.out.println("Opción inválida");
					break;	
			}
			
		} while (option != 0);
		
		sc.close();
		
	}

}
