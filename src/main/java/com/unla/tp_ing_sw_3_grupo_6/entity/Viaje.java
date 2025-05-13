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
@Table(name = "viaje")
public class Viaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private LocalDateTime fechaHora;

	@ManyToOne
	@JoinColumn(name = "tarjeta_id", nullable = false)
	private Tarjeta tarjeta;

	@ManyToOne
	@JoinColumn(name = "estacion_origen", nullable = false)
	private Estacion estacionOrigen;

	@ManyToOne
	@JoinColumn(name = "estacion_destino", nullable = false)
	private Estacion estacionDestino;

	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario usuario;

	public Viaje() {
		super();
	}

	public Viaje(Long id, LocalDateTime fechaHora, Tarjeta tarjeta, Estacion estacionOrigen, Estacion estacionDestino,
			Usuario usuario) {
		super();
		this.id = id;
		this.fechaHora = fechaHora;
		this.tarjeta = tarjeta;
		this.estacionOrigen = estacionOrigen;
		this.estacionDestino = estacionDestino;
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Estacion getEstacionOrigen() {
		return estacionOrigen;
	}

	public void setEstacionOrigen(Estacion estacionOrigen) {
		this.estacionOrigen = estacionOrigen;
	}

	public Estacion getEstacionDestino() {
		return estacionDestino;
	}

	public void setEstacionDestino(Estacion estacionDestino) {
		this.estacionDestino = estacionDestino;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
