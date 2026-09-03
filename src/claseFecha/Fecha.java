package claseFecha;

public class Fecha {

	//atributos/variables de instancia
	int dia;
	int mes;
	int anio;
	
	//constructor 
	public Fecha(int d, int m, int a) {
		this.dia = d;
		this.mes = m;
		this.anio = a;
	}
	
	//metodos
	public void imprimir() {
		System.out.println(dia+"/"+mes+"/"+anio);
	}
	
	public static boolean esBisiesto(int anio) {
		if ( anio % 4 == 0 && anio % 100 != 0) {
			return true;
		}
		else if (anio % 400 == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int diasDelMes(int mes, int anio) {
		if (mes == 1 || mes == 3 || mes == 5 ||
			mes == 7 || mes == 8 || mes == 10 ||
			mes == 12 ) {
			
			return 31;
		}
		
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			return 30;
		}
		
		if (mes == 2 && esBisiesto(anio)) {
			return 29;
		} else {
			return 28;
		}
		
	}
	
	public boolean esValida() {
		if (this.mes < 1 || this.mes > 12) {
			return false;
		}
		if (this.dia < 1 ||
				this.dia > diasDelMes(this.mes, this.anio)) {
			return false;
		} else {
			return true;
		}
	}
	
	public void avanzarDia() {
		if (this.dia == diasDelMes(this.mes, this.anio)) {//si es el ultimo dia del mes
			if (this.mes == 12) { //si es el ultimo dia del ultimo mes
				this.dia = 1;
				this.mes = 1;
				this.anio++;
			}else {
				this.dia = 1;
				this.mes ++;
			}
		}else {
			this.dia++;
		}
	}
	
	public boolean antesQue(Fecha otra) {
		if (this.anio < otra.anio) {
			return true;
		}
		if (this.anio == otra.anio) {
			if (this.mes < otra.mes ) {
				return true;
			}
			if (this.mes == otra.mes) {
				return this.dia < otra.dia;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
	
	
	
}
