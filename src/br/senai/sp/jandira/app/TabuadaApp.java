package br.senai.sp.jandira.app;

import br.senai.sp.jandira.model.Tabuada;

public class TabuadaApp {

	public static void main(String[] args) {
		
		Tabuada x = new Tabuada();
		
		x.setMultiplicador(10);
		x.setMultiplicando(8);
		
		String tabuadaX[] = x.calcular();
		
		for (int i = 0; i < tabuadaX.length; i++) {			
			System.out.println(tabuadaX[i]);
		}
		

	}

}
