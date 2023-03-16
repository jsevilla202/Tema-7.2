package ejercicio1;
/**
 * Clase de las funciones de Hora
 * @author Jaime Sevilla
 *
 */
public class Hora {
	/**
	 * Parametro de hora
	 */
	int hora;
	/**
	 * Parametro de minuto
	 */
	int minuto;
	/**
	 * Parametro de segundo
	 */
	int segundo;
	
	/**
	 * Constructor por defecto
	 */
	public Hora() {
		super();
	}
	/**
	 * Constructor con todos los parametros
	 * @param hora Recibe la hora y le da el valor a la hora de la clase
	 * @param minuto Recibe los minutos y le da el valor a los minutos de la clase
	 * @param segundo Recibe los segundos y le da el valor a los segundos de la clase
	 */
	public Hora(int hora, int minuto, int segundo) {
		super();
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	/**
	 * Getter de hora
	 * @return Devuelve la hora
	 */
	public int getHora() {
		return hora;
	}
	/**
	 * Getter de Minuto
	 * @return Devuelve los minutos
	 */
	public int getMinuto() {
		return minuto;
	}
	/**
	 * Getter de Segundo
	 * @return Devuelve los segundos
	 */
	public int getSegundo() {
		return segundo;
	}
	
	/**
	 * Setter de Hora
	 * @param hora Hora dada por el usuario
	 */
	public void setHora(int hora) {
		if(hora<=23 && hora>=0) {
			this.hora = hora;
		}
	}
	/**
	 * Setter de Minutos
	 * @param minuto Minutos dados por el usuario
	 */
	public void setMinuto(int minuto) {
		if(minuto<=59 && minuto>=0) {
			this.minuto = minuto;
		}
	}
	/**
	 * Setter de Segundos
	 * @param segundo Segundos dados por el usuario
	 */
	public void setSegundo(int segundo) {
		if(segundo<=59 && segundo>=0) {
			this.segundo = segundo;
		}
	}
	
	/**
	 * Incrementa los segundos
	 * @param incremento Incremento a los segundos dado por el usuario
	 */
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
