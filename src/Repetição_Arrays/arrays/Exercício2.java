package Repetição_Arrays.arrays;

/* Faça um programa que leia um vetor de 6 caracteres, e diga quantas consoantes foram lidas.
* Imprima as consoantes */

import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String [] consoantes = new String[6];
        int quantidadeConsoantes = 0;
        int i = 0;

        do {
            System.out.println("Letra: ");
            String letra = ler.next();

            if (! (letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u")) ) {
                consoantes[i] = letra;
                quantidadeConsoantes++;
            }
            i++;

        } while (i < consoantes.length);

        System.out.println("Consoantes: ");
        for (String consoante : consoantes ) {
            if (consoante != null) {
                System.out.println(consoante + " ");
            }
        }
        System.out.println("Quantidade de consoantes: " + quantidadeConsoantes);

    }
}
