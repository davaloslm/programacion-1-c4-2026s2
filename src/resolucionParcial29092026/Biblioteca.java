package resolucionParcial29092026;

public class Biblioteca {

	Libro[] libros;
	
	int cont = 0;
	
	public int cantPrestamos(Socio unSocio) {
		int cont = 0;
		
		for (Libro libro : this.libros) {
			for (Socio socio : libro.prestadoA) {
				if (socio != null && socio.equals(unSocio)) {
					cont++;
				}
				
			}
		}
		
		return cont;
	}
	
	
	// El método cargar no es parte de la resolucion, solo queremos comprobar que los métodos
	// funcionen correctamente
	public void cargarDatos() {
	    // Socios
	    Socio ana = new Socio();
	    ana.nombre = "Ana Pérez";
	    ana.nroSocio = "0000000001";
	    ana.activo = true;

	    Socio bruno = new Socio();
	    bruno.nombre = "Bruno Gómez";
	    bruno.nroSocio = "0000000002";
	    bruno.activo = true;

	    Socio carla = new Socio();
	    carla.nombre = "Carla Díaz";
	    carla.nroSocio = "0000000003";
	    carla.activo = false;
	    

	    // Libro 0: Don Quijote en sucursal Centro (Ana tiene 2 ejemplares, 1 libre)
	    Libro l0 = new Libro();
	    l0.titulo = "Don Quijote";
	    l0.autor = "Cervantes";
	    l0.sucursal = "Centro";
	    l0.estante = "EST-A001";
	    l0.numerosInventario = new int[] {10001, 10002, 10003};
	    l0.prestadoA = new Socio[] {ana, null, ana};

	    // Libro 1: mismo título/autor en sucursal Norte (todos prestados a Bruno)
	    Libro l1 = new Libro();
	    l1.titulo = "Don Quijote";
	    l1.autor = "Cervantes";
	    l1.sucursal = "Norte";
	    l1.estante = "EST-B010";
	    l1.numerosInventario = new int[] {20001, 20002};
	    l1.prestadoA = new Socio[] {bruno, bruno};

	    // Libro 2: Rayuela (Ana tiene 1, queda 1 libre)
	    Libro l2 = new Libro();
	    l2.titulo = "Rayuela";
	    l2.autor = "Cortázar";
	    l2.sucursal = "Centro";
	    l2.estante = "EST-A002";
	    l2.numerosInventario = new int[] {30001, 30002};
	    l2.prestadoA = new Socio[] {ana, null};

	    // Libro 3: Ficciones (Carla tiene 1, queda 1 libre)
	    Libro l3 = new Libro();
	    l3.titulo = "Ficciones";
	    l3.autor = "Borges";
	    l3.sucursal = "Sur";
	    l3.estante = "EST-C003";
	    l3.numerosInventario = new int[] {40001, 40002};
	    l3.prestadoA = new Socio[] {carla, null};

	    // Libro 4: El Aleph (sin ningún préstamo)
	    Libro l4 = new Libro();
	    l4.titulo = "El Aleph";
	    l4.autor = "Borges";
	    l4.sucursal = "Sur";
	    l4.estante = "EST-C004";
	    l4.numerosInventario = new int[] {50001};
	    l4.prestadoA = new Socio[] {null};

	    this.libros = new Libro[] {l0, l1, l2, l3, l4};
	}
	
}
