package estructuras;

import java.util.Scanner;

public class Estructuras {
	
	public static void ejemploIF() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Introduzca su nombre:");
		String nombre = sc.nextLine();
		
		if(nombre.equals("Fran")) {
			System.out.println("Hola Fran ");
		}
		else {
			System.out.println("Hola persona desconocida");
		}
		
		System.out.println("¡Tenga un buen día!");
		sc.close();
	}

	public static void ejemploIdElseIfElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tira un dado y escribe el resultado: ");
		int numero = sc.nextInt();

		
		if(numero==1) {
			System.out.println("¡Pifia! Ha salido un 1");	
		}
		else if (numero==2) {
			System.out.println("Ha salido un 2");		
		}
		else if (numero==3) {
			System.out.println("Ha salido un 3");		
		}
		else if (numero==4) {
			System.out.println("Ha salido un 4");		
		}
		else if (numero==5) {
			System.out.println("Ha salido un 5");		
		}
		else if (numero==6) {
			System.out.println("¡Crítico! Ha salido un 6");		
		}
		else {
			System.out.println("Por favor, escribe un numero del 1 al 6");
		}
		sc.close();
	}
	
	public static void ejemploSwitch() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tira un dado y escribe el resultado: ");
		int numero = sc.nextInt();
		switch (numero) {
		case 1:
			System.out.println("¡Pifia! Ha salido un 1");
			break;
		case 2:
			System.out.println("Ha salido un 2");
			break;
		case 3:
			System.out.println("Ha salido un 3");
			break;
		case 4:
			System.out.println("Ha salido un 4");
			break;
		case 5:
			System.out.println("Ha salido un 5");
			break;
		case 6:
			System.out.println("¡Crítico! Ha salido un 6");
			break;
		default:
			System.out.println("Por favor, escribe un numero del 1 al 6 y utiliza un dado de 6 caras");
		}	
		sc.close();
	}
	
	public static void ejemploTernarias() {
	int edad = 15;
	/*if (edad>=18)
		System.out.println("Eres mayor de edad");
	else
		System.out.println("Eres menos de edad");*/
	
	System.out.println(edad>=18?"Eres mayor de edad":"Eres menos de edad"); //Esta frase equivale a las 4 de arriba
		
	int descuento = edad>=18?5:20;
			System.out.println(descuento);
			
	int euros = 10;
	if(euros>1) {
		System.out.println("Cuesta " + euros + " euros");
	}
	else {
		System.out.println("Cuesta " + euros +" euro" + (euros!=1?"s":""));
		System.out.println("Cuesta " + euros + (euros!=1?"euros":"euro"));
	}
	}
	
	public static void ifElseIfSinElse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu equipo preferido");
		String equipo = sc.nextLine();
		
		if(equipo.toLowerCase().equals("madrid")) { //compara pasando todo a minuscula
			System.out.println("¡Hala Madrid!");
		}
		else if(equipo.toUpperCase().equals("BARCELONA")) { //compara pasando todo mayus
			System.out.println("Visca el barça!");
		}
		else if(equipo.equalsIgnoreCase("atletico")) {
			System.out.println("El frente atletico esta que arde"); //ignora mayus/minus
		}
		else if(equipo.equals("Betis")) {
			System.out.println("Ande erta er Beti\n" + "Beti\n" + "VIVA ER BETI");
		}
		
		System.out.println("Bienvenido al chirincirco de jugones");
		sc.close();
	}
	public static void main(String[] args) {
//		ejemploIF();
//		ejemploIdElseIfElse();
		ifElseIfSinElse();
//		ejemploSwitch();
//		ejemploTernarias();

	}

}
