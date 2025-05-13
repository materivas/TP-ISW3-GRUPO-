package com.unla.tp_ing_sw_3_grupo_6.dto;

public class TarjetaFormComprarDTO {
	private String codigo;
	private int dni;
	private String correo;
	private String repetirCorreo;
	private String tipoDni;
	private String nombre;
	private String apellido;
	private String genero;
	private String telefono;

	public TarjetaFormComprarDTO(String codigo, int dni, String correo, String repetirCorreo, String tipoDni,
			String nombre, String apellido, String genero, String telefono) {
		super();
		this.codigo = codigo;
		this.dni = dni;
		this.correo = correo;
		this.repetirCorreo = repetirCorreo;
		this.tipoDni = tipoDni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.telefono = telefono;
	}

	public TarjetaFormComprarDTO() {
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

	public String getTipoDni() {
		return tipoDni;
	}

	public void setTipoDni(String tipoDni) {
		this.tipoDni = tipoDni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

}
