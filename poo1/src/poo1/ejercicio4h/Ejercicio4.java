package poo1.ejercicio4h;

public class Ejercicio4 {
	
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		Empleado fran = new Empleado("Fran", 10000); //Puedo añadir un empelado en 2 lineas
		empresa.getEmpleados().add(fran);
		empresa.getEmpleados().add(new Empleado("Dani", 20000)); // O en 1 sola
		empresa.getEmpleados().add(new Empleado("Pipo", 1000));
		empresa.getEmpleados().add(new Empleado("Sergio", 100));
		empresa.getEmpleados().add(new Empleado("Rico", 10));
		
		Empresa copia = new Empresa(empresa); //Copiar una empresa a partir de otra
		copia.getEmpleados().get(0).setNombre("Francisco"); //le cambio el nombre al primer empleado
		copia.getDireccion().setNumeroCalle(10); // Cambiar el numerod e la calle de la direccion de la empresa copia.
		
		//Mostramos lo valores de la empresa original y la copia
		System.out.println("Empresa original");
		System.out.println(empresa);
		System.out.println("La empresa original tiene " + empresa.getEmpleados().size());
		System.out.println("Empresa copia");
		System.out.println(copia);
		System.out.println("La empresa copia tiene " + copia.getEmpleados().size());
		
		
	}

}
 