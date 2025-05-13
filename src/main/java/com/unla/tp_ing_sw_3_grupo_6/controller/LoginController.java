package com.unla.tp_ing_sw_3_grupo_6.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.unla.tp_ing_sw_3_grupo_6.entity.Usuario;
import com.unla.tp_ing_sw_3_grupo_6.service.UsuarioService;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@GetMapping("/login")
	public String loginForm() {
		return "login/login";
	}

	@PostMapping("/login")
	public String login(@RequestParam String email, @RequestParam String password, HttpSession session, Model model) {
		Usuario usuario = usuarioService.findByEmail(email);

		System.out.println("Password: " + password);
		System.out.println("Password Desencoded: " + passwordEncoder.matches(password, usuario.getContrasenia()));

		if (usuario != null && passwordEncoder.matches(password, usuario.getContrasenia())) {
			session.setAttribute("userId", usuario.getId());
			return "redirect:/";
		}

		model.addAttribute("error", true);
		return "login/login";
	}

	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}

	@GetMapping("/register")
	public String registerForm() {
		return "login/register";
	}

	@PostMapping("/register")
	public String register(@RequestParam String nombre, @RequestParam String apellido, @RequestParam String email,
			@RequestParam String tipoDni, @RequestParam int dni, @RequestParam String genero,
			@RequestParam String password, HttpSession session, Model model) {
		Usuario usuario = usuarioService.findByEmail(email);

		if (usuario != null) {
			model.addAttribute("error", "Ya existe una cuenta con ese correo");
			return "login/register";
		}

		Usuario nuevoUsuario = new Usuario(nombre, apellido, email, password, LocalDateTime.now(), "USUARIO", tipoDni,
				dni, genero, null);
		usuarioService.crear(nuevoUsuario);
		session.setAttribute("userId", nuevoUsuario.getId());
		return "redirect:/";
	}

}
