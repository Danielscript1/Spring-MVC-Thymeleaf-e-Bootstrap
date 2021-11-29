package com.testeweb.course.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.testeweb.course.model.Pedido;
import com.testeweb.course.services.PedidoService;

@Controller
public class HomeControler {
	@Autowired 
	private PedidoService pedidoService; 
	
	//pedidos
	@GetMapping("/home")
	public String home(Model model) {
	List<Pedido> pedidos = pedidoService.findAll();
	model.addAttribute("pedidos", pedidos);
	return "home";
	
	}
	
	
}
