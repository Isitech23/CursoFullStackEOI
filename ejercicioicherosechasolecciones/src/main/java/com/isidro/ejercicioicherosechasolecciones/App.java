package com.isidro.ejercicioicherosechasolecciones;

import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import com.isidro.ejercicioicherosechasolecciones.Utilidades;
import com.isidro.ejercicioicherosechasolecciones.entidades.Cliente;

/**
 * Hello world!
 *
 */
public class App 
{
   
    public static void main( String[] args )
    {
  
    	List <String> clientes = Utilidades.devolverLineasJava8(Paths.get("C:/ficheros/ejericioficherofechascolecciones/caixa.txt"));
    	List <Cliente> listaClientes = new ArrayList <Cliente>(); 
    	for (String elemento : clientes) {
    		String [] datos = elemento.split(";");
    		
    	Cliente cliente = new Cliente(datos[0], datos[1], LocalDate.parse(datos[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")), datos[3], Double.parseDouble(datos[4]));
    	listaClientes.add(cliente);
    	}
    	
    	clientes = Utilidades.devolverLineasJava8(Paths.get("C:/ficheros/ejericioficherofechascolecciones/santander.txt"));
    	for (String elemento : clientes) {
    		String [] datos = elemento.split(";");
    		
    		Cliente cliente = new Cliente(datos[0], datos[1], LocalDate.parse(datos[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")), datos[3], Double.parseDouble(datos[4]));
    		listaClientes.add(cliente);
    	}
    	
    	clientes = Utilidades.devolverLineasJava8(Paths.get("C:/ficheros/ejericioficherofechascolecciones/sabadell.txt"));
    	for (String elemento : clientes) {
    		String [] datos = elemento.split(";");
    		
    		Cliente cliente = new Cliente(datos[0], datos[1], LocalDate.parse(datos[2], DateTimeFormatter.ofPattern("dd/MM/yyyy")), datos[3], Double.parseDouble(datos[4]));
    		listaClientes.add(cliente);
    	}
    	listaClientes.forEach(e->System.out.println(e));
    }
}
