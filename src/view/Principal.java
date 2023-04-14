package view;

import javax.swing.JOptionPane;

import controller.ConverteController;

public class Principal {

	public static void main(String[] args) {
		ConverteController c = new ConverteController();
		double n;
		n=Double.parseDouble(JOptionPane.showInputDialog("Digite um numero até 1000"));
		while(n>1000) {
			n=Double.parseDouble(JOptionPane.showInputDialog("Numero invalido, digite um numero até 1000"));
		}
		String mostra =c.dectobin((int)n);
		System.out.println(mostra);
	}

}
