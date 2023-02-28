package com.isidro.json;

import java.util.ArrayList;
import java.util.List;

import com.isidro.json.entidades.People;
import com.isidro.json.entidades.Posts;
import com.isidro.json.utilidades.JsonUtils;

public class App 
{
	static List<Posts> publicaciones = new ArrayList<Posts>();
	
    public static void main( String[] args )
    {
   /*	JsonUtils.leerJsonDesdeFichero("C:/ficheros/profesor.json");
    	publicaciones = JsonUtils.leerPostsInternet("https://jsonplaceholder.typicode.com/todos");
    	publicaciones.stream()
    	.filter(e->e.getId()%2==0)// publicaciones pares
    	.forEach(e->System.out.println(e));*/
    	// Escribir con Json Simple
//    	JsonUtils.escribirJsonSimple();
    	
    	
    	//Leer personaje con Gson
//    	People p = JsonUtils.leerPersonaje("https://swapi.dev/api/people/1?format=json");
//    	System.out.println(luke);		
    	
    	//Devolver lista de personajes
    	List <People> personajes1al10 = JsonUtils.leerPersonajes("https://swapi.dev/api/people/" ,1,10,"?format=json");
    	personajes1al10.forEach(e->System.out.println(e));
    }
}
