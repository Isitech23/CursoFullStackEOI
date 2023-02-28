package ejercicios;

public class Jugador {
	
	private String nombre;
	private int edad;
	private double sueldo;
	
	public Jugador(){
		
	}

	public Jugador(String nombre, int edad, double sueldo) {
		super();
		this.nombre = nombre;
		this.setEdad(edad);
		this.setSueldo(sueldo);
	}

	public Jugador(Jugador copiado) {
		super();
		this.nombre = copiado.nombre;
		this.edad = copiado.edad;
		this.sueldo = copiado.sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad>0) {
		this.edad = edad;
		} else {
			System.out.println("La edad tiene que ser positiva");
		}
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		if (sueldo>0) {
		this.sueldo = sueldo;
		} else {
			System.out.println("El sueldo tiene que ser positiva");
		}
	}

	@Override
	public String toString() { //Para que saque por pantalla
		return "Jugador [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + "]";
	}
	
	
	
	public boolean ageIsPositive(int edad) {
		return edad<0?false:true;
	}
}
