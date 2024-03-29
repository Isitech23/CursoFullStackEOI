package com.isidro.programacionfuncional.entidades;

import java.util.Objects;

public class Usuario {

	private int id;
	private String nombre;
	private double sueldo;
	
	public Usuario() {
		
	}
	
	public Usuario(int id, String nombre, double sueldo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	public Usuario(Usuario c) {
		super();
		this.id = c.id;
		this.nombre = c.nombre;
		this.sueldo = c.sueldo;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return id == other.id;
	}
	
}
