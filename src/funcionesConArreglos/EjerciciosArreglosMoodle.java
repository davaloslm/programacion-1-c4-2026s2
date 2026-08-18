package funcionesConArreglos;

public class EjerciciosArreglosMoodle {

	public static void main(String[] args) {
		
		//definimos un arreglo y llamamos a las funciones que creamos para imprimirlo, calcular su promedio y su valor máximo

		int[] arreglo = {1, 2, 3, 4, 5};
		
		
		imprimir(arreglo);
		System.out.println(promedio(arreglo));
		System.out.println(max(arreglo));

	}
	
	public static void imprimir(int[] a) {
		System.out.print("[ ");
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println("]");
	}
	
	public static double promedio(int[] a) {
		double suma = 0;
		for (int i = 0; i < a.length; i++) {
			suma += a[i];
		}
		return suma / a.length;
	}
	
	 public static int max(int[] a) {
		 int maximo = a[0]; //elegimos un valor maximo arbitrariamente, en este caso el primer elemento del arreglo
		 
		 for (int i = 0; i < a.length; i++) { //recorremos el arreglo
			 if (a[i] > maximo) { //si encontramos un valor mayor al maximo actual, lo guardamos en la variable como nuevo maximo
				 maximo = a[i];
			 }
		 }
		 
		 return maximo;
	 }

}
