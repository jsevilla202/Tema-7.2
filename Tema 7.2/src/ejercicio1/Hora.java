package ejercicio1;

public class Hora {
	int hora;
	int minuto;
	int segundo;
	
	public Hora() {
		super();
	}
	public Hora(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	public int getHora() {
		return hora;
	}
	
	public int getMinuto() {
		return minuto;
	}
	
	public int getSegundo() {
		return segundo;
	}
	
	public void setHora(int hora) {
		if(hora<=23 && hora>=0) {
			this.hora = hora;
		}
	}
	
	public void setMinuto(int minuto) {
		if(minuto<=59 && minuto>=0) {
			this.minuto = minuto;
		}
	}
	
	public void setSegundo(int segundo) {
		if(segundo<=59 && segundo>=0) {
			this.segundo = segundo;
		}
	}
	
	public void incrementaSegundo(int incremento) {
		segundo += incremento;
		
		while(segundo>=60) {
			segundo -= 60;
			minuto++;
			
			if(minuto>=60) {
				minuto -= 60;
				hora++;
			}
			
			if(hora>=23) {
				hora -= 24;
			}
		}
	}
}
