package resolucionParcial17112026;

import java.util.ArrayList;
import java.util.LinkedList;

public class Aerolinea {
	String nombre;
	Aeropuerto[] aeropuertos;
	
	//a)con metodo auxiliar en clase Vuelo
	public ArrayList<Vuelo> vuelosCompletos(){
		ArrayList<Vuelo> vuelosCompletos = new ArrayList<>();
		
		for (Aeropuerto a : this.aeropuertos) {
			for (Vuelo v : a.terminal.vuelos) {
				if (v.estaCompleto() && !vuelosCompletos.contains(v)) {
					vuelosCompletos.add(v);
				}
			}
		}
		return vuelosCompletos;
	}
	
	//b)
	public LinkedList<Pasajero> pasajerosEnAeropuerto(String nombreAeropuerto){
		LinkedList<Pasajero> pasajeros = new LinkedList<>();
		
		for (Aeropuerto a : this.aeropuertos) {
			for (Vuelo  v: a.terminal.vuelos) {
				if (v.origen.equals(nombreAeropuerto) || v.destino.equals(nombreAeropuerto)) {
					for (Pasajero p : v.ocupadoPor) {
						if (p != null && !pasajeros.contains(p)) {
							pasajeros.add(p);
						}
					}
				}
				
			}
		}
		
		return pasajeros;
	}

}
