package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		/*
		 * Capturar:
		 * - marca da televisao
		 * - valor da televis�o
		 * - qtde de polegadas
		 * - voltagem
		 * - qtde em estoque
		 */
		
		String marca = JOptionPane.showInputDialog("Marca");
		float valor = Float.parseFloat(JOptionPane.showInputDialog("Valor"));
		short polegadas = Short.parseShort(JOptionPane.showInputDialog("Polegadas"));
		short voltagem = Short.parseShort(JOptionPane.showInputDialog("Voltagem"));
		byte qtde = Byte.parseByte(JOptionPane.showInputDialog("Estoque"));	
		System.out.println(marca);
		// e os outros sysout�s
		
		/*
		 * Tipos Primitivos:
		 * boolean => true/false => � o dado l�gico
		 * char => armazena somente um caracter => deve estar entre apostrofos
		 * =======n�mero inteiros
		 * byte = -128 // +127
		 * short = -32mil // + 32mil
		 * int = -3bilhoes // + 3bilhoes
		 * long = -9quintilhoes // + 9quintilhoes
		 * ===============
		 * float = metade da exatid�o nas casas decimais qdo comparado ao double (5 casas dec)
		 * double = 
		 */
		
		/*
		 * Regras e Padroes para identificadores (nomes de variaveis, arquivos... )
		 * Regras (obrigat�rio)
		 * 1� - N�o usar�s palavras reservadas da linguagem (int, public, class)
		 * 2� - N�o come�ar�s com n�mero. 1berto (errado) h1berto (certo)
		 * 3� - N�o utilizar�s caracteres especiais (#, @, +, * ...) Exce��o: _ ou $
		 * 
		 * Padroes (facultativo)
		 * - utilize nomes significativos
		 * - padr�o CamelCase
		 * dataDeNascimento - variavel
		 * TipoPrimitivo - classe
		 * xyczWidc
		 * data_de_nascimento (certo)
		 * data_De_Nascimento (aberra��o)
		 * - variaveis come�am com letras minusculas
		 * - classes come�am com letras maiusculas
		 * - m�todos come�am com letras minusculas e sempre vem seguido de parenteses
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
