package listas;

public class ListaInt {
	
	NodoInt primero;
	
	public void agregarAdelante(int n) {
		NodoInt nuevo = new NodoInt();
		nuevo.elemento = n;
		nuevo.siguiente = this.primero;
		this.primero = nuevo;
	}

	public int largo() {
		int largo = 0;
		NodoInt actual = this.primero;
		while (actual != null) {
			largo++;
			actual = actual.siguiente;
		}
		return largo;
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
	
	public int maximo() {
		int max = 0;
		
		NodoInt actual = this.primero;
		while (actual != null) {
			if (actual.elemento > max) {
				max = actual.elemento;
			}
			actual = actual.siguiente;
			
		}
		return max;
	}
	
	public void quitarTodos(int n) {
		NodoInt actual = this.primero;	
		

		
		while(actual != null && actual.siguiente != null) {
			if (actual.siguiente.elemento == n) {
				actual.siguiente = actual.siguiente.siguiente;
			}
			actual = actual.siguiente;
		}
		
		actual= this.primero;
		if (actual != null && actual.elemento == n) {
			
			this.primero = actual.siguiente;
		}		
		
		
	}
	
	public boolean pertenece(int e) {

		NodoInt actual = this.primero;
		while (actual != null ) {
			if (actual.elemento == e) {
				return true;
			}
			actual = actual.siguiente;
		}
		return false;
	}
}
