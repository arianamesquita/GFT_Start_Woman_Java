package Repetição_Arrays.loops;

// Faça um programa que leia 5 números e informe o maior número e a média desses números.

import java.util.Scanner;

public class Exercício3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;
        int count = 0;

        do {
            System.out.println("Entre com um número: ");
            numero = ler.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count++;
        } while (count < 5);

        System.out.println("Maior número: " + maior);
        System.out.println("Média: " + soma/5);


    }
}
