package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int vet[];
		vet = new int[10];
		int i, j, aux;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Preencha um vetor com dez números inteiros:");
		for(i = 0; i < 10; i++) {
			vet[i] = sc.nextInt();
		}
		for(i = 0; i < 10; i++) {
			for(j = 0; j < 9; j++) {
				if(vet[j] < vet[j+1]) {
					aux = vet[j];
					vet[j] = vet[j+1];
					vet[j+1] = aux;
				}
			}
		}
		System.out.println("Vetor resultante de uma ordenação decrescente:");
		for(i = 0; i < 10; i++) {
			System.out.print(vet[i] + " ");
		}

	}

}