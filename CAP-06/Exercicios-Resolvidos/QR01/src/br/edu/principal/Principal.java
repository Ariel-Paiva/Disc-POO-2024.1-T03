package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int num[];
		num = new int[9];
		Scanner sc = new Scanner (System.in);
		int i, j, cont;
		for (i=0; i<9; i++) {
			System.out.println("Digite um n�mero.");
			num[i]=sc.nextInt();
		}
		for (i=0; i<9; i++) {
			cont = 0;
			for (j=1; j<=num[i];j++) {
				if (num[i]%j == 0) {
					cont+=1;
				}
			}
			if (cont<=2) {
				if (num[i]==1) {
					continue;
				}
				else {
					System.out.println("O n�mero �: "+num[i]);
					System.out.println("A posi��o do n�mero � :"+ i);	
				}
			}
		}
	}

}
