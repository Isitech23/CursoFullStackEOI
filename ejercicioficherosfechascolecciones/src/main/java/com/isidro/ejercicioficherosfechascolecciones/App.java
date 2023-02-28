package com.isidro.ejercicioficherosfechascolecciones;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
	
	public static List<String> devolverLineasJava8(Path ruta){
		try {
			List<String> lineas = Files.readAllLines(ruta,Charset.forName("UTF-8"));
			return lineas;
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("No se puede acceder al fichero. Error en devolverLineasJava8");
			return null;
		}
	}
	
	public static void splitFichero() {
		List<String> listaFichero = FicherosUtils.devolverlineasjava8(Paths.get("C:\\ficheros\\ejericioficherofechascolecciones\\caixa.txt"))
	}
	
    public static void main( String[] args )
    {
    	
    }
}
