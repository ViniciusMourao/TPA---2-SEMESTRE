package pacote;

import javax.swing.JOptionPane;

public class Execucao_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int d = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int e = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int m = (a + b + c + d + e) / 5;
		
		JOptionPane.showMessageDialog(null, "Sua m�dia � :" +m);
		
		
		

	}

}
