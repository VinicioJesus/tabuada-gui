package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Tabuada {
	
	private int multiplicando;
	private int multiplicador;
	
	Scanner leitor = new Scanner (System.in);
	
	public int getMultiplicando() {
		return multiplicando;
	}
	
	public void setMultiplicando(int multiplicando) {
		this.multiplicando = multiplicando;
	}
	
	public double getMultiplicador() {
		return multiplicador;
	}
	
	public void setMultiplicador(int multiplicador) {
		this.multiplicador = multiplicador;
	}
	
	//criando um Vetor/Array, matriz da tabuada.
	public String[] calcular() {
		
		String t[] = new String[multiplicador + 1];
		
		for (int i = 0; i <= multiplicador; i++) {
			int produto = multiplicando * i;
			t[i] = multiplicando + " X " + " = " + i + produto;
		}
		// quem chamar o calcular vai receber como resposta o Return t
		return t;
	}
	
	
}
