package variaveis;

public class TipoString {

	public static void main(String[] args) {
		
		String email = "humBerTo@fiaP.cOM.br";
		
		System.out.println("Original: " + email);
		System.out.println("Minusculas: " + email.toLowerCase());
		System.out.println("Maiusculas: " + email.toUpperCase());
		System.out.println("Tamanho: " + email.length());
		System.out.println("Terceiro caracter: " + email.charAt(2));
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posição do @: " + email.indexOf("@"));
		System.out.println("Do 3º até o 5º: " + email.substring(2,5));
		System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
		// segunda metade
		System.out.println("Segunda metade: " + email.substring(email.length()/2));
		// exibir o usuário do email
		System.out.println("Usuario: " + email.substring(0, email.indexOf("@")));
		// exibir o servidor do email
		System.out.println("Servidor: " + email.substring(email.indexOf("@")+1));
		
		// h u m b e r t o @ f i 
		// 0 1 2 3 4 5 6 7 8 9 10
		System.out.println("É igual a humberto@gama?" + email.equals("humberto@gama"));
		
		
		
		
		
		
		

	}

}
