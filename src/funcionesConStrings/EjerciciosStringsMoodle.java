package funcionesConStrings;

public class EjerciciosStringsMoodle {

	public static void main(String[] args) {
		System.out.println(contarE("eeEe"));
		
		String s = "Hola, ¿cómo estás?";
		System.out.println(contarE(s));

	}
	
	public static int contarE(String palabra) {
		int contador = 0;
		for (int i = 0; i < palabra.length(); i++) {
			if (palabra.charAt(i) == 'e' || palabra.charAt(i) == 'E') {
				contador++;
			}
		}
		return contador;
	}

}
