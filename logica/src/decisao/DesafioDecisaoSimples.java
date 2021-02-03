package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoSimples {
	public static void main(String[] args) {
		/*
		 * Capturar:
		 * - nome
		 * - idade
		 * E exibir se a pessoa:
		 * - é obrigada a votar (maior ou igual a 18 e menor que 70)
		 * - não pode votar (menor de 16 anos)
		 * - o voto é facultativo (16, 17 ou maior ou igual a 70 anos)
		 */
		
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		short idade = Short.parseShort(JOptionPane.showInputDialog("Idade:"));
		
		if (idade<16) {
			System.out.println(nome + " você não pode votar ainda!");
		}
		
		if (idade>=18 && idade<70) {
			System.out.println(nome + " você é obrigado a votar.");
		}
		
		if (idade==16 || idade==17 || idade>=70) {
			System.out.println(nome + " o seu voto é facultativo.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
