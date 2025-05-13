package com.unla.tp_ing_sw_3_grupo_6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/informacion")
public class InformationController {
	@GetMapping("/conseguila")
	public String listarEstaciones(Model model) {
		return "informacion/conseguila";
	}
}
