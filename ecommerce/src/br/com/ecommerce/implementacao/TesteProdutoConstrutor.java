package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.beans.Produto;

public class TesteProdutoConstrutor {

	public static void main(String[] args) {
		
		Produto produto = new Produto(
				Integer.parseInt(JOptionPane.showInputDialog("ID")),
				JOptionPane.showInputDialog("Descricao").toUpperCase(),
				Float.parseFloat(JOptionPane.showInputDialog("Valor Venda")),
				Float.parseFloat(JOptionPane.showInputDialog("Valor Compra")),
				Integer.parseInt(JOptionPane.showInputDialog("Qtde"))
				);
		
		System.out.println(produto.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
