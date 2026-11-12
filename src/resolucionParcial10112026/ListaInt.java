package resolucionParcial10112026;

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


	public void imprimir() {
		
		NodoInt actual = this.primero;
		
		System.out.print("[ ");
		while (actual != null) {
			System.out.print(actual.elemento + " ");
			actual = actual.siguiente;
		}
		System.out.println("]");
		
	}
	
	//a)
	public boolean tieneRepetidosConsecutivos() {
		if (this.primero == null) {
			return false;
		}
		
		NodoInt actual = this.primero;
		while (actual.siguiente != null) {
			if (actual.elemento == actual.siguiente.elemento) {
				return true;
			}
			actual = actual.siguiente;
		}
		
		return false;
	}
	
	//b)
	public void eliminarPicos() {
		
		if (this.primero == null || this.primero.siguiente == null) {
			return;
		}
		
		NodoInt actual = this.primero;
		while (actual.siguiente != null && actual.siguiente.siguiente != null) {
			if (actual.elemento < actual.siguiente.elemento && actual.siguiente.elemento > actual.siguiente.siguiente.elemento) {
				actual.siguiente = actual.siguiente.siguiente;
			} else {
				actual = actual.siguiente;
			}
		}
	}
	
	
	
	
}
