package br.edu.principal;

import java.util.Scanner;

public class Principal {

    static Scanner sc = new Scanner(System.in);

    public static int calchm(int hi, int mi, int hf, int mf) {

        if (hf < hi || (hf == hi && mf < mi)) {
            hf += 24;
        }

        int totalh = hf - hi;
        int totalm = mf - mi;

        if (totalm < 0) {
            totalm += 60;
            totalh--; 
        }

        int total = (totalh * 60) + totalm;

        return total;
    }

    public static void main(String[] args) {
        System.out.println("Digite o valor do horário inicial.");
        int horai = sc.nextInt();
        System.out.println("Digite o valor do minuto inicial.");
        int mini = sc.nextInt();
        System.out.println("Digite o valor do horário final.");
        int horaf = sc.nextInt();
        System.out.println("Digite o valor do minuto final.");
        int minf = sc.nextInt();

        int min = calchm(horai, mini, horaf, minf);
        System.out.println("O jogo durou " + min + " minutos.");
    }

}
