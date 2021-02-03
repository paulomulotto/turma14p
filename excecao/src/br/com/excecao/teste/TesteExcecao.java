package br.com.excecao.teste;

import java.util.ArrayList;
import java.util.List;

public class TesteExcecao {

	public static void main(String[] args) {
		try {
			int numero = Integer.parseInt("1");
			List<String> lista = new ArrayList<String>();
			lista.add("Suporte");
			lista.add("teste");
			
			System.out.println("Lista: " + lista);
			
		
			System.out.println("Numero: " + numero);
			
			String palavra = "";
			System.out.println("Qtde letras: " + palavra.length());
			
			int numeros[] = new int[2];
			numeros[0] = 500;
			numeros[1] = 3;
			numeros[2] = 7;
			
			int contadorDBA = 0;
			for (int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i));
			}
		}
		catch(ArrayIndexOutOfBoundsException e ) {
			System.out.println("Array errado");
		}
		catch(NullPointerException e) {
			System.out.println("Existe um dado nulo");
		}
		catch(NumberFormatException e) {
			System.out.println("Número Invalido");
		}
		catch(Exception e) {
			System.out.println("Deu ruim");
			e.printStackTrace();
		}
	}

}
