package ejercicio2;
/**
 * Clase con las funciones de contador
 * @author Jaime Sevilla
 *
 */
public class Contador {
	/**
	 * Variable para el contador
	 */
	int cont;

	/**
	 * Constructor por defecto
	 */
	public Contador() {
		super();
	}
	/**
	 * Constructor con todos los parametros. Si el valor es inferior a 0, se queda en su valor por defecto (0)
	 * @param cont Recibe el valor del contador y se lo asigna al contador de la clase
	 */
	public Contador(int cont) {
		super();
		this.cont = 0;
		if(cont>=0) {
			this.cont = cont;
		}
	}

	/**
	 * Constructor que copia los valores de otro objeto
	 * @param c Recibe un objeto y le asigna los valores a otro objeto 
	 */
	public Contador(Contador c) {
		super();
		this.cont = c.cont;
	}
	/**
	 * Getter de Contador
	 * @return Devuelve el valor de contador
	 */
	public int getCont() {
		return cont;
	}
	/**
	 * Setter de Contador
	 * @param cont Recibe un valory se lo da a la variable contador de la clase
	 */
	public void setCont(int cont) {
		this.cont = cont;
	}
	/**
	 * Incrementa en 1 el contador
	 */
	void incrementar() {
		cont ++;
	}
	/**
	 * Decrementa en 1 el contador, a no ser que su valor sea 0 o inferior
	 */
	void decrementar() {
		if(cont > 0) {
			cont--;
		}
	}
	
}
