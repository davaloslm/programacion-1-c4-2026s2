package resolucionParcial18112025;

public class EjRecursion {

	public static void main(String[] args) {

		System.out.println(colapsarRepetidos("aaabbcdd"));
		System.out.println(colapsarRepetidos("holaaa"));
		System.out.println(colapsarRepetidos("abc"));
		System.out.println(colapsarRepetidos(""));
	}
	
	public static String colapsarRepetidos(String s) {
		if (s.length() <= 1) { // caso base
			return s;
		}
		
		//caso recursivo
		if (s.charAt(0) == s.charAt(1)) {
			return colapsarRepetidos(s.substring(1));
		} else {
			return s.charAt(0) + colapsarRepetidos(s.substring(1));
		}
		
		
	}
	
	
	

}
