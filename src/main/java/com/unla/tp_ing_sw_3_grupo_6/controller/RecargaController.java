package com.unla.tp_ing_sw_3_grupo_6.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unla.tp_ing_sw_3_grupo_6.dto.RecargaFormDTO;
import com.unla.tp_ing_sw_3_grupo_6.entity.Recarga;
import com.unla.tp_ing_sw_3_grupo_6.entity.Tarjeta;
import com.unla.tp_ing_sw_3_grupo_6.service.RecargaService;
import com.unla.tp_ing_sw_3_grupo_6.service.TarjetaService;

@Controller
@RequestMapping("/recargas")
public class RecargaController {
	@Autowired
	private RecargaService recargaService;

	@Autowired
	private TarjetaService tarjetaService;

	@GetMapping
	public String listarRecargas(Model model) {
		model.addAttribute("recargas", recargaService.findAll());
		return "recargas/lista";
	}

	@GetMapping("/nueva")
	public String mostrarFormularioNuevaRecarga(Model model) {
		model.addAttribute("recargaFormDTO", new RecargaFormDTO());
		return "recargas/formulario";
	}

	@PostMapping
	public String guardarRecarga(@ModelAttribute("recargaFormDTO") RecargaFormDTO recargaFormDTO) {
		Tarjeta tarjeta = tarjetaService.findByCodigo(recargaFormDTO.getCodigo());

		if (tarjeta == null) {
			return "redirect:recargas/nueva";
		}

		Recarga recarga = new Recarga();
		recarga.setMonto(recargaFormDTO.getMonto());
		recarga.setFechaHora(LocalDateTime.now());
		recarga.setTarjeta(tarjeta);

		recargaService.crear(recarga);

		tarjeta.setSaldo(tarjeta.getSaldo() + recarga.getMonto());
		tarjetaService.crear(tarjeta);
		return "redirect:/";
	}
}