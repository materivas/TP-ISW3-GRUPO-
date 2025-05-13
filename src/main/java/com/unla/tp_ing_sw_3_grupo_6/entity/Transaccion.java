package com.unla.tp_ing_sw_3_grupo_6.entity;

import java.time.LocalDateTime;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@SuppressWarnings("deprecation")
@Table(name = "transaccion")
public class Transaccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String tipo;

	@NotNull
	private Double importe;

	private LocalDateTime fechaHora;

	@OneToOne
	@JoinColumn(name = "tarjeta_id")
	private Tarjeta tarjeta;

	@OneToOne
	@JoinColumn(name = "viaje_id")
	private Viaje viaje;

	@OneToOne
	@JoinColumn(name = "recarga_id")
	private Recarga recarga;

	public Transaccion() {
		super();
	}

	public Transaccion(Long id, String tipo, Double importe, LocalDateTime fechaHora, Viaje viaje, Recarga recarga,
			Tarjeta tarjeta) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.importe = importe;
		this.fechaHora = fechaHora;
		this.viaje = viaje;
		this.recarga = recarga;
		this.tarjeta = tarjeta;
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

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public Viaje getViaje() {
		return viaje;
	}

	public void setViaje(Viaje viaje) {
		this.viaje = viaje;
	}

	public Recarga getRecarga() {
		return recarga;
	}

	public void setRecarga(Recarga recarga) {
		this.recarga = recarga;
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