package br.com.universidade.beans;

import br.com.universidade.util.PadraoFormacao;

public class Medio extends Formacao implements PadraoFormacao{

	private String tipo;

	public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao() * fator * 500);
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Medio(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		super(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}

	public Medio() {
		super();
	}

	@Override
	public String toString() {
		return "Medio [tipo=" + tipo + ", "  + super.toString() + "]";
	}

	public void setAll(String descricao, int periodo, double mensalidade, int duracao, String tipo) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.tipo = tipo;
	}

	@Override
	public String calcularDesconto(float porc) {
		// TODO Auto-generated method stub
		return "desconto medio";
	}
	
	
	
	
}
