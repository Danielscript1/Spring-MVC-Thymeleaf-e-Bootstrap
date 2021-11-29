package com.testeweb.course.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.testeweb.course.model.Pedidos;

@Controller
public class HomeControler {
	//pedidos
	@GetMapping("/home")
	public String home(Model model) {
		Pedidos pedido = new Pedidos();
		pedido.setNome("celular topVenom");
		pedido.setPreco(1.233);
		pedido.setUrlImagem("http:urlvenomcelularImagem");
		pedido.setUrlProduto("http:urlvenomcelular");
		pedido.setDescricao("venom melhor");
		
		
		//adicionando a lista de produtos
		List<Pedidos> pedidos = Arrays.asList(pedido);
		//atribuido na minha view os items associados
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}
}
