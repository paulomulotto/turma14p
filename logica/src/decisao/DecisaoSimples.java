package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimples {

	public static void main(String[] args) {

		/*
		 * Capturar: 
		 * - nome da disciplina
		 * - duas notas
		 * - calcular a media aritmética
		 * - exibir a Média e o nome da disciplina
		 */
		String disciplina = JOptionPane.showInputDialog("Nome da disciplina").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
		float media = (nota1+nota2)/2;
		
		if (media>=6) {
			System.out.println("Parabéns você está aprovado!!!!!");
		}
		
		
		if (media<4) {
			System.out.println("Infelizmente você foi reprovado!!!!");
		}
		
		// && => and
		// || => or
		if (media<6 && media>=4) {
			System.out.println("Você ainda tem uma chance no exame.");
		}
		
		System.out.println("Média: " + media + " na disciplina: " + disciplina);


		




















	}

}
