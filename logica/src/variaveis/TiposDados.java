package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) {
		/*
		 * Dois tipos de Dados:
		 * 1�) Alfanum�rico: � o dado que n�o ser� utilizado em express�es matem�ticas.
		 * X0010
		 * CEP (contexto: DP do Itau) => n�o faz sentido fazer c�lculo
		 * Em Java: String
		 * 
		 * 2�) Num�rico: � um dado que PODE ser utilizado em express�es matem�ticas 
		 * e/ou � um dado sens�vel/chave para buscas no modelo de neg�cios?
		 * Input: 00010-009 => Output: 1 
		 * CEP (contexto: site dos Correios) => precisa de desempenho
		 * CPF (contexto: receita federal)
		 * RM (contexto: dentro de uma universidade)
		 * Em Java: 
		 * - int: para n�meros inteiros
		 * - double: para n�meros reais
		 */
		// <Tipo do dado> <nome da variavel> = <valor>;
		
		
	// Classes Wrappers
	// S�o classes que apoiam os tipos primitivos 
	// (tipos que come�am com letra minuscula)
	// int => Integer
	// double => Double
	// boolean => Boolean
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
		double imc = peso / (altura * altura);
		
		System.out.println("Nome..: " + nome);
		System.out.println("Idade.: " + idade + " anos.");
		System.out.println("Altura: " + altura + " metros.");
		System.out.println("IMC...: " + imc);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
