package recursion;

public class Ejemplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(factorial(4));
		//System.out.println(sumaDesdeUnoHasta(7));
		//imprimirHasta(3);
		//imprimirDesde(3);
		System.out.println(sumaDeCuadradosHasta(5));
	}

	public static int factorial(int n) {
		if (n==0) {
			return 1;
		}else {
			return n * factorial(n - 1);
		}
	}
	
	public static int sumaDesdeUnoHasta(int n) {
		if (n == 1) { //caso base
			return 1;
		} else {
			return n + sumaDesdeUnoHasta(n-1);
		}
	}
	
	public static void imprimirHasta(int n) {
		if (n == 0) { //caso base
			return;
		} else { //caso recursivo
			imprimirHasta(n-1);
			System.out.println(n);

		}
	}
	
	public static void imprimirDesde(int n) {
		if (n == 0) { //caso base
			return;
		} else { //caso recursivo
			System.out.println(n);
			imprimirDesde(n-1);

		}
	}
	
	public static int sumaDeCuadradosHasta(int n) {
		if (n == 1) {
			return 1;
		}else {
			return (n * n) + sumaDeCuadradosHasta(n-1);
		}
	}
}
