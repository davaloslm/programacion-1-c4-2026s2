package resolucionParcial08112022;

import java.util.LinkedList;

public class EDS {
	Proyecto[] proyectos;
	
	//a
	public LinkedList<Desarrollador> ocupados(Tecnologia t){
		LinkedList<Desarrollador> desarrolladoresOcupados = new LinkedList<Desarrollador>();
		
		for (Proyecto p : this.proyectos) {
			if (p.avance > 0 && p.avance < 100) { //si el proyecto esta en proceso
				for (Desarrollador d : p.desarrolladores) {
					for (Tecnologia tec : d.habilidades) {
						if (tec.equals(t) && !desarrolladoresOcupados.contains(d)) {
							desarrolladoresOcupados.add(d);
							
						}
					}
				}
			}
		}
		return desarrolladoresOcupados;
	}
	
	
	
	
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
