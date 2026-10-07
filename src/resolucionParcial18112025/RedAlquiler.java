package resolucionParcial18112025;


public class RedAlquiler {
	Sucursal[] sucursales;
	
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
