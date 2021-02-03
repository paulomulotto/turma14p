package br.com.ecommerce.implementacao;

import br.com.ecommerce.beans.Cliente;
import br.com.ecommerce.beans.Endereco;
import br.com.ecommerce.beans.Pagamento;
import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.beans.Venda;
import br.com.ecommerce.util.Magica;

public class ImplementarVenda {


	
	public static void main(String[] args) {
		
		Venda venda = new Venda(
				Magica.i("Id"),
				new Cliente(
						Magica.s("Nome"),
						new Endereco(
								Magica.s("Logradouro"),
								Magica.s("Numero da Casa"),
								"ALLIANCE PARK",
								"AGUA BRANCA",
								"S�O PAULO",
								"SP",
								"12345-111"
								),
						"1234-4321"
						),
				new Produto(
						1,
						"CHURROS",
						15,
						10,
						100
						),
				"10/10/2020",
				1500,
				new Pagamento(
						"VISTA",
						"1500"
						)
				);
		
		
		System.out.println(venda.getCliente().getNome());
		System.out.println(venda.getProduto().getDescricao());
		System.out.println(venda.getCliente().getEndereco().getBairro());
		System.out.println(venda.getPagamento().getForma());
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
