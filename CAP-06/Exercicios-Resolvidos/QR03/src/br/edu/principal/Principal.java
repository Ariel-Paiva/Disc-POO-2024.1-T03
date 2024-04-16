package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vet1 = new int[10];
		int[] vet2 = new int[10];
		int[] vetr = new int[20];
		int i,j;
		byte count = 1;
		j = 0;
		
		System.out.println("Preencha os vetores.\n");
        for (i = 0; i < 10; i++) {

        	System.out.println("Preencha o valor do "+count+"º endereço do primeiro vetor com um número inteiro.");
            vet1[i] = sc.nextInt();
            vetr[j] = vet1[i];
            j += 1;
            
            System.out.println("Preencha o valor do "+count+"º endereço do segundo vetor com um número inteiro.");
            vet2[i] = sc.nextInt();
            vetr[j] = vet2[i];
            j += 1;
            count ++;
        }
        
        System.out.println("O vetor resultante é: ");
        for ( i = 0; i < 20; i++) {
            System.out.print(vetr[i] + " ");
        }
    
		
	}

}
