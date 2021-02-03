package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisaoEncadeada {

	public static void main(String[] args) {
		
		/*
		 * Capturar:
		 * - nome da cidade
		 * - IDH da cidade
		 * - populacao da cidade
		 * Para as cidades com população maior que 200.000
		 * considere o IDH da seguinte forma:
		 * - se o IDH for maior que 0,90 => "Cidade Perfeita"
		 * - se o IDH estiver entre 0,75 e 0,90 => "Boa cidade"
		 * - se o IDH for menor que 0,75 => "Cidade precisa de cuidados"
		 * Se a populacao for menor ou igual a 200.000
		 * - se o IDH for menor que 0,85 => "Cidade precisa de cuidados"
		 * - se o IDH for maior ou igual a 0,85 => "Boa cidade"
		 */
		
		String cidade = JOptionPane.showInputDialog("Cidade").toUpperCase();
		float idh = Float.parseFloat(JOptionPane.showInputDialog("IDH"));
		long populacao = Long.parseLong(JOptionPane.showInputDialog("Populacao"));
		if (populacao>200000) {
			if (idh>0.9) {
				System.out.println(cidade + " perfeita!");
			}else if(idh<0.75) {
				System.out.println(cidade + " precisa de cuidados!");
			}else {
				System.out.println(cidade + " é uma boa cidade.");
			}
		}else {
			if (idh<0.85) {
				System.out.println(cidade + " precisa de cuidados!");
			}else {
				System.out.println(cidade + " é uma boa cidade.");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
