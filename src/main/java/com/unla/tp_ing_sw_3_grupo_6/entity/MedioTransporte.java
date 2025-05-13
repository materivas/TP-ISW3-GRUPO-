package com.unla.tp_ing_sw_3_grupo_6.entity;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@SuppressWarnings("deprecation")
@Table(name = "medio_transporte")
public class MedioTransporte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String tipo;

	private String nombre;

	public MedioTransporte() {
		super();
	}

	public MedioTransporte(Long id, String tipo, String nombre) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
