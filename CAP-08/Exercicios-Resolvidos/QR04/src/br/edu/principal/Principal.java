package br.edu.principal;

import java.util.Scanner;

public class Principal {
    public static void transformacao(double seg) {
    	double h, m, s, r;
    	h = seg / 3600.0;
    	r = seg % 3600.0;
    	m = seg / 60.0;
    	s = r % 60.0;
    	System.out.println("Horas: " + h + "\nMinutos: " + m + "\nSegundos: " + s);
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor em segundos: ");
		double seg = sc.nextDouble();
		transformacao(seg);
	}

}
