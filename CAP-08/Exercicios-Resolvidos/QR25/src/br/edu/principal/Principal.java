package br.edu.principal;

import java.util.Scanner;

public class Principal {

	static Scanner sc = new Scanner(System.in);
	
	public static void substituicao(int[] vet) {
		int z;
		
		for (z = 0; z < 25; z++) {
			if (vet[z] < 0)
				vet[z] = 0;
		}
	}
	
	public static void main(String[] args) {
		int[] vetor = new int[25];
		int i;
		
		for (i = 0; i < 25; i++) {
			System.out.println("Digite um número: ");
			vetor[i] = sc.nextInt();
		}
		
		substituicao(vetor);
		System.out.println("Vetor após substituição:");
		
		for (i = 0; i < 25; i++) {
			System.out.println(vetor[i]);
		}
	}

}
