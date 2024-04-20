package br.edu.principal;

import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);
    
	public static void mutiplica_matriz(int m[][]) {
    	int i, j, v;
    	
    	for (i = 0; i < 6; i++) {
    		v = m[i][i];
			for (j = 0; j < 6; j++) {
				m[i][j] = m[i][j] * v;
			}
		}
    }
	
	public static void main(String[] args) {
		int x, y, matriz[][] = new int[6][6];
		
		for (x = 0; x < 6; x++) {
			for (y = 0; y < 6; y++) {
				System.out.println("Digite o valor ("+(x + 1)+","+(y + 1)+") da matriz: ");
				matriz[x][y] = sc.nextInt();
			}
		}
		
		mutiplica_matriz(matriz);
		
		System.out.println("\nMatriz alterada:\n");
		for (x = 0; x < 6; x++) {
			for (y = 0; y < 6; y++) {
				System.out.print(matriz[x][y] + " ");
			}
			System.out.println("");
		}
	}

}
