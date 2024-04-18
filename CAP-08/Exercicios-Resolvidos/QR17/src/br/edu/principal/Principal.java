package br.edu.principal;

import br.edu.Soma.*;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int x, y, s;
		int matriz[][]=new int [5][5];//matriz quadrada 5x5.
		Scanner sc = new Scanner (System.in);
		for (x=0; x<5; x++) {
			for (y=0; y<5; y++) {
				System.out.println("Digite o elemento que compõe a coordenada de linha "+(x+1)+" e coluna "+(y+1)+" da matriz 5x5: ");
				matriz[x][y]=sc.nextInt();
			}
		}
		s = Soma.soma_matriz(matriz);
		System.out.println("A soma dos elementos dessa matriz é: "+ s);
	}

}
