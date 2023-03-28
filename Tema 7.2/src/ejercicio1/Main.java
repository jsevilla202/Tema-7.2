package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int x = 0;
		int hora = 0;
		int minuto = 0;
		int segundo = 0;
		int incremento = 0;
		
		Hora horas = new Hora(0, 0, 0);
		Scanner sc = new Scanner(System.in);
		
		while(x != 5) {
			System.out.print("Puede elegir entre las siguientes opciones: \n 1. Establecer Hora\n 2. Establecer Minuto\n "
					+ "3. Establecer Segundo\n 4. Incrementar Segundo\n 5. Salir" +"\n¿Qué desea hacer? ");
			x = sc.nextInt();
			
			switch(x) {
			case 1: 
				System.out.print("Inserte el valor de la hora: ");
				hora = sc.nextInt();
				horas.setHora(hora);
				break;
			case 2: 
				System.out.print("Inserte el valor de los minutos: ");
				minuto  = sc.nextInt();
				horas.setMinuto(minuto);
				break;
			case 3: 
				System.out.print("Inserte el valor de los segundos: ");
				segundo  = sc.nextInt();
				horas.setSegundo(segundo);
				break;
			case 4: 
				System.out.print("Inserte los segundos a incrementar: ");
				incremento  = sc.nextInt();
				for(int i = 0; i<incremento; i++) {
					horas.incrementaSegundo();
				}
				break;
			case 5:
				System.out.println("Saliendo.....");
				break;
			default:
				System.out.println("ERROR: Opción no valida");
			}
			
			System.out.println();
			System.out.print("Son las: ");
			System.out.format("%02d", horas.getHora());
			System.out.print(":");
			System.out.format("%02d", horas.getMinuto());
			System.out.print(":");
			System.out.format("%02d", horas.getSegundo());
			System.out.println();
			System.out.println();
		}
		sc.close();
		
		
		

	}

}
