package com.isidro.ejercicio1ficherosfechascolecciones.entidades;

import java.time.LocalDate;
import java.util.Objects;

public class Cliente {
	
	private String dniCif;
	private String nombreCliente;
	private LocalDate fechaNacimiento;
	private String codigoPais;
	private double saldo;
	
	public Cliente() {
		
	}

	public Cliente(String dniCif, String nombreCliente, LocalDate fechaNacimiento, String codigoPais, double saldo) {
		this.dniCif = dniCif;
		this.nombreCliente = nombreCliente;
		this.fechaNacimiento = fechaNacimiento;
		this.codigoPais = codigoPais;
		this.saldo = saldo;
	}

	public String getDniCif() {
		return dniCif;
	}

	public void setDniCif(String dniCif) {
		this.dniCif = dniCif;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCodigoPais() {
		return codigoPais;
	}

	public void setCodigoPais(String codigoPais) {
		this.codigoPais = codigoPais;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cliente [dniCif=" + dniCif + ", nombreCliente=" + nombreCliente + ", fechaNacimiento=" + fechaNacimiento
				+ ", codigoPais=" + codigoPais + ", saldo=" + saldo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dniCif);
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
		return Objects.equals(dniCif, other.dniCif);
	}
	
	

}