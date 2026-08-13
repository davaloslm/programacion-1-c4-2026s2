package funcionesConEnteros;

public class EjerciciosEnterosMoodle {

	public static void main(String[] args) {
		System.out.println(cantDivisores(6));
		System.out.println(esPrimo(17));
	}
	
	public static int cantDivisores(int numero) {
		int contador = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		}
		return contador;
	}
	
	public static boolean esPrimo(int numero) {
		if (cantDivisores(numero) == 2) {
			return true;
		} else {
			return false;
		}
	}
}
