import java.util.Scanner;
public class ejercicios_1 {
	// Ejercicios del primer PDF, empezando por el 7, el resto vistos en clase//
	
	public static void ejercicio7() {
		char letra1 = 'b';
		char letra2 = 'k';
		System.out.println("'b' tiene la posición " + (int)letra1);
		System.out.println("'k' tiene la posición " + (int)letra2);
		System.out.println("Diefrencia entre 'b' y 'k': " + ((int)letra2 - ((int)letra1)));
	}
	
	public static void ejercicio8() {
		int a = 5;
		int b;
		int c;
		final int auxA = a;
		System.out.println(b=++a);
		System.out.println(c=a++);
		System.out.println(b=b*5);
		System.out.println(a=auxA*2);
	}
		
	public static void ejercicio9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hola, ¿Cómo te llamas?: ");
		String nombre = sc.nextLine();
		System.out.println("Encantado de conocerte " + nombre + "!");
		
		sc.close();
		}
	public static void ejercicio10() {
		
	}
	
	public static void main(String[] args) {
//		ejercicio7();
//		ejercicio8();
//		ejercicio9();
		ejercicio10();
	}

}
