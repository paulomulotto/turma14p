package br.com.elevadores.modelo;

public class Elevador {

	private byte andarMaximo;
	private byte andarMinimo;
	private byte capacidadePessoas;
	private byte qtdePessoas;
	private byte andarAtual;
	private String nome;
	
	public void inicializar(byte andarMaximo, byte andarMinimo, byte capacidadePessoas, String nome) {
		this.andarMaximo = andarMaximo;
		this.andarMinimo = andarMinimo;
		this.capacidadePessoas = capacidadePessoas;
		this.nome = nome;
	}
	
	public String status() {
		return "Qtde Pessoas: " + qtdePessoas + "\nAndar Atual: " 
					+ andarAtual + "\nCapacidade Máxima: " + capacidadePessoas; 
	}
	
	public String descer() {
		if (andarAtual>andarMinimo) {
			andarAtual--;
			return "Indo para o andar: " + andarAtual;
		}
		return "Já está no primeiro andar";
	}
	
	public String subir() {
		if (andarAtual<andarMaximo) {
			andarAtual++;
			return "Indo para o andar: " + andarAtual;
		}
		return "Já está no último andar";
		
	}
	
	public void entrar() {
		if (qtdePessoas<capacidadePessoas) {
			qtdePessoas++;
		}
	}
	
	public void entrar(byte qtde) {
		if ((qtdePessoas+qtde)<=capacidadePessoas) {
			qtdePessoas+=qtde;
		}
	}
	
	public void sair() {
		if (qtdePessoas>0) {
			qtdePessoas--;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
