package com.unla.tp_ing_sw_3_grupo_6.dto;

public class EstacionDto {
	private Long id;
	private String nombre;
	private String ubicacion;
	private Long medioTransporteId;

	public EstacionDto() {
		super();
	}

	public EstacionDto(Long id, String nombre, String ubicacion, Long medioTransporteId) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.medioTransporteId = medioTransporteId;
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

	public Long getMedioTransporteId() {
		return medioTransporteId;
	}

	public void setMedioTransporteId(Long medioTransporteId) {
		this.medioTransporteId = medioTransporteId;
	}

}
