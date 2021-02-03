package repeticao;

import javax.swing.JOptionPane;

public class DesafioWhile {

	public static void main(String[] args) {
		/*
		 * Capture separadamente:
		 * dia, mes,  ano e usuario
		 * 
		 * - Usuario deve ter mais que 5 letras e menos que 20 letras
		 * - Dia (deve estar entre 1 e 31)
		 * - Mes (deve estar entre 1 e 12)
		 * - Ano (deve ser menor que 2003)
		 * 
		 * - Leve em consideraçãos
		 * * meses que possuem 30 ou 31 dias
		 * * considere fevereiro com 29 dias
		 * 
		 * No final exibir a data completa
		 */
		String usuario = JOptionPane.showInputDialog("Digite o usuário").toUpperCase();
		byte dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia"));
		byte mes = Byte.parseByte(JOptionPane.showInputDialog("Digite o mes"));
		short ano = Short.parseShort(JOptionPane.showInputDialog("Digite o ano"));
		
		while(usuario.length()<=5 || usuario.length()>=20) {
			usuario = JOptionPane.showInputDialog("Digite o usuário novamente").toUpperCase();
		}
		
		while (ano>=2003) {
			ano = Short.parseShort(JOptionPane.showInputDialog("Digite o ano novamente"));
		}
		
		while (mes<1 || mes>12) {
			mes = Byte.parseByte(JOptionPane.showInputDialog("Digite o mes novamente"));
		}
		
		if (mes==2) {
			while(dia<1 || dia>29) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia novamente"));
			}
		}else if (mes==4 || mes==6 || mes==9 || mes==11) {
			while (dia<1 || dia>30) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia novamente"));
			}
		}else {
			while (dia<1 || dia>31) {
				dia = Byte.parseByte(JOptionPane.showInputDialog("Digite o dia novamente"));
			}
		}
		
		System.out.println("Data: " + dia + "/" + mes + "/" + ano);
		System.out.println("Usuário: " + usuario);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
