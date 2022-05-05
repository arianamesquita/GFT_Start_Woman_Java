package Repeti��o_Arrays.arrays;

/* Fa�a um programa que leia 20 n�meros inteiros aleat�rios (entre 0 e 100) armazene-os num vetor.
* Ao final mostre os n�meros e seus sucessores. */

import java.util.Random;

public class Exerc�cio3 {
    public static void main(String[] args) {
        Random random = new Random();
        int i;

        int[] numerosAleatorios = new int[20];

        for (i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("N�meros Aleat�rios: ");
        for (int numero : numerosAleatorios ) {
            System.out.println(numero + " ");
        }

        System.out.println("Sucessores dos N�meros Aleat�rios: ");
        for (int numero : numerosAleatorios ) {
            System.out.println((numero+1) + " ");
        }

        System.out.println("Antecessor dos N�meros Aleat�rios: ");
        for (int numero : numerosAleatorios ) {
            System.out.println((numero-1) + " ");
        }

    }
}
