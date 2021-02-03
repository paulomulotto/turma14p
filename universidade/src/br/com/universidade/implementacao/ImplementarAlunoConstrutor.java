package br.com.universidade.implementacao;

import br.com.universidade.beans.Aluno;
import br.com.universidade.beans.Endereco;

public class ImplementarAlunoConstrutor {

	public static void main(String[] args) {

		Aluno aluno = new Aluno(
				1,
				"aluno@aluno",
				"ABC",
				new Endereco(
						"AV ITAQUERA",
						"123",
						"",
						"ITAQUERA",
						"SÃO PAULO",
						"SP",
						"12345-123"
						)
				);
		
		System.out.println(aluno.getNome());
		System.out.println(aluno.getEndereco().getLogradouro());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
