package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int[] vet1 = new int[5];
		int[] vet2 = new int[5];
		int[] vetr = new int[10];
		int i,j, aux;
		j = 0;
		byte count = 1;

		System.out.println("Preencha os vetores.\n");
        for (i = 0; i < 5; i++) {

        	System.out.println("Preencha o valor do "+count+"º endereço do primeiro vetor com um número inteiro.");
            vet1[i] = sc.nextInt();
            vetr[j] = vet1[i];
            j++;
      
            System.out.println("Preencha o valor do "+count+"º endereço do segundo vetor com um número inteiro.");
            vet2[i] = sc.nextInt();
            vetr[j] = vet2[i];
            j++;
            count ++;

        }
        
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 4; j++) {
                if (vet1[j] > vet1[j + 1]) {
                    aux = vet1[j];
                    vet1[j] = vet1[j + 1];
                    vet1[j + 1] = aux;
                }
            }
        }
        
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 4; j++) {
                if (vet2[j] > vet2[j + 1]) {
                    aux = vet2[j];
                    vet2[j] = vet2[j + 1];
                    vet2[j + 1] = aux;
                }
            }
        }
        
        for (i = 0; i < 10; i++) {
            for (int z = 0; z < 9; z++) {
                if (vetr[z] > vetr[z + 1]) {
                    aux = vetr[z];
                    vetr[z] = vetr[z + 1];
                    vetr[z + 1] = aux;
                }
            }
        }
        
        System.out.println("Primeiro vetor ordenado:");
        for (i = 0; i < 5; i++) {
            System.out.print(vet1[i] + " ");
        }
        System.out.println();

        System.out.println("Segundo vetor ordenado:");
        for (i = 0; i < 5; i++) {
            System.out.print(vet2[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor resultante ordenado:");
        for (i = 0; i < 10; i++) {
            System.out.print(vetr[i] + " ");
        }
        System.out.println();
        
	}

}