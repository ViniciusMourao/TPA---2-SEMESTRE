package pacote;

import javax.swing.JOptionPane;

public class Bhaskara {
	public static void main(String[]args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("Digite um número : "));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Digite um número : "));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Digite um número : "));
		double delta = (Math.pow(b, 2)) - 4 * a * c;
		double menos = - (b) + Math.sqrt(delta) / 2 * a; 
		double mais = - (b) - Math.sqrt(delta) / 2 * a;
		if (delta < 0 ) {
			JOptionPane.showMessageDialog(null, "O delta é negativo logo a conta não pode continuar" +delta);
		}else {
			JOptionPane.showMessageDialog(null, "O delta é positivo" +delta);
			JOptionPane.showMessageDialog(null, "O x1 é : " +menos + "\n O x2 é :" +mais );
		}
		
		
	
	}

}
