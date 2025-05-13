package com.unla.tp_ing_sw_3_grupo_6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unla.tp_ing_sw_3_grupo_6.entity.Viaje;
import com.unla.tp_ing_sw_3_grupo_6.service.ViajeService;

@Controller
@RequestMapping("/viajes")
public class ViajeController {
	@Autowired
	private ViajeService viajeService;

	@GetMapping
	public String listarViajes(Model model) {
		model.addAttribute("viajes", viajeService.findAll());
		return "viajes/lista";
	}

	@GetMapping("/nuevo")
	public String mostrarFormularioNuevoViaje(Model model) {
		model.addAttribute("viaje", new Viaje());
		return "viajes/formulario";
	}

	@PostMapping
	public String guardarViaje(@ModelAttribute("viaje") Viaje viaje) {
		viajeService.crear(viaje);
		return "redirect:/viajes";
	}
}
