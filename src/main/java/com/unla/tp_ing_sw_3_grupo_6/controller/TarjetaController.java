package com.unla.tp_ing_sw_3_grupo_6.controller;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.unla.tp_ing_sw_3_grupo_6.dto.TarjetaFormComprarDTO;
import com.unla.tp_ing_sw_3_grupo_6.dto.TarjetaFormDTO;
import com.unla.tp_ing_sw_3_grupo_6.entity.Tarjeta;
import com.unla.tp_ing_sw_3_grupo_6.entity.Usuario;
import com.unla.tp_ing_sw_3_grupo_6.service.TarjetaService;
import com.unla.tp_ing_sw_3_grupo_6.service.UsuarioService;

@Controller
@RequestMapping("/tarjetas")
public class TarjetaController {
	@Autowired
	private TarjetaService tarjetaService;

	@Autowired
	private UsuarioService usuarioService;

	private String generarCodigoAleatorio12() {
		StringBuilder stringBuilder = new StringBuilder(12);
		ThreadLocalRandom random = ThreadLocalRandom.current();
		for (int i = 0; i < 12; i++) {
			stringBuilder.append(random.nextInt(0, 10));
		}
		return stringBuilder.toString();
	}

	@GetMapping
	public String listarTarjetas(Model model) {
		model.addAttribute("tarjetas", tarjetaService.findAll());
		return "tarjetas/lista";
	}

	@GetMapping("/nueva")
	public String mostrarFormularioNuevaTarjeta(Model model) {
		model.addAttribute("tarjetaFormDTO", new TarjetaFormDTO());
		return "tarjetas/formulario";
	}

	@PostMapping("/nueva")
	public String guardar(@ModelAttribute TarjetaFormDTO form) {

		if (usuarioService.findByDni(form.getDni()) == null
				|| (!form.getCorreo().equalsIgnoreCase(form.getRepetirCorreo()))) {
			return "redirect:/tarjetas/nueva";
		}

		Tarjeta tarjeta = new Tarjeta();
		tarjeta.setCodigo(form.getCodigo());
		tarjeta.setFechaEmision(LocalDateTime.now());
		tarjeta.setSaldo((double) 0);
		tarjeta.setEstado("ACTIVA");

		Usuario usuario = usuarioService.findByDni(form.getDni());
		tarjeta.setUsuario(usuario);
		tarjetaService.crear(tarjeta);

		return "redirect:/";
	}

	@GetMapping("/comprar-nueva")
	public String mostrarFormularioComprarNuevaTarjeta(Model model) {
		model.addAttribute("tarjetaFormComprarDTO", new TarjetaFormComprarDTO());
		return "tarjetas/formulario-comprar";
	}

	@PostMapping("/comprar-nueva")
	public String guardarCompraNuevaTarjeta(@ModelAttribute TarjetaFormComprarDTO form) {

		if (usuarioService.findByDni(form.getDni()) == null
				|| (!form.getCorreo().equalsIgnoreCase(form.getRepetirCorreo()))) {
			return "redirect:/tarjetas/comprar-nueva";
		}

		Tarjeta tarjeta = new Tarjeta();
		String codigo;

		do {
			codigo = generarCodigoAleatorio12();
		} while (tarjetaService.findByCodigo(codigo) != null);

		tarjeta.setCodigo(codigo);
		tarjeta.setFechaEmision(LocalDateTime.now());
		tarjeta.setSaldo((double) 0);
		tarjeta.setEstado("ACTIVA");

		Usuario usuario = usuarioService.findByDni(form.getDni());
		tarjeta.setUsuario(usuario);

		tarjetaService.crear(tarjeta);

		usuario.setTelefono(form.getTelefono());
		usuarioService.crear(usuario);

		return "redirect:/";
	}

	@GetMapping("/buscar")
	public String buscarTarjeta(Model model) {
		return "tarjetas/buscar";
	}

	@GetMapping("/buscar-tarjeta")
	public String buscarTarjetaEspecifica(@RequestParam String codigo, Model model) {
		model.addAttribute("tarjeta", tarjetaService.findByCodigo(codigo));
		return "tarjetas/buscar-tarjeta";
	}
}
