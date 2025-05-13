package com.unla.tp_ing_sw_3_grupo_6.entity;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@SuppressWarnings("deprecation")
@Table(name = "estacion")
public class Estacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String nombre;

	private String ubicacion;

	@ManyToOne
	@JoinColumn(name = "medio_id", nullable = false)
	private MedioTransporte medioTransporte;

	public Estacion() {
		super();
	}

	public Estacion(Long id, String nombre, String ubicacion, MedioTransporte medioTransporte) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.medioTransporte = medioTransporte;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public MedioTransporte getMedioTransporte() {
		return medioTransporte;
	}

	public void setMedioTransporte(MedioTransporte medioTransporte) {
		this.medioTransporte = medioTransporte;
	}

}