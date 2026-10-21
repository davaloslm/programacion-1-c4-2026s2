package listas;

public class Main {

	public static void main(String[] args) {

		ListaInt lista = new ListaInt();
		lista.agregarAtras(6);
		lista.agregarAtras(6);
		lista.agregarAtras(1);
		lista.agregarAtras(7);
		lista.agregarAtras(6);
		
		lista.imprimir();
//		System.out.println(lista.pertenece(6));
		lista.quitarTodos(6);
		lista.imprimir();
		

	
	}

}
