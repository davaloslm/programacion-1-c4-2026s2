package resolucionParcial10112026;

import java.util.LinkedList;

public class Red {

	String nombre;
	Sucursal[] sucursales;
	
	//a) con metodo auxiliar en clase sucursal
	public Sucursal sucursalConMasPrestamos() {
		
		if (sucursales == null || sucursales.length == 0) {
			return null;
		}
		
		Sucursal sucursalConMasPrestamos = null;
		int maxPrestamos = 0;
		
		for (Sucursal s : this.sucursales) {
			if (s.cantidadPrestamos() > maxPrestamos) {
				maxPrestamos = s.cantidadPrestamos();
				sucursalConMasPrestamos = s;	
			}
		}
		
		return sucursalConMasPrestamos;
	}
	
	//b) con metodo auxiliar en clase libro
	public LinkedList<Libro> librosDisponiblesDe(String autor, int min){
		LinkedList<Libro> librosDisponibles = new LinkedList<>();
		
		for (Sucursal s : this.sucursales) {
			for (Libro l : s.biblioteca.libros) {
				if (l.autor.equals(autor) && l.cantidadDisponible() >= min && !librosDisponibles.contains(l)) {
					librosDisponibles.add(l);			
				}
			}
		}
		
		return librosDisponibles;
	}
}
