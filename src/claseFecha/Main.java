package claseFecha;

public class Main {

	public static void main(String[] args) {

		Fecha f = new Fecha(28,2,2001);
//		f.imprimir();
//		System.out.println(Fecha.esBisiesto(f.anio));
//		System.out.println(Fecha.diasDelMes(f.mes, f.anio));
		f.avanzarDia();
		f.imprimir();
	}

}
