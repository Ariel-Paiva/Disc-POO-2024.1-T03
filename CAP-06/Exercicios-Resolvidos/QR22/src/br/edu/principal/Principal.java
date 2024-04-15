package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int conta[]=new int [10];
		double saldo[]= new double [10];
		int i, j, codigo, op;
		double valor;
		double soma;
		boolean achou;
		Scanner sc = new Scanner (System.in);
		
		
		for (i=0; i<=9; i++) {
			achou = false;
			do {
				System.out.println("Digite o número da conta "+i+".");
				conta[i] = sc.nextInt();
				for (j=0; j<=(i); j++) {
					if (conta[i]==conta[j]) {
						achou = true;
					}
				}
			}while(achou == false);
			System.out.println("Digite o saldo da conta "+ i+ ".");
			saldo[i] = sc.nextDouble();
		}
		do {
			System.out.println("Digite a opção desejada: \n");
			System.out.println("1. Efetuar depósito.");
			System.out.println("2. Efetuar saque.");
			System.out.println("3. Consultar o ativo bancário, ou seja, o somatório dos saldos de todos os clientes");
			System.out.println("4. Finalizar o programa");
			op = sc.nextInt();
			
			achou = false;
			
			if (op==1) {
				System.out.println("Digite o código da sua conta.");
				codigo = sc.nextInt();
				System.out.println("Digite o valor a ser depositado.");
				valor = sc.nextDouble();
				for (i=0; i<=9; i++) {
					if (codigo == conta[i]) {
						saldo[i]+=valor;
						achou = true;
						System.out.println("Depósito efetuado!");
					}
				}
				if (achou == false) {
					System.out.println("Conta não cadastrada.");
				}
			}
			
			
				
			if (op==2) {
				System.out.println("Digite o código da sua conta.");
				codigo = sc.nextInt();
				System.out.println("Digite o valor a ser sacado.");
				valor = sc.nextDouble();
				for (i=0; i<=9; i++) {
					if (codigo == conta[i]) {
						if (saldo[i]<valor) {
							System.out.println("Saldo insuficiente.");
						}
					}else {
						saldo[i]-=valor;
						System.out.println("Saque efetuado.");
					}
					achou = true;
				}
				if (achou == false) {
					System.out.println("Conta não cadastrada.");
				}
			}
			
				
				
			if (op==3) {
				soma = 0;
				for (i=0; i<=9; i++) {
					soma+=saldo[i];
				}
				System.out.println("A soma do saldo de todas as contas é R$"+soma);
			}
			
			
			if(op<1||op>4){
				System.out.println("Opção inválida.");
			}
			
		}while(op != 4);

	}

}
