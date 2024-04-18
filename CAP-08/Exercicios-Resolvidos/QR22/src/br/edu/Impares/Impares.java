package br.edu.Impares;

public class Impares {
	public static int impares(int v1[], int v2[]) {
		int i, r, cont;
		cont = 1;
		for(i=0; i<8; i++) {
			r = v1[i]%2;
			if (r==1) {
				v2[cont] = v1[i];
				cont++;
			}
		}
		return cont;
	}
}
