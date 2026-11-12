package resolucionParcial10112026;

public class Libro {

	String titulo;
	String autor;
	String sucursal;
	int[] numerosInventario;
	Socio[] prestadoA;
	
	public int cantidadDisponible() {
		int cant = 0;
		
		for (Socio socio : this.prestadoA) {
			if (socio == null) {
				cant++;
			}
			
		}
		
		return cant;
	}
}
