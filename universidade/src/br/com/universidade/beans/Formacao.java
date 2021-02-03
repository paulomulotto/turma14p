package br.com.universidade.beans;

import br.com.universidade.util.PadraoFormacao;

public class Formacao implements PadraoFormacao{

	/*
	 * Polimorfismo: um mesmo m�todo pode ser utilizado para v�rias situa��es.
	 * Overload (sobrecarga): quando os m�todos est�o na mesma classe (devem possuir assinaturas diferentes)
	 * Override (sobrescrita): quando os m�todos est�o em classes distintas (classe pai e filha). 
	 */

	private String descricao;
	private int periodo;
	private double mensalidade;
	private int duracao;
	//Por boa pr�tica
	public void calcularMensalidade(double fator) {}
	
	public void definirDuracao() {
		if (this instanceof Medio) {
			duracao=36;
		}else if (this instanceof Tecnologo) {
			duracao=24;
		}else if (this instanceof Bacharelado) {
			if (descricao.contains("ENGENHARIA")==true) {
				duracao=60;
			}else {
				duracao=48;
			}
		}
	}
	
	
	public double exibirMedia(double ps1, double ps2) {
		return (ps1+ps2)/2;
	}
	
	public double exibirMedia(double ps1, double ps2, double nac1, double nac2) {
		return ps1*0.4 + ps2*0.4 + nac1*0.1 + nac2*0.1;
	}

	public double exibirMedia(double ps1, double ps2, double nac1, double nac2, double am1, double am2) {
		return ps1*0.25 + ps2*0.25 + nac1*0.1 + nac2*0.1 + am1*0.15 + am2*0.15;
	}

	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public double getMensalidade() {
		return mensalidade;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public Formacao(String descricao, int periodo, double mensalidade, int duracao) {
		super();
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}
	public Formacao() {
		super();
	}
	public void setAll(String descricao, int periodo, double mensalidade, int duracao) {
		this.descricao = descricao;
		this.periodo = periodo;
		this.mensalidade = mensalidade;
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		return "Formacao [descricao=" + descricao + ", periodo=" + periodo + ", mensalidade=" + mensalidade
				+ ", duracao=" + duracao + "]";
	}

	@Override
	public String calcularDesconto(float porc) {
		// TODO Auto-generated method stub
		return null;
	}


}
