package com.unla.tp_ing_sw_3_grupo_6.dto;

public class RecargaFormDTO {
	private double monto;
	private String codigo;

	public RecargaFormDTO(double monto, String codigo) {
		super();
		this.monto = monto;
		this.codigo = codigo;
	}

	public RecargaFormDTO() {
		super();
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
