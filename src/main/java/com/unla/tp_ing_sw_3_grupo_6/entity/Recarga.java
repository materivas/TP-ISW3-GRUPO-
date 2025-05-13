package com.unla.tp_ing_sw_3_grupo_6.entity;

import java.time.LocalDateTime;

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
@Table(name = "recarga")
public class Recarga {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private Double monto;

	private LocalDateTime fechaHora;

	@ManyToOne
	@JoinColumn(name = "tarjeta_id", nullable = false)
	private Tarjeta tarjeta;

	public Recarga() {
		super();
	}

	public Recarga(Long id, Double monto, LocalDateTime fechaHora, Tarjeta tarjeta) {
		super();
		this.id = id;
		this.monto = monto;
		this.fechaHora = fechaHora;
		this.tarjeta = tarjeta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	public Tarjeta getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}

}