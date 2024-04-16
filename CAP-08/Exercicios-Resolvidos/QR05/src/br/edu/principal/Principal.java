package br.edu.principal;

import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);
	
	public static double calculo_reajuste(double PA, double PN) {
		double result;
		
		result = (100. * PN - 100. * PA) / PA;
		
		return result;
	}
	
	public static void main(String[] args) {	
		double precoantigo, precoatual, acrescimo;
		
		System.out.println("Informe o preço antigo do produto: ");
		precoantigo = sc.nextDouble();
		System.out.println("Informe o preço atual do produto: ");
		precoatual = sc.nextDouble();
		
		acrescimo = calculo_reajuste(precoantigo, precoatual);
		
		System.out.println("O acréscimo foi de: " + acrescimo + "%");
	}

}
