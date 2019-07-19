package pacote;

import javax.swing.JOptionPane;

public class Execucao_03 {
	public static void main(String[]args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		if(a < b && a < c && b < c) {
			System.out.println("" +c + "\n" +b + "\n" +a );
		}else if(b < a && b < c && a < c) {
			System.out.println("" +c + "\n" +a + "\n" +b);
		}else if(c < a && c < b && a < b) {
			System.out.println("" +b + "\n" +a + "\n" +c);
		}else if(a < b && a < c && c < b) {
			System.out.println("" +b + "\n" +c + "\n" +a);
		}else if(c < a && c < b && b < a) {
			System.out.println("" +a + "\n" +b + "\n" +c);
		}else {
			System.out.println("" +a + "\n" +c + "\n" +b);	
		}

	}
}
