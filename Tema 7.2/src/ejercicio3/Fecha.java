package ejercicio3;

/**
 * Clase con las funciones de Fecha
 * 
 * @author Jaime Sevilla
 *
 */
public class Fecha {
	/**
	 * Parametro de dia
	 */
	private int dia;
	/**
	 * Parametro de mes
	 */
	private int mes;
	/**
	 * Parametro de año
	 */
	private int ano;

	/**
	 * Constructor por defecto
	 */
	public Fecha() {
		super();
	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param dia Recive el dia y se lo da al dia de la clase
	 * @param mes Recive el mes y se lo da al mes de la clase
	 * @param ano Recive el año y se lo da al año de la clase
	 */
	public Fecha(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	/**
	 * Getter de dia
	 * 
	 * @return Devuelve el valor de dia
	 */
	public int getDia() {
		return dia;
	}

	/**
	 * Setter de dia. Comprueba que sea posible insertar el día especificado
	 * 
	 * @param dia Dia dado por el usuario
	 */
	public void setDia(int dia) {
		if (mes == 2) {
			if ((ano % 4 == 0 && dia > 0 && dia < 30) || dia > 0 && dia < 29) {
				this.dia = dia;
			}
		} else {
			if (mes == 1 || mes == 5 || mes == 8 || mes == 10 || mes == 12) {
				if (dia > 0 && dia < 32) {
					this.dia = dia;
				}
			}

			else {
				if (dia > 0 && dia < 31) {
					this.dia = dia;
				}
			}
		}
	}

	/**
	 * Getter de mes
	 * 
	 * @return Devuelve el valor del mes
	 */
	public int getMes() {
		return mes;
	}

	/**
	 * Setter de mes. Comprueba que sea posible insertar el mes especificado
	 * 
	 * @param mes Mes dado por el usuario
	 */
	public void setMes(int mes) {
		if (mes > 0 && mes < 13) {
			this.mes = mes;
		}
		if (mes == 2 && dia > 28) {
			this.mes = 1;
		} else if ((mes == 1 || mes == 5 || mes == 8 || mes == 10 || mes == 12) && (dia > 0 && dia < 32)) {
			this.mes = mes;
		}

		else if ((mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 0 && dia < 31)) {
			this.mes = mes;
		}
	}

	/**
	 * Getter de año
	 * 
	 * @return Devuelve el valor de año
	 */
	public int getAno() {
		return ano;
	}

	/**
	 * Setter de año. Comprueba si es posible establecer ese año
	 * 
	 * @param ano Año dado por el usuario
	 */
	public void setAno(int ano) {
		if (ano >= 0) {
			this.ano = ano;
		}
	}

	/**
	 * Comprueba si el año es bisiesto
	 * 
	 * @return Devuelve true o false dependiendo si lo es o no
	 */
	boolean esBisiesto() {
		boolean esBisiesto = false;
		if (ano % 4 == 0) {
			esBisiesto = true;
		}
		return esBisiesto;
	}

	/**
	 * Comprueba si la fecha es correcta o no
	 * 
	 * @return Devuelve true o false si lo es o no
	 */
	boolean fechaCorrecta() {
		boolean esCorrecta = false;
		if (esBisiesto()) {
			if (mes == 2) {
				if (dia > 0 && dia < 30) {
					esCorrecta = true;
				}
			} else if ((mes == 1 || mes == 5 || mes == 8 || mes == 10 || mes == 12) && (dia > 0 && dia < 32)) {
				esCorrecta = true;
			}

			else if ((mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 0 && dia < 31)) {
				esCorrecta = true;
			}
		} else {
			if (mes == 2) {
				if (dia > 0 && dia < 29) {
					esCorrecta = true;
				}
			} else if ((mes == 1 || mes == 5 || mes == 8 || mes == 10 || mes == 12) && (dia > 0 && dia < 32)) {
				esCorrecta = true;
			}

			else if ((mes == 2 || mes == 4 || mes == 6 || mes == 9 || mes == 11) && (dia > 0 && dia < 31)) {
				esCorrecta = true;
			}
		}
		return esCorrecta;
	}

	/**
	 * Combierte la fecha en la del día siguiente
	 */
	void diaSiguiente() {
		switch(mes) {
		case 1, 3, 5, 7,8, 10 -> {
			if(dia == 31) {
				dia = 1;
				mes++;
			}
			else {
				dia++;
			}
		}
		case 4, 6, 9, 11->{
			if(dia == 30) {
				dia = 1;
				mes++;
			}
			else {
				dia++;
			}
		}
		case 2->{
			if(esBisiesto() && dia == 29) {
				dia = 1;
				mes++;
			}
			else if(dia == 28) {
				dia = 1;
				mes++;
			}
			else {
				dia++;
			}
		}
		case 12->{
			if(dia == 31) {
				ano++;
				dia = 1;
				mes = 1;
			}
			else {
				dia++;
			}
		}
		}
	}

	/**
	 * Combierte la fecha a String
	 */
	public String toString() {
		String fecha = "";

		if (dia / 10 != 0) {
			fecha += dia;
		} else {
			fecha += "0" + dia;
		}

		fecha += "-";

		if (mes / 10 != 0) {
			fecha += mes;
		} else {
			fecha += "0" + mes;
		}

		fecha += "-" + ano;

		return fecha;
	}

}
