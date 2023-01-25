package estructuras;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
	 public static void ejemploWhile1() {
		 Scanner sc = new Scanner(System.in);
		 String password = "1234";
		 boolean adivina = false;
		 while(adivina==false) {
			 System.out.println("Introduzca la contraseña");
			 String respuesta = sc.nextLine();
			 if(respuesta.contentEquals(password)) {
				 adivina = true;
			 }
		 }
		 System.out.println("Enhorabuena! Acertaste! Ahora muere ¬¬");
		sc.close();
	}
	
	 public static void ejemploWhile2() {
		 Scanner sc = new Scanner(System.in);
		 String password = "1234";
		 boolean adivina = false;
		 int intentos = 0;
		 while (!adivina && intentos<3) {
			 intentos++;
			 System.out.println("Introduzca la contraseña (Quedan " + (3-intentos) + " intentos");
			 String respuesta = sc.nextLine();
			 if(respuesta.equals(password)) {
				 adivina = true;
			 } else {
				 System.out.println("fallaste");
			 }
		 }
		 System.out.println(adivina? "Acertaste":"Gastaste todos tus intentos");
		 
		 sc.close();
		}
	 
	public static void acaboCurso() {
		LocalDate fecha = LocalDate.now(); // dia de hoy (23/01/2023)
		while(fecha.isBefore(LocalDate.parse("2023-03-31"))) {
			if(fecha.getDayOfWeek()!=DayOfWeek.SATURDAY && fecha.getDayOfWeek()!=DayOfWeek.SUNDAY) {
			System.out.println(fecha);
			}
				fecha = fecha.plusDays(1);
			}
			System.out.println("Has acabado el curso");
		}

	public static void ejemploDoWhile2() { //Plantilla para preguntar opciones v1
		Scanner sc = new Scanner(System.in);
		int opcion=-1;
		do {
			// Impresión del menú
			System.out.println("1. Primera opción");
			System.out.println("2. Segunda opción");
			System.out.println("3. Tercera opción");
			System.out.println("4. Cuarta opción");
			System.out.println("0. Salir");
			// Obtención de la opción
			opcion = sc.nextInt();
			sc.nextLine();
			// Tratamiento de la opción
			switch (opcion) {
			case 1 -> System.out.println("Has elegido la primera opción");
			case 2 -> System.out.println("Has elegido la segunda opción");
			case 3 -> System.out.println("Has elegido la tercera opción");
			case 4 -> System.out.println("Has elegido la cuarta opción");
			case 0 -> System.out.println("¡Gracias por usar nuestro programa!");
			default -> System.out.println("La opción seleccionada no es correcta");
			}
		} while (opcion!=0);
		sc.close();
	}
	
	public static void offtopicBloqueTexto() { //Ejemplos de mejoras en version java 17
		//Java 11
		String texto = "Primera linea\n" +
				"Segunda linea\n" +
				"\t\tTercera linea";
		System.out.println(texto);
		//Java 17
		String texto2 = """
				El perro de san roque no tiene rabo \
				xq a Ramon Rodriguez \
				le escuece el ano.\
				""";
		System.out.println(texto2);
	}
	
	public static void tiposfechasJava() { //Tipos de fechas que muestra Java
		LocalDate fecha = LocalDate.now();
		LocalTime hora = LocalTime.now();
		LocalDateTime fechahora= LocalDateTime.now();
		System.out.println(fecha);
		System.out.println(hora);
		System.out.println(fechahora);
	}
	
	public static void ejemploFor1() {
		for (int i=0; i<=10; i++) {
			System.out.println("Repetición número " + (i));
		}
	}
	public static void ejemploFor1b() { //Mismo pero con la variable fuera
		int i=0;
		for (; i<=10; i++) {
			System.out.println("Repetición número " + (i));
		}
	}
	
	public static void ejemploFor2() { //Bucle infinito
		for (;;) { //No hay condiciones
			System.out.println("Repetición número");
		}
	}
	public static void ejemploFor3() { //Cuenta regresiva
		for (int i =10; i>=0; i--) { //No hay condiciones
			System.out.println("Repetición número " + i);
		}
	}
	
	public static void ejemploForAWhile() { //Bucle for hecho con un while
		int i=0;
		while (i<10) {
			System.out.println("Repetición número " +(i));
			i++;
		}
	}
	
	public static void ejemploForAnidadosTablasMultiplicar() {
		for (int tabla = 1; tabla <= 5; tabla++)
				for (int num=1; num<=10; num++) {
					System.out.println(tabla + " x " + num + " = " + (tabla*num));
		}
	}
	public static void main(String[] args) {
//		ejemploIF();
//		ejemploIdElseIfElse();
//		ifElseIfSinElse();
//		ejemploSwitch();
//		ejemploTernarias();
//		ejemploWhile1();
//		ejemploWhile2();
//		acaboCurso();
//		ejemploDoWhile2();
//		offtopicBloqueTexto();
//		tiposfechasJava();
//		ejemploFor1();
//		ejemploFor1b();
//		ejemploFor2();
//		ejemploFor3();
//		ejemploForAWhile();
		ejemploForAnidadosTablasMultiplicar();
	}
}
