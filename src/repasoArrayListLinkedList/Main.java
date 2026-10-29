package repasoArrayListLinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {

		ArrayList<String> letras = new ArrayList<>(); // noten que si cambian de ArrayList a LinkedList, los metodos son los mismos
//		LinkedList<String> letras = new LinkedList<>();

		System.out.println(letras.toString()); // toString muestra el contenido del arraylist
		letras.add("a"); // por defecto agregar al final
		letras.add("b");
		letras.add("c");
		System.out.println(letras.toString());
		letras.addFirst("z"); // agregar al principio
		System.out.println(letras.toString());
		letras.remove("a"); // se puede quitar por elemento
		System.out.println(letras.toString());
		letras.remove(1); // se puede quitar por posicion
		System.out.println(letras.toString());
		letras.add(1, "w"); // se puede agregar en una posicion determinada
		System.out.println(letras.toString());

		System.out.println(letras.isEmpty()); // retorna true si esta vacio

		System.out.println(letras.contains("w")); // retorna true si contiene el elemento

		System.out.println(letras.size()); // retorna la cantidad de elementos

		
		
		// 2 formas de recorrer un ArrayList
		
		// por indice
		for (int i = 0; i < letras.size(); i++) {
			System.out.print(letras.get(i)); // get para obtener el elemento en la posicion i
		}

		System.out.println();

		// por elemento (for each)
		for (String letra : letras) {
			System.out.print(letra);
		}

	}

}
