package com.testeweb.course.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.testeweb.course.dto.RequisicaoNovoPedido;
import com.testeweb.course.model.Pedido;
import com.testeweb.course.repository.PedidoRepository;

@Controller
@RequestMapping("pedido")
public class PedidoController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	 @RequestMapping(method = RequestMethod.GET, value="formulario")
	public String formulario(RequisicaoNovoPedido requisicao) {
		return "pedido/formulario";
		
	}
	 @RequestMapping(method = RequestMethod.POST, value="novo")
	public String novo(@Valid RequisicaoNovoPedido requisicao,  BindingResult result,RedirectAttributes attributes) {
		if(result.hasErrors()) {
			attributes.addFlashAttribute("flashMessage", "Verifique os campos!");
			attributes.addFlashAttribute("flashType", "danger");
			return "redirect:/pedido/formulario";
		}
			
		
		Pedido pedido = requisicao.toPedido();
		pedidoRepository.save(pedido);
		attributes.addFlashAttribute("flashMessage", "Ususario Cadastrado com  sucesso!");
		attributes.addFlashAttribute("flashType", "success");
		return "redirect:/pedido/formulario";
		
	}
}
