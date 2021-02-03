package br.com.votacao.beans;

public class Eleitor extends Pessoa {
	private int titulo;
	private boolean ativo;
	public int getTitulo() {
		return titulo;
	}
	public void setTitulo(int titulo) {
		this.titulo = titulo;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public Eleitor(String nome, int titulo, boolean ativo) {
		super(nome);
		this.titulo = titulo;
		this.ativo = ativo;
	}
	
	@Override
	public String toString() {
		return getNome();
	}
	public Eleitor() {
		super();
	}
	public void setAll(String nome, int titulo, boolean ativo) {
		super.setAll(nome);
		this.titulo = titulo;
		this.ativo = ativo;
	}
	
	
}
