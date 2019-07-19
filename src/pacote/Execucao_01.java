package pacote;

import javax.swing.JOptionPane;

public class Execucao_01 {
	
	public static String parOuImpar(int i) {
		String b;
		
		if( i % 2 == 0) {
			b = "par";
		}else {
			b = "impar";
		}
		return b;
	}
		public static void main(String[]args) {
			int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
			
			JOptionPane.showMessageDialog(null, " O número " + a + " é " + parOuImpar(a));
		}
}
