package Repetição_Arrays.loops;

// Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e
// continue pedindo até que o usuário informe um valor válido.

import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int nota;

        System.out.println("Entre com a nota: ");
        nota = ler.nextInt();

        while (nota < 0 || nota > 10){
            System.out.println("Nota inválida! Digite novamente!");
            nota = ler.nextInt();
        }

    }
}
