package br.com.lg.primeiro_projeto.um;

import java.util.Random;
import java.util.Scanner;

public class Advinhacao {
    public static void main(String[] args) {
        int numeroSecreto = new Random().nextInt(100);
        Scanner l = new Scanner(System.in);
        int chances = 0;
        int numeroInformado = 0;
        System.out.println(numeroSecreto);

        while(chances < 5) {
            System.out.println("Infomre o número aleatório: ");
            numeroInformado = l.nextInt();

            if(numeroInformado == numeroSecreto) {
                System.out.println("Parabés, você advinhou o número! O número é "+numeroSecreto);
                break;
            }

            if (chances == 5) {
                System.out.println("Você não conseguiu adivinhar o número em 5 tentativas. O número era " + numeroSecreto);
            }

            if(numeroInformado > numeroSecreto) {
                System.out.println("O número digitado é maior que o número secreto! ");
            } else {
                System.out.println("O número digitado é menor que o número secreto! ");
            }

            chances++;
        }
    }
}
