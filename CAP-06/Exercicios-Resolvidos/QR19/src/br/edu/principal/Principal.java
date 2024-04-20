package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String vet1[] = new String[20], vet2[] = new String[20], aux;
		int i, j;
		Scanner sc = new Scanner(System.in);
		
		for (i = 0; i < 20; i++) {
			System.out.println("Valor " + (i+1) + " do vetor 1: ");
			vet1[i] = sc.next();
		}
		for (i = 0; i < 20; i++) {
			System.out.println("Valor " + (i+1) + " do vetor 2: ");
			vet2[i] = sc.next();
		}
		System.out.println("\nVetor 1 - Antes da troca");
		for (i = 0; i < 20; i++) {
			System.out.print(vet1[i] + " ");
		}
		System.out.println("");
		System.out.println("\nVetor 2 - Antes da troca");
		for (i = 0; i < 20; i++) {
			System.out.print(vet2[i] + " ");
		}
		j = 20 - 1;
		for (i = 0; i < 20; i++) {
			aux = vet1[i];
			vet1[i] = vet2[j];
			vet2[j] = aux;
			j = j - 1;
		}
		System.out.println("");
		System.out.println("\nVetor 1 - Depois da troca");
		for (i = 0; i < 20; i++) {
			System.out.print(vet1[i] + " ");
		}
		System.out.println("");
		System.out.println("\nVetor 2 - Depois da troca");
		for (i = 0; i < 20; i++) {
			System.out.print(vet2[i] + " ");
		}
	}

}
