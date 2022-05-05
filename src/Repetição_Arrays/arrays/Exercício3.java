package Repetição_Arrays.arrays;

/* Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
* Ao final mostre os números e seus sucessores. */

import java.util.Random;

public class Exercício3 {
    public static void main(String[] args) {
        Random random = new Random();
        int i;

        int[] numerosAleatorios = new int[20];

        for (i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Números Aleatórios: ");
        for (int numero : numerosAleatorios ) {
            System.out.println(numero + " ");
        }

        System.out.println("Sucessores dos Números Aleatórios: ");
        for (int numero : numerosAleatorios ) {
            System.out.println((numero+1) + " ");
        }

        System.out.println("Antecessor dos Números Aleatórios: ");
        for (int numero : numerosAleatorios ) {
            System.out.println((numero-1) + " ");
        }

    }
}
