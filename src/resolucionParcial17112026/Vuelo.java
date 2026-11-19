package resolucionParcial17112026;

public class Vuelo {
	String origen;
	String destino;
	String aerolinea;
	int[] numerosAsientos;
	Pasajero[] ocupadoPor;
	
	
	public boolean estaCompleto() {
		for (Pasajero p : this.ocupadoPor) {
			if (p == null) {
				return false;
			}
		}
		return true;
	}
}
