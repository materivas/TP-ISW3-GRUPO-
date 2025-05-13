package com.unla.tp_ing_sw_3_grupo_6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unla.tp_ing_sw_3_grupo_6.entity.MedioTransporte;
import com.unla.tp_ing_sw_3_grupo_6.service.MedioTransporteService;

@Controller
@RequestMapping("/medios-transportes")
public class MedioTransporteController {

	@Autowired
	private MedioTransporteService medioTransporteService;

	@GetMapping
	public String listarMediosTransporte(Model model) {
		model.addAttribute("mediosTransporte", medioTransporteService.findAll());
		return "medios-transporte/lista";
	}

	@GetMapping("/nuevo")
	public String mostrarFormularioNuevoMedioTransporte(Model model) {
		model.addAttribute("medioTransporte", new MedioTransporte());
		return "medios-transporte/formulario";
	}

	@PostMapping
	public String guardarMedioTransporte(@ModelAttribute("medioTransporte") MedioTransporte medioTransporte) {
		medioTransporteService.crear(medioTransporte);
		return "redirect:/medios-transporte";
	}
}