package poo1.ejercicio4h;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empresa {
	private Direccion direccion;
	private String nombreEmpresa;
	private  double numeroEmpleados;
	private List<Empleado> empleados;
	
	public Empresa() {
		// NO OLVIDAR DAR MEMORIA PARA ALMACENAR LOS DIFERENTES OBJETOS
		empleados = new ArrayList<Empleado>();
		direccion = new Direccion("Sin dirección", -1); //Puedo poner valores por defecto.
	}

	public Empresa(Direccion direccion, String nombreEmpresa, List<Empleado> empleados) {
		super();
		this.direccion = direccion;
		this.nombreEmpresa = nombreEmpresa;
		this.empleados = empleados;
	}

	public Empresa(Empresa e) {
		super();
		this.nombreEmpresa = nombreEmpresa;
		this.direccion = new Direccion(e.direccion);
		this.empleados = new ArrayList<Empleado>();
		e.getEmpleados().forEach(emp->this.empleados.add(new Empleado(emp)));
	}

	
	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public static double getNumeroEmpleados() {
		return numeroEmpleados;
	}

	public static void setNumeroEmpleados(double numeroEmpleados) {
		Empresa.numeroEmpleados = numeroEmpleados;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}


	@Override
	public String toString() {
		return "Empresa [direccion=" + direccion + ", nombreEmpresa=" + nombreEmpresa + ", empleados=" + empleados
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombreEmpresa);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		return Objects.equals(nombreEmpresa, other.nombreEmpresa);
	}

	
	
}
