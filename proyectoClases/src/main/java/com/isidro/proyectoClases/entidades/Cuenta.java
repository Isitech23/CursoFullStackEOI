package com.isidro.proyectoClases.entidades;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Cuenta { //Le ponemos abstract porque no se puede instanciar, es decir, no se van a crear cuentas per se.
	
	private String cif;
	private String nombre;
	private LocalDate fechaNacimiento;
	private String pais;
	private double saldo;
	
	public Cuenta(String cif, String nombre, LocalDate fechaNacimiento, String pais, double saldo) {
		super();
		this.cif = cif;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.pais = pais;
		this.saldo = saldo;
	}

	public Cuenta(Cuenta c) {
		super();
		this.cif = c.cif;
		this.nombre = c.cif;
		this.fechaNacimiento = c.fechaNacimiento;
		this.pais = c.cif;
		this.saldo = c.saldo;
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

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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
		return "Cuenta [cif=" + cif + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", pais=" + pais
				+ ", saldo=" + saldo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(cif, fechaNacimiento, nombre, pais, saldo);
	}

	@Override  //Normalmente una cuenta tiene su ID, pero para el ejercicio lo dejamos así
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cuenta other = (Cuenta) obj;
		return Objects.equals(cif, other.cif) && Objects.equals(fechaNacimiento, other.fechaNacimiento)
				&& Objects.equals(nombre, other.nombre) && Objects.equals(pais, other.pais)
				&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo);
	}

	
}
