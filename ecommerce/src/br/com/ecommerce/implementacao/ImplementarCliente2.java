package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.ClientePF;
import br.com.ecommerce.beans.ClientePJ;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.Venda;
import br.com.ecommerce.util.Magica;

public class ImplementarCliente2 {

	public static void main(String[] args) {
		
		char resp = Magica.s("Digite <F> para Fisica ou <J> para Juridica").charAt(0);
		Cliente objeto = new Cliente();
		if (resp=='F') {
			objeto = new ClientePF(
					Magica.s("Nome"),
					new Endereco(),
					Magica.s("Telefone"),
					Magica.s("CPF"),
					Magica.s("RG")
					);
		}else if (resp=='J') {
			objeto = new ClientePJ(
					Magica.s("Nome"),
					new Endereco(),
					Magica.s("Telefone"),
					Magica.s("CNPJ"),
					Magica.s("Contato")					
					);
			
		}else {
			System.out.println("Op��o inv�lida");
		}
		
		System.out.println(objeto.getBasico());
		System.out.println(objeto.toString());
		
		Venda venda = new Venda();
		venda.setCliente(objeto);
		/*
		if (venda.getCliente() instanceof ClientePF) {
			System.out.println("� uma pessoa F�sica");
		}else if(venda.getCliente() instanceof ClientePJ) {
			System.out.println("� uma pessoa Jur�dica");
		}else {
			System.out.println("� uma pessoa");
		}*/
		
		System.out.println(venda.getCliente().identificarCliente());
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
