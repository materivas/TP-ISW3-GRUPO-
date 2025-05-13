package com.unla.tp_ing_sw_3_grupo_6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index(Model model) {
		return "index";
	}

}
