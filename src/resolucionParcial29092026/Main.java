package resolucionParcial29092026;

public class Main {

	public static void main(String[] args) {

		Biblioteca biblioteca = new Biblioteca();
	    biblioteca.cargarDatos();

	    Socio ana   = biblioteca.libros[0].prestadoA[0];
	    Socio bruno = biblioteca.libros[1].prestadoA[0];
	    Socio carla = biblioteca.libros[3].prestadoA[0];
	    Socio nuevo = new Socio(); // sin préstamos

	    // cantPrestamos
	    System.out.println("cantPrestamos");
	    System.out.println("Ana:   " + biblioteca.cantPrestamos(ana));   // esperado 3
	    System.out.println("Bruno: " + biblioteca.cantPrestamos(bruno)); // esperado 2
	    System.out.println("Carla: " + biblioteca.cantPrestamos(carla)); // esperado 1
	    System.out.println("Nuevo: " + biblioteca.cantPrestamos(nuevo)); // esperado 0

	    // registrarPrestamo
	    System.out.println("\nregistrarPrestamo");
	    System.out.println("libro 0 (1 disponible):        " + biblioteca.libros[0].registrarPrestamo(nuevo)); // true
	    System.out.println("libro 0 (ya sin disponibles):  " + biblioteca.libros[0].registrarPrestamo(nuevo)); // false
	    System.out.println("libro 1 (todos prestados):" + biblioteca.libros[1].registrarPrestamo(nuevo)); // false
	    System.out.println("libro 2 (1 disponible):        " + biblioteca.libros[2].registrarPrestamo(nuevo)); // true
	    System.out.println("libro 2 (ya sin disponibles):  " + biblioteca.libros[2].registrarPrestamo(nuevo)); // false
	    System.out.println("libro 3 (1 disponible):        " + biblioteca.libros[3].registrarPrestamo(nuevo)); // true
	    System.out.println("libro 3 (ya sin disponibles):  " + biblioteca.libros[3].registrarPrestamo(nuevo)); // false
	    System.out.println("libro 4 (sin préstamos):  " + biblioteca.libros[4].registrarPrestamo(nuevo)); // true
	    System.out.println("libro 4 (ya sin disponibles):  " + biblioteca.libros[4].registrarPrestamo(nuevo)); // false

	}


}
