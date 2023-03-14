package com.isidro.ejercicio1ficherosfechascolecciones;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.isidro.ejercicio1ficherosfechascolecciones.entidades.Cliente;
import com.isidro.ejercicio1ficherosfechascolecciones.entidades.Productos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Hello world!
 *
 */ 
public class App 
{
	static List <Cliente> listaClientes = new ArrayList <Cliente>();
	static List <Productos> listaProductos = new ArrayList <Productos>();
	static String dni;
	
	public static void crearListaClientes (String ruta) {
		List <String> clientes = Utilidades.devolverLineasJava8(Paths.get(ruta));    	 
    	for (String elemento : clientes) {
    		String [] datos = elemento.split(";");
    	Cliente cliente = new Cliente(datos[0], datos[1], LocalDate.parse(datos[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")), datos[3], Double.parseDouble(datos[4]));
    	listaClientes.add(cliente);
    	}	
	}
	
	public static void crearListaProductos (String ruta) {
		List <String> productos = Utilidades.devolverLineasJava8(Paths.get(ruta));    	 
		for (String elemento : productos) {
			String [] datos = elemento.split(";");
			Productos producto = new Productos (Integer.parseInt(datos[0]), Integer.parseInt(datos[1]), Double.parseDouble(datos[2]), Double.parseDouble(datos[3]), datos[4]);
			listaProductos.add(producto);
		}	
//		listaProductos.forEach(System.out::println);
	}
	
////	public static void saludar() {
//		String [] dia = {"cero", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
//		String [] mes = {"cero", "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
//		int opcion;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Introduzca su DNI/CIF");
//		String dni = (sc.nextLine()); //recogemos el DNI del usuario
//		//(Meter dentro de un do while hasta que acierte un DNI)
//		Cliente clienteASaludar = (Cliente) listaClientes.stream() //Localizamos al usuario
//			.filter(e->e.getDniCif().equals(dni))
//			.findFirst().orElse(null); 
//		List <LocalDate> fechasNacimiento = listaClientes.stream() // Recogemos sus fechas de nacimiento
//			.filter(e->e.getDniCif().equals(dni))
//			.map(e->e.getFechaNacimiento())
//			.collect(Collectors.toList());
//		System.out.println((idioma(clienteASaludar)?
//			"Hola " + clienteASaludar.getNombreCliente()
//				+ "\n" + "Son las " + LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute() + ":" + LocalDateTime.now().getSecond() + " del dia " 
//				+dia[LocalDate.now().getDayOfWeek().getValue()] + ", " + LocalDate.now().getDayOfMonth() + " de " + mes[LocalDate.now().getMonthValue()] + " de " + LocalDate.now().getYear():
//			"Hello " + clienteASaludar.getNombreCliente() + "\n" 
//				+ "The time is " + LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute() + ":" + LocalDateTime.now().getSecond() + " at "
//				+ LocalDate.now().getDayOfWeek() + ", " + LocalDate.now().getMonth() + " " + LocalDate.now().getDayOfMonth() + ", " + LocalDate.now().getYear())); 		
//		
//		if (fechasNacimiento.stream().distinct().count()!=1) {
//			System.out.println((idioma(clienteASaludar)?
//					"Por favor, selecciona el número que corresponda con tu fecha de nacimiento: [0]: " + fechasNacimiento.get(0) + "  [1]: " + fechasNacimiento.get(1) + " [2]: " + fechasNacimiento.get(2)
//					:"Please, choose the number that matches your birthday: [0]: " + fechasNacimiento.get(0) + "  [1]: " + fechasNacimiento.get(1) + " [2]: " + fechasNacimiento.get(2)));
//			do {opcion = Integer.parseInt(sc.nextLine());
//			} while (opcion!=0 && opcion!=1 && opcion!=2);
//		final int opcionFinal = opcion;
//			listaClientes.stream()
//				.filter(e->e.getDniCif().equals(dni))
//				.forEach(e->e.setFechaNacimiento(fechasNacimiento.get(opcionFinal)));
//			clienteASaludar.setFechaNacimiento(fechasNacimiento.get(opcionFinal));
//		}
//		obtenerDatosCliente(clienteASaludar);
//		sc.close();
//		}
	
	public static void saludar() {
		String [] dia = {"cero", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
		String [] mes = {"cero", "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
		int opcion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca su DNI/CIF");
		String dni = (sc.nextLine()); //recogemos el DNI del usuario
		//(Meter dentro de un do while hasta que acierte un DNI)
		List <LocalDate> fechasNacimiento = buscarFechasNacimiento();
		System.out.println((idioma(clienteASaludar())?
				"Hola " + clienteASaludar().getNombreCliente()
				+ "\n" + "Son las " + LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute() + ":" + LocalDateTime.now().getSecond() + " del dia " 
				+dia[LocalDate.now().getDayOfWeek().getValue()] + ", " + LocalDate.now().getDayOfMonth() + " de " + mes[LocalDate.now().getMonthValue()] + " de " + LocalDate.now().getYear():
					"Hello " + clienteASaludar().getNombreCliente() + "\n" 
					+ "The time is " + LocalDateTime.now().getHour() + ":" + LocalDateTime.now().getMinute() + ":" + LocalDateTime.now().getSecond() + " at "
					+ LocalDate.now().getDayOfWeek() + ", " + LocalDate.now().getMonth() + " " + LocalDate.now().getDayOfMonth() + ", " + LocalDate.now().getYear())); 		
		
		if (fechasNacimiento.stream().distinct().count()!=1) {
			System.out.println((idioma(clienteASaludar())?
					"Por favor, selecciona el número que corresponda con tu fecha de nacimiento: [0]: " + fechasNacimiento.get(0) + "  [1]: " + fechasNacimiento.get(1) + " [2]: " + fechasNacimiento.get(2)
					:"Please, choose the number that matches your birthday: [0]: " + fechasNacimiento.get(0) + "  [1]: " + fechasNacimiento.get(1) + " [2]: " + fechasNacimiento.get(2)));
			do {opcion = Integer.parseInt(sc.nextLine());
			} while (opcion!=0 && opcion!=1 && opcion!=2);
			final int opcionFinal = opcion;
			listaClientes.stream()
			.filter(e->e.getDniCif().equals(dni))
			.forEach(e->e.setFechaNacimiento(fechasNacimiento.get(opcionFinal)));
			clienteASaludar().setFechaNacimiento(fechasNacimiento.get(opcionFinal));
		}
		
		obtenerDatosCliente(clienteASaludar());
		sc.close();
	}
	/**
	 * Crea una lista de todas las fechas de Nacimiento del Usuario.
	 * @return
	 */
	public static List<LocalDate> buscarFechasNacimiento() {
		return listaClientes.stream() 
				.filter(e->e.getDniCif().equals(dni))
				.map(e->e.getFechaNacimiento())
				.collect(Collectors.toList());
	}
	
	public static void seleccionarFechaCorrecta(List fechasNacimiento) {
		
	}
	
	/**
	 * Función para obtener el idioma al que hablar al cliente
	 * @param cliente
	 * @return false si queremos que hable en español, true si queremos que hable en inglés.
	 */
		public static boolean idioma(Cliente cliente) {
			String idioma = cliente.getCodigoPais();
			if (idioma=="ES") {
				return false;
			} else {
				return true;
			}
		}
		/**
		 * Función que determina al cliente que saludar y con el que realizar las operaciones
		 * @return el cliente a modificar.
		 */
		public static Cliente clienteASaludar() {
			return listaClientes.stream() //Localizamos al usuario
					.filter(e->e.getDniCif().equals(dni))
					.findFirst().orElse(null);
		}
	
		/**
		 * Función para obtener la edad y el saldo total del cliente.
		 * @param cliente
		 */
		public static void obtenerDatosCliente(Cliente cliente) {
			int edad = Period.between(cliente.getFechaNacimiento(), LocalDate.now()).getYears();
			DoubleSummaryStatistics saldoTotal = listaClientes.stream()
					.filter(e->e.getDniCif().equals(cliente.getDniCif()))
					.collect(Collectors.summarizingDouble(Cliente::getSaldo));
			productoOfrecido(edad, saldoTotal.getSum());
		}
		
		/**
		 * Función para crear una lista de Productos compatibles con el cliente, y devolver el más adecuado.
		 * @param edad
		 * @param saldo
		 */
		public static void productoOfrecido(int edad, double saldo) {
		List <Productos> productosCompatibles = new ArrayList<Productos>();
		for(Productos producto: listaProductos){
			if(producto.getSaldoMaximo()>=saldo && producto.getSaldoMinimo()<=saldo && producto.getEdadMaxima()>=edad && producto.getEdadMinima()<=edad) {
				productosCompatibles.add(producto);
			}
		}
			Optional <Productos> adecuado = productosCompatibles.stream().max(Comparator.comparingDouble(Productos::getSaldoMinimo));
			if (adecuado.isPresent()) {
				System.out.println(idioma(clienteASaludar())?"Nos gustaría ofrecerle el siguente producto: " + adecuado.get().getNombreProducto():
					"We would like to offer you the product " + adecuado.get().getNombreProducto());
			}
	}
		
		
    public static void main( String[] args )
    {
    	crearListaClientes("C:/ficheros/ejericioficherofechascolecciones/caixa.txt");
    	crearListaClientes("C:/ficheros/ejericioficherofechascolecciones/sabadell.txt");
    	crearListaClientes("C:/ficheros/ejericioficherofechascolecciones/santander.txt");
    	crearListaProductos("C:/ficheros/ejericioficherofechascolecciones/productosofertados.txt");
    	saludar();
    
    	
    }
}