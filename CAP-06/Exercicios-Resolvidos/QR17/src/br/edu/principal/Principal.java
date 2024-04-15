package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num[]=new int [6];
		int i, soma, qtde;
		boolean achou;
		Scanner sc = new Scanner (System.in);
		for (i=0; i<=5; i++) {
			System.out.println("Digite o número:");
			num[i]= sc.nextInt();
		}
		soma=0;
		achou = false;
		
		System.out.println("\n");
		
		//Testando os pares:
		for (i=0; i<=5; i++) {
			if (num[i]%2 == 0) {
				achou = true;
				System.out.println(num [i] +" na posição "+ i+ " é par.");
				soma+=num[i];
			}
		}
		if (achou == false) {
			System.out.println("Nenhum número par foi digitado.");
		}else {
			System.out.println("Soma dos pares: "+soma);
		}
		
		System.out.println("\n");
		
		qtde = 0;
		achou = false;
		
		//Testando os ímpares:
		for (i=0; i<=5; i++) {
			if (num[i]%2!=0) {
				achou = true;
				System.out.println(num[i]+" na posição "+i+" é impar.");
				qtde +=1;
			}
		}
		if (achou == false){
			System.out.println("Nenhum número ímpar foi digitado.");
		}else {
			System.out.println("Quantidade de ímpares: "+qtde);
		}
	}

}
