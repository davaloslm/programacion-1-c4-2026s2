package resolucionParcial29092026;

public class Libro {
	
	String titulo;
	String autor;
	String sucursal;
	String estante;
	int[] numerosInventario;
	Socio[] prestadoA;
	
	public boolean registrarPrestamo(Socio socio) {
		for (int i = 0;  i < this.numerosInventario.length; i++) { //la condcion i <this.prestadoA.length tambien funciona
			if (this.prestadoA[i] == null) {
				this.prestadoA[i] = socio;
				return true;
			}
		}
		return false;
	}


}
