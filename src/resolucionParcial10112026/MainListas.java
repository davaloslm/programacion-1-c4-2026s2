package resolucionParcial10112026;

public class MainListas {

	public static void main(String[] args) {

		ListaInt lista = new ListaInt();
		
		lista.agregarAtras(6);
		lista.agregarAtras(7);
		lista.agregarAtras(5);
		lista.agregarAtras(8);
		lista.agregarAtras(5);
		lista.agregarAtras(3);
		lista.agregarAtras(3);
		
		lista.imprimir();
		
		System.out.println(lista.tieneRepetidosConsecutivos());

		lista.eliminarPicos();
		
		lista.imprimir();
		
		

	}

}
