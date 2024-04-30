package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int qtd[];
		int preco[];
		qtd = new int[10];
		preco = new int[10];
		int i, tot_geral, tot_vend, comissao, maior, ind;
		Scanner sc = new Scanner(System.in);
		
		tot_geral = 0;
		
		for(i = 0; i < 10; i++) {
			System.out.println("Digite a quantidade de objetos vendidos:");
			qtd[i] = sc.nextInt();
			System.out.println("Digite o preço de cada objeto vendido:");
			preco[i] = sc.nextInt();
		}
		for(i = 0; i < 10; i++) {
			tot_vend = qtd[i] * preco[i];
			
			System.out.println("Quantidade vendida:");
			System.out.println(qtd[i] + "\n");
			System.out.println("Valor unitário:");
			System.out.println(preco[i] + "\n");
			System.out.println("Valor total de cada objeto:");
			System.out.println(tot_vend + "\n");
			
			tot_geral = tot_geral + tot_vend;
		}
		comissao = tot_geral * 5 /100;
		
		System.out.println("Valor geral das vendas:");
		System.out.println(tot_geral + "\n");
		System.out.println("Valor da comissão que será paga ao vendedor:");
		System.out.println(comissao + "\n");
		
		maior = qtd[1];
		ind = 1;
		
		for(i = 0; i < 10; i++) {
			if(qtd[i] > maior) {
				maior = qtd[i];
				ind = i;
			}
		}
		System.out.println("Valor do objeto mais vendido:");
		System.out.println(preco[ind] + "\n");
		System.out.println("Posição no vetor:");
		System.out.println(ind + "\n");
	}

}