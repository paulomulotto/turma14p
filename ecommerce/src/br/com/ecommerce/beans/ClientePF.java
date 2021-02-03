package br.com.ecommerce.beans;

public class ClientePF extends Cliente{

	private String cpf;
	private String rg;

	
	public void setAll(String nome, Endereco endereco, String telefone, String cpf, String rg) {
		super.setAll(nome, endereco, telefone);
		this.cpf = cpf;
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "ClientePF [cpf=" + cpf + ", rg=" + rg + ", " + super.toString() + "]";
	}

	public ClientePF() {
		super();
	}
	
	public ClientePF(String nome, Endereco endereco, String telefone, String cpf, String rg) {
		super(nome, endereco, telefone);	
		this.cpf = cpf;
		this.rg = rg;
	}


	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	
	
	
	
	
	
}
