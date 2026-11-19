package resolucionParcial17112026;

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
	public boolean tieneExtremosIguales() {
		if (this.primero == null) {
			return false;
		}
		
		NodoInt actual = this.primero;
		while (actual.siguiente != null) {
			actual = actual.siguiente;
		}
		
		return this.primero.elemento == actual.elemento;
	}
	
	
	//b)
	public void eliminarPosicionesImpares() {
		
		if (this.primero == null) {
			return;
		}
		
		NodoInt actual = this.primero;
		int posicion = 0;
		
		while (actual != null && actual.siguiente != null) {
			if (posicion % 2 == 0) {
				actual.siguiente = actual.siguiente.siguiente;
			} else {
				actual = actual.siguiente;
			}
			posicion++;
		}
	}
	
	
}
