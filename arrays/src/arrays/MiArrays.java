package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MiArrays {

	public static void ejemploDeclaraciones() {
		int [] numeros; //Declarar la variable
		numeros = new int[5]; //Asignar memoria para poder trabajar con ella
		int [] nums = new int [5]; // Declaración y asignación en la misma linea.
		numeros[0]=12; //Inicializar los valores
		numeros[1]=23;
		numeros[2]=52;
		numeros[3]=5;
		numeros[4]=92;
		int[] numeros2 = {12, 23, 53, 5, 92}; //Declarar la variable y asignarle valores	
	}

	public static void ejemploRecorrido() {
		int[] numeros = {12, 23, 53, 5, 92};
		// con un bucle for
		for(int i=0; i<numeros.length; i++) { //Recorrer el array de nuevo
			System.out.println("El array numeros en su posición " + i + " tiene valor " +numeros[i]);
		}
		// bucle for de atrás hacia delante
		for (int i=numeros.length-1; i>=0; i--) { //Recorrer el array de uno en uno
			System.out.println();
		}
		//con un bucle for-each
		for (int numero : numeros) {
			System.out.println(numero);
		}
		// bucle for each con posicion
		int i=0;
		for (int numero:numeros) {
			System.out.println("El array numeros en su posición " + (i++) + " tiene el  valor " +numero);
		}
		
	}

	public static void ejemploBusquedas1() {
		String[]nombres = {"Juan", "Ana", "Pedro", "Eva", "Paco"};
		boolean encontrado = false; //Nos indicará si hemos encontrado el valor
		String buscar = "Pedro"; //Valor a buscar en el array
		// La condicion tambi´en incluye que no vayamos a encontrar lo que buscamos
		for (int i=0; i<nombres.length && encontrado; i++){
			if (nombres[i].equals(buscar)) {
				encontrado = true;
			}
		}
		if (encontrado) {
			System.out.println("El nombre " + buscar + " está en el array");
		} else {
			System.out.println(buscar + " no encontrado");
		}
	}

	public static void ejemploBusquedaFuncional() { //Ejemplo MUY avanzado
		String[]nombres = {"Juan", "Ana", "Pedro", "Eva", "Paco"};
		String buscar = "Pedro"; 
		
		if (Arrays.stream(nombres).anyMatch(n->n.equals("Pedro"))) { // con lambdas
			System.out.println("El nombre " + buscar + " está en el array");
		} else {
			System.out.println(buscar + " no encontrado...");
		}
	}

	public static void ejemploRedimension () {
		String[] nombres = {"Juan", "Ana", "Pedro", "Eva", "Paco", ""};
		nombres = Arrays.copyOf(nombres, 10);
		for (int i=0; i<nombres.length; i++) {
			//if(nombres[i]!=null) 
			System.out.println(nombres[i] + " tiene " + nombres[i].length() + " letras ");
		}
	}
	
public static void ejemploAumentarUnoArray() {
		Scanner sc = new Scanner(System.in);
		String[] alumnos = {"Juan", "Ana", "Pedro", "Eva", "Paco", ""};
		System.out.println("Introduzaca el nuevo alumno:");
		String nombreAlumno = sc.nextLine();
		alumnos = Arrays.copyOf(alumnos, alumnos.length+1); //Le da un tamaño de una unidad más
		alumnos[alumnos.length-1] = nombreAlumno; // Mete el nuevo dato en la última posicion
		for (String alumno:alumnos) { //forEach
			System.out.println(alumno);
		}
		Arrays.stream(alumnos).forEach(e->System.out.println(e)); // programación funcional
		sc.close();
	}
	
public static void ordenarArray() {
		String[] alumnos = {"Juan", "Ana", "Pedro", "Eva", "Paco"};
		Arrays.sort(alumnos);
		for (String alumno:alumnos) { //forEach
			System.out.println(alumno);
		}
		
		int[] numeros = {11, 2,4,5,3,21,80};
		Arrays.sort(numeros);
		for (int numero:numeros) {
			System.out.println(numero);
		}
		System.out.println("Imprimir con toString");
		System.out.println(alumnos);
	}
	
	public static void main(String[] args) {
//		ejemploDeclaraciones();
//		ejemploRecorrido();
//		ejemploBusquedas1();
//		ejemploBusquedaFuncional();
//		ejemploRedimension();
//		ejemploAumentarUnoArray();
		ordenarArray();
	}

}
