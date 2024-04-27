package br.edu.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] janela = new int[24];
        int[] corredor = new int[24];

        for (int i = 0; i < 24; i++) {
            janela[i] = 0;
            corredor[i] = 0;
        }

        boolean found;
        String posição;
        int n;
        int op;

        do {
            System.out.print("Escolha uma opção: "+"\n1- Vender passagem."+
        "\n2- Mostrar mapa de ocupação de assentos do ônibus."+"\n3- Encerrar.");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    found = false;
                    for (int i = 0; i < 24; i++) {
                        if (corredor[i] == 0 || janela[i] == 0) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Ônibus lotado.");
                    } else {
                        do {
                            System.out.print("Escolha Janela (J) ou Corredor (C): ");
                            posição = sc.next();
                        } while (!posição.equals("J") && !posição.equals("C"));

                        do {
                            System.out.print("Agora escolha o número do assento de 1 a 24: ");
                            n = sc.nextInt();
                        } while (n < 1 || n > 24);

                        if (posição.equals("J")) {
                            if (janela[n - 1] == 1) {
                                System.out.println("Sinto muito, o assento está ocupado.");
                            } else {
                                System.out.println("Venda efetivada.");
                                janela[n - 1] = 1;
                            }
                        } else {
                            if (corredor[n - 1] == 1) {
                                System.out.println("Sinto muito, o assento está ocupado.");
                            } else {
                                System.out.println("Venda efetivada.");
                                corredor[n - 1] = 1;
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("JANELA  CORREDOR");
                    for (int i = 0; i < 24; i++) {
                        System.out.printf("%-7s%-9s%n",(i + 1) + " - " + (janela[i] == 1 ? "Ocupado" : "Livre	"),
                                (i + 1) + " - " + (corredor[i] == 1 ? "Ocupado" : "Livre"));
                    }
                    break;
                case 3:
                    System.out.println("O programa foi encerrado com sucesso.");
                    break;
                default:
                    System.out.println("Opção inválida. Digite novamente uma opção de 1 a 3.");
            }
        } while (op != 3);
    }
}
