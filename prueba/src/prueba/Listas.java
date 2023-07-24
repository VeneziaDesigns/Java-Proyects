package prueba;

import java.util.*;

import personas.Personas;

public class Listas {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<>();
		
		//Insertamos valores
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		
		//Insertamos indicando la posicion
		numeros.add(0,1);
		numeros.add(1,2);
		
		for (int i = 0; i<numeros.size(); i++) {
			System.out.println(numeros.get(i)); //Comprobamos
		}
		
		System.out.println("--------------------------------------");
		
		//Donde lo insertara?
		numeros.add(7);
		
		for (int i = 0; i<numeros.size(); i++) {
			System.out.println(numeros.get(i)); //Comprobamos
		}
		
		System.out.println("--------------------------------------");
		
		//Que pasa si queremos añadir un elemento en 
		//una posicion superior al tamaño de la lista?
		//numeros.add(9,9);
		System.out.println("Tamaño de la lista: " + numeros.size());
		
		numeros.set(2, 10); //Posicion 2 valor 10
		for (int i = 0; i<numeros.size(); i++) {
			System.out.println(numeros.get(i)); //Comprobamos
		}
		
		System.out.println("--------------------------------------");
		
		numeros.remove(2); //Elimina el elemento de la posicion indicada
		for (int i = 0; i<numeros.size(); i++) {
			System.out.println(numeros.get(i)); //Comprobamos
		}
		
		System.out.println("--------------------------------------");
		
		//Para recorrer las colecciones tambien
		//se puede usar el Iterator()
		Iterator<Integer> iterator= numeros.iterator();
		
		while(iterator.hasNext()) { 				//El metodo hasNext devuelve true si existe un 
			System.out.println(iterator.next());	//elem a continuacion, si no devuelve false
		}
//-------------------------------------------------------------------------------------------------------------
		//USO DE FOR EACH
		
		//Instanciamos los objetos
		Personas señorX=new Personas();
		Personas Ana=new Personas("Ana", "Casquero", "Havrylova", 'M', 30, "Monteperdido");
		Personas Adrian=new Personas("Adrian", "Huarte", "Franceschini", 'V', 32, "Chorriflautis");
		
		//Declaramos Array de personas
		Personas[] pp = {señorX, Ana, Adrian};
		
		//for each
		for (Personas p : pp) {
			System.out.println("La persona: " + p.getnombre() + " " + p.getapellido1() + " " + p.getapellido2() + " tiene " + p.getedad() + " años");
		}
		
//---------------------------------------------------------------------------------------------------------------
		
		System.out.println("    ----USO DE LIST=>LINKEDLIST----    ");
		
		LinkedList<Integer>linkedNum = new LinkedList<>(); //Lista de enteros
		
		linkedNum.add(2);
		linkedNum.addLast(3);
		linkedNum.addFirst(1);
		linkedNum.add(3,4); //Indice 3 => valor 4
		
		System.out.println("Mostramos la lista con FOR...");
		
		for (int i: linkedNum) {
			System.out.println(i);
		}
		
		System.out.println("Mostramos la lista con ITERATOR...");
		
		Iterator <Integer> iteratorLK = linkedNum.iterator();
		
		while (iteratorLK.hasNext()) {
			System.out.println(iteratorLK.next());
		}
		
//-----------------------------------------------------------------------------------------------------------------------------
		
					//HASHSET
		
		HashSet<String> hashSet = new HashSet<String>();
		
		//Insertamos elementos en el hashSet
		hashSet.add("Alba");
		hashSet.add("Laura");
		hashSet.add("Luis");
		System.out.println("HashSet= " + hashSet);
		
		boolean b = hashSet.add("Carlos");
			
		if (b) {
			System.out.println("Elemento añadido al hashSet");
		} else {
			System.out.println("ERROR: El elemento no existe");
		}
		//Se añade a Carlos
		System.out.println("HashSet= " + hashSet);
		//Eliminar un elem del hashSet
		boolean r = hashSet.remove("Ana");
		
		if (r) {
			System.out.println("Elemento añadido al hashSet");
		} else {
			System.out.println("ERROR: El elemento no existe");
		}
		
//-----------------------------------------------------------------------------------------------------------------
		//COLAS - QUEUE => ARRAYDEQUE
		
		System.out.println("---------------------------------------------------------------------");
		
		ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
		arrayDeque.add(1);
		arrayDeque.addFirst(0);
		System.out.println(arrayDeque.peek());
		arrayDeque.push(2);
		System.out.println(arrayDeque.toString());
		System.out.println(arrayDeque.pollFirst());
		System.out.println(arrayDeque.pollLast());
		System.out.println(arrayDeque.toString());
		
		//-----------------------------------------------------------------------------------------------------------------
		//MAP - 
	}

}
