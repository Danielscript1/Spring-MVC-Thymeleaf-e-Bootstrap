package com.testeweb.course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testeweb.course.dto.RequisicaoNovoPedido;
import com.testeweb.course.model.Pedido;
import com.testeweb.course.services.PedidoService;

@Controller
@RequestMapping("pedido")
public class PedidoController {
	
	@Autowired 
	private PedidoService pedidoService; 
	
	@GetMapping("formulario")
	public String formulario() {
		return "pedido/formulario";
		
	}
	@PostMapping("novo")
	public String novo(RequisicaoNovoPedido requisicao) {
		Pedido pedido = requisicao.toPedido();
		pedidoService.salvar(pedido);
		return "pedido/novo";
		
	}
}
