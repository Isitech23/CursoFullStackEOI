package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		Jugador j1 = new Jugador("jesus", 20, 1000);
		Jugador j2 = new Jugador ("isidro", 27, -5000);
		Jugador j3 = new Jugador ("paco", 47, 5000);
		Jugador j4 = new Jugador ("pepe", 67, 6000);
//		System.out.println(j1.toString() +"\n"+ j2.toString());
		
		List<Jugador> listaJugadores = new ArrayList<Jugador>();
		listaJugadores.add(j1);
		listaJugadores.add(j2);
		listaJugadores.add(null);
		listaJugadores.add(null);
		listaJugadores.add(j3);
		listaJugadores.add(j4);
		
		for(Jugador j: listaJugadores) {
			if (j!=null) {
				System.out.println(j.toString());
			} 
		}
		
		List<Jugador> listaJugadores2 = new ArrayList<Jugador>();
		for (Jugador j:listaJugadores) {
			if (j!=null) {
				listaJugadores2.add(new Jugador (j));
			}
		}
		listaJugadores2.get(2).setNombre("pipo");
		System.out.println(listaJugadores);
		System.out.println(listaJugadores2);
	}
}
