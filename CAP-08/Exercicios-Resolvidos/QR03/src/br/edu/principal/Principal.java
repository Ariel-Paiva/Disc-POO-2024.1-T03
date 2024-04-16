package br.edu.principal;

import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);
	
	public static int somadiv(int a, int b, int c) {
		
		int soma = 0;
		for (int i = b; i <= c; i++) {
            if (i % a == 0) {
                soma += i;
            }
        }
        return soma;

	}
	
	public static void main(String[] args) {
		
		int a, b, c;
		do {
			System.out.println("Digite o valor de A.");
			a = sc.nextInt();
		} while (a <= 1);
		
		System.out.println("Digite o valor de B.");
		b = sc.nextInt();
		System.out.println("Digite o valor de C.");
		c = sc.nextInt();
		
		int result = somadiv(a,b,c);
		System.out.println("A soma dos inteiros é: "+result);
	}

}
