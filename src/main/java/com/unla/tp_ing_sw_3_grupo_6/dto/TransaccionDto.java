package com.unla.tp_ing_sw_3_grupo_6.dto;

public class TransaccionDto {
	private Long id;
	private String tipo;
	private Double importe;
	private Long viajeId;
	private Long recargaId;

	public TransaccionDto() {
		super();
	}

	public TransaccionDto(Long id, String tipo, Double importe, Long viajeId, Long recargaId) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.importe = importe;
		this.viajeId = viajeId;
		this.recargaId = recargaId;
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

	public Long getViajeId() {
		return viajeId;
	}

	public void setViajeId(Long viajeId) {
		this.viajeId = viajeId;
	}

	public Long getRecargaId() {
		return recargaId;
	}

	public void setRecargaId(Long recargaId) {
		this.recargaId = recargaId;
	}

}
