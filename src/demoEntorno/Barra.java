package demoEntorno;

import java.awt.Color;

import entorno.Entorno;

public class Barra {
	
	double x;
	double y;
	double ancho;
	double alto;
	double velocidad;
	Color color;
	
	public Barra(double x, double y, double ancho, double alto, double velocidad, Color color) {
		this.x = x;
		this.y = y;
		this.ancho = ancho;
		this.alto = alto;
		this.velocidad = velocidad;
		this.color = color;
	}
	
	public void dibujarse(Entorno e) {
		e.dibujarRectangulo(x, y, ancho, alto, 0, color);
	}
	
	public void moverIzquierda() {
		x -= 4 * velocidad;
	}
	
	public void moverDerecha() {
		x += 4 * velocidad;
	}

}
