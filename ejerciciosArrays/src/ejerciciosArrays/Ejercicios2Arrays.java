package ejerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios2Arrays {

public static void ejercicio1() {
	String [] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio",
			"Agosto","Septiembre","Octubre","Noviembre", "Diciembre"} ;
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el numero del mes:");
	int mes = Integer.parseInt(sc.nextLine());
	System.out.println(meses[mes-1]);
}
	
public static void ejercicio2() {
		int total=0;
		Integer[] numeros = {23,48,19,14,5,1000000,90,9,17,27};
		//Lista de numeros introducirs a recorrer
		for (int numero:numeros) {
			System.out.println(numero);
		}
		//La suma de los números
		for (int numero:numeros) {
			total+=numero;
		}
		System.out.println("El  total es " + total);
		
		// La media de los numeros
		System.out.println((double)total/numeros.length);
		
		//El mayor y el menor de los números (crea un máximo y un mínimo provisional que
//		será igual al primer número del array, después vas comparando con el resto de
//		posiciones).
		int mayorProvisional = numeros[0];
		int menorProvisional = numeros[0];
		for (int numero:numeros) {
			if (numero>mayorProvisional)
				mayorProvisional=numero;
			if (numero<menorProvisional)
				menorProvisional=numero;
		}
		System.out.println("El numero mayor es " + mayorProvisional);
		System.out.println("El número menos es " + menorProvisional);
		//Opción B (y buena)
		Arrays.sort(numeros);
		System.out.println("El numero mayor es " + numeros[numeros.length-1]);
		System.out.println("El número menos es " + numeros[0]);
		
	}
	
public static void ejercicio3() {
	double [] numeros = new double [4]; //Creo el array y le asigno 10 huecos
	double suma = 0; // Variable para ahcer la media
	Scanner sc = new Scanner(System.in);
	System.out.println("Escribe diez numeros: ");
	for (int i=0; i<numeros.length; i++) { //Paso por la array tantas veces como huecos hay
		numeros[i]=Double.parseDouble(sc.nextLine()); //Almaceno en la array cada input
		suma+=numeros[i]; //Actualizo suma con cada nuevo valor en la array
	}
	System.out.println("La media aritmética es :" + (suma/numeros.length)); //Muestro la media
	for (int i=0; i<numeros.length; i++) {
		if (numeros[i]>=suma) {
			System.out.println(numeros[i]);
		}
	}
	sc.close();
	}
	

/*
 * Crea un programa que almacene en una tabla el número de días que tiene cada mes
 * (de un año no bisiesto), pida al usuario que te indique un mes (ej. 2 para febrero) y un
 * día (ej. el día 15). Muéstrale qué número de día es dentro del año (por ejemplo, el 15
 * de febrero sería el día número 46, y el 31 de diciembre sería el día 365).
 */
public static void ejercicio4() {
	
}

public static void main(String[] args) {
//		ejercicio1();
//		ejercicio2();
		ejercicio3();
		ejercicio4();
	}
}