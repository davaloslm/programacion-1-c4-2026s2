package resolucionParcial18112025;

public class ListaInt {
	
	NodoInt primero;
	
	public void agregarAdelante(int n) {
		NodoInt nuevo = new NodoInt();
		nuevo.elemento = n;
		nuevo.siguiente = this.primero;
		this.primero = nuevo;
	}

	public void agregarAtras(int n) {
		NodoInt nuevo = new NodoInt();
		nuevo.elemento = n;
				
		if (this.primero == null) //si la lista esta vacia
			this.primero = nuevo;
		else {
			NodoInt actual = this.primero;
			while (actual.siguiente != null) {//|
				actual = actual.siguiente;
			}
			actual.siguiente = nuevo;
		}
	}

	public void quitar(int x) {
		NodoInt actual = this.primero;
		
		if (actual != null && actual.elemento ==x) { //si el que hay que quitar es el primero
			this.primero = actual.siguiente;
		}
		
		//si no, recorrer hasta el penultimo
		while (actual != null && actual.siguiente != null) {
			if (actual.siguiente.elemento == x) {
				actual.siguiente = actual.siguiente.siguiente;
				return; //terminar el metodo porque solo hay que quitar la primera aparicion
			}
			actual = actual.siguiente;
					
		}
	}

	public void imprimir() {
		
		NodoInt actual = this.primero;
		
		System.out.print("[ ");
		while (actual != null) {
			System.out.print(actual.elemento + " ");
			actual = actual.siguiente;
		}
		System.out.println("]");
		
	}
	
	
	public int rango() {
		if (this.primero == null) {
			return 0;
		}
		
		int minimo = this.primero.elemento;
		int maximo = this.primero.elemento;
		
		NodoInt actual = this.primero;
		while (actual != null) {
			if (actual.elemento < minimo) {
				minimo = actual.elemento;
			}
			if (actual.elemento > maximo) {
				maximo = actual.elemento;
			}
			actual = actual.siguiente;
		}
		
		return maximo - minimo;
		
	}

}
