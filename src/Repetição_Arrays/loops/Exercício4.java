package Repetição_Arrays.loops;

//Faça um programa que peça N números inteiros, calcule e mostre a quantidade de números pares
//e a quantidade de números impares;

import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = ler.nextInt();

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = ler.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade pares: " + quantPares);
        System.out.println("Quantidade ímpares: " + quantImpares);
    }
}
