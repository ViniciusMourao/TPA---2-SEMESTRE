package pacote;

import javax.swing.JOptionPane;

public class Execucao {
	public static int soma (int x, int y) {
		return x + y;
	}
	public static int subtra��o (int x, int y) {
		return x - y;
	}
	public static int multiplica��o (int x, int y) {
		return x * y;
	}
	public static int divis�o (int x, int y) {
		return x / y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero 1: "));
	int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero 2: "));
		
	System.out.println("Total: " +soma(a,b));
	System.out.println("Total: "+subtra��o(a,b));
	System.out.println("Total: " +multiplica��o(a,b));
	System.out.println("Total: "+divis�o(a,b));
	

	}

}
