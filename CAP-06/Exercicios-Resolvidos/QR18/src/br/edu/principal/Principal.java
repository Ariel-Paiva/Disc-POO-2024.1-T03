package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] dado = new int[20];
        int[] f = new int[6]; 
        
        System.out.println("Sorteio dos números (digite um número sorteado de 1 a 6 do dado em cada rodada).\n");
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o número sorteado na rodada " + (i + 1)+": ");
            int n = sc.nextInt();
            while (n < 1 || n > 6) {
                System.out.println("Número inválido (digite novamente de 1 a 6).");
                n = sc.nextInt();
            }
            dado[i] = n;
            f[n - 1]++; 
        }
        
        System.out.println("Os números sorteados foram:");
        for (int i = 0; i < 20; i++) {
            System.out.print(dado[i] + " ");
        }
        System.out.println("\n");
        
        for (int i = 0; i < 6; i++) {
        	if (f[i] == 1) {
                System.out.println("O número " + (i + 1) + " foi sorteado " + f[i] + " vez.");

        	}
            System.out.println("O número " + (i + 1) + " foi sorteado " + f[i] + " vezes.");
        }
        
    }
    
}