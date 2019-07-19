package pacote;

import javax.swing.JOptionPane;

public class Execucao_02 {
	public static int num1(int x) {
		return x;
	}
	public static int num2(int y) {
		return y;
	}
	public static int num3(int z) {
		return z;
	}

	
	public static void main(String[]args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		
		if(a > b && a > c && b > c) {
			System.out.println("" +num3(c)  + "\n" +num2(b) + "\n" +num1(a));
		}else if (b > a && b > c && a > c) {
			System.out.println("" +num3(c) + "\n" +num1(a) + "\n" +num2(b));
		}else if (c > a && c > b && a > b) {
			System.out.println("" +num2(b) + "\n" +num1(a) + "\n" +num3(c));
		}else if (a > b && a > c && c > b) {
			System.out.println("" +num2(b) + "\n" +num3(c) + "\n" +num1(a));
		}else if (c > a && c > b && b > a) {
			System.out.println("" +num1(a) + "\n" +num2(b) + "\n" +num3(c));
		}else {
			System.out.println("" +num1(a) + "\n" +num3(c) + "\n" +num2(b));
		}
		
		}
	}
				
	

