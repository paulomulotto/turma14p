package br.com.universidade.implementacao;

import br.com.universidade.beans.Aluno;
import br.com.universidade.beans.Endereco;

public class ImplementarAlunoSetAll {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		Endereco endereco = new Endereco();
		
		aluno.setAll(
				1, 
				"aluno@aluno.com.br", 
				"ABC", 
				endereco
				);
		endereco.setAll(
				"AV ITAQUERA", 
				"123456", 
				"VIELA 9", 
				"ITAQUERA", 
				"SAO PAULO", 
				"SP", 
				"12345-123"
				);
		
		//System.out.println(aluno.toString());
		System.out.println(aluno.getNome());
		System.out.println(aluno.getEndereco().getBairro());
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
