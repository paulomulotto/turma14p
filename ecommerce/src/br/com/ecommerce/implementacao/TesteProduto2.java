package br.com.ecommerce.implementacao;

import javax.swing.JOptionPane;

import br.com.ecommerce.beans.Produto;

public class TesteProduto2 {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.setId(Integer.parseInt(JOptionPane.showInputDialog("ID")));
		produto.setDescricao(JOptionPane.showInputDialog("Descri��o").toUpperCase()); 
		produto.setValorVenda(Float.parseFloat(JOptionPane.showInputDialog("Venda"))); 
		produto.setValorCompra(Float.parseFloat(JOptionPane.showInputDialog("Compra"))); 
		produto.setQtde(Integer.parseInt(JOptionPane.showInputDialog("Qtde")));
		produto.atualizarValores(10);
		System.out.println(produto.toString());
		System.out.println("Total Compra: " + produto.getTotalCompra());
		System.out.println("Total Venda: " + produto.getTotalVenda());
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
