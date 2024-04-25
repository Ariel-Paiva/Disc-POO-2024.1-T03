package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static double media_aritmetica(int [][] m) {
		int i, j, cont, soma;
		double media;
		
		soma = 0;
		cont = 0;
		
		for (i = 2; i <= 12; i++) {
			for (j = 12; j >= (14 - i); j--) {
				soma += m[i-1][j-1];
				cont+=1;
			}
		}
		
		media = soma/cont;
		return media;
	}
	
	public static void main(String[] args) {
		int x, y;
		int[][] matriz = new int[12][12];
		double m;
		
		Scanner sc = new Scanner(System.in);
		
		for (x = 0; x < 12; x++) {
			for (y = 0; y < 12; y++) {
				System.out.println("Digite um número para ["+x+","+y+"]: ");
				matriz[x][y] = sc.nextInt();
			}
		}
		
		m = media_aritmetica(matriz);
		System.out.println("A média é: " + m);
	}

}
