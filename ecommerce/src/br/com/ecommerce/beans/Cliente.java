package br.com.ecommerce.beans;

public class Cliente {

	private String nome;
	private Endereco endereco;
	private String telefone;
	
	public String identificarCliente() {
		if (this instanceof ClientePF) {
			return "Pessoa F�sica";
		}else if (this instanceof ClientePJ) {
			return "Pessoa Jur�dica";
		}else {
			return "Pessoa";
		}
		
	
	}
	
	
	public String getBasico() {
		return null;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Cliente() {
		super();
	}
	public Cliente(String nome, Endereco endereco, String telefone) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public void setAll(String nome, Endereco endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + "]";
	}
	
	
	
	
	
	
}
