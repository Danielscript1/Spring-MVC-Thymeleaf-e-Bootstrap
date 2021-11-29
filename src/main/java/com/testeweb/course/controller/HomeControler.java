package com.testeweb.course.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.testeweb.course.model.Pedido;

@Controller
public class HomeControler {
	@PersistenceContext
	private EntityManager entityManager;
	//pedidos
	@GetMapping("/home")
	public String home(Model model) {
	Query query = entityManager.createQuery("select p from pedido p ",Pedido.class);
	List<Pedido> pedidos = query.getResultList();
	model.addAttribute("pedidos", pedidos);
	return "home";
	}
}
