package br.com.colecoes.implementacao;

import java.util.HashMap;
import java.util.Map;

import br.com.colecoes.beans.Cargo;

public class TesteMap {

	public static void main(String[] args) {
		Map<Integer, Cargo> lista = new HashMap<Integer, Cargo>();
		
		lista.put(1, new Cargo("DBA", "JR", 5000));
		lista.put(2, new Cargo("DBA", "PLENO", 8000));
		lista.put(3, new Cargo("DBA", "SR", 15000));
		
		System.out.println("Cargos: " + lista);
		
		System.out.println("Cargos: " + lista);
		System.out.println("Elementos 2: " + lista.get(2));
		System.out.println("Chaves: " + lista.keySet());
		System.out.println("Valores: " + lista.values());
		System.out.println("Qtde: " + lista.size());
		
		for (Cargo objeto: lista.values()) {
			System.out.println(objeto.getNome());
			System.out.println(objeto.getSalario());
		}
	}

}
