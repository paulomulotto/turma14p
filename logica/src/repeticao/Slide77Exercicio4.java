package repeticao;

import javax.swing.JOptionPane;

public class Slide77Exercicio4 {

	public static void main(String[] args) {
		
		String nome = "";
		short idade = 0;
		short qtdeMaioresIdade=0;
		int totalIdades=0;
		short qtdePessoas=0;
		String nomeMaisExperiente="";
		short idadeMaisExperiente=0;
		String nomeMaisJovem="";
		short idadeMaisJovem=0;
		
		do {
			nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
			idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
			
			qtdePessoas++;
			totalIdades=totalIdades+idade; // totalIdade+=idade;
			
			if (idade>17) {
				qtdeMaioresIdade++;
			}
			
			if (idade>idadeMaisExperiente) {
				idadeMaisExperiente= idade;
				nomeMaisExperiente=nome;
			}
			
			if (idade<idadeMaisJovem || qtdePessoas==1) {
				idadeMaisJovem=idade;
				nomeMaisJovem=nome;
			}
			
		}while(JOptionPane.showConfirmDialog(null, "Continuar?", "T�tulo", JOptionPane.YES_NO_OPTION)==0);
		
		JOptionPane.showMessageDialog(null, qtdeMaioresIdade + " pessoas s�o maiores de idade");
		JOptionPane.showMessageDialog(null, "M�dia de Idade: " + (totalIdades/qtdePessoas));
		JOptionPane.showMessageDialog(null, "Mais Experiente: " + nomeMaisExperiente + "\nIdade: " + idadeMaisExperiente);
		JOptionPane.showMessageDialog(null, "Mais Jovem: " + nomeMaisJovem + "\nIdade: " + idadeMaisJovem);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
