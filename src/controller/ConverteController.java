package controller;

import br.com.KauanPaulino.pilhaint.Pilha;

public class ConverteController {
	
	public ConverteController() {
		// TODO Auto-generated constructor stub
	}
	public String dectobin(int decimal) {
		Pilha p = new Pilha();
		String mostra="";
		int tamanho;
		while(decimal/2!=0) {
			if(decimal%2==0) {
				p.push(0);
			}
			if(decimal%2==1) {
				p.push(1);
			}
			decimal /=2;
		}
		p.push(decimal);
		tamanho=p.size();
		for(int i=0;i<tamanho;i++) {
			try {
				int valor = p.top();
				mostra += valor;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				p.pop();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return mostra;

	}
}
