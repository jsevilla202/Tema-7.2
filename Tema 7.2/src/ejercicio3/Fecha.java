package ejercicio3;

public class Fecha {
	private int dia;
	private int mes;
	private int ano;
	
	public Fecha() {
		super();
	}

	public Fecha(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if(mes == 2) {
			if((ano%4==0 && dia>0&&dia<30) || dia>0&&dia<29) {
				this.dia = dia;
			}
		}
		else if(dia>0&&dia<32) {
			this.dia = dia;
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if(mes>0&&mes<13) {
			this.mes = mes;
		}
		if(mes == 2 && dia>28) {
			mes = 0;
		}
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	boolean esBisiesto() {
		boolean esBisiesto = false;
		if(ano%4 == 0) {
			esBisiesto = true;
		}
		return esBisiesto;
	}
	
	boolean fechaCorrecta() {
		boolean esCorrecta = false;
		if(esBisiesto() == true) {
			if(mes == 2) {
				if(dia>0&&dia<30) {
					esCorrecta = true;
				}
			}
			else if(dia>0&&dia<32) {
				esCorrecta = true;
			}
		}
		else {
			if(mes == 2) {
				if(dia>0&&dia<29) {
					esCorrecta = true;
				}
			}
			else if(dia>0&&dia<32) {
				esCorrecta = true;
			}
		}
		return esCorrecta;
	}
	
	void diaSiguiente() {
		if(esBisiesto()==true) {
			if(mes == 2) {
				if(dia == 29) {
					dia = 1;
					mes++;
				}
			}
			else {
				if(mes == 2) {
					if(dia == 28) {
						dia = 1;
						mes++;
					}
				}
			}
			if(dia == 31 && mes != 12) {
				dia = 1;
				mes++;
			}
			else if(dia<31 && mes == 12) {
				dia ++;
			}
			else {
				dia = 1;
				mes = 1;
				ano++;
			}
		}
	}
	
	
}
