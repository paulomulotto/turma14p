package br.com.elevadores.teste;

import br.com.elevadores.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		Elevador elevador = new Elevador();
		
		elevador.inicializar((byte) 10, (byte) 0, (byte) 8, "Torre B");
		System.out.println(elevador.status());
		System.out.println(elevador.subir());
		elevador.subir();
		elevador.entrar();
		elevador.subir();
		elevador.entrar((byte) 9);
		System.out.println(elevador.status());
		elevador.descer();
		elevador.descer();
		elevador.descer();
		System.out.println(elevador.descer());
		System.out.println(elevador.status());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
