package br.com.universidade.implementacao;

import br.com.universidade.beans.Bacharelado;
import br.com.universidade.beans.Formacao;
import br.com.universidade.beans.Medio;
import br.com.universidade.beans.Tecnologo;
import br.com.universidade.util.Magica;

public class TesteFormacao {
	public static void main(String[] args) {

		int opcao = Magica.i("1 - Tecnologo\n2 - Bacharelado\n3 - Medio");
		Formacao formacao = new Formacao();
		if (opcao==1) {
			formacao = new Tecnologo(
					Magica.s("Descri��o"),
					Magica.i("Periodo: 1 Manha - 2 Noite"),
					0,
					0,
					true
					);
		}else if (opcao==2) {
			formacao = new Bacharelado(
					Magica.s("Descri��o"),
					Magica.i("Periodo: 1 Manha - 2 Noite"),
					0,
					0,
					Magica.s("Conclus�o"),
					Magica.i("Carga Horaria Estagio")
					);
		}else if (opcao==3) {
			formacao = new Medio(
					Magica.s("Descri��o"),
					Magica.i("Periodo: 1 Manha - 2 Noite"),
					0,
					0,
					Magica.s("Tipo")
					);
		}else {
			System.out.println("Op��o inv�lida");
		}
		
		formacao.definirDuracao();
		formacao.calcularMensalidade(0.015);
		System.out.println(formacao.calcularDesconto(10));
		System.out.println(formacao.toString());
		
		
		
	}
}
