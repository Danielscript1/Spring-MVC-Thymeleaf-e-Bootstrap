package com.testeweb.course.dto;

import com.testeweb.course.model.Pedido;

public class RequisicaoNovoPedido {
	private String Nomeproduto;
	private String urlName;
	private String urlImagem;
	private String descricao;
	public String getNomeproduto() {
		return Nomeproduto;
	}
	public void setNomeproduto(String nomeproduto) {
		Nomeproduto = nomeproduto;
	}
	public String getUrlName() {
		return urlName;
	}
	public void setUrlName(String urlName) {
		this.urlName = urlName;
	}
	public String getUrlImagem() {
		return urlImagem;
	}
	public void setUrlImagem(String urlImagem) {
		this.urlImagem = urlImagem;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setNome(Nomeproduto);
		pedido.setUrlImagem(urlImagem);
		pedido.setUrlProduto(urlName);
		pedido.setDescricao(descricao);
		return pedido;
	}
	
	
}
