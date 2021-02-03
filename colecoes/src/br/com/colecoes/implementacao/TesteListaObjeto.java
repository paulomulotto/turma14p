package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//import com.sun.tools.javac.util.List;

import br.com.colecoes.beans.Cargo;

public class TesteListaObjeto {

	
	public static void main(String[] args) {
		ArrayList<Cargo> lista = new ArrayList<Cargo>();
		
		lista.add(new Cargo("DBA", "JR", 5000));
		lista.add(new Cargo("DEV", "PL", 9000));
		lista.add(new Cargo("SUPORTE", "JR", 4500));
		lista.add(new Cargo("ESTAGIARIO", "SR", 3000));
		
		float total_salario = 0;
		ArrayList<Cargo> lista_jrs = new ArrayList<Cargo>();
		for(Cargo objeto: lista) {
			/*System.out.println("Cargo...:" + objeto.getNome());
			System.out.println("Nivel...:" + objeto.getNivel());
			System.out.println("Salario...:" + objeto.getSalario());
			System.out.println("==================================");*/
			
			total_salario = total_salario + objeto.getSalario();
			
			if (objeto.getSalario() > 5000) {
				System.out.println("GANHA MAIS DO QUE 5K");
				System.out.println("Nivel...:" + objeto.getNivel());
				
			}
			if (objeto.getNivel() == "JR") {
				lista_jrs.add(objeto);
			}
		}
		
		System.out.println("\nLISTA JRs:");
		for(Cargo objeto: lista_jrs) {
			System.out.println("Cargo...:" + objeto.getNome());
			System.out.println("Salario...:" + objeto.getSalario());
		}

		System.out.println("\nTOTAL SALARIOS: " + total_salario);
		
		Collections.sort(lista);
		System.out.println("lista ordenada: " + lista);
		
	}

}
