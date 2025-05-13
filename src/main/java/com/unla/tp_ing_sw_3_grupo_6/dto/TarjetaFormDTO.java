package com.unla.tp_ing_sw_3_grupo_6.dto;

public class TarjetaFormDTO {
	private String codigo;
	private int dni;
	private String correo;
	private String repetirCorreo;

	public TarjetaFormDTO(String codigo, int dni, String correo, String repetirCorreo) {
		super();
		this.codigo = codigo;
		this.dni = dni;
		this.correo = correo;
		this.repetirCorreo = repetirCorreo;
	}

	public TarjetaFormDTO() {
		super();
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getRepetirCorreo() {
		return repetirCorreo;
	}

	public void setRepetirCorreo(String repetirCorreo) {
		this.repetirCorreo = repetirCorreo;
	}

}
