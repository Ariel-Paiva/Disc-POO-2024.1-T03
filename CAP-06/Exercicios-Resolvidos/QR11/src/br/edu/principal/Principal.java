package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int temp[];
		temp = new int[12];
		int cont, maior = 0 , menor = 0, maior_mes = 0, menor_mes = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura média de cada mês do ano:");
		for(cont = 0; cont < 12; cont++) {
			temp[cont] = sc.nextInt();
			
			if(cont == 0) {
				maior = temp[cont];
				menor = temp[cont];
				maior_mes = cont;
				menor_mes = cont;
			}else {
				if(temp[cont] > maior) {
					maior = temp[cont];
					maior_mes = cont;
				}
				if(temp[cont] < menor) {
					menor = temp[cont];
					menor_mes = cont;
				}
			}
		}
		
		System.out.print("A maior temperatura do ano foi " + maior + " em ");
		
		if(maior_mes == 0) {
			System.out.println("JANEIRO");
		}
		if(maior_mes == 1) {
			System.out.println("FEVEREIO");
		}
		if(maior_mes == 2) {
			System.out.println("MARÇO");
		}
		if(maior_mes == 3) {
			System.out.println("ABRIL");
		}
		if(maior_mes == 4) {
			System.out.println("MAIO");
		}
		if(maior_mes == 5) {
			System.out.println("JUNHO");
		}
		if(maior_mes == 6) {
			System.out.println("JULHO");
		}
		if(maior_mes == 7) {
			System.out.println("AGOSTO");
		}
		if(maior_mes == 8) {
			System.out.println("SETEMBRO");
		}
		if(maior_mes == 9) {
			System.out.println("OUTUBRO");
		}
		if(maior_mes == 10) {
			System.out.println("NOVEMBRO");
		}
		if(maior_mes == 11) {
			System.out.println("DEZEMBRO");
		}
		
		System.out.print("A menor temperatura do ano foi " + menor + " em ");
		
		if(menor_mes == 0) {
			System.out.println("JANEIRO");
		}
		if(menor_mes == 1) {
			System.out.println("FEVEREIO");
		}
		if(menor_mes == 2) {
			System.out.println("MARÇO");
		}
		if(menor_mes == 3) {
			System.out.println("ABRIL");
		}
		if(menor_mes == 4) {
			System.out.println("MAIO");
		}
		if(menor_mes == 5) {
			System.out.println("JUNHO");
		}
		if(menor_mes == 6) {
			System.out.println("JULHO");
		}
		if(menor_mes == 7) {
			System.out.println("AGOSTO");
		}
		if(menor_mes == 8) {
			System.out.println("SETEMBRO");
		}
		if(menor_mes == 9) {
			System.out.println("OUTUBRO");
		}
		if(menor_mes == 10) {
			System.out.println("NOVEMBRO");
		}
		if(menor_mes == 11) {
			System.out.println("DEZEMBRO");
		}

	}

}