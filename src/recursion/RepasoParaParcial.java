package recursion;

public class RepasoParaParcial {
	
	public static void main(String[] args) {
		
		System.out.println(duplicar("hola"));
//		System.out.println(duplicarDesde("hola", 2));
//		System.out.println(duplicarHasta("hola", 2));
//		System.out.println(duplicarEntre("hola", 1, 2));
		
	}
	
	//a)
	//Escribir una función recursiva public static String duplicar(String s) que reciba un String s y devuelva un String con cada letra duplicada.
	//Por ejemplo, si recibe "hola" debe devolver "hhoollaa".
	public static String duplicar(String s) {
		if (s.isEmpty()) {
			return "";
		} else {
			return s.charAt(0) + "" + s.charAt(0) + duplicar(s.substring(1)) ;
		}
	}
	
	//b)
	//Escribir una función recursivapublic static String duplicarDesde(String s, desde) que reciba un String y duplique solo las letras desde la posicion desde (inclusive).
	//Por ejemplo, public static String duplicar("hola", 2) debe devolver "hollaa".
	
	
	
	//c)
	//Escribir una función recursivapublic static String duplicarHasta(String s, hasta) que reciba un String y duplique solo las letras antes de la posicion hasta.
	//Por ejemplo, public static String duplicarHasta("hola", 2) debe devolver "hhoola".
	
	
	//d)
	//Escribir una función recursivapublic static String duplicarEntre(String s, desde, hasta) que reciba un String y duplique solo las letras entre de las posiciones desde y hasta.
	//Por ejemplo, public static String duplicarEntre("hola", 1,2) debe devolver "hoolla".

	
}
