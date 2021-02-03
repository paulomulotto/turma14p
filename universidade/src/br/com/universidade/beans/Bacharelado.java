package br.com.universidade.beans;

import br.com.universidade.util.PadraoFormacao;

public class Bacharelado extends Formacao implements PadraoFormacao{

	private String projetoConclusao;
	private int cargaHorariaEstagio;
	
	public void calcularMensalidade(double fator) {
		super.setMensalidade((super.getDuracao() * fator * 600) + (cargaHorariaEstagio*12));
	}
	
	public String getProjetoConclusao() {
		return projetoConclusao;
	}
	public void setProjetoConclusao(String projetoConclusao) {
		this.projetoConclusao = projetoConclusao;
	}
	public int getCargaHorariaEstagio() {
		return cargaHorariaEstagio;
	}
	public void setCargaHorariaEstagio(int cargaHorariaEstagio) {
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	public Bacharelado(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao,
			int cargaHorariaEstagio) {
		super(descricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}
	public Bacharelado() {
		super();
	}
	@Override
	public String toString() {
		return "Bacharelado [projetoConclusao=" + projetoConclusao + ", cargaHorariaEstagio=" + cargaHorariaEstagio
				+ "," + super.toString() + "]";
	}
	public void setAll(String descricao, int periodo, double mensalidade, int duracao, String projetoConclusao,
			int cargaHorariaEstagio) {
		super.setAll(descricao, periodo, mensalidade, duracao);
		this.projetoConclusao = projetoConclusao;
		this.cargaHorariaEstagio = cargaHorariaEstagio;
	}

	@Override
	public String calcularDesconto(float porc) {
		// TODO Auto-generated method stub
		return "Desconto do bacharelado";
	}




}
