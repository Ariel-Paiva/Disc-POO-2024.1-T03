package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int a[] = new int[10], repetidos[] = new int[10], vezes[] = new int[10],
				i, j, qtde, cont, cont_r; 
		Scanner sc = new Scanner(System.in);
		
		for (i = 0; i < 10; i++) {
			System.out.println("Número " + (i+1) + " do vetor A: ");
			a[i] = sc.nextInt();
		}
		cont_r = 0;
		for (i = 0; i < 10; i++) {
		    qtde = 0;
		    for (j = 0; j < 10; j++) {
		    	if (i != j) {
		    		if (a[i] == a[j]) {
		    			qtde = qtde + 1;
		    		}
		    	}
		    }
		    
		    if (qtde > 0) {
		    	cont = 0;
		    	
		    	while (cont < cont_r && (a[i] != repetidos[cont])) {
		    		cont = cont + 1;
		    	}
		    	
		    	if (cont == cont_r) {
		    		repetidos[cont_r] = a[i];
		    		vezes[cont_r] = (qtde+1);
		    		cont_r = cont_r + 1;
		    	}
		    }
		}
		System.out.println("");
		for (i = 0; i < cont_r; i++) {
			System.out.println("- O número " + repetidos[i] + " apareceu " + vezes[i] + " vezes");
		}
	}

}
