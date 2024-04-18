package br.edu.principal;

import br.edu.funcoesbasicas.*;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		double nota1, nota2, nota3, m;
		String letra;
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite sua nota 1: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite sua nota 2: ");
		nota2 = sc.nextDouble();
		System.out.println("Digite sua nota 3: ");
		nota3 = sc.nextDouble();
		do {
			System.out.println("Digite a letra: ");
			letra = sc.next();
		}while (!letra.equals("A") && !letra.equals("P"));
		m = FuncoesBasicas.calcula_media(nota1, nota2, nota3, letra);
		if (letra.equals("A")) {
			System.out.println("A média aritimética obtida é :"+m);
		}else {
			System.out.println("A média ponderada obtida é : "+m);
		}
	}

}
