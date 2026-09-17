package ejemploForEach;

import claseFecha.Fecha;

public class EjemploForEach {

	public static void main(String[] args) {
		
		//Creamos arreglos de objetos. Por ejemplo, un arreglos de Strings
		String[] palabras = {"hola", "mundo", "java"};
		
		//podemos recorrer por indice
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}
		
		//Recorrer por elemento con forEach
		for (String p : palabras) {
			System.out.println(p);
		}
		
		
		
		//Otro ejemplo: arreglo de objetos Fecha
		Fecha[] fechas = new Fecha[3];
		fechas[0] = new Fecha(1,5,1999);
		fechas[1] = new Fecha(1,3,2002);
		fechas[2] = new Fecha(1,7,2020);
		
		//recorrer por indice
		for (int i = 0; i < fechas.length; i++) {
			fechas[i].imprimir();
		}
		
		//recorrer por elemento
		for (Fecha fecha : fechas) {
			fecha.imprimir();
		}
	}

}
