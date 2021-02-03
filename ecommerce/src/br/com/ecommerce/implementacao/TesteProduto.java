package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.beans.Produto;
import br.com.ecommerce.util.Magica;

public class TesteProduto {

	
	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.setAll(
				Magica.i("ID"), 
				Magica.s("Descrição"), 
				Magica.f("Venda"), 
				Float.parseFloat(JOptionPane.showInputDialog("Compra")), 
				Integer.parseInt(JOptionPane.showInputDialog("Qtde"))
				);
		produto.atualizarValores(10);
		System.out.println(produto.toString());
		System.out.println("Total Compra: " + produto.getTotalCompra());
		System.out.println("Total Venda: " + produto.getTotalVenda());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
