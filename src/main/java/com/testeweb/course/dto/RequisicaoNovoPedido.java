package com.testeweb.course.dto;

import javax.validation.constraints.NotBlank;

import com.testeweb.course.model.Pedido;
import com.testeweb.course.model.StatusPedido;

public class RequisicaoNovoPedido {
	@NotBlank(message = "Campo nome obrigatorio")
	private String Nomeproduto;
	@NotBlank(message = "Campo Url obrigatorio")
	private String urlName;
	@NotBlank(message = "Campo UrlImagem obrigatorio")
	private String urlImagem;
	@NotBlank(message = "Campo descricao")
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
		pedido.setNomeProduto(Nomeproduto);
		pedido.setUrlImagem(urlImagem);
		pedido.setUrlProduto(urlName);
		pedido.setDescricao(descricao);
		pedido.setStatus(StatusPedido.AGUARDANDO);
		
		return pedido;
	}
	
	
}
