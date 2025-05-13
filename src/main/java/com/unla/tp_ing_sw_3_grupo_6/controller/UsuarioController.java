package com.unla.tp_ing_sw_3_grupo_6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unla.tp_ing_sw_3_grupo_6.entity.Usuario;
import com.unla.tp_ing_sw_3_grupo_6.service.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;

	@GetMapping
	public String listarUsuarios(Model model) {
		model.addAttribute("usuarios", usuarioService.findAll());
		return "usuarios/lista";
	}

	@GetMapping("/nuevo")
	public String mostrarFormularioNuevoUsuario(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "usuarios/formulario";
	}

	@PostMapping
	public String guardarUsuario(@ModelAttribute("usuario") Usuario usuario) {
		usuarioService.crear(usuario);
		return "redirect:/usuarios";
	}
}
