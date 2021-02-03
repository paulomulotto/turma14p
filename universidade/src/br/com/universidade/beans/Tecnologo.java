package br.com.universidade.beans;

import br.com.universidade.util.PadraoFormacao;

public class Tecnologo extends Formacao implements PadraoFormacao{
	private boolean planoEstendido;

	public void calcularMensalidade(double fator) {
		super.setMensalidade(super.getDuracao() * fator * 600);
	}

	public boolean isPlanoEstendido() {
		return planoEstendido;
	}

	public void setPlanoEstendido(boolean planoEstendido) {
		this.planoEstendido = planoEstendido;
	}

	public Tecnologo(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		super(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}

	public Tecnologo() {
		super();
	}

	public String toString() {
		return "Tecnologo [planoEstendido=" + planoEstendido + ", " + super.toString() + "]";
	}

	public void setAll(String descricao, int periodo, double mensalidade, int duracao, boolean planoEstendido) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.planoEstendido = planoEstendido;
	}

	@Override
	public String calcularDesconto(float porc) {
		// TODO Auto-generated method stub
		return "desconto tecnologo";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
