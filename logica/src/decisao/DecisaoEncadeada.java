package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {
		/*
		 * capturem a qtde de faltas.
		 * Aprovação será com base na media e a qtde de faltas tem que ser menor que 20
		 * o mesmo vale para o Exame.
		 */
		String disciplina = JOptionPane.showInputDialog("Nome da disciplina").toUpperCase();
		short faltas = Short.parseShort(JOptionPane.showInputDialog("Faltas"));
		if (faltas>=20) {
			System.out.println("Reprovado por faltas");
		}else {
			float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
			float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
			float media = (nota1+nota2)/2;
			if (media>=6) {
				System.out.println("Parabéns você está aprovado!!!!!");
			}else if (media<4) {
				System.out.println("Infelizmente você foi reprovado!!!!");
			}else  {
				System.out.println("Você ainda tem uma chance no exame.");
			}
			System.out.println("Média: " + media + " na disciplina: " + disciplina);
		}






















	}

}
