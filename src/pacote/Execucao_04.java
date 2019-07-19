package pacote;

import javax.swing.JOptionPane;

public class Execucao_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int d = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int e = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int m = (a + b + c + d + e) / 5;
		
		JOptionPane.showMessageDialog(null, "Sua média é :" +m);
		
		
		

	}

}
