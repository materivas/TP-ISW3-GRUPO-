package com.unla.tp_ing_sw_3_grupo_6.entity;

import java.time.LocalDateTime;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@SuppressWarnings("deprecation")
@Table(name = "tarjeta")
public class Tarjeta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Column(unique = true)
	private String codigo;

	@NotNull
	private Double saldo;

	private String estado;

	private LocalDateTime fechaEmision;

	@ManyToOne
	@JoinColumn(name = "usuario_id", nullable = false)
	private Usuario usuario;

	public Tarjeta() {
		super();
	}

	public Tarjeta(Long id, String codigo, Double saldo, LocalDateTime fechaEmision, String estado, Usuario usuario) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.saldo = saldo;
		this.fechaEmision = fechaEmision;
		this.estado = estado;
		this.usuario = usuario;
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

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
