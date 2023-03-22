package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Array de objetos
		Disco[] discos = new Disco[10];
		//Opcion del emnu
		int opcion = 0;
		//Contador de posición libre
		int pos = 0;
		//Posición a modificar
		int modify = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//Da valor a los discos
		for(int i=0; i<discos.length; i++) {
			discos[i] = new Disco();
		}
		
		//Menu
		while(opcion != 5) {
			System.out.print("COLECCIÓN DE DISCOS\n" + "===================\n"
		+ " 1. Listado.\n"
		+ " 2. Nuevo Disco.\n"
		+ " 3. Modificar.\n"
		+ " 4. Borrar.\n"
		+ " 5. Salir.\n"
		+ "===================\n" + "¿Qué desea hacer? ");
			
			opcion = sc.nextInt();
			switch(opcion) {
			case 1:
				for(int i = 0; i<discos.length; i++) {
					if(!discos[i].codigo.equals("LIBRE")) {
						System.out.println();
						System.out.println(discos[i].toString());;
					}
				}
				break;
				//Inserta un nuevo disco
			case 2:
				sc.nextLine();
				//El usuario no puede poner el mismo codigo que el que viene por defecto
				while(discos[pos].codigo.equals("LIBRE")) {
					System.out.print("Inserte un codigo para el disco: ");
					discos[pos].codigo = sc.nextLine();
					
					if(discos[pos].codigo.equals("LIBRE")) {
						System.out.println("ERROR: Inserte un codigo diferente");
						System.out.println();
					}
				}
				
				System.out.print("Inserte el autor: ");
				discos[pos].autor = sc.nextLine();
				
				System.out.print("Inserte el titulo: ");
				discos[pos].titulo = sc.nextLine();
				
				System.out.print("Inserte el genero: ");
				discos[pos].genero = sc.nextLine();
				//Tampoco puede insertar un valor negativo en la duracion
				do {
					System.out.print("Inserte la duración: ");
					discos[pos].duracion = sc.nextInt();
					
					if(discos[pos].duracion<0) {
						System.out.println("ERROR: No puede introducir un tiempo negativo");
						System.out.println();
					}
				}
				while(discos[pos].duracion<0);
				pos++;
				break;
			case 3:
				//Modifica una posición y copia y pega la opcion 2
				System.out.print("¿Qué ubicación desea modificar? ");
				modify = sc.nextInt();
				modify--;
				if(modify>=0&&modify<discos.length) {
				System.out.println();
					if(discos[modify].codigo.equals("LIBRE")) {
						System.out.println("ERROR: Aquí no hay disco");
					}
					else {
						sc.nextLine();
						do {
							System.out.print("Inserte un codigo para el disco: ");
							discos[modify].codigo = sc.nextLine();
							
							if(discos[modify].codigo.equals("LIBRE")) {
								System.out.println("ERROR: Inserte un codigo diferente");
								System.out.println();
							}
						}
						while(discos[modify].codigo.equals("LIBRE"));
						
						System.out.print("Inserte el autor: ");
						discos[modify].autor = sc.nextLine();
						
						System.out.print("Inserte el titulo: ");
						discos[modify].titulo = sc.nextLine();
						
						System.out.print("Inserte el genero: ");
						discos[modify].genero = sc.nextLine();
						do {
							System.out.print("Inserte la duración: ");
							discos[modify].duracion = sc.nextInt();
							
							if(discos[modify].duracion<0) {
								System.out.println("ERROR: No puede introducir un tiempo negativo");
								System.out.println();
							}
						}
						while(discos[modify].duracion<0);
					}
				}
				else {
					System.out.println("ERROR: Ubicación no disponible");
				}
					break;
			case 4:
				System.out.print("¿Qué ubicacion desea borrar? ");
				modify = sc.nextInt();
				modify--;
				
				if(discos[modify].codigo.equals("LIBRE")) {
					System.out.println("ERROR: Aquí no hay disco");
				}
				else {
					//En vez de borrar esa posición, se resetea el objeto y listo
					System.arraycopy(discos, modify + 1, discos, modify, discos.length - modify - 1);
					discos[discos.length-1] = new Disco();
				}
				pos--;
				break;
			case 5:
				break;
			default:
				System.out.println("ERROR: Valor erroneo introducido");
			}
			System.out.println();
		}
		sc.close();
		
	}

}
