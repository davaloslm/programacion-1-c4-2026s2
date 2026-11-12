package resolucionParcial13062023;

import java.util.Date;

public class Funcion {
	Date fecha;
	Date horaInicio; //La consigna dice Time horaInicio, pero Java no tiene ese tipo de dato. Cambio a Date solo para que compile.
	Sector[] sectores;
	
	//metodo auxiliar para agotadas()
	public boolean estaAgotada() {
		for (Sector s : sectores) {
			for (Asiento a : s.asientos) {
				if (a.usuario == null) {
					return false;
				}
			}
		}
		return true;
	}
	


}
