package com.unla.tp_ing_sw_3_grupo_6.entity;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@SuppressWarnings({ "deprecation", "serial" })
@Table(name = "usuario")
public class Usuario implements UserDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String nombre;

	@NotNull
	private String apellido;

	@NotNull
	@Column(unique = true)
	private String email;

	@NotNull
	private String contrasenia;

	private LocalDateTime fechaAlta;

	@NotNull
	private String rol;

	private String tipoDni;

	@NotNull
	@Column(unique = true)
	private int dni;

	private String genero;

	private String telefono;

	public Usuario() {
		super();
	}

	public Usuario(String nombre, String apellido, String email, String contrasenia, LocalDateTime fechaAlta,
			String rol, String tipoDni, int dni, String genero, String telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.contrasenia = contrasenia;
		this.fechaAlta = fechaAlta;
		this.rol = rol;
		this.tipoDni = tipoDni;
		this.dni = dni;
		this.genero = genero;
		this.telefono = telefono;
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

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getTipoDni() {
		return tipoDni;
	}

	public void setTipoDni(String tipoDni) {
		this.tipoDni = tipoDni;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getRole() {
		return rol;
	}

	public void setRole(String rol) {
		this.rol = rol;
	}

	public LocalDateTime getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDateTime fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public String getPassword() {
		return contrasenia;
	}

	@Override
	public String getUsername() {
		return nombre;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return List.of(new SimpleGrantedAuthority("ROLE_" + rol));
	}

}