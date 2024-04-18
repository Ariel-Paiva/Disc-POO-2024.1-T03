package br.edu.principal;
import br.edu.Pares.*;
import br.edu.Impares.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int vet1[]=new int [8];
		int vet2[]=new int [8];
		int vet3[]=new int [8];
		int i, cont1, cont2;
		Scanner sc = new Scanner(System.in);
		for (i=0; i<8; i++) {
			System.out.println("Digite a posição "+i+ " do vetor 1: ");
			vet1[i]=sc.nextInt();
		}
		System.out.println("Os pares são: \n");
		cont1 = Pares.pares(vet1, vet2);
		if (cont1 == 1) {
			System.out.println("Nenhum par foi digitado");
		}else {
			for (i=0; i<=cont1-1; i++) {
				System.out.println(vet2[i]);
			}
		}
		System.out.println("\n");
		System.out.println("Os ímpares são: \n");
		cont2 = Impares.impares(vet1, vet3);
		if (cont2 == 1) {
			System.out.println("Nenhum ímpar foi digitado.");
		}else {
			for (i=0; i<= cont2-1; i++) {
				System.out.println(vet3[i]);
			}
		}
	}

}
