package recursion;

public class RepasoParaParcial {
	
	public static void main(String[] args) {
		
		System.out.println(duplicar("hola"));
		System.out.println(duplicarDesde("hola", 2));
		System.out.println(duplicarHasta("hola", 2));
		System.out.println(duplicarEntre("hola", 1, 2));
		
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
	//Escribir una función recursivapublic static String duplicarDesde(String s, int desde) que reciba un String y duplique solo las letras desde la posicion desde (inclusive).
	//Por ejemplo, public static String duplicar("hola", 2) debe devolver "hollaa".
	public static String duplicarDesde(String s, int desde) {
		//casos base
		if (s.isEmpty()) { //si s esta vacio
			return "";
		}
		if (desde < 0 || desde >= s.length()) { // si la posicion es inválida
			return s;
		}
		
		//casos recursivos
		if (desde == 0) { 
			return s.charAt(0) + "" + s.charAt(0) + 
					duplicarDesde(s.substring(1), 0); // duplico
		}else {
			return s.charAt(0) +
					duplicarDesde(s.substring(1), desde-1); // no duplico
		}
		
		
	}
	
	
	//c)
	//Escribir una función recursivapublic static String duplicarHasta(String s, hasta) que reciba un String y duplique solo las letras antes de la posicion hasta.
	//Por ejemplo, public static String duplicarHasta("hola", 2) debe devolver "hhoola".
	
	public static String duplicarHasta(String s, int hasta) {
		//casos base
		if (s.isEmpty()) {
			return ""; //si el string esta vacio
		}
		if (hasta < 0) {
			return s; // si la posicion es invalida
		}
		
		//casos recursivos
		if (hasta > 0) {
			//duplicar
			return s.charAt(0) + "" + s.charAt(0) + 
					duplicarHasta(s.substring(1), hasta-1);
		}else {
			//no duplicar
			return s.charAt(0) + duplicarHasta(s.substring(1), hasta-1);
		}
	}
	
	//d)
	//Escribir una función recursivapublic static String duplicarEntre(String s, desde, hasta) que reciba un String y duplique solo las letras entre de las posiciones desde y hasta.
	//Por ejemplo, public static String duplicarEntre("hola", 1,2) debe devolver "hoolla".
	public static String duplicarEntre(String s, int desde, int hasta) {
		//casos base
		if (s.isEmpty()) {
			return ""; // si el string esta vacio
		}
		
		if (desde < 0 || hasta >= s.length() || desde > hasta) {
			return s; //si las posiciones no son validas
		}
		
		//casos recursivos
		if (desde == 0 && hasta >= 0) {
			//si duplico
			return s.charAt(0) + "" + s.charAt(0) + 
					duplicarEntre(s.substring(1), 0, hasta-1);
		}else {
			// no duplico
			return s.charAt(0) + duplicarEntre(s.substring(1), desde-1, hasta-1);
		}
		
		
		
	}
	
}
