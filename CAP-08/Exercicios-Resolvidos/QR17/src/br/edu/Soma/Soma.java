package br.edu.Soma;

public class Soma {
	public static int soma_matriz(int[][] m) {
		int i, j, soma;
		soma = 0;
		for (i=0; i<5; i++) {
			for (j=0; j<5; j++) {
				soma = soma + m[i][j];
			}
		}
		return soma;
	}	
}
