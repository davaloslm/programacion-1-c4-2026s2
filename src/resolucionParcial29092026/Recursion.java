package resolucionParcial29092026;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(intercalarDesde("hola", "1234", 0)); 
		System.out.println(intercalarDesde("programacion", "ABCD", 2)); 
		System.out.println(intercalarDesde("", "recursion", 3)); 

	}
	
	public static String intercalarDesde(String s1, String s2, int pos) {
		// Caso base 1: s1 no tiene caracteres desde pos
	    if (pos >= s1.length()) {
	        if (pos >= s2.length()) {
	            return "";
	        }
	        return s2.substring(pos);
	    }
	    // Caso base 2: s2 no tiene caracteres desde pos
	    if (pos >= s2.length()) {
	        return s1.substring(pos);
	    }
		
		//casos recursivos
		if (pos > 0) {
			return intercalarDesde(s1.substring(1), s2.substring(1), pos - 1);
		}else {
			return s1.charAt(0) + "" + s2.charAt(0) + intercalarDesde(s1.substring(1), s2.substring(1), pos);
		}	
		
	}
	
	//resolucion alternativa
//	public static String intercalarDesde(String s1, String s2, int pos) {
//        //casos base
//        if (s1.length() == 0) {
//            return s2;
//        }
//        if (s2.length() == 0) {
//            return s1;
//        }
//
//        //casos recursivos
//        if (pos > 0) {
//            return intercalarDesde(s1.substring(1), s2.substring(1), pos - 1);
//        }else {
//            return s1.charAt(0) + "" + s2.charAt(0) + intercalarDesde(s1.substring(1), s2.substring(1), pos);
//        }
//
//    }
	

}
