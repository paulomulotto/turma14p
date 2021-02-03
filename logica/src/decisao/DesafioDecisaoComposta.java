package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoComposta {

	public static void main(String[] args) {
		/*
		 * Capturar:
		 * - nome de um produto
		 * - qtde em estoque
		 * - valor de venda
		 * Exibir:
		 * - "Estoque médio" se a qtde estiver entre 10 e 20
		 * - "Estoque alto" se a qtde for maior que 20
		 * - "Estoque baixo" se a qtde estiver entre 5 e 9
		 * - "Estoque emergencial" se a qtde for menor que 5
		 * 
		 * - o valor total do estoque
		 * - o valor de venda com 10% de desconto
		 *
		 */
		
		String produto = JOptionPane.showInputDialog("Nome do produto");
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Qtde"));
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
		if (qtde>20) {
			System.out.println("Estoque alto");
		}else if (qtde<5) {
			System.out.println("Estoque emergencial");
		}else if (qtde>=10 && qtde<=20) {
			System.out.println("Estoque médio");
		}else {
			System.out.println("Estoque baixo");
		}
		
		float total = valor*qtde;
		float valorDesconto = valor * (float) 0.9;
		// Cast => utilizado para o tratamento entre dados compativeis POREM com tamanhos diferentes
		//int numero = 500;
		//byte x = (byte) (numero * 5);
		//long y = (long) total;
		
		System.out.println("Total do Estoque: " + total);
		System.out.println("Valor Com desconto: " + valorDesconto);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
