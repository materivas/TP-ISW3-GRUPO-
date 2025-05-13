package com.unla.tp_ing_sw_3_grupo_6.dto;

public class MedioTransporteDto {
	private Long id;
	private String tipo;
	private String descripcion;

	public MedioTransporteDto() {
		super();
	}

	public MedioTransporteDto(Long id, String tipo, String descripcion) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.descripcion = descripcion;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
