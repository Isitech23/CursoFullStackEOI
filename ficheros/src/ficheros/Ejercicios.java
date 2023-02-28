package ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Ejercicios {
	
	/**
	 * Crea un programa que vaya leyendo lo que el usuario escribe en consola y lo escriba en un
	 * fichero (línea a línea). Terminará cuando el usuario escriba la palabra ‘FIN’.
	 * @param nombreFichero
	 */
	public static void ejercicio2(String nombreFichero) {
		Scanner sc = new Scanner(System.in);
		String linea;
		try {
			Files.writeString(Paths.get(nombreFichero), "");
		}catch (IOException e1) {
			e1.printStackTrace();
		} do {
			System.out.println("Introduzca la línea que quiere insertar en el fichero (FIN PARA FINALIZAR");
			linea = sc.nextLine();
			if(!linea.equalsIgnoreCase("fin")) {
				try {
				Files.writeString(Paths.get(nombreFichero), linea+"\n", StandardOpenOption.APPEND);
			}catch (IOException e) {
				e.printStackTrace();
			}
		} 
		}while(!linea.equalsIgnoreCase("fin"));
		sc.close();
	}
	
	
	/**
	 * Haz un programa que pregunte al usuario por el nombre de un fichero y muestra su contenido.
	 * Observa que cuando el fichero no existe lanza una excepción. 
	 * Captúrala e informa de que el fichero no existe al usuario.
	 * 
	 * @param args
	 */
	
	public static void ejercicio7i5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el nombre del fichero");
		String nombreFichero = sc.nextLine();
		List<String> lineas = Ejemplos.devolverLineasJava8(Paths.get(nombreFichero));
		if (lineas!=null) { //He podido acceder al fichero
			lineas.forEach(e->System.out.println(e));
		}
		sc.close();
	}
	
	
	public static void main(String[] args) {
		ejercicio2("C:/ficheros/ejercicio2.txt");
//		ejercicio7i5();
	}

}