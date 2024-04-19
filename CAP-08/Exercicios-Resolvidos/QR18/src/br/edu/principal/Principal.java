package br.edu.principal;

import java.util.Scanner;

public class Principal {
    
	static Scanner sc = new Scanner(System.in);
	
	public static int menorE(int[][] m) {
	    int mE = m[0][5]; 
	    int j = 4;
	    
	    for (int i = 1; i < 6; i++) {
	        if (m[i][j] < mE) {
	            mE = m[i][j];
	        }
	        j--;
	    }

	    return mE;
	}
	
	public static void main(String[] args) {
		
        int[][] mat = new int[6][6];
        
        System.out.println("Preencha a matriz com números inteiros:\n");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
            	System.out.println("Digite o número correspondente à "+(j+1)+"ª coluna da "+(i+1)+"ª linha da matriz.");
                mat[i][j] = sc.nextInt();
            }
        }

        int menor = menorE(mat);
        System.out.println("O menor elemento da diagonal secundária da matriz é: "+menor);
    }
    
}
