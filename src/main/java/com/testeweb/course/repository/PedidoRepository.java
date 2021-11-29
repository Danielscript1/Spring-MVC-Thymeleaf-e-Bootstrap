package com.testeweb.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testeweb.course.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
