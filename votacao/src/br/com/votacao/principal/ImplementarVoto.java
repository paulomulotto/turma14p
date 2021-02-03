package br.com.votacao.principal;

import java.util.Random;

import br.com.votacao.beans.Candidato;
import br.com.votacao.beans.Eleitor;
import br.com.votacao.beans.Pessoa;
import br.com.votacao.beans.Urna;
import br.com.votacao.beans.Voto;

public class ImplementarVoto {

	public static void main(String[] args) {
		Urna urna = new Urna(1, 2, "CIDADE ZONA 1 SECAO 2");
		
		Random gerador = new Random();
		
		for(int i = 0; i < 10; i++) {
			Pessoa eleitor = new Pessoa();
			eleitor = new Eleitor("NOME ELEITOR" + i, 1, true);
			
			Pessoa candidato = new Pessoa();
			candidato = new Candidato("NOME CANDIDATO" + gerador.nextInt(3), 1, "PREFEITO", "ÉNOIX");
			
			Voto voto = new Voto(eleitor, candidato, true);
			urna.addVotos(voto);
			
		}
		
		
		System.out.println("O total de votos é: " + urna.totalVotos());
		

	}

}
