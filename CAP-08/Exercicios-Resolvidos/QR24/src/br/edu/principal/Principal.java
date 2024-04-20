package br.edu.principal;

import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);
    
	public static double calculo(double n1, double n2, String simbolo) {
    	double result = 0.0;
    	
    	if (simbolo.equals("+")) {
    		result = n1 + n2;
    	} else {
    		result = n1 * n2;
    	}
		
		return result;
    }
	
	public static void main(String[] args) {
		double num1, num2, res;
		String op = "";
		
		System.out.println("Digite o 1º número: ");
		num1 = sc.nextDouble();
		System.out.println("Digite o 2º número: ");
		num2 = sc.nextDouble();
		
		do {
			System.out.println("Digite (+) para somar e (*) para mutiplicar: ");
			op = sc.next();
		} while (!(op.equals("+") || op.equals("*")));
		
		res = calculo(num1, num2, op);
		
        System.out.println("\nO resultado da operação foi: " + res);
	}

}
