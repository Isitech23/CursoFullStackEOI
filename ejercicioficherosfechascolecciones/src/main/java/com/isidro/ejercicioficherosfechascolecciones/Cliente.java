package com.isidro.ejercicioficherosfechascolecciones;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente {
	
	private String cif;
	private String nombre;
	private LocalDate fecha;
	private String pais;
	private double saldo;
	
	public Cliente() {
		
	}

	public Cliente(String cif, String nombre, LocalDate fecha, String pais, double saldo) {
		super();
		this.cif = cif;
		this.nombre = nombre;
		this.fecha = fecha;
		this.pais = pais;
		this.saldo = saldo;
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cliente [cif=" + cif + ", nombre=" + nombre + ", fecha=" + fecha + ", pais=" + pais + ", saldo=" + saldo
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cif, nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cif, other.cif) && Objects.equals(nombre, other.nombre);
	}
	
	
	
}
