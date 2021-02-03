package br.com.universidade.beans;

/*
 * Design Pattern: define as melhores pr�ticas para POO
 * Uma das pr�ticas: DTO (Data Transfer Object) = atua sobre a representa��o das classes 
 * do Diagrama de Classes.
 * Sugest�es:
 * 1� TODOS os atributos devem ser privados
 * 2� CADA atributo deve possuir um m�todo individual GETTER e SETTER
 * 3� TODO modelo deve possuir no m�nimo: 2 Construtores:
 * - vazio
 * - permite preencher todo o objeto (cheio) 
 * 
 */

public class Aluno {

	private int rm;
	private String email;
	private String nome;
	private Endereco endereco;
	
	public void setAll(int rm, String email, String nome, Endereco endereco) {
		this.rm = rm;
		this.email = email;
		this.nome = nome;
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Aluno [rm=" + rm + ", email=" + email + ", nome=" + nome + ", endereco=" + endereco + "]";
	}

	public Aluno(int rm, String email, String nome, Endereco endereco) {
		super();
		this.rm = rm;
		this.email = email;
		this.nome = nome;
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Aluno() {
		super();
	}


	


	public String getUsuario() {
		if (email.contains("@")) {
			return email.substring(0,email.indexOf("@"));
		}
		return email;
	}
	
	/*
	 * Metodos para:
	 * retornar o usu�rio do email => getUsuario()
	 * preencher todos os dados do aluno => setAll()
	 */
	

	
	
	public int getRm() {
		return rm;
	}
	public void setRm(int rm) {
		this.rm = rm;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
