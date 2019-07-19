package pacote;

import javax.swing.JOptionPane;

public class Execucao {
	public static int soma (int x, int y) {
		return x + y;
	}
	public static int subtração (int x, int y) {
		return x - y;
	}
	public static int multiplicação (int x, int y) {
		return x * y;
	}
	public static int divisão (int x, int y) {
		return x / y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 1: "));
	int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o número 2: "));
		
	System.out.println("Total: " +soma(a,b));
	System.out.println("Total: "+subtração(a,b));
	System.out.println("Total: " +multiplicação(a,b));
	System.out.println("Total: "+divisão(a,b));
	

	}

}
