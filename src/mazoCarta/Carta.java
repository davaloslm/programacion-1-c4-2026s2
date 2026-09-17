package mazoCarta;

public class Carta {

	int palo;
	int numero;

	public Carta(int palo, int numero) {
		this.palo = palo;
		this.numero = numero;
	}

	void mostrar() {
		String[] palos = { "espada", "copa", "basto", "oro" };
		System.out.println(this.numero + " " + palos[this.palo]);
	}
}
