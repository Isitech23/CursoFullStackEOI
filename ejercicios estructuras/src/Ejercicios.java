import java.util.Scanner;

public class Ejercicios {
	// Ejercicios del segundo PDF del moodle///

	public static void ejercicio1() {
		/*
		 * Programa que lea un número entero por teclado y calcule si es par o impar. Un
		 * número es par si el resto (%) de dividir entre 2 da 0.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número:");
		double numero = sc.nextInt();
		System.out.println(numero % 2 == 0 ? "Es par" : "Es impar");
		sc.close();
	}

	public static void ejercicio2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número:");
		double numero = sc.nextInt();
		System.out.println(numero % 10 == 0 ? "Es múltiplo de 10" : "No es múltiplo de 10");
		sc.close();
	}

	public static void ejercicio3() { // EL programa esta bien hecho pero no sigue el enunciado//
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una letra");
		String letra = sc.next();
		System.out.println(letra.toLowerCase().equals(letra) ? "No es una letra mayúscula" : "Es una letra mayúscula");
		sc.close();
	}

	public static void ejercicio3b() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una palabra");
		String palabra = sc.next();
		char letra1 = palabra.charAt(0);
		String palabra2 = palabra.toLowerCase();
		char letra2 = palabra2.charAt(0);
		System.out
				.println(letra1 == letra2 ? letra1 + " no es una letra mayúscula" : letra1 + " es una letra mayúscula");
		sc.close();
	}

	public static void ejercicio4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una palabra");
		String palabra1 = sc.nextLine();
		System.out.println("Escribe otra palabra");
		String palabra2 = sc.nextLine();
		System.out.println(palabra1.contentEquals(palabra2) ? "Ambas palabras son iguales" : "Son diferentes palabras");
		sc.close();
	}

	public static void ejercicio5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un dividendo");
		int dividendo = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce el divisor");
		int divisor = sc.nextInt();
		if (divisor == 0) {
			System.out.println("Introduce un divisor distinto de 0");
		}
		System.out.println("La división da: " + dividendo / divisor);
		sc.close();
	}

	public static void ejercicio6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tres números enteros");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		int numero3 = sc.nextInt();
		sc.nextLine();
		if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println(numero1 + " es el número más grande");
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println(numero2 + " es el número más grande");
		} else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println(numero3 + " es el número más grande");
		}
		sc.close();
	}

	public static void ejercicio7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la hora, minutos y segundos actuales");
		int hora = sc.nextInt();
		int minutos = sc.nextInt();
		int segundos = sc.nextInt();
		sc.nextLine();
		if (hora >= 24 || hora < 0) {
			System.out.println("El formato de la hora no esta escrito correctamente");
		} else if (minutos >= 60 || minutos < 0) {
			System.out.println("El formato de los minutos no esta escrito correctamente");
		} else if (segundos >= 60 || segundos < 0) {
			System.out.println("El formato de los segundos no esta escrito correctamente");
		} else {
			System.out.printf("Son las %s:%s:%s", hora > 10 ? hora : "0" + hora, minutos > 10 ? minutos : "0" + minutos,
					segundos > 10 ? segundos : "0" + segundos);
		}
		sc.close();
	}

	public static void ejercicio8() {
		Scanner sc = new Scanner(System.in);
		int A = 55;
		System.out.println(A % 2 == 0 ? A + " es par" : A + " es impar");
		sc.close();
	}

	public static void ejercicio9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número del mes");
		int mes = sc.nextInt();
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("El mes tienes 31 dias");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("El mes tiene 30 días");
			break;
		case 2:
			System.out.println("El mes tiene 28 días");
			break;
		default:
			System.out.println("Introduce un número válido");
		}

		sc.close();
	}

	public static void ejercicio9b() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número del mes");
		int mes = sc.nextInt();
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println("El mes tienes 31 dias");
		case 4, 6, 9, 11:
			System.out.println("El mes tiene 30 días");
		case 2:
			System.out.println("El mes tiene 28 días");
		default:
			System.out.println("Introduce un número válido");
		}
		sc.close();
	}

	public static void ejercicio10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pulsa una tecla");
		String a = sc.next();
		char tecla = a.charAt(0);
		switch (tecla) {
		case '.':
		case ',':
		case ';':
		case ':':
			System.out.println("Has escrito un signo de puntuación");
			break;
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("Has escrito un número");
			break;
		default:
			System.out.println("No has escrito un número ni un signo de puntuación");
		}
		sc.close();
	}

	public static void ejercicio13() {
		int conteo = 20;
		while (conteo > 0) {
			System.out.println(conteo--);
		}
	}

	public static void ejercicio13b() {
//		int conteo2 = 20;
//		for(conteo2 > 0) {			
//			System.out.println(conteo2--);
//		}
//			
//		
	}

	public static void ejercicio12() {
		Scanner sc = new Scanner(System.in);
		int precio = 50;
		System.out.println("Indica tu edad:");
		int edad = sc.nextInt();
		sc.nextLine();
		if (edad <= 0) {
			System.out.println("Por favor introduzca un número válido");
		} else if (edad > 0 && edad <= 18) {
			System.out.println("El precio de tu entrada es de " + (precio - (precio / 4)));
		} else if (edad >= 65) {
			System.out.println("El precio de tue entrada es de " + precio / 4);
		} else {
			System.out.println("Es usted socio? (Sí/No) ");
			String socio = sc.nextLine();
			if (socio.equals("No")) {
				System.out.println("El precio de su entrada es de " + precio);
			} else if (socio.equals("Sí")) {
				System.out.println("El precio de su entrada es de " + precio * 0.6);
			}
		}
		sc.close();
	}

	public static void ejercicio12b() { // lo mismo para un grupo
		final double MENOR_EDAD = 0.25;
		final double DESCUENTO_SOCIO = 0.4;
		final double DESCUENTO_JUBILADO = 0.75;
		final int PRECIO_ENTRADA = 50;
		Scanner sc = new Scanner(System.in);
		double precioEntrada = 50; // Precio 1 entrada base
		double precioTotalGrupo = 0; // Precio total acumulado
		System.out.println("¿Cuántos sois?");
		int personas = sc.nextInt();
		sc.nextLine();
		int personasAtendidas = 0;
		while (personasAtendidas < personas)
			System.out.println("Datos de la persona " + (personasAtendidas + 1));
		{
			System.out.println("Introduzca su edad:");
			int edad = sc.nextInt();
			sc.nextLine();
			precioEntrada = 50;
			if (edad < 18) {
				precioEntrada = precioEntrada * (1 - MENOR_EDAD);
			} else if (edad >= 18 && edad < 65) {
				System.out.println("Es usted socio (si/no)");
				String respuesta = sc.nextLine();
				if (respuesta.equalsIgnoreCase("si") || respuesta.equalsIgnoreCase("Sí")
						|| respuesta.equalsIgnoreCase("S")) {
					precioEntrada = precioEntrada * (1 - DESCUENTO_SOCIO);
				}
			} else {
				precioEntrada = precioEntrada * (1 - DESCUENTO_JUBILADO);
			}
			precioTotalGrupo += precioEntrada;
			System.out
					.println("Precio de la entrada de la persona " + (personasAtendidas + 1) + " es " + precioEntrada);
			System.out.println("Precio total de las entradas es " + precioTotalGrupo);
		}
		sc.close();
	}
	
	public static void ejercicio18() {
		for (int i = 0; i<=100; i+=5) {
			System.out.println(i);
			}
		}
	public static void ejercicio19() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número");
		int numero = Integer.parseInt(sc.nextLine());
		for (int i=1; i <= numero; i++) {
			System.out.print(i + ((i != numero) ? "," : " "));
		}
		sc.close();
	}
	
	/*
	 * Decir si un número es primo o no
	 * Primo si solo ses divisible por 1 y por él mismo (2,3,5,7,11,13,17,23,29...)
	 */
	public static void ejercicio21a() { //Resuelto con For
		int divisor=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero=Integer.parseInt(sc.nextLine()); // Para coger un número y asignarlo a una variable.
		for (int i=1; i<=numero; i++) {
			if (numero%i==0) {
				divisor++;
			}	
			} if (divisor==2 || numero==1) {
				System.out.println(numero +" es un numero primo");
			} else {
				System.out.println(numero + " es un numero compuesto");
			}
		sc.close();
	}
	public static void ejercicio21aConBoolean() { //Resuelto con For
		int contador = 0;
		boolean esPrimo = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero=Integer.parseInt(sc.nextLine()); // Para coger un número y asignarlo a una variable.
		for (int i=2; i<numero/2 && esPrimo; i++) {
			contador++;
			if (numero%i==0) {
				esPrimo=false;
			}	
		} System.out.println(contador);
			if (esPrimo) {
			System.out.println(numero +" es un numero primo");
		} else {
			System.out.println(numero + " es un numero compuesto");
		}
		
		sc.close();
	}
	public static void ejercicio21aConBreak() { //Resuelto con For
		int contador = 0;
		boolean esPrimo = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero=Integer.parseInt(sc.nextLine()); // Para coger un número y asignarlo a una variable.
		for (int i=2; i<numero/2 && esPrimo; i++) {
			contador++;
			if (numero%i==0) {
				esPrimo=false;
				break; //No es recomendable salvo excepciones;
			}	
		} System.out.println(contador);
		if (esPrimo) {
			System.out.println(numero +" es un numero primo");
		} else {
			System.out.println(numero + " es un numero compuesto");
		}
		sc.close();
	}
	public static void ejercicio21b() { //Resuelto con While
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero=sc.nextInt();
		sc.nextLine();
		int i=1;
		while(i<numero) {
			if (numero%i==0) {
				System.out.println("El numero " + i + " es divisor de " + numero);	
			} i++;
		}
		sc.close();	
	}
		
	public static void main(String[] args) {
//		ejercicio1();
//		ejercicio2();
//		ejercicio3();
//		ejercicio3b();
//		ejercicio4();
//		ejercicio5();
//		ejercicio6();
//		ejercicio7();
//		ejercicio8();
//		ejercicio9();
//		ejercicio9b();
//		ejercicio10();
//		ejercicio12();
//		ejercicio12b();
//		ejercicio13();
//		ejercicio13b();
//		ejercicio18();
		ejercicio19();
//		ejercicio21aConBoolean();
//		ejercicio21a();
//		ejercicio21b();

	}

}
