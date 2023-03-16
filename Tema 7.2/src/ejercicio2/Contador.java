package ejercicio2;

public class Contador {
	int cont;

	public Contador() {
		super();
	}

	public Contador(int cont) {
		super();
		this.cont = 0;
		if(cont>=0) {
			this.cont = cont;
		}
	}

	public Contador(Contador c) {
		super();
		this.cont = c.cont;
	}
	
	
	
}
