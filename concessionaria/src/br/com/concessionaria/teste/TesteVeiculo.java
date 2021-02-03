package br.com.concessionaria.teste;

import br.com.concessionaria.modelo.Veiculo;

public class TesteVeiculo {

	public static void main(String[] args) {
		// Instanciando um objeto
		Veiculo objeto = new Veiculo();
		objeto.preencherModelo("uno");
		objeto.preencherPlaca("clp4520");
		objeto.preencherValor(500);
		objeto.preencherStatus("sim");
		objeto.preencherVelocidadeAtual(0);
		
		System.out.println(objeto.retornarModelo());
		System.out.println(objeto.retornarPlaca());
		System.out.println(objeto.retornarValor());
		System.out.println(objeto.retornarStatus());
		System.out.println(objeto.retornarVelocidadeAtual());
		
		System.out.println("Desconto: " + objeto.retornarDesconto());
		System.out.println(objeto.aplicarReajuste(10));
		System.out.println("Valor Atualizado: " + objeto.retornarValor());
		
		System.out.println("==========Teste de velocidade===============");
		objeto.preencherStatus("nao");
		objeto.acelerar(20);
		System.out.println(objeto.retornarResumo());
		objeto.preencherStatus("sim");
		objeto.acelerar(50);
		System.out.println(objeto.retornarResumo());
		objeto.acelerar(50);
		System.out.println("�ltimo Resumo: " + objeto.retornarResumo());
		objeto.brecar();
		System.out.println("Depois de brecar: " + objeto.retornarResumo());
		//Criando um objeto
		//String nome;
		//Veiculo carro;
		//carro.preencherModelo("UNO");
		
		
		// Instanciando um objeto
		//String nome2 = new String();
		//Veiculo carro2 = new Veiculo();
		//carro2.modelo="UNO";
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
