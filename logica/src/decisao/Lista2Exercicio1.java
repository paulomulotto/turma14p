package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Diarias"));
		float taxa = 8;
		if (diarias>15) {
			taxa = (float) 5.5;
		}else if (diarias==15){
			taxa = 6;
		}
		System.out.println("Total: " + ((80+taxa)*diarias));
		
		
		
		
		


	}

}
