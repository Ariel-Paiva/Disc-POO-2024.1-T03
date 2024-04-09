package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int vet[];
		vet = new int [8];
		//vet é um vetor com 8 espaços, suas posições vão de 0 até 7.
		int i, j, z, aux;
		Scanner escaneador = new Scanner (System.in);
		i=0;
		while(i<8) {
			System.out.println("Digite "+ (i+1)+"° elemento da lista.   ");
			aux = escaneador.nextInt();
			j =0;
			while(j<i && vet[j]<aux) {
				j +=1;
			}
			z=i;
			while (z>=j+1) {
				vet[z]= vet[z-1];
				z-=1;
			}
			vet[j]=aux;
			i+=1;
		}
		for (i=0; i<8; i++) {
			System.out.println(vet[i]);
		}

	}

}
