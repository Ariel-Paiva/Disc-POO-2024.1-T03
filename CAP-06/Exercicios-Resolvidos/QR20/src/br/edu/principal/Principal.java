package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int[] vet = new int[5];
		int i, cod;
		Scanner sc = new Scanner(System.in);
		
		for (i = 0; i < 5; i++) {
			System.out.println("Digite um número: ");
			vet[i] = sc.nextInt(); 
		}
		
		System.out.println("\n0 = finalizar programa;\n1 = mostrar o vetor na ordem direta;\n2 = mostrar o vetor na ordem inversa\nDigite a opção:");
		cod = sc.nextInt();
		System.out.println("");
		
		if (cod == 0)
			System.out.println("fim");
		else if (cod == 1) {
			for (i = 0; i < 5; i++) {
				System.out.println(vet[i]);
			}
		} else if (cod == 2) {
			for (i = 4; i >= 0; i--) {
				System.out.println(vet[i]);
			}
		} else if (cod < 0 || cod > 2)
			System.out.println("Código inválido.");
	}

}
