package com.testeweb.course.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testeweb.course.model.Pedido;
import com.testeweb.course.repository.PedidoRepository;
@Service
public class PedidoService {
	@Autowired
	private PedidoRepository pedidoRepository;
	
	
	//buscar por Pedido
	//buscar todos os Pedido
		public List<Pedido> findAll() {
			return pedidoRepository.findAll();
		}
	
		public Pedido salvar(Pedido pedido) {
			return pedidoRepository.save(pedido);
			
		}
}
