package mazoCarta;

public class Main {

	public static void main(String[] args) {
		
		Carta c1 = new Carta(0, 1);
		c1.mostrar();
		
		Mazo m1 = new Mazo();
		m1.mostrar();
		m1.mezclarMazo();
		m1.mostrar();
	}

}
