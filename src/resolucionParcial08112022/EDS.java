package resolucionParcial08112022;


public class EDS {
	Proyecto[] proyectos;
	
	
	//b
	public Software elaboradoPorExpertos() {
		
		Software softwareElaboradoPorExpertos = null;
		int cantMaxExpertos = 0; //maximo de todos los proyectos
		
		for (Proyecto proyecto : proyectos) {
			int contadorExpertos = 0;
			for (Desarrollador desarrollador : proyecto.desarrolladores ) {
				if (desarrollador.experiencia >= 10) {// si tiene 10 o mas años de experiencia
					contadorExpertos++;
				}
		
			}
			if (contadorExpertos > cantMaxExpertos) {
				cantMaxExpertos = contadorExpertos;
				softwareElaboradoPorExpertos = proyecto.producto;
			}
		}
		
		return softwareElaboradoPorExpertos;
		
	}
	
}
