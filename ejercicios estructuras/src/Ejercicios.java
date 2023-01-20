import java.util.Scanner;
public class Ejercicios {
	// Ejercicios del segundo PDF del moodle///
	
	public static void ejercicio1() {
		/* Programa que lea un número entero por teclado y calcule si es par o impar. Un número es par si el 
		resto (%) de dividir entre 2 da 0. */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número:");
		double numero = sc.nextInt();
		System.out.println(numero%2<=0?"Es par":"Es impar");
		sc.close();
	}
	
	public static void ejercicio2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número:");
		double numero = sc.nextInt();
		System.out.println(numero%10==0?"Es múltiplo de 10":"No es múltiplo de 10");
		sc.close();
	}
	
	public static void ejercicio3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una letra");
		String letra = sc.next();
		System.out.println(letra.toLowerCase().equals(letra)? "No es una letra mayúscula":"Es una letra mayúscula");
		sc.close();
	}
	
	public static void ejercicio4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una palabra");
		String palabra1 = sc.nextLine();
		System.out.println("Escribe otra palabra");
		String palabra2 = sc.nextLine();
		System.out.println(palabra1.contentEquals(palabra2)? "Ambas palabras son iguales":"Son diferentes palabras");
		sc.close();
	}
	
	public static void ejercicio5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un dividendo");
		int dividendo = sc.nextInt();
		System.out.println("Introduce el divisor");
		int divisor = sc.nextInt();
		if(divisor==0) {
			System.out.println("Introduce un divisor distinto de 0");
		}
		System.out.println(dividendo/divisor);
		sc.close();
	}
	
	public static void main(String[] args) {
//		ejercicio1();
//		ejercicio2();
//		ejercicio3();
//		ejercicio4();
//		ejercicio5();
		
		
		

	}

}
