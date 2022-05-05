package Repeti��o_Arrays.loops;

//Fa�a um programa que pe�a N n�meros inteiros, calcule e mostre a quantidade de n�meros pares
//e a quantidade de n�meros impares;

import java.util.Scanner;

public class Exerc�cio4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;

        System.out.println("Quantidade de n�meros: ");
        quantNumeros = ler.nextInt();

        int count = 0;
        do {
            System.out.println("N�mero: ");
            numero = ler.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++;
        } while (count < quantNumeros);

        System.out.println("Quantidade pares: " + quantPares);
        System.out.println("Quantidade �mpares: " + quantImpares);
    }
}
