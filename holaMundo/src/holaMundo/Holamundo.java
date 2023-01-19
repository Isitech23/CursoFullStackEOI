package holaMundo;

import java.util.Scanner;

/**
 * Esta es la clase inicial del curso
 * @author Usuario
 * @since 1.0
 */
public class Holamundo {

	public static void ejemplosDeComentarios() {
		/*
		 * Este es mi primerito programa
		 * Isidro 17/01/2023
		 */
		System.out.println("Hola Isidro");
		System.out.println("Adiós mundo cruel");
		System.out.println("Otra línea");
		System.out.println("Segunda línea");
		System.out.println("Tercera línea");
		System.out.println("Adiós mundo cruel");	
	}
	
	private static void ejemplosTipos() {
		int number = 5;
		int number2 = 7;
		int suma = (number + number2);
		System.out.println(suma);
	}
	
	public static void ejemplosString() {
		//////////////// Clase dia 18/01/22 ////////////////////////////////////////////////////////////
		String cadena1; // String cadena 1 = "Fran";
		cadena1 = "Fran";
		String cadena2 = "Hola";
		String cadena3 = "Adiós";
		String cadena4 = cadena1 + cadena2; //"HolaFran"
		String cadena5 = cadena1 + " " + cadena2; //"Hola Fran"
		String prefijo = "34";
		String telefono = "666666666";
		int numero = 40;
		System.out.print(prefijo + " "+ telefono); // 34 666666666
		System.out.println("Otra cosa");
		System.out.printf("%s tiene %d años \n", cadena1, numero);
		System.out.println("Otra cosa");
		
		String Isidro ="Isidro";
		//String int ="String"; // Da error
	}
	
	public static void ejemplosBoolean() {
		//Son valores que solo pueden ser true o false;
		boolean boolean1 = true;
		boolean boolean2 = false;
		boolean comparacion1 = 10<20; //true;
		System.out.println(10<20); //true);
		System.out.println(comparacion1); //true
		// COndiciones de comparación: <, >, >=, <=, ==. !=,
		int numero1 = 10;
		int numero2 = 20;
		boolean c1 = 10<20; //true
		boolean c2 = 10>20; //false
		boolean c3 = 10<=20; //true
		boolean c4 = 10>=20; //false
		boolean c5 = 10==20; //false
		boolean c6 = 10!=20; //true
		String cadena1 = "hola";
		String cadena2 = "adiós";
		String cadena3 = "hola";
		String cadena4 = "Hola";
		System.out.println(cadena1.equals(cadena2)); //false
		System.out.println(cadena1.equals(cadena3)); //true
		System.out.println(cadena1.equals(cadena4)); //false
		boolean cadenasIguales = cadena1.equals(cadena2); //false
		numero1 = 5; //reescribimos el valor de la int numero1 a partir de aquí
		double numero3 = 5.0;
		double numero4 = 5.1;
		System.out.println(numero1==numero3); //true, se pueden comparan enteros con decimales.
		System.out.println(numero1==numero4); //false
		System.out.println((11/2)==numero1); //true, ya que 11 y 2 son int, y la division da otro int
		System.out.println((11.0/2)==numero1);	//false, ya que detecta una double.
		System.out.println((11%2)==1); //true porque imprime el resto que es 1 
		System.out.println((11%2)==0); //false, ya que 1 != 0.
		System.out.println(23%4); //imprimiria 3 que es el resto.
	}
	
	public static void ejercicio3() {
		int valor1=10, valor2=10;
		System.out.println(valor1<valor2);
		System.out.println(valor1==valor2);
		System.out.println(valor1>=valor2);
	}
	
	public static void ejercicio5() { //Esta mal xq no transformas la variable N)
		
		int n = 23;
		
		System.out.println("Valor inicial de N = 23");
		System.out.println("N + 77 = " + (n+77));
		n = 100;
		System.out.println("N - 3 = " + (n-3));
		n = 97;
		System.out.println("N * 2 = " + (n*2));
		
		//EJEMPLO DE FRAN//
		 int N = 23;
		 N += 77;
		 System.out.println("Valor inicial de N = " + N); 
		 N -= 3;
		 System.out.println("N - 3 = " + N);
		 N *= 2;
		 System.out.println("N * 2 = " + N);
		
	}
	
	public static void ejemplosIncrementosDecrementos() {
		int numero = 10;
		//pre-incrementos
		numero++; // 11
		System.out.println(numero); // 11
		numero++; //12
		System.out.println(numero); // 12
		//pre-decrementos
		--numero; // 11
		System.out.println(numero); // 11
		numero--; // 10
		System.out.println(numero); // 10
		
		/////LO IMPORTANTE ES EL MOMENTO EN QUE INCREMENTA O DECREMENTA/////
		System.out.println(++numero); // 10 u 11? -> 11 y numero vale 11
		System.out.println(numero--); // 11 y numero vale 12
		System.out.println(numero); // 12
		
	}
	
	public static void ejemplosConstantes() {
		//Para que una variable sea siempre constante le ponemos final delante//
		//Escribimos las ctes con MAYUS y separadas por "_"//
		final double IVA = 0.21;
		final double PI = 3.1416;
		double precioVaquero = 50;
		System.out.println("El precio final es : " + (precioVaquero * (1+IVA)));
		//Si intentamos cambiar PI = 3.14159 daria error por ser una final//
	}
	
	public static void conversionesNumerosCadenas() {
		
		int numero = 10;
		String cadena = "11";
		System.out.println(cadena+cadena); //1110
		//Convertir cadena a numero
		System.out.println(Integer.parseInt(cadena) + numero); // 21
		int prefijo=34;
		int telefono=666666666;
		System.out.println(prefijo+telefono); // hace la suma 666666670
		System.out.println(" "+(prefijo)+ telefono); // 34666666666 -> Si un elementos es cadena (String) ya lo hace bien
		// Convertir un numero a cadena
		System.out.println(String.valueOf(prefijo)+telefono); //34666666666
		System.out.println("00" + prefijo +"-" + telefono); //0034-666666666
	}
		
	public static void ejercicio6() {
		//Ejemplo para almacenar valores iniciales//
		int A = 1, B=2, C=3, D=4;	
		System.out.println("Valores iniciales: A = " + A + " B = " + 2 + " C = " + 3 + " D = " + D);
		B=C;
		System.out.println("B toma el valor de C -> B = " + B);
		C=A;
		System.out.println("C toma el valor de A -> C = " + C);
		A=D;
		System.out.println("A toma el valor de D -> A = " + A);
		D=B;
		System.out.println("D toma el valor de B -> D = " + D);
		
		/*SOLUCIÓN DE FRAN
		int A=1; 
		int B=2;
		int C=3;
		int D=4;*/
		final int auxB = B; //2	Creamos una variable auxiliar para no perder el valor de B
		System.out.println("Valores iniciales: A = " + A + " B = " + 2 + " C = " + 3 + " D = " + D);
		B=C;
		System.out.println("B toma el valor de C -> B = " + B);
		C=A;
		System.out.println("C toma el valor de A -> C = " + C);
		A=D;
		System.out.println("A toma el valor de D -> A = " + A);
		D=auxB;
		System.out.println("D toma el valor de B -> D = " + D); 
		
		}
	
	public static void ejercicio7() {
//		char b = 'b';
//		char k = 'k';
//		System.out.println(b +" tiene la posición " + charCodeAt('b')); //falta saber la funcion para convertir a ASCII
//		System.out.println(k + " tiene la posicion " + charCodeAt(k));
	}
	
	public static void ejemplosSaltos() {
		////////////   Clase dia 19/01    ///////////////////////////////////////////////////////////////
		System.out.println("Hola\nFran\nBien?"); // \n baja una linea
		System.out.println("Hola\n\tFran\nBien?");  // \t tabula una linea
		System.out.println("\t2) Borrar producto"); // \t2 dos tabulaciones ...
	} 
	public static void ejemplosFormateos() {
		String fran = "Fran";
		String isidro = "Isidro";
		double salario1 = 95567.89;
		double salario2 = 2589.3674;
		
		System.out.printf("%12s%14s\n", "NOMBRE", "SALARIO");
		System.out.println("-----------------------");
		System.out.printf("%12s%14s€\n" ,fran, salario1); 
		System.out.printf("%12s%14s€\n" ,isidro, salario2);
		System.out.printf("%-12s%-14f€\n" ,isidro, salario2); //Si ponemos numeros negativos alineas a la izquierda
		System.out.printf("%12s%14.2f€\n" ,isidro, salario2); //el .2 indica que quieres 2 decimales
		System.out.printf("%-12s%14.2f€\n" ,isidro, salario2); 
	}
	
		public static void ejemplosScanner() { //Leer la consola
			/*Scanner sc = new Scanner(System.in); //Abrir el scanner
			System.out.println("Introduzca su nombre");
			String nombre = sc.nextLine(); // Lo es que scriba el user hasta que pulse el intro.
			System.out.println("Introduzca su localidad");
			String localidad =sc.nextLine();
			System.out.println("Introduzca su salario:");
			double salario =sc.nextDouble();
			sc.nextLine(); // Al hacer esto limpiamos buffer y solo coge el primer elemento, para evitar errores
			System.out.println("Introduzca cuanto desaaria ganar");
			double salarioDeseado = sc.nextDouble();
			System.out.println("¡Hola " + nombre + " me encanta " 
			+ localidad + " y que usted gane " + salario + " y jamas llegue a ganar " 
			+ salarioDeseado + "!");
			sc.close(); //cierra el Scanner*/
			
			// Opción B//
//			Scanner sc = new Scanner(System.in); //Abrir el scanner
//			System.out.println("Introduzca su nombre");
//			String nombre = sc.nextLine(); // Lo es que scriba el user hasta que pulse el intro.
//			System.out.println("Introduzca su localidad");
//			String localidad =sc.nextLine();
//			System.out.println("Introduzca su salario:");
//			double salario = Double.parseDouble(sc.nextLine()); //Al transformas la string a double nos ahorramos lo anterior
//			System.out.println("Introduzca cuanto desaaria ganar");
//			double salarioDeseado = Double.parseDouble(sc.nextLine()); 
//			System.out.println("¡Hola " + nombre + " me encanta " 
//					+ localidad + " y que usted gane " + salario + " y jamas llegue a ganar " 
//					+ salarioDeseado + "!");
//			sc.close(); //cierra el Scanner
			
			Scanner sc = new Scanner(System.in); //Abrir el scanner
			System.out.println("Introduzca su nombre");
			String nombre = sc.nextLine(); // Lo es que scriba el user hasta que pulse el intro.
			System.out.println("Introduzca su localidad");
			String localidad =sc.nextLine();
			System.out.println("Introduzca su salario:");
			double salario = Double.parseDouble(sc.next().replace(',','.')); //Al transformas la string a double nos ahorramos lo anterior
			sc.nextLine();
			System.out.println("Introduzca cuanto desearia ganar");
			double salarioDeseado = Double.parseDouble(sc.nextLine()); 
			System.out.println("¡Hola " + nombre + " me encanta " 
					+ localidad + " y que usted gane " + salario + " y jamas llegue a ganar " 
					+ salarioDeseado + "!");
			sc.close(); //cierra el Scanner
	}
		
		public static void ejercicio15() {
//			// Mi intento//
//			Scanner sc = new Scanner(System.in);
//			System.out.printf("%15s\n" ,"Introduzca el nombre del producto:");
//			String nombre1 = sc.nextLine();
//			System.out.printf("%12.2f\n", "Introduzca su precio:");
//			double precio1 = Double.parseDouble(sc.next().replace(',','.'));
//			sc.nextLine();
//			sc.close();
			
			Scanner sc = new Scanner(System.in);
			final double IVA = 0.21;
			//Obtención de datos//
			System.out.println("Introduce el nombre del producto: ");
			String nombre1 = sc.nextLine();
			System.out.println("Introduzca el precio del producto ");
			double precio1 = Double.parseDouble(sc.next().replace(',','.'));
			sc.nextLine();
			System.out.println("Introduce el nombre del producto: ");
			String nombre2 = sc.nextLine();
			System.out.println("Introduzca el precio del producto ");
			double precio2 = Double.parseDouble(sc.next().replace(',','.'));
			sc.nextLine();
			System.out.println("Introduce el nombre del producto: ");
			String nombre3 = sc.nextLine();
			System.out.println("Introduzca el precio del producto ");
			double precio3 = Double.parseDouble(sc.next().replace(',','.'));
			sc.nextLine();
			//Impresión de datos//
			System.out.printf("------------------------------------\n");
			System.out.printf("%-15s%12.2s%12s\n", "PRODUCTO", "PRECIO", "IVA");
			System.out.printf("%-15s%12.2f%12s\n", nombre1, precio1, precio1*(1+IVA));
			System.out.printf("%-15s%12.2f%12s\n", nombre2, precio2, precio2*(1+IVA));
			System.out.printf("%-15s%12.2f%12s\n", nombre3, precio3, precio3*(1+IVA));
			sc.close();
			
			
			
			
			
		}
	public static void tablasVerdad() {
		//Ejemplo copiado del PDF
		int edad = 25;
		int anyosCarnet = 6;
		String sexo = "Masculino";
		String nombre = "Pepe";
		boolean esPepeMayor = edad >= 18 && nombre.equals("Pepe"); //true
		System.out.println(esPepeMayor); // true

		boolean tieneDescuento = (sexo.equals("Masculino") && anyosCarnet > 10) || (sexo.equals("Femenino") &&
		anyosCarnet > 5); 
		System.out.println(tieneDescuento); // false
		
		boolean estoQueDA = sexo.equals("Masculino") || anyosCarnet<5 && nombre.equals("Fran");  //true
	}
	
	public static void main(String[] args) {
//		ejemplosTipos();
//		ejemplosDeComentarios();
//		ejemplosString();
//		ejemplosBoolean();
//		ejercicio3();
//		ejercicio5(); 
//		ejemplosIncrementosDecrementos();
//		ejemplosConstantes();
//		conversionesNumerosCadenas();
//		ejercicio6();
//		ejercicio7();
//		ejemplosSaltos();
//		ejemplosFormateos();
//		ejemplosScanner();
		ejercicio15();
	}

}
