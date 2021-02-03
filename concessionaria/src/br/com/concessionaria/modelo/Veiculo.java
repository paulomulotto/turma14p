package br.com.concessionaria.modelo;

public class Veiculo {

	// Sintaxe dos metodos
	// <modificador> <Tipo do Retorno> <nome do metodo> (<Tipo do Parametro> <Nome do Parametro){
	private String modelo;
	private String placa;
	private float valor;
	private boolean status;
	private float velocidadeAtual;
	
	
	public String retornarResumo() {
		String situacao = "LIGADO";
		if (status==false) {
			situacao="DESLIGADO";
		}
		return "Modelo: "  + modelo + "\nStatus: " + situacao + "\nVelocidade: " + velocidadeAtual; 
	}
	
	public String ligar() {
		status=true;
		return "Ligado";
	}
	
	public String desligar() {
		velocidadeAtual=0;
		status=false;
		return "Desligado";
	}
	
	public void brecar() {
		if (status==true) {
			velocidadeAtual=0;
		}
	}
	
	public void acelerar(float valor) {
		if (status==true) {
			velocidadeAtual+=valor;
		}
	}
	
	
	public String aplicarReajuste(float porcentagem) {
		valor = valor + valor * (porcentagem/100);
		return "Valor atualizado";
	}
	
	public float retornarDesconto(float porcentagem) {
		return valor - valor * (porcentagem/100);
	}
	
	public float retornarDesconto() {
		return valor * (float) 0.95;
	}
	
	public void preencherModelo(String param) {
		if (param.length()>5) {
			modelo = param.substring(0,5).toUpperCase();
		}else {
			modelo = param.toUpperCase();
		}
	}
	
	public String retornarModelo() {
		return modelo;
	}
	
	public String retornarPlaca() {
		return placa;
	}
	
	public float retornarValor() {
		return valor;
	}
	
	public String retornarStatus() {
		if (status==true) {
			return "Sim";
		}else {
			return "Não";
		}
	}
	
	public float retornarVelocidadeAtual() {
		return velocidadeAtual;
	}
	
	
	public void preencherPlaca(String param) {
		placa = param.toUpperCase();
	}
	
	public void preencherValor(float param) {
		if (param>0) {
			valor=param;
		}
	}
	
	public void preencherStatus(String param) {
		if (param.toUpperCase().equals("SIM")) {
			status=true;
		}else {
			status=false;
		}
	}
	
	public void preencherVelocidadeAtual(float param) {
		if (param>0) {
			velocidadeAtual=param;
		}
	}
	
	
	
	
	
	
	
	
	
	
}
