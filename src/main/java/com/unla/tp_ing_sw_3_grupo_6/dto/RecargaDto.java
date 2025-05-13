package com.unla.tp_ing_sw_3_grupo_6.dto;

import java.time.LocalDateTime;

public class RecargaDto {
	private Long id;
	private Double monto;
	private LocalDateTime fechaHora;
	private Long tarjetaId;

	public RecargaDto() {
		super();
	}

	public RecargaDto(Long id, Double monto, LocalDateTime fechaHora, Long tarjetaId) {
		super();
		this.id = id;
		this.monto = monto;
		this.fechaHora = fechaHora;
		this.tarjetaId = tarjetaId;
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

	public Long getTarjetaId() {
		return tarjetaId;
	}

	public void setTarjetaId(Long tarjetaId) {
		this.tarjetaId = tarjetaId;
	}

}
