package br.edu.principal;

import java.util.Scanner;

import br.edu.verificar.*;

public class Principal {

	public static void main(String[] args) {
		 double num, x;
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Digite o número, por favor: ");
		 num = sc.nextDouble();
		 x = Verificar.verifica(num);
		 if (x==1) {
			//Infelizmente o próprio código do Livro está errado, pois assume 0 como positivo, o certo seria não negativo.
			 System.out.println("Número positivo.");
		 }else {
			 System.out.println("Número negativo.");
		 }
		 

	}

}
