package com.testeweb.course.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("pedido")
public class PedidoController {
	@GetMapping("formulario")
	public String formulario() {
		return "pedido/formulario";
		
	}
	@PostMapping("novo")
	public String novo() {
		return "pedido/novo";
		
	}
}
