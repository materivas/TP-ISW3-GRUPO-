package com.unla.tp_ing_sw_3_grupo_6.dto;

import java.time.LocalDateTime;

public class UsuarioDto {
	private Long id;
	private String nombre;
	private String apellido;
	private String email;
	private LocalDateTime fechaAlta;

	public UsuarioDto() {
		super();
	}

	public UsuarioDto(Long id, String nombre, String apellido, String email, LocalDateTime fechaAlta) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.fechaAlta = fechaAlta;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDateTime fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

}
