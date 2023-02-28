package ejerciciosPOO2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	
	/**
	 * 1. Crea una clase llamada Tienda con un método llamado bienvenida que imprima por consola 
	 * “¡Bienvenido a nuestra tienda!”. Crea otra clase llamada TiendaLicores que herede de Tienda.
	 *  Crea un objeto del tipo TiendaLicores y llama al método bienvenida.
	 *   
	 *  2. Sobrescribe el método bienvenida en la clase TiendaLicores. 
	 *  Deberá hacer lo mismo que la clase base y añadir el mensaje “Si eres menor de 18 años, fuera de aquí”.
	 */
	public static void ejercicios1y2() {
	TiendaLicores TiendaLicores = new TiendaLicores();
	TiendaLicores.bienvenida();
	}
	
	/**
	 * Crea la clase Persona con los atributos dni, nombre y edad (junto a los getters y setters que vayas necesitando). 
	 * Sobrescribe el método toString, que mostrará los datos de la persona, el método equals que utilizarán solamente
	 *  el DNI para comparar si una persona es la misma que otra, y crea un constructor de copia para la clase. 
	 *  Crea 4 personas y mételas en un array. De una de las personas, crea una copia y cámbiale el nombre. 
	 *  Finalmente recorre el array comparando la copia con cada posición del array usando equals. 
	 *  Cuando encuentres a la persona imprime el mensaje: “Persona encontrada en la posición N” 
	 *  (siendo N la posición del array). Imprime también los datos de la persona del array 
	 *  y de la copia con el método toString().
	 */
	public static void ejercicio3() {
		Persona persona1 = new Persona("111","Fran",45);
		Persona persona2 = new Persona("222","Ate",20);
		Persona persona3 = new Persona("333","Cagdas",22);
		Persona persona4 = new Persona("333","Natalia",21);
		// Creo la lista y meto a las 4 personas
		List<Persona> personas = new ArrayList<Persona>();
		personas.add(persona1);
		personas.add(persona2);
		personas.add(persona3);
		personas.add(persona4);
		
		Persona copia = new Persona(persona3);
		copia.setNombre("Néstor");
		
		for(int i = 0; i<personas.size();i++) {
			if(personas.get(i).equals(copia)) {
				System.out.println("Persona encontrada en la posición " + i);
				System.out.println("Persona encontrada: " + personas.get(i));
				System.out.println("Copia: " + copia);				
			}
		}
		
		// Mi favorita en este caso
		int contador = 0;
		for(Persona persona : personas) {
			if(persona.equals(copia)) {
				System.out.println("Persona encontrada en la posición " + contador);
				System.out.println("Persona encontrada: " + persona);
				System.out.println("Copia: " + copia);
			}
			contador++;
		}
		
		// Esta forma no funcionaría con más de un elemento de la lista que coincida
		for(Persona persona : personas) {
			if(persona.equals(copia)) {
				System.out.println("Persona encontrada en la posición " + personas.indexOf(persona));
				System.out.println("Persona encontrada: " + persona);
				System.out.println("Copia: " + copia);
			}
		}
		
		// Para los talibanes de la prog funcional
		int[] contador2 = new int[1];
		personas.forEach(e->{
			if(e.equals(copia)) {
				System.out.println("Persona encontrada en la posición " + contador2[0]);
				System.out.println("Persona encontrada: " + e);
				System.out.println("Copia: " + copia);
			}
			contador2[0]++;
		});
				
	}
	
	
	public static void main(String[] args) {
//		ejercicios1y2();
//		ejercicio3();
	}
}
