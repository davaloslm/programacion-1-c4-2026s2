package resolucionParcial18112025;

import java.util.ArrayList;

public class RedAlquiler {
	Sucursal[] sucursales;
	
	//a)
	public double gastoTotal(Cliente cliente, Ciudad ciudad) {
		
		double total = 0; //acumulador 
		
		//accedo a sucursales
		for (Sucursal sucursal : sucursales) {
			if (sucursal.ciudad.nombre.equals(ciudad.nombre)) {
				for (Auto auto : sucursal.autos) {
					for (Alquiler alquiler : auto.alquileres) {
						if (alquiler.cliente.equals(cliente)) {
							total += alquiler.costoTotal;
						}
					}
				}
			}
		}
		return total;
	}
	
	//b
	public ArrayList<Sucursal> conTodosAutosViejos(int anioMax){
		ArrayList<Sucursal> sucursales = new ArrayList<Sucursal>();
		
		for (Sucursal sucursal : this.sucursales) {
			int contadorAutosViejos = 0;
			
			for (Auto auto : sucursal.autos) {
				if (auto.anio < anioMax) {
					contadorAutosViejos++;
				}
			}
			
			if (contadorAutosViejos == sucursal.autos.length && !sucursales.contains(sucursal)) {
				sucursales.add(sucursal);
			}
		}
		
		return sucursales;
	}
	
	
	//Ejercicio de recuperatorio de este parcial:
	//Escribir el método public Cliente conAlquilerMasAlto() que retorna el cliente que realizó el alquiler ás costoso
	
	public Cliente conAlquilerMasAlto() {
		Cliente clienteMax = null;
		double alquilerMax = 0;
		
		for (Sucursal sucursal : sucursales) {
			for (Auto auto : sucursal.autos) {
				for (Alquiler alquiler : auto.alquileres) {
					if (alquiler.costoTotal > alquilerMax) {
						alquilerMax = alquiler.costoTotal;
						clienteMax = alquiler.cliente;
					}
				}
			}
		}
		return clienteMax;
		
		
		
	}
	
}
