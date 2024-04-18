package br.edu.Pares;

public class Pares {
	public static int pares(int v1[], int v2[]) {
		int i, r, cont;
		cont = 1;
		for (i=0; i<8; i++) {
			r = (v1[i]%2);
			if (r==0) {
				v2[cont]=v1[i];
				cont++;
			}
		}
		return cont;
	}

}
