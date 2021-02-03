package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.ClientePF;
import br.com.ecommerce.beans.ClientePJ;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.Venda;
import br.com.ecommerce.util.Magica;

public class ImplementarCliente {

	public static void main(String[] args) {

		char resp = Magica.s("Digite <F> para Fisica ou <J> para Juridica").charAt(0);
		
		if (resp=='F') {
			ClientePF pf = new ClientePF();
			pf.setCpf(Magica.s("CPF"));
			pf.setEndereco(new Endereco());
			pf.setNome(Magica.s("Nome"));
			pf.setRg(Magica.s("RG"));
			pf.setTelefone(Magica.s("Telefone"));
			System.out.println(pf.toString());
		}else if (resp=='J') {
			ClientePJ pj = new ClientePJ();
			pj.setAll(
					Magica.s("Nome"), 
					new Endereco(), 
					Magica.s("Fone"), 
					Magica.s("CNPJ"), 
					Magica.s("Contato")
					);
			System.out.println(pj.toString());
			System.out.println(pj.getBasico());
		}else {
			System.out.println("Opção inválida");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
