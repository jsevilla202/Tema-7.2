package ejercicio2;

public class Main {

	public static void main(String[] args) {
		Contador cont1 = new Contador(-1);
		
		System.out.println(cont1.getCont());
		cont1.incrementar();
		System.out.println(cont1.getCont());
		cont1.setCont(10);
		System.out.println(cont1.getCont());
		cont1.setCont(0);
		System.out.println(cont1.getCont());
		cont1.decrementar();
		System.out.println(cont1.getCont());
		cont1.setCont(12);
		Contador cont2 = new Contador(cont1);
		System.out.println(cont2.getCont());

	}

}
