package pacote;

import javax.swing.JOptionPane;

public class Bhaskara {
	public static void main(String[]args) {
		double a = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero : "));
		double b = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero : "));
		double c = Double.parseDouble(JOptionPane.showInputDialog("Digite um n�mero : "));
		double delta = (Math.pow(b, 2)) - 4 * a * c;
		double menos = - (b) + Math.sqrt(delta) / 2 * a; 
		double mais = - (b) - Math.sqrt(delta) / 2 * a;
		if (delta < 0 ) {
			JOptionPane.showMessageDialog(null, "O delta � negativo logo a conta n�o pode continuar" +delta);
		}else {
			JOptionPane.showMessageDialog(null, "O delta � positivo" +delta);
			JOptionPane.showMessageDialog(null, "O x1 � : " +menos + "\n O x2 � :" +mais );
		}
		
		
	
	}

}
