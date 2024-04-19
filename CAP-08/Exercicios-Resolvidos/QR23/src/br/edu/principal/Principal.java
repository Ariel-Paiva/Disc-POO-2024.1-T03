package br.edu.principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Principal {
    
    public static void vet(double[][] matriz, double[] vetor) {
        int a = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                vetor[a] = matriz[i][j];
                a++;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat comma = new DecimalFormat("0.00");

        double[][] mat = new double[3][4];
        double[] vet1 = new double[12];
        

        System.out.println("Preencha a matriz:\n");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
            	System.out.println("Digite o número correspondente à "+(j+1)+"ª coluna da "+(i+1)+"ª linha da matriz.");
                mat[i][j] = scanner.nextDouble();
            }
        }
        
        vet(mat, vet1);
        
        System.out.println("O vetor gerado através dos valores da matriz foi:");
        for (int i = 0; i < 12; i++) {
            System.out.println(comma.format(vet1[i]));
        }
        
    }
}