package repeticao;

import javax.swing.JOptionPane;

public class DesafioDo {
/*
 * Momento flashback
 * Decisao Simples // recomendado para uma condi��o �nica sobre um dado
 * if (<condicao>){
 * 
 * }
 * 
 * Decisao Composta // recomendado quando precisa de v�rias perguntas sobre o mesmo dado
 * if (<condicao>){
 * 
 * }else{
 * 
 * }
 * 
 * Decisao Encadeada // recomendada quando voc� pergunta pra mais de um dado (relacionados)
 * if (<condicao>){ // um dado
 * 		if (<condicao>) { // o outro dado
 * 
 * 		}
 * }
 * 
 * 
 * Repeti��es
 * 
 * while (<condicao>) {
 * 
 * }
 * 
 * 
 * do {
 * 
 * }while(<condicao>);
 */
	public static void main(String[] args) {
		
		/*
		 * Game:
		 * Jogador1 => vai digitar um n�mero
		 * Jogador2 => tem que descobrir o n�mero digitado pelo Jogador1
		 * 
		 * Quando o Jogador2 acertar, voc� vai exibir uma mensagem de Parab�ns!!!
		 * 
		 * Missao 2:
		 * Voc� implementar dicas para o Jogador2 ("O n�mero � maior" - "O n�mero � menor")
		 * 
		 * Missao 3:
		 * Quando o Jogador2 acertar, voc� vai exibir quantas tentativas ele usou.
		 * Dica: vai ter que utilizar uma vari�vel pra contar
		 */
		// x = x + 1;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero"));
		int chute = 0;
		int contador=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Descubra o n�mero"));
			contador= contador+1;
			//contador++;
			//contador+=1;
			if (numero>chute) {
				JOptionPane.showMessageDialog(null, "O n�mero � maior!!!");
			}else if(numero<chute) {
				JOptionPane.showMessageDialog(null, "O n�mero � menor!!!");
			}
			
		}while(numero!=chute);
		
		JOptionPane.showMessageDialog(null, "Parab�ns voc� acertou com " + contador + " tentativa(s)!");
			
		
		//=========================================================
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1, digite um n�mero aleat�rio"));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 2, tente acertar o valor digitado pelo jogador 1"));
		int tentativas = 1;
		
		while (num2!=num1) {
			if (num2<num1) {
				num2 = Integer.parseInt(JOptionPane.showInputDialog("O n�mero digitado � menor, tente acertar o valor digitado pelo jogador 1"));
								
			}else {
				num2 = Integer.parseInt(JOptionPane.showInputDialog("O n�mero digitado � maior, tente acertar o valor digitado pelo jogador 1"));
				
			}
				tentativas = tentativas + 1;
			
		}
		JOptionPane.showMessageDialog(null, "Parab�ns voc� acertou com " + contador + " tentativa(s)!");
		
	
		
	}

}
