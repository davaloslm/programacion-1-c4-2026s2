package resolucionParcial13062023;

import java.util.ArrayList;
import java.util.Date;

public class Teatro {

	Obra[] obras;

		
		
	
	
	
	
	// Esto no es parte de la resolucion, solo queremos comprobar que los métodos
	// funcionen correctamente
	// Juan y Maria compran 7 asientos cada uno
	// La obra mas barata es "Romeo y Julieta" (sector paraiso a $1500)
	// Las funciones agotadas son: El fantasma de la opera (funcion 1 15 Nov 2025) y
	// La casa de Bernarda Alba (unica funcion 1 Dic 2025 )
	public void cargarDatos() {

		// Crear usuarios
		Usuario juan = new Usuario();
		juan.nombre = "Juan Pérez";

		Usuario maria = new Usuario();
		maria.nombre = "María González";

		Usuario carlos = new Usuario();
		carlos.nombre = "Carlos Rodríguez";

		// === OBRA 1: "El Fantasma de la Ópera" ===
		Obra obra1 = new Obra();
		obra1.nombre = "El Fantasma de la Ópera";
		obra1.funciones = new Funcion[2];

		// Función 1 de Obra 1 (AGOTADA)
		Funcion f1 = new Funcion();
		f1.fecha = new Date(125, 10, 15); // 15 Nov 2025
		f1.horaInicio = new Date(20, 0, 0);
		f1.sectores = new Sector[2];

		// Sector Platea (precio alto, todos vendidos)
		Sector platea1 = new Sector();
		platea1.nombre = "Platea";
		platea1.precio = 5000.0;
		platea1.asientos = new Asiento[4]; // 2x2

		// Llenar platea con asientos vendidos a Juan
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				Asiento a = new Asiento();
				a.fila = i;
				a.columna = j;
				a.usuario = juan; // Juan compró 4 asientos x $5000 = $20000
				platea1.asientos[i * 2 + j] = a;
			}
		}

		// Sector Pullman (precio medio, todos vendidos)
		Sector pullman1 = new Sector();
		pullman1.nombre = "Pullman";
		pullman1.precio = 3000.0;
		pullman1.asientos = new Asiento[4]; // 2x2

		// Llenar pullman con asientos vendidos a María
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				Asiento a = new Asiento();
				a.fila = i;
				a.columna = j;
				a.usuario = maria; // María compró 4 asientos x $3000 = $12000
				pullman1.asientos[i * 2 + j] = a;
			}
		}

		f1.sectores[0] = platea1;
		f1.sectores[1] = pullman1;
		obra1.funciones[0] = f1;

		// Función 2 de Obra 1 (NO AGOTADA)
		Funcion f2 = new Funcion();
		f2.fecha = new Date(125, 10, 20); // 20 Nov 2025
		f2.horaInicio = new Date(19, 0, 0);
		f2.sectores = new Sector[1];

		Sector platea2 = new Sector();
		platea2.nombre = "Platea";
		platea2.precio = 5000.0;
		platea2.asientos = new Asiento[4];

		// Solo algunos asientos vendidos
		for (int i = 0; i < 4; i++) {
			Asiento a = new Asiento();
			a.fila = i / 2;
			a.columna = i % 2;
			if (i < 2) {
				a.usuario = carlos; // Carlos compró 2 asientos x $5000 = $10000
			} else {
				a.usuario = null; // Asientos libres
			}
			platea2.asientos[i] = a;
		}

		f2.sectores[0] = platea2;
		obra1.funciones[1] = f2;

		// === OBRA 2: "Romeo y Julieta" ===
		Obra obra2 = new Obra();
		obra2.nombre = "Romeo y Julieta";
		obra2.funciones = new Funcion[1];

		Funcion f3 = new Funcion();
		f3.fecha = new Date(125, 10, 25); // 25 Nov 2025
		f3.horaInicio = new Date(21, 0, 0);
		f3.sectores = new Sector[1];

		// Sector Paraíso (precio BAJO - la más barata)
		Sector paraiso = new Sector();
		paraiso.nombre = "Paraíso";
		paraiso.precio = 1500.0; // LA MÁS BARATA
		paraiso.asientos = new Asiento[6];

		// Algunos vendidos, otros libres
		for (int i = 0; i < 6; i++) {
			Asiento a = new Asiento();
			a.fila = i / 3;
			a.columna = i % 3;
			if (i < 3) {
				a.usuario = juan; // Juan compró 3 más x $1500 = $4500
			} else if (i == 3) {
				a.usuario = maria; // María compró 1 más x $1500 = $1500
			} else {
				a.usuario = null; // Libres
			}
			paraiso.asientos[i] = a;
		}

		f3.sectores[0] = paraiso;
		obra2.funciones[0] = f3;

		// === OBRA 3: "La Casa de Bernarda Alba" ===
		Obra obra3 = new Obra();
		obra3.nombre = "La Casa de Bernarda Alba";
		obra3.funciones = new Funcion[1];

		Funcion f4 = new Funcion();
		f4.fecha = new Date(125, 11, 1); // 1 Dic 2025
		f4.horaInicio = new Date(18, 30, 0);
		f4.sectores = new Sector[1];

		Sector platea3 = new Sector();
		platea3.nombre = "Platea";
		platea3.precio = 4000.0;
		platea3.asientos = new Asiento[2];

		// Todos vendidos a María (AGOTADA)
		for (int i = 0; i < 2; i++) {
			Asiento a = new Asiento();
			a.fila = 0;
			a.columna = i;
			a.usuario = maria; // María compró 2 más x $4000 = $8000
			platea3.asientos[i] = a;
		}

		f4.sectores[0] = platea3;
		obra3.funciones[0] = f4;

		// Asignar obras al teatro
		this.obras = new Obra[3];
		this.obras[0] = obra1;
		this.obras[1] = obra2;
		this.obras[2] = obra3;
	}
}
