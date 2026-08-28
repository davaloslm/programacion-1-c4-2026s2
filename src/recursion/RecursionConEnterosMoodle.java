package recursion;

public class RecursionConEnterosMoodle {
	
	public static void main(String[] args) {
		//System.out.println(sumaDesdeUnoHasta(5));
		//imprimirHasta(5);
		//imprimirDesde(5);
		//System.out.println(sumaDeCuadrados(4));
		System.out.println(potencia(3,3));
	}
	
	public static int sumaDesdeUnoHasta(int n) {
		if (n == 1) { //caso base
			return 1;
		} else {
			return n + sumaDesdeUnoHasta(n - 1); //caso recursivo
		}
	}
	
	public static void imprimirHasta(int n) {
		if (n == 0) {
			return;
		} else {
			imprimirHasta(n-1);
			System.out.println(n);
		}
	}
	
	public static void imprimirDesde(int n) {
		if (n == 0) {
			return;
		} else {
			System.out.println(n);
			imprimirDesde(n-1);
		}
	}
	
	public static int sumaDeCuadrados(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n*n + sumaDeCuadrados(n-1);
		}
	}
	
	public static int potencia(int base, int exponente) {
		if (exponente == 1) {
			return base;
		} else {
			return base * potencia(base, exponente-1);
		}
	}
	
	
	

}
