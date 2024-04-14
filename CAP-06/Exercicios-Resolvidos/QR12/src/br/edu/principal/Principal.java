package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int consumo[] = new int[5];
		int menor_cons = 0, menor_vei = 0, valor, i;
		String veiculo[] = new String [5];
		Scanner sc = new Scanner (System.in);
		for (i=0; i<=4; i++) {
			System.out.println("Digite o veículo de número "+(i+1)+":");
			veiculo[i] = sc.next();
		}
		for (i=0; i<=4; i++) {
			System.out.println("Digite o consumo do veículo de número "+(i+1)+", em quilômetros por litro:");
			consumo[i] = sc.nextInt();
			valor = 1000/consumo[i];
			System.out.println("O veículo " + veiculo[i] + " consome "+ valor + " litro(s) de combustível para percorrer 1000 Km");
			if (i==0) {
				menor_cons=consumo[i];
				menor_vei=i;
			}else {
				if (consumo[i]>menor_cons) {
					menor_cons = consumo[i];
					menor_vei = i;
				}
			}
			System.out.println("\n");
		}
		System.out.println("O veículo mais econômico é o "+ veiculo[menor_vei]+", pois ele faz "+(consumo[menor_vei])+"km/L.");

	}

}
