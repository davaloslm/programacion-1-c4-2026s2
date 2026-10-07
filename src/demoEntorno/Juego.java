package demoEntorno;

import java.awt.Color;

import entorno.Entorno;
import entorno.InterfaceJuego;

public class Juego extends InterfaceJuego
{
	// El objeto Entorno que controla el tiempo y otros
	private Entorno entorno;
	private Barra barra;
	private Pelota pelota;
	
	// Variables y métodos propios de cada grupo
	// ...
	
	Juego()
	{
		// Inicializa el objeto entorno
		this.entorno = new Entorno(this, "La Invasión de los Zombies Grinch", 800, 600);
		this.barra = new Barra(400, 550, 100, 20, 1, Color.RED);
		this.pelota = new Pelota(400, 50, 20, 1, Color.BLUE);
		
		// Inicializar lo que haga falta para el juego
		// ...

		// Inicia el juego!
		this.entorno.iniciar();
	}

	/**
	 * Durante el juego, el método tick() será ejecutado en cada instante y 
	 * por lo tanto es el método más importante de esta clase. Aquí se debe 
	 * actualizar el estado interno del juego para simular el paso del tiempo 
	 * (ver el enunciado del TP para mayor detalle).
	 */
	public void tick()
	{
		// Procesamiento de un instante de tiempo
		// ...
		
		barra.dibujarse(entorno);
		pelota.dibujarse(entorno);
		
		
		pelota.caer();

		if (entorno.estaPresionada('a')) {
			barra.moverIzquierda();
		}
		
		if (entorno.estaPresionada('d')) {
			barra.moverDerecha();
		}
		
		if (pelota.y + pelota.diametro/2 >= barra.y - barra.alto/2 && pelota.y - pelota.diametro/2 <= barra.y + barra.alto/2 &&
			pelota.x + pelota.diametro/2 >= barra.x - barra.ancho/2 && pelota.x - pelota.diametro/2 <= barra.x + barra.ancho/2) {
			pelota.rebotar();
			
		}
		
		if (pelota.y - pelota.diametro/2  <= 0) {
			pelota.rebotar();
			
		}
		
		if (pelota.y + pelota.diametro/2 >= entorno.alto()) {
			entorno.escribirTexto("GAME OVER", 380, 300);
			
		}
		

		
		
	}
	

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Juego juego = new Juego();
	}
}
