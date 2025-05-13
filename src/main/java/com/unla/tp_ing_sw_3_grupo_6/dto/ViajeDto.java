package com.unla.tp_ing_sw_3_grupo_6.dto;

import java.time.LocalDateTime;

public class ViajeDto {
	private Long id;
	private LocalDateTime fechaHora;
	private Long tarjetaId;
	private Long estacionOrigenId;

	public ViajeDto() {
		super();
	}

	public ViajeDto(Long id, LocalDateTime fechaHora, Long tarjetaId, Long estacionOrigenId) {
		super();
		this.id = id;
		this.fechaHora = fechaHora;
		this.tarjetaId = tarjetaId;
		this.estacionOrigenId = estacionOrigenId;
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

	public Long getTarjetaId() {
		return tarjetaId;
	}

	public void setTarjetaId(Long tarjetaId) {
		this.tarjetaId = tarjetaId;
	}

	public Long getEstacionOrigenId() {
		return estacionOrigenId;
	}

	public void setEstacionOrigenId(Long estacionOrigenId) {
		this.estacionOrigenId = estacionOrigenId;
	}

}
