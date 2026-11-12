package resolucionParcial10112026;

public class Sucursal {
	String nombre;
	String ciudad;
	Biblioteca biblioteca;
	
	
	public int cantidadPrestamos() {
		int cantidadPrestamos = 0;
		for (Libro libro : biblioteca.libros) {
			for (Socio socio : libro.prestadoA) {
				if (socio != null) {
					cantidadPrestamos++;
				}
			}
		}
		
		return cantidadPrestamos;
	}
}
