package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {

	public static void main(String[] args) {
		String disciplina = JOptionPane.showInputDialog("Nome da disciplina").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 1"));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota 2"));
		float media = (nota1+nota2)/2;
		
		if (media>=6) {
			System.out.println("Parab�ns voc� est� aprovado!!!!!");
		}else if (media<4) {
			System.out.println("Infelizmente voc� foi reprovado!!!!");
		}else  {
			System.out.println("Voc� ainda tem uma chance no exame.");
		}
		
		System.out.println("M�dia: " + media + " na disciplina: " + disciplina);


		




















	}

}
