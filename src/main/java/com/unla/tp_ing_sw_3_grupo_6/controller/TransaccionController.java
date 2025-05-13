package com.unla.tp_ing_sw_3_grupo_6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unla.tp_ing_sw_3_grupo_6.entity.Transaccion;
import com.unla.tp_ing_sw_3_grupo_6.service.TransaccionService;

@Controller
@RequestMapping("/transacciones")
public class TransaccionController {
	@Autowired
	private TransaccionService transaccionService;

	@GetMapping
	public String listarTransacciones(Model model) {
		model.addAttribute("transacciones", transaccionService.listarTodas());
		return "transacciones/lista";
	}

	@GetMapping("/nueva")
	public String mostrarFormularioNuevaTransaccion(Model model) {
		model.addAttribute("transaccion", new Transaccion());
		return "transacciones/formulario";
	}

	@PostMapping
	public String guardarTransaccion(@ModelAttribute("transaccion") Transaccion transaccion) {
		transaccionService.crear(transaccion);
		return "redirect:/transacciones";
	}
}