package pointRectangle;

import java.awt.Point;
import java.awt.Rectangle;

public class EjerciciosMoodle {

	public static void main(String[] args) {
//		Point punto1 = new Point(3,2);
//		Point punto2 = new Point(5,6);
//		System.out.println(distancia(punto1, punto2));
//		
		Rectangle rectangulo1 = new Rectangle(2, 3, 50, 100);
		//System.out.println(diagonal(rectangulo1));
		System.out.println(centro(rectangulo1));
	}
	
	public static double distancia(Point p1, Point p2) {
		int distanciaX = p1.x - p2.x;
		int distanciaY = p1.y - p2.y;
		return Math.sqrt(distanciaX*distanciaX + distanciaY*distanciaY);
	}
	
	public static double diagonal(Rectangle r) {
		Point p1 = new Point(r.x, r.y);
		Point p2 = new Point(r.x + r.width, r.y + r.height);
		
		double resultado = distancia(p1, p2);
		
		return resultado;
	}
	
	public static Point centro(Rectangle r) {
		return new Point(r.x + r.width/2, r.y + r.height/2);
	}
	
}
