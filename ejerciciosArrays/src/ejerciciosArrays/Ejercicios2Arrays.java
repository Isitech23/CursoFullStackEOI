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
	/**
	 * Pide al usuario 10 números con decimales (double). Usa un array para almacenarlos.
	 * Muestra la media y los números que están por encima de esa media.
	 */
public static void ejercicio3() {
	double [] numeros = new double [10]; //Creo el array y le asigno 10 huecos
	double suma = 0; // Variable para ahcer la media
	Scanner sc = new Scanner(System.in);
	System.out.println("Escribe diez numeros: ");
	for (int i=0; i<numeros.length; i++) { //Paso por la array tantas veces como huecos hay
		numeros[i]=Double.parseDouble(sc.nextLine()); //Almaceno en la array cada input
		suma+=numeros[i]; //Actualizo suma con cada nuevo valor en la array
		
	}
	double media = (suma/numeros.length); //Calculo la media
	System.out.println("La media aritmética es :" + (media)); //Muestro la media
	for (double num:numeros) {
		if (num>=media) {
			System.out.println(num +" es mayor de la media");
		}
	}
	sc.close();
	}
	
/**
 * Crea un programa que almacene en una tabla el número de días que tiene cada mes
 * (de un año no bisiesto), pida al usuario que te indique un mes (ej. 2 para febrero) y un
 * día (ej. el día 15). Muéstrale qué número de día es dentro del año (por ejemplo, el 15
 * de febrero sería el día número 46, y el 31 de diciembre sería el día 365).
 */
public static void ejercicio4() {
	double [] meses = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduce el numero del mes actual: ");
	int mes = Integer.parseInt(sc.nextLine());
	System.out.println("Introduce el numero del dia de hoy: ");
	int dia = Integer.parseInt(sc.nextLine());
	System.out.println(dia + meses[mes-1]);
	sc.close();
}


/**
 * Crea 2 arrays, uno para almacenar notas de alumnos y otro para almacenar sus
 * nombres. A continuación pregunta al usuario cuántos alumnos hay en total. En función
 * del número de alumnos pide sus nombres y sus notas y guárdalos en los respectivos
 * arrays.
 */
public static void ejercicio5() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Cuántos alumnos hay en clase?: ");
	int clase = Integer.parseInt(sc.nextLine());
	String [] alumnos = new String [clase]; //String para los alumnos
	double [] notas = new double [clase]; //string para las notas
	System.out.println("Introduce el nombre de un alumnno,y después su nota: ");
	for (int i=0; i<=clase-1; i++) { //clase-1 porque la array empieza en 0 pero los alumnos empiezan por 1
			alumnos [i] = sc.nextLine();
			notas [i] = Double.parseDouble(sc.nextLine());
		}
	for (int i=0; i<=clase-1; i++) {
		System.out.println(alumnos[i] + " ha sacado un "+ notas[i]);
	}
	sc.close();
}

/**
 * Crea un array de números enteros con 10 posiciones. Pregunta al usuario por un
 * número y guarda en el array la tabla de multiplicar de dicho número. A continuación,
 * recorre el array y muestra lo que tienes almacenado. 
 */
public static void ejercicio6() {
	int [] tabla = new int [10];
	Scanner sc = new Scanner(System.in);
	System.out.println("Escoge un número: ");
	int numero = Integer.parseInt(sc.nextLine());
	for (int i=0; i<=9; i++) {
		tabla[i]=numero*(i+1);
		System.out.println(numero +" x "+ (i+1) + " = " + tabla[i]);
	}
	sc.close();
}
 
/**Crea un programa con 2 arrays que almacenen 10 números cada uno (pon los valores
* que quieras). Suma las posiciones de ambos arrays (usa un bucle) en un tercer array,
* y al final muestra los resultados:
*/

public static void ejercicio7() {
	int [] array1 = {12, 25, 56, 78, 48, 15, 35, 22, 14, 45};
	int [] array2 = {65, 48, 75, 99, 25, 15, 45, 35, 285, 78};
	int [] array3 = new int [10];
	for (int i=0; i<10; i++) {
		System.out.println((array3[i]=(array1[i]+array2[i])) + " = " + array1[i] + " + " + array2[i]);
	}
}

public static void main(String[] args) {
//		ejercicio1();
//		ejercicio2();
//		ejercicio3();
//		ejercicio4();
//		ejercicio5();
//		ejercicio6();
		ejercicio7();
	
	}
}