package com.unla.tp_ing_sw_3_grupo_6.dto;

import java.time.LocalDateTime;

public class TarjetaDto {
	private Long id;
	private String codigo;
	private Double saldo;
	private LocalDateTime fechaEmision;

	public TarjetaDto() {
		super();
	}

	public TarjetaDto(Long id, String codigo, Double saldo, LocalDateTime fechaEmision) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.saldo = saldo;
		this.fechaEmision = fechaEmision;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public LocalDateTime getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(LocalDateTime fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

}
