package br.edu.principal;

import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);
    
	public static void maior_menor() {
    	int i, num, maior = 0, menor = 0;
    	for (i = 0; i < 5; i++) {
    		System.out.println("Digite o " + (i + 1) + "º número: ");
    		num = sc.nextInt();
    		
    		if (i == 0) {
    			maior = num;
    			menor = num;
    		} else {
    			if (num > maior) {
    				maior = num;
    			}
    			if (num < menor) {
    				menor = num;
    			}
    		}
    	}
    	System.out.println("\nO maior número digitado foi: " + maior);
    	System.out.println("O menor número digitado foi: " + menor);
    }
	
	public static void main(String[] args) {
		maior_menor();
	}

}
