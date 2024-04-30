package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void multiplicacao(int n) {
		int i, j;		
		for(i = 0; i <= n; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int num;
		
		do {
			System.out.println("Digite um número entre 1 e 9:");
			num = sc.nextInt();
		}while((num < 1) || (num > 9));
		
		multiplicacao(num);

	}

}