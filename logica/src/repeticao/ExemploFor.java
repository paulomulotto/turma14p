package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		/*
		 * Sintaxe For:
		 * 1� - identifica o contador e qual o seu inicio
		 * 2� - condi��o (at� onde deve repetir)
		 * 3� - Como ser� a contagem
		 */
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a tabuada"));
		for (int contador=1;contador<11;contador+=1) {
			System.out.println(tabuada + " x " + contador + " = " + (contador*tabuada));
		}
		
		// 15 x 1 = 15
		// 15 x 2 = 30
		// ....

		/*
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a tabuada"));
		int contador=1;
		while (contador<11) {
			System.out.println(tabuada + " x " + contador + " = " + (contador*tabuada));
			contador++;
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
