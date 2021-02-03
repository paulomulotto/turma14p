package variaveis;

import javax.swing.JOptionPane;

public class TiposDados {

	public static void main(String[] args) {
		/*
		 * Dois tipos de Dados:
		 * 1º) Alfanumérico: é o dado que não será utilizado em expressões matemáticas.
		 * X0010
		 * CEP (contexto: DP do Itau) => não faz sentido fazer cálculo
		 * Em Java: String
		 * 
		 * 2º) Numérico: é um dado que PODE ser utilizado em expressões matemáticas 
		 * e/ou é um dado sensível/chave para buscas no modelo de negócios?
		 * Input: 00010-009 => Output: 1 
		 * CEP (contexto: site dos Correios) => precisa de desempenho
		 * CPF (contexto: receita federal)
		 * RM (contexto: dentro de uma universidade)
		 * Em Java: 
		 * - int: para números inteiros
		 * - double: para números reais
		 */
		// <Tipo do dado> <nome da variavel> = <valor>;
		
		
	// Classes Wrappers
	// São classes que apoiam os tipos primitivos 
	// (tipos que começam com letra minuscula)
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
