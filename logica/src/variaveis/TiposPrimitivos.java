package variaveis;

import javax.swing.JOptionPane;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		/*
		 * Capturar:
		 * - marca da televisao
		 * - valor da televisão
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
		// e os outros sysout´s
		
		/*
		 * Tipos Primitivos:
		 * boolean => true/false => é o dado lógico
		 * char => armazena somente um caracter => deve estar entre apostrofos
		 * =======número inteiros
		 * byte = -128 // +127
		 * short = -32mil // + 32mil
		 * int = -3bilhoes // + 3bilhoes
		 * long = -9quintilhoes // + 9quintilhoes
		 * ===============
		 * float = metade da exatidão nas casas decimais qdo comparado ao double (5 casas dec)
		 * double = 
		 */
		
		/*
		 * Regras e Padroes para identificadores (nomes de variaveis, arquivos... )
		 * Regras (obrigatório)
		 * 1º - Não usarás palavras reservadas da linguagem (int, public, class)
		 * 2º - Não começarás com número. 1berto (errado) h1berto (certo)
		 * 3º - Não utilizarás caracteres especiais (#, @, +, * ...) Exceção: _ ou $
		 * 
		 * Padroes (facultativo)
		 * - utilize nomes significativos
		 * - padrão CamelCase
		 * dataDeNascimento - variavel
		 * TipoPrimitivo - classe
		 * xyczWidc
		 * data_de_nascimento (certo)
		 * data_De_Nascimento (aberração)
		 * - variaveis começam com letras minusculas
		 * - classes começam com letras maiusculas
		 * - métodos começam com letras minusculas e sempre vem seguido de parenteses
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
