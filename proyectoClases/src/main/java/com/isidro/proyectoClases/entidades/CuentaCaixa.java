package com.isidro.proyectoClases.entidades;

import java.time.LocalDate;
import java.util.Objects;

import com.isidro.proyectoClases.enumerados.NivelCatalan;

public final class CuentaCaixa extends Cuenta {
	
	private NivelCatalan nivelCatalan;
	
	public CuentaCaixa() {
		super(null);
		nivelCatalan = NivelCatalan.Medio;  // por defecto
	}

	public CuentaCaixa(String cif, String nombre, LocalDate fechaNacimiento, String pais, double saldo,
			NivelCatalan nivelCatalan) {
		super(cif, nombre, fechaNacimiento, pais, saldo);
		this.nivelCatalan = nivelCatalan;
	}

	public CuentaCaixa(CuentaCaixa c) {
		super(c);
		this.nivelCatalan = c.nivelCatalan;
	}

	public NivelCatalan getNivelCatalan() {
		return nivelCatalan;
	}

	public void setNivelCatalan(NivelCatalan nivelCatalan) {
		this.nivelCatalan = nivelCatalan;
	}

	@Override
	public String toString() {
		return "CuentaCaixa [nivelCatalan=" + nivelCatalan + ", getCif()=" + getCif() + ", getNombre()=" + getNombre()
				+ ", getFechaNacimiento()=" + getFechaNacimiento() + ", getPais()=" + getPais() + ", getSaldo()=" + getSaldo() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(nivelCatalan);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaCaixa other = (CuentaCaixa) obj;
		return nivelCatalan == other.nivelCatalan;
	}

}