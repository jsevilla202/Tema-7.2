package ejercicio3;

public class Main {

	public static void main(String[] args) {
		Fecha fecha = new Fecha();
		
		System.out.println("dia " + fecha.getDia());
		fecha.setDia(10);
		System.out.println("dia " + fecha.getDia());
		fecha.setDia(32);
		System.out.println("dia " + fecha.getDia());
		System.out.println("mes " + fecha.getMes());
		fecha.setMes(10);
		System.out.println("mes " + fecha.getMes());
		fecha.setMes(13);
		System.out.println("mes " + fecha.getMes());
		System.out.println("año " + fecha.getAno());
		fecha.setAno(2000);
		System.out.println("año " + fecha.getAno());
		System.out.println(fecha.fechaCorrecta()? "Es correcta" : "No es correcta");
		fecha.setDia(31);
		fecha.setMes(2);
		System.out.println(fecha.fechaCorrecta()? "Es correcta" : "No es correcta");
		System.out.println(fecha.getDia() + " " + fecha.getMes() + " " + fecha.getAno());
		fecha.diaSiguiente();
		System.out.println(fecha.getDia() + " " + fecha.getMes() + " " + fecha.getAno());
		fecha.setMes(12);
		fecha.setDia(31);
		System.out.println("fin de año " + fecha.getDia() + " " + fecha.getMes() + " " + fecha.getAno());
		fecha.diaSiguiente();
		System.out.println(fecha.getDia() + " " + fecha.getMes() + " " + fecha.getAno());
		System.out.println(fecha.toString());
		fecha.setMes(12);
		fecha.setDia(31);
		System.out.println(fecha.toString());
		System.out.println(fecha.esBisiesto()? "Es bisiesto" : "No es bisiesto");
		fecha.setAno(2000);
		System.out.println(fecha.esBisiesto()? "Es bisiesto" : "No es bisiesto");
	}

}
