package demoEntorno;

import java.awt.Color;

import entorno.Entorno;

public class Pelota {
	
	double x;
	double y;
	double diametro;
	double velocidad;
	Color color;
	
	public Pelota(double x, double y, double diametro, double velocidad, Color color) {
		super();
		this.x = x;
		this.y = y;
		this.diametro = diametro;
		this.velocidad = velocidad;
		this.color = color;
	}
	
	public void dibujarse(Entorno e) {
		e.dibujarCirculo(x, y, diametro, color);
	}
	
	public void caer() {
		this.y += 4 * velocidad;
	}
	
	public void rebotar() {
		this.velocidad *= -1;
	}
	
	
	
	

}
