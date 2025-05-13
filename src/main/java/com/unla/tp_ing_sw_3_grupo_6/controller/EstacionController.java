package com.unla.tp_ing_sw_3_grupo_6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unla.tp_ing_sw_3_grupo_6.entity.Estacion;
import com.unla.tp_ing_sw_3_grupo_6.service.EstacionService;

@Controller
@RequestMapping("/estaciones")
public class EstacionController {
	@Autowired
	private EstacionService estacionService;

	@GetMapping("/lista")
	public String listarEstaciones(Model model) {
		model.addAttribute("estaciones", estacionService.findAll());
		return "estaciones/lista";
	}

	@GetMapping("/nueva")
	public String mostrarFormularioNuevaEstacion(Model model) {
		model.addAttribute("estacion", new Estacion());
		return "estaciones/formulario";
	}

	@PostMapping
	public String guardarEstacion(@ModelAttribute("estacion") Estacion estacion) {
		estacionService.crear(estacion);
		return "redirect:/estaciones";
	}
}