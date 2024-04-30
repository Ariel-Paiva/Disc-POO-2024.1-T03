package br.edu.principal;

import java.util.Scanner;

public class Principal {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int somar(int num1, int num2) {
		int i, s;
		s = 0;
		
		for(i = num1 + 1; i <= num2 - 1; i++) {
			s = s + i;
		}
		return s;
	}
	public static void main(String[] args) {
		int num1, num2, s;
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextInt();
		s = somar(num1, num2);
		
		System.out.println("Soma dos números inteiros entre " + num1 + " e " + num2 + ":");
		System.out.println(s);
	}

}