package br.com.ecommerce.beans;

public class Produto {

	private int id;
	private String descricao;
	private float valorVenda;
	private float valorCompra;
	private int qtde;
	
	
	
	public Produto(int id, String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	public Produto() {
		
	}

	public Produto(int id, String descricao, float valorVenda, float valorCompra, int qtde) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
		this.qtde = qtde;
	}

	public void setAll(int id, String descricao, float valorVenda, float valorCompra, int qtde) {
		this.id=id;
		this.descricao=descricao;
		this.valorVenda=valorVenda;
		this.valorCompra=valorCompra;
		setQtde(qtde);
	}
	
	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + ", valorVenda=" + valorVenda + ", valorCompra="
				+ valorCompra + ", qtde=" + qtde + "]";
	}

	public void atualizarValores(float porc) {
		valorVenda = valorVenda + valorVenda * (porc/100);
		valorCompra = valorCompra + valorCompra * (porc/100);
	}
	
	public float getTotalVenda() {
		return qtde * valorVenda;
	}
	
	public float getTotalCompra() {
		return qtde * valorCompra;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
